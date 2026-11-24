// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hp3 implements Executor {
    public static final hp3 a;
    public static final /* synthetic */ hp3[] b;

    static {
        hp3 hp3Var = new hp3("INSTANCE", 0);
        a = hp3Var;
        b = new hp3[]{hp3Var};
    }

    public static hp3 valueOf(String str) {
        return (hp3) Enum.valueOf(hp3.class, str);
    }

    public static hp3[] values() {
        return (hp3[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
