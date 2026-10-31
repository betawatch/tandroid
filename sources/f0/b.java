package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
