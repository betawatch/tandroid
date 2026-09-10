package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
