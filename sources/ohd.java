// default package

import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ohd {
    public byte a;
    public Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ohd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String a(j9f j9fVar) {
        nkd nkdVar = (nkd) this.b;
        byte b = this.a;
        try {
            if (nkdVar.E == null) {
                throw null;
            }
            bcd bcdVar = nkdVar.E;
            String packageName = nkdVar.C.getPackageName();
            String str = b != 2 ? b != 3 ? b != 4 ? b != 5 ? b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            wjd wjdVar = new wjd(j9fVar);
            fbd fbdVar = (fbd) bcdVar;
            Parcel X = fbdVar.X();
            X.writeString(packageName);
            X.writeString(str);
            int i = dbd.a;
            X.writeStrongBinder(wjdVar);
            try {
                fbdVar.b.transact(1, X, null, 1);
                X.recycle();
                return "billingOverrideService.getBillingOverride";
            } catch (Throwable th) {
                X.recycle();
                throw th;
            }
        } catch (Exception e) {
            nkdVar.E(95, 28, sld.p);
            yid.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            j9fVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
