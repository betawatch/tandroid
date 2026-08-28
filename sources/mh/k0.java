package mh;

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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public j0 f;

    public k0(Context context, int i9, long j10) {
        this.a = context;
        this.b = i9;
        this.c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i9, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    j0 j0Var = new j0(this, new JSONObject(it.next()));
                    File file = j0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(j0Var);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public static void a() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            context.getSharedPreferences("botdownloads_" + i9, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static k0 c(Context context, int i9, long j10) {
        Pair pair = new Pair(Integer.valueOf(i9), Long.valueOf(j10));
        HashMap hashMap = g;
        k0 k0Var = (k0) hashMap.get(pair);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(context, i9, j10);
        hashMap.put(pair, k0Var2);
        return k0Var2;
    }

    public final void b(String str, String str2) {
        j0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            j0 j0Var = new j0(this, str, str2);
            this.f = j0Var;
            j0Var.l = false;
            this.e.add(j0Var);
            f();
            e();
        }
    }

    public final j0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            j0 j0Var = (j0) obj;
            if (TextUtils.equals(j0Var.b, str) && j0Var.h) {
                return j0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        int i9 = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            j0 j0Var = (j0) obj;
            j0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", j0Var.b);
                jSONObject.put("file_name", j0Var.c);
                jSONObject.put("size", j0Var.g);
                File file = j0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", j0Var.h);
                jSONObject.put("mime", j0Var.e);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
