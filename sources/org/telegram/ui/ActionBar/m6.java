package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m6 {
    public String a = "";
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public float k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public s6 p;
    public r6 q;
    public float r;
    public ArrayList s;
    public TLRPC.WallPaper t;

    public static void a(m6 m6Var) {
        org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0).edit().remove(m6Var.b()).commit();
        new File(org.telegram.messenger.w0.h(), m6Var.a).delete();
        new File(org.telegram.messenger.w0.h(), m6Var.b).delete();
    }

    public final String b() {
        if (this.q == null) {
            return a1.g.r(new StringBuilder(), this.p.a, "_owp");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.p.a);
        sb2.append("_");
        return a1.g.p(sb2, this.q.a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.a);
            jSONObject.put("owall", this.b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f);
            jSONObject.put("pGrColor3", this.g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.i);
            jSONObject.put("wMotion", this.j);
            jSONObject.put("pIntensity", this.k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }
}
