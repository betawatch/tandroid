package b1;

import com.google.android.gms.common.api.r;
import di.z0;
import gd.k;
import java.util.concurrent.Executor;
import v0.o;
import w0.i;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements rd.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ v0.g c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(e1.d dVar, Exception exc, Executor executor, v0.g gVar) {
        this.a = 3;
        this.d = exc;
        this.b = executor;
        this.c = gVar;
    }

    @Override // rd.a
    public final Object invoke() {
        Object cVar;
        switch (this.a) {
            case 0:
                this.b.execute(new a1.e(21, this.c, this.d));
                break;
            case 1:
                this.b.execute(new a1.e(22, this.c, (o) this.d));
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
                this.b.execute(new z0(26, this.c, cVar));
                break;
        }
        return k.a;
    }

    public /* synthetic */ b(Executor executor, v0.g gVar, Object obj, int i7) {
        this.a = i7;
        this.b = executor;
        this.c = gVar;
        this.d = obj;
    }
}
