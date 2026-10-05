package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class c {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
