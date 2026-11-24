// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gv0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ mw0 d;
    public final /* synthetic */ ow0 e;

    public /* synthetic */ gv0(String[] strArr, int i, mw0 mw0Var, ow0 ow0Var, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = i;
        this.d = mw0Var;
        this.e = ow0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ow0 ow0Var = this.e;
        mw0 mw0Var = this.d;
        int i = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        qw0.t(i, mw0Var, ow0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                break;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr[0]);
                    qw0.t(i, mw0Var, ow0Var, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
