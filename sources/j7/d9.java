package j7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
