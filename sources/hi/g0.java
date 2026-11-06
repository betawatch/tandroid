package hi;

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
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class g0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public f0 f;

    public g0(Context context, int i7, long j3) {
        this.a = context;
        this.b = i7;
        this.c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i7, 0).getStringSet("" + j3, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    f0 f0Var = new f0(this, new JSONObject(it.next()));
                    File file = f0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(f0Var);
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

    public static g0 c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = g;
        g0 g0Var = (g0) hashMap.get(pair);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(context, i7, j3);
        hashMap.put(pair, g0Var2);
        return g0Var2;
    }

    public final void b(String str, String str2) {
        f0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            f0 f0Var = new f0(this, str, str2);
            this.f = f0Var;
            f0Var.l = false;
            this.e.add(f0Var);
            f();
            e();
        }
    }

    public final f0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0 f0Var = (f0) obj;
            if (TextUtils.equals(f0Var.b, str) && f0Var.h) {
                return f0Var;
            }
        }
        return null;
    }

    public final void e() {
        qs.f(this.b).k(qs.J3, new Object[0]);
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
            f0 f0Var = (f0) obj;
            f0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", f0Var.b);
                jSONObject.put("file_name", f0Var.c);
                jSONObject.put("size", f0Var.g);
                File file = f0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", f0Var.h);
                jSONObject.put("mime", f0Var.e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
