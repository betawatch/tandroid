package d1;

import org.json.JSONException;
import v0.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ b(e eVar, JSONException jSONException, int i9) {
        this.a = i9;
        this.b = eVar;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b.f;
                if (iVar != null) {
                    iVar.onError(new y0.a(new x0.a(4), this.c.getMessage()));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.b.f;
                if (iVar2 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                String message = this.c.getMessage();
                iVar2.onError((message == null || message.length() <= 0) ? new y0.a(new x0.a(4), "Unknown error") : new y0.a(new x0.a(4), message));
                return;
        }
    }
}
