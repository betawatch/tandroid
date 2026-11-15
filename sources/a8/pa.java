package a8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
