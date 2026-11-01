package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gm0 extends JSONObject {
    public gm0(qm0 qm0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = qm0Var.M0;
                if (obj == null) {
                    gm0 gm0Var = new gm0();
                    gm0Var.put("gateway", "stripe");
                    gm0Var.put("stripe:publishableKey", qm0Var.j0);
                    gm0Var.put("stripe:version", "3.5.0");
                    put("parameters", gm0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                gm0 gm0Var2 = new gm0();
                gm0Var2.put("protocolVersion", "ECv2");
                gm0Var2.put("publicKey", qm0Var.K0);
                put("parameters", gm0Var2);
                break;
        }
    }
}
