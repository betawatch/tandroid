package a8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
