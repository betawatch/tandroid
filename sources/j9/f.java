package j9;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.jo0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends JSONObject {
    public f(jo0 jo0Var, int i10) {
        switch (i10) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = jo0Var.J0;
                if (obj == null) {
                    f fVar = new f();
                    fVar.put("gateway", "stripe");
                    fVar.put("stripe:publishableKey", jo0Var.g0);
                    fVar.put("stripe:version", "3.5.0");
                    put("parameters", fVar);
                    break;
                } else {
                    put("parameters", obj);
                    break;
                }
            default:
                put(TeXSymbolParser.TYPE_ATTR, "DIRECT");
                f fVar2 = new f();
                fVar2.put("protocolVersion", "ECv2");
                fVar2.put("publicKey", jo0Var.H0);
                put("parameters", fVar2);
                break;
        }
    }
}
