package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ fg(qn qnVar, int i9) {
        this.a = i9;
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
                    qnVar.Bc(true);
                    qnVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    qnVar.h1 = 0;
                    qnVar.Bc(true);
                    qnVar.getMessagesController().markReactionsAsRead(qnVar.P5, qnVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                qn qnVar2 = this.b;
                qnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i9 = qnVar2.i1 - 1;
                    qnVar2.i1 = i9;
                    if (i9 <= 0) {
                        qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.P5, qnVar2.b());
                    }
                    qnVar2.Ac(true);
                    qnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    qnVar2.i1 = 0;
                    qnVar2.Ac(true);
                    qnVar2.getMessagesController().markPollVotesAsRead(qnVar2.P5, qnVar2.b());
                    break;
                }
            default:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qnVar3.b7 = booleanValue;
                if (!booleanValue) {
                    qnVar3.r8();
                    break;
                }
                break;
        }
    }
}
