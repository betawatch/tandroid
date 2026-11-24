// default package

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
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class mq0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public lq0 f;

    public mq0(Context context, int i, long j) {
        this.a = context;
        this.b = i;
        this.c = j;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i, 0).getStringSet(String.valueOf(j), null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    lq0 lq0Var = new lq0(this, new JSONObject(it.next()));
                    File file = lq0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(lq0Var);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public static void a() {
        Context context = a.b;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("botdownloads_" + i, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static mq0 c(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap hashMap = g;
        mq0 mq0Var = (mq0) hashMap.get(pair);
        if (mq0Var != null) {
            return mq0Var;
        }
        mq0 mq0Var2 = new mq0(context, i, j);
        hashMap.put(pair, mq0Var2);
        return mq0Var2;
    }

    public final void b(String str, String str2) {
        lq0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            lq0 lq0Var = new lq0(this, str, str2);
            this.f = lq0Var;
            lq0Var.l = false;
            this.e.add(lq0Var);
            f();
            e();
        }
    }

    public final lq0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lq0 lq0Var = (lq0) obj;
            if (TextUtils.equals(lq0Var.b, str) && lq0Var.h) {
                return lq0Var;
            }
        }
        return null;
    }

    public final void e() {
        nm7.f(this.b).k(nm7.M3, new Object[0]);
    }

    public final void f() {
        int i = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lq0 lq0Var = (lq0) obj;
            lq0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", lq0Var.b);
                jSONObject.put("file_name", lq0Var.c);
                jSONObject.put("size", lq0Var.g);
                File file = lq0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", lq0Var.h);
                jSONObject.put("mime", lq0Var.e);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet(String.valueOf(this.c), hashSet);
        edit.apply();
    }
}
