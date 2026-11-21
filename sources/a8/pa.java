package a8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb.k b;

    public /* synthetic */ pa(pb.k kVar, int i7) {
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
