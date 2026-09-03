package j9;

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.lo0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f extends JSONObject {
    public f(lo0 lo0Var, int i10) {
        switch (i10) {
            case 4:
                put(TeXSymbolParser.TYPE_ATTR, "PAYMENT_GATEWAY");
                Object obj = lo0Var.J0;
                if (obj == null) {
                    f fVar = new f();
                    fVar.put("gateway", "stripe");
                    fVar.put("stripe:publishableKey", lo0Var.g0);
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
                fVar2.put("publicKey", lo0Var.H0);
                put("parameters", fVar2);
                break;
        }
    }
}
