package cb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
