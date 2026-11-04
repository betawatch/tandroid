package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;
import v0.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ b(e eVar, JSONException jSONException, int i3) {
        this.a = i3;
        this.b = eVar;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b.f;
                if (hVar != null) {
                    hVar.a(new y0.a(new x0.a(4), this.c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.b.f;
                if (hVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                String message = this.c.getMessage();
                hVar2.a((message == null || message.length() <= 0) ? new y0.a(new x0.a(4), "Unknown error") : new y0.a(new x0.a(4), message));
                return;
        }
    }
}
