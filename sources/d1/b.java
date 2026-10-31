package d1;

import kotlin.jvm.internal.i;
import org.json.JSONException;
import v0.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ b(f fVar, JSONException jSONException, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b.f;
                if (hVar != null) {
                    hVar.g(new y0.a(new x0.a(4), this.c.getMessage()));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.b.f;
                if (hVar2 == null) {
                    i.h("callback");
                    throw null;
                }
                String message = this.c.getMessage();
                hVar2.g((message == null || message.length() <= 0) ? new y0.a(new x0.a(4), "Unknown error") : new y0.a(new x0.a(4), message));
                return;
        }
    }
}
