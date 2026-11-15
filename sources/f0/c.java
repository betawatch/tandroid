package f0;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class c {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
