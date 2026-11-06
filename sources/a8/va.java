package a8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class va {
    public final s6.d a;
    public final AtomicLong b;

    public va(Context context, int i7) {
        switch (i7) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new s6.d(context, s6.d.m, new q6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            case 2:
                this.b = new AtomicLong(-1L);
                this.a = new s6.d(context, s6.d.m, new q6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new s6.d(context, s6.d.m, new q6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
