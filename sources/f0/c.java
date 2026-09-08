package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
