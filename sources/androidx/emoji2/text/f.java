package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f {
    public volatile Object a;
    public volatile Object b;
    public final Object c;

    public /* synthetic */ f(Object obj) {
        this.c = obj;
    }

    public boolean a() {
        try {
            Context context = (Context) this.c;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public f(c9.s sVar) {
        db.a aVar = new db.a(8);
        cb.b bVar = new cb.b(7);
        this.b = aVar;
        this.c = new ArrayList();
        this.a = bVar;
        sVar.a(new af.a(this, 26));
    }
}
