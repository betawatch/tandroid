package j7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d9 {
    public final d6.b a;
    public final AtomicLong b;

    public d9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new d6.b(context, d6.b.k, new b6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            case 2:
                this.b = new AtomicLong(-1L);
                this.a = new d6.b(context, d6.b.k, new b6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new d6.b(context, d6.b.k, new b6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
