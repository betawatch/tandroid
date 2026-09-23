package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ og(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                xn xnVar = this.b;
                xnVar.getClass();
                if (num.intValue() != 0) {
                    xnVar.Bc(true);
                    xnVar.F(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    xnVar.l1 = 0;
                    xnVar.Bc(true);
                    xnVar.getMessagesController().markReactionsAsRead(xnVar.T5, xnVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                xn xnVar2 = this.b;
                xnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = xnVar2.m1 - 1;
                    xnVar2.m1 = i10;
                    if (i10 <= 0) {
                        xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.T5, xnVar2.d());
                    }
                    xnVar2.Ac(true);
                    xnVar2.F(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    xnVar2.m1 = 0;
                    xnVar2.Ac(true);
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.T5, xnVar2.d());
                    break;
                }
            default:
                xn xnVar3 = this.b;
                xnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xnVar3.f7 = booleanValue;
                if (!booleanValue) {
                    xnVar3.r8();
                    break;
                }
                break;
        }
    }
}
