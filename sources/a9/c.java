package a9;

import android.content.Context;
import com.google.android.gms.internal.play_billing.u;
import java.util.ArrayList;
import y8.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    public boolean a() {
        try {
            Context context = (Context) this.a;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e10) {
            u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }

    public c(p pVar) {
        v9.d dVar = new v9.d(5);
        d7.u uVar = new d7.u(4);
        this.c = dVar;
        this.a = new ArrayList();
        this.b = uVar;
        pVar.a(new b(this, 0));
    }
}
