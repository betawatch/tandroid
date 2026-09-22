package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jo0 extends JSONObject {
    public jo0(wo0 wo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = wo0Var.M0;
                if (obj == null) {
                    jo0 jo0Var = new jo0();
                    jo0Var.put("gateway", "stripe");
                    jo0Var.put("stripe:publishableKey", wo0Var.j0);
                    jo0Var.put("stripe:version", "3.5.0");
                    put("parameters", jo0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                jo0 jo0Var2 = new jo0();
                jo0Var2.put("protocolVersion", "ECv2");
                jo0Var2.put("publicKey", wo0Var.K0);
                put("parameters", jo0Var2);
                break;
        }
    }
}
