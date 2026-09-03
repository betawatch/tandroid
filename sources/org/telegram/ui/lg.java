package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ lg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                zn znVar = this.b;
                znVar.getClass();
                if (num.intValue() != 0) {
                    znVar.Bc(true);
                    znVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    znVar.i1 = 0;
                    znVar.Bc(true);
                    znVar.getMessagesController().markReactionsAsRead(znVar.Q5, znVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                zn znVar2 = this.b;
                znVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = znVar2.j1 - 1;
                    znVar2.j1 = i10;
                    if (i10 <= 0) {
                        znVar2.getMessagesController().markPollVotesAsRead(znVar2.Q5, znVar2.d());
                    }
                    znVar2.Ac(true);
                    znVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    znVar2.j1 = 0;
                    znVar2.Ac(true);
                    znVar2.getMessagesController().markPollVotesAsRead(znVar2.Q5, znVar2.d());
                    break;
                }
            default:
                zn znVar3 = this.b;
                znVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                znVar3.c7 = booleanValue;
                if (!booleanValue) {
                    znVar3.r8();
                    break;
                }
                break;
        }
    }
}
