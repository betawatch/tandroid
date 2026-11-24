// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fp3 implements Executor {
    public static final fp3 a;
    public static final /* synthetic */ fp3[] b;

    static {
        fp3 fp3Var = new fp3("INSTANCE", 0);
        a = fp3Var;
        b = new fp3[]{fp3Var};
    }

    public static fp3 valueOf(String str) {
        return (fp3) Enum.valueOf(fp3.class, str);
    }

    public static fp3[] values() {
        return (fp3[]) b.clone();
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
