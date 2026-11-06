package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class c {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
