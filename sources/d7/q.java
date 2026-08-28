package d7;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya.k b;

    public /* synthetic */ q(ya.k kVar, int i9) {
        this.a = i9;
        this.b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
