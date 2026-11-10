package ca;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.kl0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends JSONObject {
    public g(kl0 kl0Var, int i7) {
        switch (i7) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = kl0Var.M0;
                if (obj == null) {
                    g gVar = new g();
                    gVar.put("gateway", "stripe");
                    gVar.put("stripe:publishableKey", kl0Var.j0);
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
                gVar2.put("publicKey", kl0Var.K0);
                put("parameters", gVar2);
                break;
        }
    }
}
