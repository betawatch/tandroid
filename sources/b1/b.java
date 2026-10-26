package b1;

import com.google.android.gms.common.api.r;
import di.b4;
import java.util.concurrent.Executor;
import v0.i;
import v0.o;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ud.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ i c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(e1.e eVar, Exception exc, Executor executor, i iVar) {
        this.a = 3;
        this.d = exc;
        this.b = executor;
        this.c = iVar;
    }

    @Override // ud.a
    public final Object invoke() {
        Object cVar;
        switch (this.a) {
            case 0:
                this.b.execute(new a1.f(19, this.c, this.d));
                break;
            case 1:
                this.b.execute(new a1.f(20, this.c, (o) this.d));
                break;
            case 2:
                this.b.execute(new h(this.c, (w0.i) this.d, 0));
                break;
            default:
                Exception exc = (Exception) this.d;
                if (exc instanceof com.google.android.gms.common.api.f) {
                    int statusCode = ((com.google.android.gms.common.api.f) exc).getStatusCode();
                    if (statusCode == 16) {
                        cVar = new w0.b(exc.getMessage());
                    } else if (statusCode == 17) {
                        cVar = new w0.c("API is not supported: " + exc.getMessage(), 3);
                    } else if (statusCode == 8) {
                        cVar = new w0.f(exc.getMessage());
                    } else if (d.b.contains(Integer.valueOf(statusCode))) {
                        cVar = new w0.e(exc.getMessage());
                    } else {
                        cVar = new w0.c("Conditional create failed, failure: " + exc.getMessage(), 2);
                    }
                } else if (exc instanceof r) {
                    cVar = new w0.c("API is unsupported", 3);
                } else {
                    cVar = new w0.c("Conditional create failed, failure: " + exc, 2);
                }
                this.b.execute(new b4(22, this.c, cVar));
                break;
        }
        return jd.i.a;
    }

    public /* synthetic */ b(Executor executor, i iVar, Object obj, int i10) {
        this.a = i10;
        this.b = executor;
        this.c = iVar;
        this.d = obj;
    }
}
