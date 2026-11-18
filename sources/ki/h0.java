package ki;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public g0 f;

    public h0(Context context, int i7, long j3) {
        this.a = context;
        this.b = i7;
        this.c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i7, 0).getStringSet("" + j3, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    g0 g0Var = new g0(this, new JSONObject(it.next()));
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(g0Var);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.t0.b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botdownloads_" + i7, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static h0 c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = g;
        h0 h0Var = (h0) hashMap.get(pair);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(context, i7, j3);
        hashMap.put(pair, h0Var2);
        return h0Var2;
    }

    public final void b(String str, String str2) {
        g0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            g0 g0Var = new g0(this, str, str2);
            this.f = g0Var;
            g0Var.l = false;
            this.e.add(g0Var);
            f();
            e();
        }
    }

    public final g0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g0 g0Var = (g0) obj;
            if (TextUtils.equals(g0Var.b, str) && g0Var.h) {
                return g0Var;
            }
        }
        return null;
    }

    public final void e() {
        ks.f(this.b).k(ks.M3, new Object[0]);
    }

    public final void f() {
        int i7 = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g0 g0Var = (g0) obj;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", g0Var.b);
                jSONObject.put("file_name", g0Var.c);
                jSONObject.put("size", g0Var.g);
                File file = g0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", g0Var.h);
                jSONObject.put("mime", g0Var.e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
