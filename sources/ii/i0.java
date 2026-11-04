package ii;

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
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public h0 f;

    public i0(Context context, int i3, long j10) {
        this.a = context;
        this.b = i3;
        this.c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i3, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    h0 h0Var = new h0(this, new JSONObject(it.next()));
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(h0Var);
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
        for (int i3 = 0; i3 < 4; i3++) {
            context.getSharedPreferences("botdownloads_" + i3, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static i0 c(Context context, int i3, long j10) {
        Pair pair = new Pair(Integer.valueOf(i3), Long.valueOf(j10));
        HashMap hashMap = g;
        i0 i0Var = (i0) hashMap.get(pair);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(context, i3, j10);
        hashMap.put(pair, i0Var2);
        return i0Var2;
    }

    public final void b(String str, String str2) {
        h0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            h0 h0Var = new h0(this, str, str2);
            this.f = h0Var;
            h0Var.l = false;
            this.e.add(h0Var);
            f();
            e();
        }
    }

    public final h0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h0 h0Var = (h0) obj;
            if (TextUtils.equals(h0Var.b, str) && h0Var.h) {
                return h0Var;
            }
        }
        return null;
    }

    public final void e() {
        hs.f(this.b).k(hs.J3, new Object[0]);
    }

    public final void f() {
        int i3 = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", h0Var.b);
                jSONObject.put("file_name", h0Var.c);
                jSONObject.put("size", h0Var.g);
                File file = h0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", h0Var.h);
                jSONObject.put("mime", h0Var.e);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
