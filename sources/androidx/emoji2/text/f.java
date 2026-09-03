package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        } catch (Exception e6) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e6);
            return false;
        }
    }

    public f(c9.r rVar) {
        h7.u uVar = new h7.u(8);
        db.a aVar = new db.a(7);
        this.b = uVar;
        this.c = new ArrayList();
        this.a = aVar;
        rVar.a(new w(this, 25));
    }
}
