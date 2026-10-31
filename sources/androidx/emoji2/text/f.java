package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;
import rh.x6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public f(r9.p pVar) {
        kb.a aVar = new kb.a(25);
        hb.a aVar2 = new hb.a(24);
        this.c = aVar;
        this.b = new ArrayList();
        this.a = aVar2;
        pVar.a(new x6(this, 22));
    }
}
