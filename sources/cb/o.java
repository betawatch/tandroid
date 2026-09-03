package cb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
