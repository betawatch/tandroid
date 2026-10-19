package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
