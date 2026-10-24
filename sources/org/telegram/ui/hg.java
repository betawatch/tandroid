package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ hg(sn snVar, int i10) {
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
                    snVar.Ic(true);
                    snVar.j(num.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    snVar.x1 = 0;
                    snVar.Ic(true);
                    snVar.getMessagesController().markReactionsAsRead(snVar.f6, snVar.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                sn snVar2 = this.b;
                snVar2.getClass();
                if (num2.intValue() != 0) {
                    int i10 = snVar2.y1 - 1;
                    snVar2.y1 = i10;
                    if (i10 <= 0) {
                        snVar2.getMessagesController().markPollVotesAsRead(snVar2.f6, snVar2.d());
                    }
                    snVar2.Hc(true);
                    snVar2.j(num2.intValue(), 0, false, 0, true, 0);
                    break;
                } else {
                    snVar2.y1 = 0;
                    snVar2.Hc(true);
                    snVar2.getMessagesController().markPollVotesAsRead(snVar2.f6, snVar2.d());
                    break;
                }
            default:
                sn snVar3 = this.b;
                snVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                snVar3.r7 = booleanValue;
                if (!booleanValue) {
                    snVar3.v8();
                    break;
                }
                break;
        }
    }
}
