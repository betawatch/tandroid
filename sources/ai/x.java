package ai;

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.bz;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public x(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.e = xVar;
        this.c = 15000L;
        this.h = new d3.y();
        this.g = h2.g0.a;
    }

    public static x c(android.support.v4.media.session.a0 a0Var, q2 q2Var) {
        long nativeSessionNew;
        t tVar = (t) a0Var.b;
        long k10 = DictationAsr.k(tVar);
        if (k10 == 0) {
            return null;
        }
        x xVar = new x(a0Var, q2Var);
        String a10 = tVar.a((String) a0Var.c);
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, a10.split(",")[0], bz.o() == 0 ? 2 : 4);
        xVar.c = nativeSessionNew;
        if (nativeSessionNew != 0) {
            return xVar;
        }
        DictationAsr.Q(tVar);
        return null;
    }

    public void a() {
        String nativeSessionFinish;
        long j3 = this.c;
        if (j3 == 0) {
            return;
        }
        nativeSessionFinish = DictationAsr.nativeSessionFinish(j3);
        b(nativeSessionFinish);
        DictationAsr.nativeSessionFree(this.c);
        this.c = 0L;
        DictationAsr.Q((t) this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        q2 q2Var = (q2) this.f;
        StringBuilder sb2 = (StringBuilder) this.g;
        if (str == null || str.length() <= 2) {
            return;
        }
        boolean z13 = this.b;
        try {
            JSONArray jSONArray = new JSONArray(str);
            z11 = false;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String optString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
                    int hashCode = optString.hashCode();
                    z10 = true;
                    if (hashCode != -1354815177) {
                        if (hashCode != -792934015) {
                            if (hashCode != 100619) {
                                continue;
                            } else {
                                try {
                                    if (optString.equals("eou") && jSONObject.optDouble("p") > 0.5d) {
                                        z13 = true;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    Log.e("Dictation", "tinyasr: unreadable events (" + str.length() + " chars)", e);
                                    z12 = z13;
                                    if (z11) {
                                    }
                                    i7 = 0;
                                    this.b = (z12 || ((String) this.h).isEmpty()) ? i7 : z10;
                                    if (z12) {
                                    }
                                }
                            }
                        } else if (optString.equals("partial")) {
                            StringBuilder sb3 = new StringBuilder();
                            this.a = DictationAsr.j(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                            DictationAsr.n(sb3, jSONObject.optJSONArray("open"), null);
                            DictationAsr.n(sb3, jSONObject.optJSONArray("tail"), null);
                            this.h = sb3.toString();
                            z11 = true;
                        }
                    } else if (optString.equals("commit")) {
                        DictationAsr.n(sb2, jSONObject.optJSONArray("words"), null);
                        z11 = true;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
            }
            z10 = true;
        } catch (Exception e12) {
            e = e12;
            z10 = true;
            z11 = false;
        }
        z12 = z13;
        if (z11) {
            String sb4 = sb2.toString();
            String str2 = (String) this.h;
            boolean z14 = this.a;
            q2Var.s++;
            if (q2Var.g > sb4.length()) {
                q2Var.g = 0;
            }
            q2Var.h = sb4.length();
            q2Var.i = str2.isEmpty();
            String trim = sb4.substring(q2Var.g).trim();
            if (trim.length() > 180 && str2.isEmpty()) {
                org.telegram.messenger.g0.g3(new n2(q2Var, q2Var.f, trim, z10, 0));
                r2 r2Var = q2Var.t;
                long j3 = r2Var.f;
                r2Var.f = 1 + j3;
                q2Var.f = j3;
                q2Var.g = sb4.length();
                q2Var.m.reset();
                trim = "";
            }
            String q10 = DictationAsr.q(trim, str2, z14);
            if (!q10.equals(q2Var.j)) {
                q2Var.j = q10;
                boolean z15 = 0;
                org.telegram.messenger.g0.g3(new n2(q2Var, q2Var.f, q10, z15, 0));
                i7 = z15;
                this.b = (z12 || ((String) this.h).isEmpty()) ? i7 : z10;
                if (z12 && ((String) this.h).isEmpty() && sb2.length() > 0) {
                    sb2.setLength(i7);
                    q2Var.b();
                    q2Var.h = i7;
                    q2Var.g = i7;
                    return;
                }
                return;
            }
        }
        i7 = 0;
        this.b = (z12 || ((String) this.h).isEmpty()) ? i7 : z10;
        if (z12) {
        }
    }

    public x(android.support.v4.media.session.a0 a0Var, q2 q2Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.e = (t) a0Var.b;
        this.f = q2Var;
    }
}
