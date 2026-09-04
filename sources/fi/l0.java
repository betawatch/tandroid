package fi;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class l0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public k0 f;

    public l0(Context context, int i10, long j3) {
        this.a = context;
        this.b = i10;
        this.c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j3, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    k0 k0Var = new k0(this, new JSONObject(it.next()));
                    File file = k0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(k0Var);
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public static void a() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botdownloads_" + i10, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static l0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = g;
        l0 l0Var = (l0) hashMap.get(pair);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(context, i10, j3);
        hashMap.put(pair, l0Var2);
        return l0Var2;
    }

    public final void b(String str, String str2) {
        k0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            k0 k0Var = new k0(this, str, str2);
            this.f = k0Var;
            k0Var.l = false;
            this.e.add(k0Var);
            f();
            e();
        }
    }

    public final k0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            if (TextUtils.equals(k0Var.b, str) && k0Var.h) {
                return k0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        int i10 = 0;
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botdownloads_" + this.b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            k0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", k0Var.b);
                jSONObject.put("file_name", k0Var.c);
                jSONObject.put("size", k0Var.g);
                File file = k0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", k0Var.h);
                jSONObject.put("mime", k0Var.e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
