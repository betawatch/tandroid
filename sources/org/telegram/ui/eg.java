package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ eg(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                qn qnVar = this.b;
                qnVar.getClass();
                if (num.intValue() != 0) {
                    qnVar.Fc(true);
                    qnVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    qnVar.l1 = 0;
                    qnVar.Fc(true);
                    qnVar.getMessagesController().markReactionsAsRead(qnVar.T5, qnVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                qn qnVar2 = this.b;
                qnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = qnVar2.m1 - 1;
                    qnVar2.m1 = i10;
                    if (i10 <= 0) {
                        qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.T5, qnVar2.d());
                    }
                    qnVar2.Ec(true);
                    qnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    qnVar2.m1 = 0;
                    qnVar2.Ec(true);
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.T5, qnVar2.d());
                    break;
                }
            default:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qnVar3.f7 = booleanValue;
                if (!booleanValue) {
                    qnVar3.v8();
                    break;
                }
                break;
        }
    }
}
