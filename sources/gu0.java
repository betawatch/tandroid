// default package

import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gu0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ nv0 d;
    public final /* synthetic */ pv0 e;

    public /* synthetic */ gu0(String[] strArr, int i, nv0 nv0Var, pv0 pv0Var, byte b) {
        this.a = b;
        this.b = strArr;
        this.c = i;
        this.d = nv0Var;
        this.e = pv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pv0 pv0Var = this.e;
        nv0 nv0Var = this.d;
        int i = this.c;
        String[] strArr = this.b;
        switch (b) {
            case 0:
                if (strArr[0] != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", strArr[0]);
                        rv0.t(i, nv0Var, pv0Var, "phone_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                break;
            default:
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", strArr[0]);
                    rv0.t(i, nv0Var, pv0Var, "write_access_requested", jSONObject2);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
