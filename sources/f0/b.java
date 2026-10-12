package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class b {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
