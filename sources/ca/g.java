package ca;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.hl0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g extends JSONObject {
    public g(hl0 hl0Var, int i7) {
        switch (i7) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = hl0Var.M0;
                if (obj == null) {
                    g gVar = new g();
                    gVar.put("gateway", "stripe");
                    gVar.put("stripe:publishableKey", hl0Var.j0);
                    gVar.put("stripe:version", "3.5.0");
                    put("parameters", gVar);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                g gVar2 = new g();
                gVar2.put("protocolVersion", "ECv2");
                gVar2.put("publicKey", hl0Var.K0);
                put("parameters", gVar2);
                break;
        }
    }
}
