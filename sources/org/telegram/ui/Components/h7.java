package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ p80 c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ h7(l8 l8Var, MessageObject messageObject, p80 p80Var, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.d = messageObject;
        this.c = p80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l8 l8Var = this.b;
                l8Var.getClass();
                this.c.u();
                l8Var.r0(this.d);
                break;
            case 1:
                l8 l8Var2 = this.b;
                l8Var2.getClass();
                this.c.u();
                l8Var2.A0(this.d);
                break;
            case 2:
                l8 l8Var3 = this.b;
                MessageObject messageObject = this.d;
                l8Var3.w0(messageObject, false, new h7(l8Var3, messageObject, this.c, 5), false);
                break;
            case 3:
                l8 l8Var4 = this.b;
                l8Var4.getClass();
                this.c.u();
                l8Var4.r0(this.d);
                break;
            case 4:
                l8 l8Var5 = this.b;
                l8Var5.getClass();
                this.c.u();
                l8Var5.A0(this.d);
                break;
            case 5:
                l8.x(this.b, this.d, this.c);
                break;
            case 6:
                l8 l8Var6 = this.b;
                l8Var6.w0(this.d, true, new i7(l8Var6, this.c, 4), false);
                break;
            case 7:
                l8.M(this.b, this.d, this.c);
                break;
            default:
                this.b.v0(this.d);
                this.c.u();
                break;
        }
    }

    public /* synthetic */ h7(l8 l8Var, p80 p80Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.c = p80Var;
        this.d = messageObject;
    }
}
