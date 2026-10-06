package org.telegram.ui;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fo0 extends JSONObject {
    public fo0(so0 so0Var, int i10) {
        switch (i10) {
            case 3:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = so0Var.M0;
                if (obj == null) {
                    fo0 fo0Var = new fo0();
                    fo0Var.put("gateway", "stripe");
                    fo0Var.put("stripe:publishableKey", so0Var.j0);
                    fo0Var.put("stripe:version", "3.5.0");
                    put("parameters", fo0Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                fo0 fo0Var2 = new fo0();
                fo0Var2.put("protocolVersion", "ECv2");
                fo0Var2.put("publicKey", so0Var.K0);
                put("parameters", fo0Var2);
                break;
        }
    }
}
