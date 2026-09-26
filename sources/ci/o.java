package ci;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ o(bc bcVar, int i10) {
        this.a = i10;
        this.b = bcVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                bc bcVar = this.b;
                bcVar.setPeriod(intValue);
                Utilities.Callback callback = bcVar.B1;
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
