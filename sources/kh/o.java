package kh;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb b;

    public /* synthetic */ o(mb mbVar, int i9) {
        this.a = i9;
        this.b = mbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                mb mbVar = this.b;
                mbVar.setPeriod(intValue);
                Utilities.Callback callback = mbVar.x1;
                if (callback != null) {
                    callback.run(num);
                    break;
                }
                break;
            default:
                Utilities.Callback callback2 = this.b.y1;
                if (callback2 != null) {
                    callback2.run(num);
                    break;
                }
                break;
        }
    }
}
