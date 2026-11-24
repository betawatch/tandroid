// default package

import org.json.JSONException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class k33 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o33 b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ k33(o33 o33Var, JSONException jSONException, byte b) {
        this.a = b;
        this.b = o33Var;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        JSONException jSONException = this.c;
        o33 o33Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = o33Var.f;
                if (a33Var != null) {
                    a33Var.A(new l23(new h1((byte) 4), jSONException.getMessage()));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var2 = o33Var.f;
                if (a33Var2 == null) {
                    rr5.e("callback");
                    throw null;
                }
                String message = jSONException.getMessage();
                a33Var2.A((message == null || message.length() <= 0) ? new l23(new h1((byte) 4), "Unknown error") : new l23(new h1((byte) 4), message));
                return;
        }
    }
}
