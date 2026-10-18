package ei;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ o(lb lbVar, int i10) {
        this.a = i10;
        this.b = lbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                lb lbVar = this.b;
                lbVar.setPeriod(intValue);
                Utilities.Callback callback = lbVar.B1;
                if (callback != null) {
                    callback.run(num);
                    break;
                }
                break;
            default:
                Utilities.Callback callback2 = this.b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    break;
                }
                break;
        }
    }
}
