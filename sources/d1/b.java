package d1;

import kotlin.jvm.internal.j;
import org.json.JSONException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ b(e eVar, JSONException jSONException, int i7) {
        this.a = i7;
        this.b = eVar;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0.g gVar = this.b.f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(4), this.c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.b.f;
                if (gVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                String message = this.c.getMessage();
                gVar2.a((message == null || message.length() <= 0) ? new y0.a(new x0.a(4), "Unknown error") : new y0.a(new x0.a(4), message));
                return;
        }
    }
}
