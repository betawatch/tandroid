package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ l80 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ i7(m8 m8Var, MessageObject messageObject, l80 l80Var, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.d = messageObject;
        this.c = l80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8 m8Var = this.b;
                m8Var.getClass();
                this.c.u();
                m8Var.r0(this.d);
                break;
            case 1:
                m8 m8Var2 = this.b;
                m8Var2.getClass();
                this.c.u();
                m8Var2.A0(this.d);
                break;
            case 2:
                m8 m8Var3 = this.b;
                MessageObject messageObject = this.d;
                m8Var3.w0(messageObject, false, new i7(m8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                m8 m8Var4 = this.b;
                m8Var4.getClass();
                this.c.u();
                m8Var4.r0(this.d);
                break;
            case 4:
                m8 m8Var5 = this.b;
                m8Var5.getClass();
                this.c.u();
                m8Var5.A0(this.d);
                break;
            case 5:
                m8.x(this.b, this.d, this.c);
                break;
            case 6:
                m8 m8Var6 = this.b;
                m8Var6.w0(this.d, true, new j7(m8Var6, this.c, 4), false);
                break;
            case 7:
                m8.M(this.b, this.d, this.c);
                break;
            default:
                this.b.v0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ i7(m8 m8Var, l80 l80Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = l80Var;
        this.d = messageObject;
    }
}
