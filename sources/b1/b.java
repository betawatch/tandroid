package b1;

import ad.j;
import com.google.android.gms.common.api.r;
import java.util.concurrent.Executor;
import v0.n;
import w0.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ld.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ v0.h c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(e1.d dVar, Exception exc, Executor executor, v0.h hVar) {
        this.a = 3;
        this.d = exc;
        this.b = executor;
        this.c = hVar;
    }

    @Override // ld.a
    public final Object invoke() {
        Object cVar;
        switch (this.a) {
            case 0:
                this.b.execute(new a1.f(15, this.c, this.d));
                break;
            case 1:
                this.b.execute(new a1.f(16, this.c, (n) this.d));
                break;
            case 2:
                this.b.execute(new h(this.c, (i) this.d, 0));
                break;
            default:
                Exception exc = (Exception) this.d;
                if (exc instanceof com.google.android.gms.common.api.f) {
                    int statusCode = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                    if (statusCode == 16) {
                        cVar = new w0.b(exc.getMessage());
                    } else if (statusCode == 17) {
                        cVar = new w0.c(3, "API is not supported: " + exc.getMessage());
                    } else if (statusCode == 8) {
                        cVar = new w0.f(exc.getMessage());
                    } else if (d.b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c(2, "Conditional create failed, failure: " + exc.getMessage());
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c(3, "API is unsupported");
                } else {
                    cVar = new w0.c(2, "Conditional create failed, failure: " + exc);
                }
                this.b.execute(new d1.e(4, this.c, cVar));
                break;
        }
        return j.a;
    }

    public /* synthetic */ b(Executor executor, v0.h hVar, Object obj, int i10) {
        this.a = i10;
        this.b = executor;
        this.c = hVar;
        this.d = obj;
    }
}
