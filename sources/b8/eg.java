package b8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb.k b;

    public /* synthetic */ eg(mb.k kVar, int i3) {
        this.a = i3;
        this.b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
