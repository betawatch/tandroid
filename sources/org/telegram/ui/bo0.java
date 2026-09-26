package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class bo0 extends JSONObject {
    public bo0(oo0 oo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = oo0Var.M0;
                if (obj == null) {
                    bo0 bo0Var = new bo0();
                    bo0Var.put("gateway", "stripe");
                    bo0Var.put("stripe:publishableKey", oo0Var.j0);
                    bo0Var.put("stripe:version", "3.5.0");
                    put("parameters", bo0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                bo0 bo0Var2 = new bo0();
                bo0Var2.put("protocolVersion", "ECv2");
                bo0Var2.put("publicKey", oo0Var.K0);
                put("parameters", bo0Var2);
                break;
        }
    }
}
