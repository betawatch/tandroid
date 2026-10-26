package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class co0 extends JSONObject {
    public co0(po0 po0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = po0Var.M0;
                if (obj == null) {
                    co0 co0Var = new co0();
                    co0Var.put("gateway", "stripe");
                    co0Var.put("stripe:publishableKey", po0Var.j0);
                    co0Var.put("stripe:version", "3.5.0");
                    put("parameters", co0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                co0 co0Var2 = new co0();
                co0Var2.put("protocolVersion", "ECv2");
                co0Var2.put("publicKey", po0Var.K0);
                put("parameters", co0Var2);
                break;
        }
    }
}
