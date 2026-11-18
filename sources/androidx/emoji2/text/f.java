package androidx.emoji2.text;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        z9.a aVar = new z9.a();
        w7.s sVar = new w7.s(28);
        this.c = aVar;
        this.b = new ArrayList();
        this.a = sVar;
        oVar.a(new ug.x(this));
    }
}
