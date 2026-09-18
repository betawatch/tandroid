package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
