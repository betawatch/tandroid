// default package

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gd7 extends JSONObject {
    public gd7(p pVar, byte b) {
        switch (b) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = pVar.N0;
                if (obj == null) {
                    gd7 gd7Var = new gd7();
                    gd7Var.put("gateway", "stripe");
                    gd7Var.put("stripe:publishableKey", pVar.k0);
                    gd7Var.put("stripe:version", "3.5.0");
                    put("parameters", gd7Var);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                gd7 gd7Var2 = new gd7();
                gd7Var2.put("protocolVersion", "ECv2");
                gd7Var2.put("publicKey", pVar.L0);
                put("parameters", gd7Var2);
                break;
        }
    }
}
