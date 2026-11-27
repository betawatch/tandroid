// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mo3 implements Executor {
    public static final mo3 a;
    public static final /* synthetic */ mo3[] b;

    static {
        mo3 mo3Var = new mo3("INSTANCE", 0);
        a = mo3Var;
        b = new mo3[]{mo3Var};
    }

    public static mo3 valueOf(String str) {
        return (mo3) Enum.valueOf(mo3.class, str);
    }

    public static mo3[] values() {
        return (mo3[]) b.clone();
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
