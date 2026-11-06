package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }

    public f(u9.o oVar) {
        qb.a aVar = new qb.a(29);
        qb.a aVar2 = new qb.a(28);
        this.c = aVar;
        this.b = new ArrayList();
        this.a = aVar2;
        oVar.a(new v0.j(this));
    }
}
