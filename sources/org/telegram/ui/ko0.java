package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class ko0 extends JSONObject {
    public ko0(xo0 xo0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = xo0Var.M0;
                if (obj == null) {
                    ko0 ko0Var = new ko0();
                    ko0Var.put("gateway", "stripe");
                    ko0Var.put("stripe:publishableKey", xo0Var.j0);
                    ko0Var.put("stripe:version", "3.5.0");
                    put("parameters", ko0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                ko0 ko0Var2 = new ko0();
                ko0Var2.put("protocolVersion", "ECv2");
                ko0Var2.put("publicKey", xo0Var.K0);
                put("parameters", ko0Var2);
                break;
        }
    }
}
