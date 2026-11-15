package a8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class wa {
    public final s6.d a;
    public final AtomicLong b;

    public wa(Context context, int i7) {
        switch (i7) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new s6.d(context, s6.d.m, new q6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new s6.d(context, s6.d.m, new q6.q("mlkit:vision"), com.google.android.gms.common.api.i.c);
                break;
        }
    }
}
