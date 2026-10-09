package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class io0 extends JSONObject {
    public io0(vo0 vo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = vo0Var.M0;
                if (obj == null) {
                    io0 io0Var = new io0();
                    io0Var.put("gateway", "stripe");
                    io0Var.put("stripe:publishableKey", vo0Var.j0);
                    io0Var.put("stripe:version", "3.5.0");
                    put("parameters", io0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                io0 io0Var2 = new io0();
                io0Var2.put("protocolVersion", "ECv2");
                io0Var2.put("publicKey", vo0Var.K0);
                put("parameters", io0Var2);
                break;
        }
    }
}
