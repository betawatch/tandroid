package a8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
