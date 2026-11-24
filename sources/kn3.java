// default package

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kn3 {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public kn3(Context context, xcc xccVar) {
        this.d = context.getApplicationContext();
        this.e = xccVar;
        this.c = 15000L;
        this.h = new ycc();
        this.g = bfb.a;
    }

    public static kn3 c(in3 in3Var, p86 p86Var) {
        long nativeSessionNew;
        gn3 gn3Var = (gn3) in3Var.b;
        long h = DictationAsr.h(gn3Var);
        if (h == 0) {
            return null;
        }
        kn3 kn3Var = new kn3(in3Var, p86Var);
        String a = gn3Var.a((String) in3Var.c);
        nativeSessionNew = DictationAsr.nativeSessionNew(h, a, a.split(",")[0], gda.o() == 0 ? 2 : 4);
        kn3Var.c = nativeSessionNew;
        if (nativeSessionNew != 0) {
            return kn3Var;
        }
        DictationAsr.S(gn3Var);
        return null;
    }

    public final void a() {
        String nativeSessionFinish;
        long j = this.c;
        if (j == 0) {
            return;
        }
        nativeSessionFinish = DictationAsr.nativeSessionFinish(j);
        b(nativeSessionFinish);
        DictationAsr.nativeSessionFree(this.c);
        this.c = 0L;
        DictationAsr.S((gn3) this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        p86 p86Var = (p86) this.f;
        StringBuilder sb = (StringBuilder) this.g;
        if (str == null || str.length() <= 2) {
            return;
        }
        boolean z4 = this.b;
        try {
            JSONArray jSONArray = new JSONArray(str);
            z2 = false;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
                    int hashCode = optString.hashCode();
                    z = true;
                    if (hashCode != -1354815177) {
                        if (hashCode != -792934015) {
                            if (hashCode == 100619) {
                                try {
                                    if (optString.equals("eou") && jSONObject.optDouble("p") > 0.5d) {
                                        z4 = true;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    Log.e("Dictation", "tinyasr: unreadable events (" + str.length() + " chars)", e);
                                    z3 = z4;
                                    if (z2) {
                                    }
                                    i = 0;
                                    this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
                                    if (z3) {
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (optString.equals("partial")) {
                            StringBuilder sb2 = new StringBuilder();
                            this.a = DictationAsr.v(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                            DictationAsr.l(sb2, jSONObject.optJSONArray("open"), null);
                            DictationAsr.l(sb2, jSONObject.optJSONArray("tail"), null);
                            this.h = sb2.toString();
                            z2 = true;
                        }
                    } else if (optString.equals("commit")) {
                        DictationAsr.l(sb, jSONObject.optJSONArray("words"), null);
                        z2 = true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
            }
            z = true;
        } catch (Exception e3) {
            e = e3;
            z = true;
            z2 = false;
        }
        z3 = z4;
        if (z2) {
            String sb3 = sb.toString();
            String str2 = (String) this.h;
            boolean z5 = this.a;
            p86Var.w++;
            if (p86Var.g > sb3.length()) {
                p86Var.g = 0;
            }
            p86Var.h = sb3.length();
            p86Var.i = str2.isEmpty();
            String trim = sb3.substring(p86Var.g).trim();
            if (trim.length() > 180 && str2.isEmpty()) {
                gm.c3(new i71((Object) p86Var, p86Var.f, (Object) trim, z, (byte) 2));
                q86 q86Var = p86Var.x;
                long j = q86Var.f;
                q86Var.f = 1 + j;
                p86Var.f = j;
                p86Var.g = sb3.length();
                p86Var.q.reset();
                trim = "";
            }
            String o = DictationAsr.o(trim, str2, z5);
            if (!o.equals(p86Var.j)) {
                p86Var.j = o;
                boolean z6 = 0;
                gm.c3(new i71((Object) p86Var, p86Var.f, (Object) o, z6, (byte) 2));
                i = z6;
                this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
                if (z3 && ((String) this.h).isEmpty() && sb.length() > 0) {
                    sb.setLength(i);
                    p86Var.b();
                    p86Var.h = i;
                    p86Var.g = i;
                    return;
                }
                return;
            }
        }
        i = 0;
        this.b = (z3 || ((String) this.h).isEmpty()) ? i : z;
        if (z3) {
        }
    }

    public kn3(in3 in3Var, p86 p86Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = in3Var;
        this.e = (gn3) in3Var.b;
        this.f = p86Var;
    }
}
