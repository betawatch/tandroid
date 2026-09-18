package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lo0 extends JSONObject {
    public lo0(yo0 yo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = yo0Var.M0;
                if (obj == null) {
                    lo0 lo0Var = new lo0();
                    lo0Var.put("gateway", "stripe");
                    lo0Var.put("stripe:publishableKey", yo0Var.j0);
                    lo0Var.put("stripe:version", "3.5.0");
                    put("parameters", lo0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                lo0 lo0Var2 = new lo0();
                lo0Var2.put("protocolVersion", "ECv2");
                lo0Var2.put("publicKey", yo0Var.K0);
                put("parameters", lo0Var2);
                break;
        }
    }
}
