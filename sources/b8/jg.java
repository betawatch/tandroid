package b8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class jg {
    public final r6.d a;
    public final AtomicLong b;

    public jg(Context context, int i3) {
        switch (i3) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new r6.d(context, r6.d.m, new p6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
            case 2:
                this.b = new AtomicLong(-1L);
                this.a = new r6.d(context, r6.d.m, new p6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new r6.d(context, r6.d.m, new p6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
