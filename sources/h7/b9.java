package h7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b9 {
    public final b6.c a;
    public final AtomicLong b;

    public b9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new b6.c(context, b6.c.k, new z5.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            case 2:
                this.b = new AtomicLong(-1L);
                this.a = new b6.c(context, b6.c.k, new z5.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new b6.c(context, b6.c.k, new z5.p("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
