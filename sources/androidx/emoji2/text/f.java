package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public f(q9.p pVar) {
        ob.a aVar = new ob.a(24);
        t7.u uVar = new t7.u();
        this.c = aVar;
        this.b = new ArrayList();
        this.a = uVar;
        pVar.a(new s0.b(this, 17));
    }
}
