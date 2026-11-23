package ai;

import android.content.Context;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.bz;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u {
    public boolean a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public u(Context context, d3.x xVar) {
        this.d = context.getApplicationContext();
        this.e = xVar;
        this.c = 15000L;
        this.h = new d3.y();
        this.g = h2.g0.a;
    }

    public static u c(android.support.v4.media.session.a0 a0Var, i2 i2Var) {
        long nativeSessionNew;
        q qVar = (q) a0Var.b;
        long k10 = DictationAsr.k(qVar);
        if (k10 == 0) {
            return null;
        }
        u uVar = new u(a0Var, i2Var);
        String a10 = qVar.a((String) a0Var.c);
        nativeSessionNew = DictationAsr.nativeSessionNew(k10, a10, a10.split(",")[0], bz.o() == 0 ? 2 : 4);
        uVar.c = nativeSessionNew;
        if (nativeSessionNew != 0) {
            return uVar;
        }
        DictationAsr.T(qVar);
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
        DictationAsr.T((q) this.e);
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
        i2 i2Var = (i2) this.f;
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
                            DictationAsr.o(sb3, jSONObject.optJSONArray("open"), null);
                            DictationAsr.o(sb3, jSONObject.optJSONArray("tail"), null);
                            this.h = sb3.toString();
                            z11 = true;
                        }
                    } else if (optString.equals("commit")) {
                        DictationAsr.o(sb2, jSONObject.optJSONArray("words"), null);
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
            i2Var.w++;
            if (i2Var.g > sb4.length()) {
                i2Var.g = 0;
            }
            i2Var.h = sb4.length();
            i2Var.i = str2.isEmpty();
            String trim = sb4.substring(i2Var.g).trim();
            if (trim.length() > 180 && str2.isEmpty()) {
                org.telegram.messenger.g0.g3(new f2(i2Var, i2Var.f, trim, z10, 0));
                j2 j2Var = i2Var.x;
                long j3 = j2Var.f;
                j2Var.f = 1 + j3;
                i2Var.f = j3;
                i2Var.g = sb4.length();
                i2Var.q.reset();
                trim = "";
            }
            String r10 = DictationAsr.r(trim, str2, z14);
            if (!r10.equals(i2Var.j)) {
                i2Var.j = r10;
                boolean z15 = 0;
                org.telegram.messenger.g0.g3(new f2(i2Var, i2Var.f, r10, z15, 0));
                i7 = z15;
                this.b = (z12 || ((String) this.h).isEmpty()) ? i7 : z10;
                if (z12 && ((String) this.h).isEmpty() && sb2.length() > 0) {
                    sb2.setLength(i7);
                    i2Var.b();
                    i2Var.h = i7;
                    i2Var.g = i7;
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

    public u(android.support.v4.media.session.a0 a0Var, i2 i2Var) {
        this.g = new StringBuilder();
        this.h = "";
        this.d = a0Var;
        this.e = (q) a0Var.b;
        this.f = i2Var;
    }
}
