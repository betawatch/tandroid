package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class po0 extends JSONObject {
    public po0(cp0 cp0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = cp0Var.M0;
                if (obj == null) {
                    po0 po0Var = new po0();
                    po0Var.put("gateway", "stripe");
                    po0Var.put("stripe:publishableKey", cp0Var.j0);
                    po0Var.put("stripe:version", "3.5.0");
                    put("parameters", po0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                po0 po0Var2 = new po0();
                po0Var2.put("protocolVersion", "ECv2");
                po0Var2.put("publicKey", cp0Var.K0);
                put("parameters", po0Var2);
                break;
        }
    }
}
