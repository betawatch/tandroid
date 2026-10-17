package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ gg(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                sn snVar = this.b;
                snVar.getClass();
                if (num.intValue() != 0) {
                    snVar.Fc(true);
                    snVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    snVar.l1 = 0;
                    snVar.Fc(true);
                    snVar.getMessagesController().markReactionsAsRead(snVar.T5, snVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                sn snVar2 = this.b;
                snVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = snVar2.m1 - 1;
                    snVar2.m1 = i10;
                    if (i10 <= 0) {
                        snVar2.getMessagesController().markPollVotesAsRead(snVar2.T5, snVar2.d());
                    }
                    snVar2.Ec(true);
                    snVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    snVar2.m1 = 0;
                    snVar2.Ec(true);
                    snVar2.getMessagesController().markPollVotesAsRead(snVar2.T5, snVar2.d());
                    break;
                }
            default:
                sn snVar3 = this.b;
                snVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                snVar3.f7 = booleanValue;
                if (!booleanValue) {
                    snVar3.v8();
                    break;
                }
                break;
        }
    }
}
