// default package

import android.os.Parcel;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ekd {
    public byte a;
    public Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ekd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String a(ybf ybfVar) {
        cnd cndVar = (cnd) this.b;
        byte b = this.a;
        try {
            if (cndVar.E == null) {
                throw null;
            }
            sed sedVar = cndVar.E;
            String packageName = cndVar.C.getPackageName();
            String str = b != 2 ? b != 3 ? b != 4 ? b != 5 ? b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            mmd mmdVar = new mmd(ybfVar);
            wdd wddVar = (wdd) sedVar;
            Parcel X = wddVar.X();
            X.writeString(packageName);
            X.writeString(str);
            int i = udd.a;
            X.writeStrongBinder(mmdVar);
            try {
                wddVar.b.transact(1, X, null, 1);
                X.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th) {
                X.recycle();
                throw th;
            }
        } catch (Exception e) {
            cndVar.E(95, 28, hod.p);
            old.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            ybfVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
