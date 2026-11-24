// default package

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m6c implements Executor {
    public static final m6c a;
    public static final Handler b;
    public static final /* synthetic */ m6c[] c;

    static {
        m6c m6cVar = new m6c("INSTANCE", 0);
        a = m6cVar;
        c = new m6c[]{m6cVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static m6c valueOf(String str) {
        return (m6c) Enum.valueOf(m6c.class, str);
    }

    public static m6c[] values() {
        return (m6c[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
