package g7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c9 {
    public final a6.c a;
    public final AtomicLong b;

    public c9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new a6.c(context, a6.c.k, new y5.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            case 2:
                this.b = new AtomicLong(-1L);
                this.a = new a6.c(context, a6.c.k, new y5.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new a6.c(context, a6.c.k, new y5.p("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
