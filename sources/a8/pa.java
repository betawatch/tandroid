package a8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
