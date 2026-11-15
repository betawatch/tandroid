package ai;

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public w(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.e = xVar;
        this.c = 15000L;
        this.h = new d3.y();
        this.g = h2.g0.a;
    }

    public static w c(android.support.v4.media.session.a0 a0Var, n2 n2Var) {
        long nativeSessionNew;
        long k10 = DictationAsr.k((s) a0Var.b);
        if (k10 == 0) {
            return null;
        }
        w wVar = new w(a0Var, n2Var);
        String str = (String) a0Var.c;
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, str, str.split(",")[0]);
        wVar.c = nativeSessionNew;
        if (nativeSessionNew != 0) {
            return wVar;
        }
        DictationAsr.M((s) a0Var.b);
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
        DictationAsr.M((s) this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        n2 n2Var = (n2) this.f;
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
                                    Log.e("Dictation", "tinyasr: events ".concat(str), e);
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
                            this.a = DictationAsr.h(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
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
            n2Var.s++;
            if (n2Var.g > sb4.length()) {
                n2Var.g = 0;
            }
            n2Var.h = sb4.length();
            n2Var.i = str2.isEmpty();
            String trim = sb4.substring(n2Var.g).trim();
            if (trim.length() > 180 && str2.isEmpty()) {
                org.telegram.messenger.g0.h3(new k2(n2Var, n2Var.f, trim, z10, 0));
                o2 o2Var = n2Var.t;
                long j3 = o2Var.f;
                o2Var.f = 1 + j3;
                n2Var.f = j3;
                n2Var.g = sb4.length();
                n2Var.m.reset();
                trim = "";
            }
            String p10 = DictationAsr.p(trim, str2, z14);
            if (!p10.equals(n2Var.j)) {
                n2Var.j = p10;
                boolean z15 = 0;
                org.telegram.messenger.g0.h3(new k2(n2Var, n2Var.f, p10, z15, 0));
                i7 = z15;
                this.b = (z12 || ((String) this.h).isEmpty()) ? i7 : z10;
                if (z12 && ((String) this.h).isEmpty() && sb2.length() > 0) {
                    sb2.setLength(i7);
                    n2Var.b();
                    n2Var.h = i7;
                    n2Var.g = i7;
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

    public w(android.support.v4.media.session.a0 a0Var, n2 n2Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.e = (s) a0Var.b;
        this.f = n2Var;
    }
}
