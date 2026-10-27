package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                m8Var.x0(this.d);
                break;
            case 1:
                m8 m8Var2 = this.b;
                m8Var2.getClass();
                this.c.u();
                m8Var2.G0(this.d);
                break;
            case 2:
                m8 m8Var3 = this.b;
                MessageObject messageObject = this.d;
                m8Var3.C0(messageObject, false, new i7(m8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                m8 m8Var4 = this.b;
                m8Var4.getClass();
                this.c.u();
                m8Var4.x0(this.d);
                break;
            case 4:
                m8 m8Var5 = this.b;
                m8Var5.getClass();
                this.c.u();
                m8Var5.G0(this.d);
                break;
            case 5:
                m8.p(this.b, this.d, this.c);
                break;
            case 6:
                m8 m8Var6 = this.b;
                m8Var6.C0(this.d, true, new j7(m8Var6, this.c, 4), false);
                break;
            case 7:
                m8.I(this.b, this.d, this.c);
                break;
            default:
                this.b.B0(this.d);
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
