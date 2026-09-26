package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ng(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                wn wnVar = this.b;
                wnVar.getClass();
                if (num.intValue() != 0) {
                    wnVar.Bc(true);
                    wnVar.F(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    wnVar.l1 = 0;
                    wnVar.Bc(true);
                    wnVar.getMessagesController().markReactionsAsRead(wnVar.T5, wnVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                wn wnVar2 = this.b;
                wnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = wnVar2.m1 - 1;
                    wnVar2.m1 = i10;
                    if (i10 <= 0) {
                        wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.T5, wnVar2.d());
                    }
                    wnVar2.Ac(true);
                    wnVar2.F(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    wnVar2.m1 = 0;
                    wnVar2.Ac(true);
                    wnVar2.getMessagesController().markPollVotesAsRead(wnVar2.T5, wnVar2.d());
                    break;
                }
            default:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wnVar3.f7 = booleanValue;
                if (!booleanValue) {
                    wnVar3.r8();
                    break;
                }
                break;
        }
    }
}
