package e1;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import c1.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.g;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class d extends b1.d {
    public final Context e;
    public g f;
    public Executor g;
    public CancellationSignal h;
    public final e i;

    public d(Context context) {
        j.e(context, "context");
        this.e = context;
        this.i = new e(this, new Handler(Looper.getMainLooper()), 2);
    }
}
