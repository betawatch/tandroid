package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final j0[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(j0[] j0VarArr) {
        this.a = j0VarArr;
        this.notCompletedCount$volatile = j0VarArr.length;
    }
}
