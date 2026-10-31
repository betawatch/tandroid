package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class im0 extends JSONObject {
    public im0(sm0 sm0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = sm0Var.M0;
                if (obj == null) {
                    im0 im0Var = new im0();
                    im0Var.put("gateway", "stripe");
                    im0Var.put("stripe:publishableKey", sm0Var.j0);
                    im0Var.put("stripe:version", "3.5.0");
                    put("parameters", im0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                im0 im0Var2 = new im0();
                im0Var2.put("protocolVersion", "ECv2");
                im0Var2.put("publicKey", sm0Var.K0);
                put("parameters", im0Var2);
                break;
        }
    }
}
