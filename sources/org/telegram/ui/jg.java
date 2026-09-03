package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ jg(xn xnVar, int i10) {
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
                    xnVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    xnVar.i1 = 0;
                    xnVar.Bc(true);
                    xnVar.getMessagesController().markReactionsAsRead(xnVar.Q5, xnVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                xn xnVar2 = this.b;
                xnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = xnVar2.j1 - 1;
                    xnVar2.j1 = i10;
                    if (i10 <= 0) {
                        xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.Q5, xnVar2.b());
                    }
                    xnVar2.Ac(true);
                    xnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    xnVar2.j1 = 0;
                    xnVar2.Ac(true);
                    xnVar2.getMessagesController().markPollVotesAsRead(xnVar2.Q5, xnVar2.b());
                    break;
                }
            default:
                xn xnVar3 = this.b;
                xnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xnVar3.c7 = booleanValue;
                if (!booleanValue) {
                    xnVar3.r8();
                    break;
                }
                break;
        }
    }
}
