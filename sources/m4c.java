// default package

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m4c implements Executor {
    public static final m4c a;
    public static final Handler b;
    public static final /* synthetic */ m4c[] c;

    static {
        m4c m4cVar = new m4c("INSTANCE", 0);
        a = m4cVar;
        c = new m4c[]{m4cVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static m4c valueOf(String str) {
        return (m4c) Enum.valueOf(m4c.class, str);
    }

    public static m4c[] values() {
        return (m4c[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
