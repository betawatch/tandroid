package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c6 {
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
    public i6 p;
    public h6 q;
    public float r;
    public ArrayList s;
    public TLRPC.WallPaper t;

    public static void a(c6 c6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.b).delete();
    }

    public final String b() {
        if (this.q == null) {
            return android.support.v4.media.a.r(new StringBuilder(), this.p.a, "_owp");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.a);
        sb.append("_");
        return android.support.v4.media.a.m(this.q.a, "_owp", sb);
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
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
            FileLog.e(th2);
        }
    }
}
