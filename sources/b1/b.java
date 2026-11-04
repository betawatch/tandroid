package b1;

import ci.e0;
import com.google.android.gms.common.api.r;
import dd.k;
import java.util.concurrent.Executor;
import v0.h;
import v0.n;
import w0.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements od.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ h c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(e1.d dVar, Exception exc, Executor executor, h hVar) {
        this.a = 3;
        this.d = exc;
        this.b = executor;
        this.c = hVar;
    }

    @Override // od.a
    public final Object invoke() {
        Object cVar;
        switch (this.a) {
            case 0:
                this.b.execute(new a1.f(8, this.c, this.d));
                break;
            case 1:
                this.b.execute(new a1.f(9, this.c, (n) this.d));
                break;
            case 2:
                this.b.execute(new g(this.c, (i) this.d, 0));
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
                this.b.execute(new e0(26, this.c, cVar));
                break;
        }
        return k.a;
    }

    public /* synthetic */ b(Executor executor, h hVar, Object obj, int i3) {
        this.a = i3;
        this.b = executor;
        this.c = hVar;
        this.d = obj;
    }
}
