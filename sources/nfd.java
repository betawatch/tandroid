// default package

import android.os.Parcel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class nfd {
    public byte a;
    public Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nfd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String a(h7f h7fVar) {
        lid lidVar = (lid) this.b;
        byte b = this.a;
        try {
            if (lidVar.E == null) {
                throw null;
            }
            z9d z9dVar = lidVar.E;
            String packageName = lidVar.C.getPackageName();
            String str = b != 2 ? b != 3 ? b != 4 ? b != 5 ? b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            vhd vhdVar = new vhd(h7fVar);
            d9d d9dVar = (d9d) z9dVar;
            Parcel X = d9dVar.X();
            X.writeString(packageName);
            X.writeString(str);
            int i = b9d.a;
            X.writeStrongBinder(vhdVar);
            try {
                d9dVar.b.transact(1, X, null, 1);
                X.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th) {
                X.recycle();
                throw th;
            }
        } catch (Exception e) {
            lidVar.E(95, 28, qjd.p);
            xgd.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h7fVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
