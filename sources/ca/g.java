package ca;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.hl0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
