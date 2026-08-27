package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ hg(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                rn rnVar = this.b;
                rnVar.getClass();
                if (num.intValue() != 0) {
                    rnVar.Bc(true);
                    rnVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    rnVar.h1 = 0;
                    rnVar.Bc(true);
                    rnVar.getMessagesController().markReactionsAsRead(rnVar.P5, rnVar.b());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                rn rnVar2 = this.b;
                rnVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = rnVar2.i1 - 1;
                    rnVar2.i1 = i10;
                    if (i10 <= 0) {
                        rnVar2.getMessagesController().markPollVotesAsRead(rnVar2.P5, rnVar2.b());
                    }
                    rnVar2.Ac(true);
                    rnVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    rnVar2.i1 = 0;
                    rnVar2.Ac(true);
                    rnVar2.getMessagesController().markPollVotesAsRead(rnVar2.P5, rnVar2.b());
                    break;
                }
            default:
                rn rnVar3 = this.b;
                rnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rnVar3.b7 = booleanValue;
                if (!booleanValue) {
                    rnVar3.r8();
                    break;
                }
                break;
        }
    }
}
