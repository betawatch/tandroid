package f9;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.co0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends JSONObject {
    public f(co0 co0Var, int i9) {
        switch (i9) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = co0Var.I0;
                if (obj == null) {
                    f fVar = new f();
                    fVar.put("gateway", "stripe");
                    fVar.put("stripe:publishableKey", co0Var.f0);
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
                fVar2.put("publicKey", co0Var.G0);
                put("parameters", fVar2);
                break;
        }
    }
}
