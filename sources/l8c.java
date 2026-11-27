// default package

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
