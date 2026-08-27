package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e9);
            return false;
        }
    }

    public f(z8.o oVar) {
        ab.a aVar = new ab.a(6);
        xa.a aVar2 = new xa.a(4);
        this.b = aVar;
        this.c = new ArrayList();
        this.a = aVar2;
        oVar.a(new a9.m(this, 10));
    }
}
