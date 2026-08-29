package h9;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.bo0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends JSONObject {
    public f(bo0 bo0Var, int i10) {
        switch (i10) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = bo0Var.I0;
                if (obj == null) {
                    f fVar = new f();
                    fVar.put("gateway", "stripe");
                    fVar.put("stripe:publishableKey", bo0Var.f0);
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
                fVar2.put("publicKey", bo0Var.G0);
                put("parameters", fVar2);
                break;
        }
    }
}
