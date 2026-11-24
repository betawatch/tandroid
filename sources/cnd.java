// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cnd implements Executor {
    public static final cnd a;
    public static final /* synthetic */ cnd[] b;

    static {
        cnd cndVar = new cnd("INSTANCE", 0);
        a = cndVar;
        b = new cnd[]{cndVar};
    }

    public static cnd[] values() {
        return (cnd[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
