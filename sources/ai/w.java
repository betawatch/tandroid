package ai;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class w {
    public final z a;
    public final t b;
    public final String c;
    public final u1 d;
    public volatile int[] g;
    public int i;
    public boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile String n;
    public r1 o;
    public final StringBuilder e = new StringBuilder();
    public final ArrayList f = new ArrayList();
    public String h = "";
    public volatile int m = -1;

    public w(z zVar, android.support.v4.media.session.a0 a0Var, u1 u1Var) {
        this.a = zVar;
        this.b = (t) a0Var.b;
        this.c = (String) a0Var.c;
        this.d = u1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        int i7;
        if (str == null || str.length() <= 2) {
            return;
        }
        int i10 = 0;
        try {
            JSONArray jSONArray = new JSONArray(str);
            i7 = 0;
            while (i10 < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String optString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
                    int hashCode = optString.hashCode();
                    if (hashCode != -1613589672) {
                        if (hashCode != -1354815177) {
                            if (hashCode == -792934015 && optString.equals("partial")) {
                                StringBuilder sb2 = new StringBuilder();
                                this.j = DictationAsr.j(jSONObject.optJSONArray("open"), jSONObject.optJSONArray("tail"));
                                DictationAsr.n(sb2, jSONObject.optJSONArray("open"), null);
                                this.i = sb2.length();
                                DictationAsr.n(sb2, jSONObject.optJSONArray("tail"), null);
                                this.h = sb2.toString();
                                i7 = 1;
                            }
                        } else if (optString.equals("commit")) {
                            DictationAsr.n(this.e, jSONObject.optJSONArray("words"), this.f);
                            i7 = 1;
                        }
                    } else if (optString.equals("language")) {
                        String optString2 = jSONObject.optString("lang");
                        Log.d("Dictation", "tinyasr: language → " + optString2);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.n = DictationAsr.o(optString2);
                        }
                    }
                    i10++;
                } catch (Exception e10) {
                    e = e10;
                    i10 = i7;
                    Log.e("Dictation", "tinyasr: unreadable events (" + str.length() + " chars)", e);
                    i7 = i10;
                    if (i7 == 0) {
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (i7 == 0) {
            b(null);
        }
    }

    public final void b(Runnable runnable) {
        String sb2 = this.e.toString();
        String str = this.h;
        boolean z10 = this.j;
        int i7 = this.i;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        org.telegram.messenger.g0.g3(new v(this, iArr, sb2, str, z10, i7, runnable));
    }
}
