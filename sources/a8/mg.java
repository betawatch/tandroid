package a8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class mg {
    public final q6.b a;
    public final AtomicLong b;

    public mg(Context context, int i10) {
        switch (i10) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new q6.b(context, q6.b.k, new o6.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new q6.b(context, q6.b.k, new o6.p("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
