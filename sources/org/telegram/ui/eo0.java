package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eo0 extends JSONObject {
    public eo0(ro0 ro0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = ro0Var.M0;
                if (obj == null) {
                    eo0 eo0Var = new eo0();
                    eo0Var.put("gateway", "stripe");
                    eo0Var.put("stripe:publishableKey", ro0Var.j0);
                    eo0Var.put("stripe:version", "3.5.0");
                    put("parameters", eo0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                eo0 eo0Var2 = new eo0();
                eo0Var2.put("protocolVersion", "ECv2");
                eo0Var2.put("publicKey", ro0Var.K0);
                put("parameters", eo0Var2);
                break;
        }
    }
}
