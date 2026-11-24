// default package

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class if7 extends JSONObject {
    public if7(p pVar, byte b) {
        switch (b) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = pVar.N0;
                if (obj == null) {
                    if7 if7Var = new if7();
                    if7Var.put("gateway", "stripe");
                    if7Var.put("stripe:publishableKey", pVar.k0);
                    if7Var.put("stripe:version", "3.5.0");
                    put("parameters", if7Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                if7 if7Var2 = new if7();
                if7Var2.put("protocolVersion", "ECv2");
                if7Var2.put("publicKey", pVar.L0);
                put("parameters", if7Var2);
                break;
        }
    }
}
