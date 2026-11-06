package a8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class oa implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb.k b;

    public /* synthetic */ oa(pb.k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
