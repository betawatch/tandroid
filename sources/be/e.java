package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
