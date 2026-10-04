package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ og(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                yn ynVar = this.b;
                ynVar.getClass();
                if (num.intValue() != 0) {
                    ynVar.Ac(true);
                    ynVar.D(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    ynVar.j1 = 0;
                    ynVar.Ac(true);
                    ynVar.getMessagesController().markReactionsAsRead(ynVar.R5, ynVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                yn ynVar2 = this.b;
                ynVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = ynVar2.k1 - 1;
                    ynVar2.k1 = i10;
                    if (i10 <= 0) {
                        ynVar2.getMessagesController().markPollVotesAsRead(ynVar2.R5, ynVar2.d());
                    }
                    ynVar2.zc(true);
                    ynVar2.D(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    ynVar2.k1 = 0;
                    ynVar2.zc(true);
                    ynVar2.getMessagesController().markPollVotesAsRead(ynVar2.R5, ynVar2.d());
                    break;
                }
            default:
                yn ynVar3 = this.b;
                ynVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ynVar3.d7 = booleanValue;
                if (!booleanValue) {
                    ynVar3.r8();
                    break;
                }
                break;
        }
    }
}
