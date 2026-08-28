package f7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d9 {
    public final z5.b a;
    public final AtomicLong b;

    public d9(Context context, int i9) {
        switch (i9) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new z5.b(context, z5.b.k, new x5.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            case 2:
                this.b = new AtomicLong(-1L);
                this.a = new z5.b(context, z5.b.k, new x5.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new z5.b(context, z5.b.k, new x5.p("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
