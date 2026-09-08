package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public volatile Object a;
    public final Object b;
    public volatile Object c;

    public /* synthetic */ f(Object obj) {
        this.b = obj;
    }

    public boolean a() {
        try {
            Context context = (Context) this.b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e7);
            return false;
        }
    }

    public f(q9.p pVar) {
        qb.b bVar = new qb.b(24);
        na.d dVar = new na.d();
        this.c = bVar;
        this.b = new ArrayList();
        this.a = dVar;
        pVar.a(new r9.i(this, 25));
    }
}
