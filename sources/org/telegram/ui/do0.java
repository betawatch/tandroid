package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class do0 extends JSONObject {
    public do0(qo0 qo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = qo0Var.M0;
                if (obj == null) {
                    do0 do0Var = new do0();
                    do0Var.put("gateway", "stripe");
                    do0Var.put("stripe:publishableKey", qo0Var.j0);
                    do0Var.put("stripe:version", "3.5.0");
                    put("parameters", do0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                do0 do0Var2 = new do0();
                do0Var2.put("protocolVersion", "ECv2");
                do0Var2.put("publicKey", qo0Var.K0);
                put("parameters", do0Var2);
                break;
        }
    }
}
