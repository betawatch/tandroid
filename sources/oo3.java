// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oo3 implements Executor {
    public static final oo3 a;
    public static final /* synthetic */ oo3[] b;

    static {
        oo3 oo3Var = new oo3("INSTANCE", 0);
        a = oo3Var;
        b = new oo3[]{oo3Var};
    }

    public static oo3 valueOf(String str) {
        return (oo3) Enum.valueOf(oo3.class, str);
    }

    public static oo3[] values() {
        return (oo3[]) b.clone();
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
