package a8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
