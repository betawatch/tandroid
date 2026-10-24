package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class b {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
