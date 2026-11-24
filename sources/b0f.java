// default package

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b0f {
    public final ua4 a;
    public final AtomicLong b;

    public b0f(Context context, byte b) {
        switch (b) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = new ua4(context, ua4.o, new oib("mlkit:vision"), b05.c);
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = new ua4(context, ua4.o, new oib("mlkit:natural_language"), b05.c);
                break;
        }
    }
}
