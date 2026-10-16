package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final i0[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}
