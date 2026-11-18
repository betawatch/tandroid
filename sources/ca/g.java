package ca;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.ml0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g extends JSONObject {
    public g(ml0 ml0Var, int i7) {
        switch (i7) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = ml0Var.N0;
                if (obj == null) {
                    g gVar = new g();
                    gVar.put("gateway", "stripe");
                    gVar.put("stripe:publishableKey", ml0Var.k0);
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
                gVar2.put("publicKey", ml0Var.L0);
                put("parameters", gVar2);
                break;
        }
    }
}
