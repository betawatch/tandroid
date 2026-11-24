// default package

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k23 extends j33 {
    public final Context e;
    public a33 f;
    public Executor g;
    public CancellationSignal h;
    public final j23 i;

    public k23(Context context) {
        context.getClass();
        this.e = context;
        this.i = new j23(this, new Handler(Looper.getMainLooper()), (byte) 0);
    }
}
