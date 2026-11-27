// default package

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l8c implements Executor {
    public static final l8c a;
    public static final Handler b;
    public static final /* synthetic */ l8c[] c;

    static {
        l8c l8cVar = new l8c("INSTANCE", 0);
        a = l8cVar;
        c = new l8c[]{l8cVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static l8c valueOf(String str) {
        return (l8c) Enum.valueOf(l8c.class, str);
    }

    public static l8c[] values() {
        return (l8c[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
