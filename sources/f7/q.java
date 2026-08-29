package f7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab.l b;

    public /* synthetic */ q(ab.l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
