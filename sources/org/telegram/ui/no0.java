package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class no0 extends JSONObject {
    public no0(ap0 ap0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = ap0Var.M0;
                if (obj == null) {
                    no0 no0Var = new no0();
                    no0Var.put("gateway", "stripe");
                    no0Var.put("stripe:publishableKey", ap0Var.j0);
                    no0Var.put("stripe:version", "3.5.0");
                    put("parameters", no0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                no0 no0Var2 = new no0();
                no0Var2.put("protocolVersion", "ECv2");
                no0Var2.put("publicKey", ap0Var.K0);
                put("parameters", no0Var2);
                break;
        }
    }
}
