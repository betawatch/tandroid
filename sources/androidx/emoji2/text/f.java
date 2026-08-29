package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
            return false;
        }
    }

    public f(a9.t tVar) {
        bb.a aVar = new bb.a(7);
        f7.v vVar = new f7.v(6);
        this.b = aVar;
        this.c = new ArrayList();
        this.a = vVar;
        tVar.a(new a9.f(this, 18));
    }
}
