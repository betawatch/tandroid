package cb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o implements Executor {
    public static final o a;
    public static final /* synthetic */ o[] b;

    static {
        o oVar = new o("INSTANCE", 0);
        a = oVar;
        b = new o[]{oVar};
    }

    public static o[] values() {
        return (o[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g.a().a.post(runnable);
    }
}
