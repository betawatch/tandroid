package ab;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q implements Executor {
    public static final q a;
    public static final /* synthetic */ q[] b;

    static {
        q qVar = new q("INSTANCE", 0);
        a = qVar;
        b = new q[]{qVar};
    }

    public static q[] values() {
        return (q[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.a().a.post(runnable);
    }
}
