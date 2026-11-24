// default package

import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nw0 {
    public final String a;
    public final String b;
    public final int c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public nw0(JSONObject jSONObject) {
        this.c = -1;
        this.a = jSONObject.getString("id");
        String string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
        switch (string.hashCode()) {
            case -1829997182:
                if (string.equals("destructive")) {
                    this.c = cmb.p7;
                    break;
                }
                break;
            case -1367724422:
                if (string.equals("cancel")) {
                    this.b = jb6.M0(2131752542, null);
                    return;
                }
                break;
            case 3548:
                if (string.equals("ok")) {
                    this.b = jb6.M0(2131747564, null);
                    return;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    this.b = jb6.M0(2131751978, null);
                    return;
                }
                break;
            case 1544803905:
                string.equals("default");
                break;
        }
        this.b = jSONObject.getString("text");
    }
}
