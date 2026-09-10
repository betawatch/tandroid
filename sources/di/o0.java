package di;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public n0 f;

    public o0(Context context, int i10, long j3) {
        this.a = context;
        this.b = i10;
        this.c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j3, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    n0 n0Var = new n0(this, new JSONObject(it.next()));
                    File file = n0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(n0Var);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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

    public static o0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = g;
        o0 o0Var = (o0) hashMap.get(pair);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(context, i10, j3);
        hashMap.put(pair, o0Var2);
        return o0Var2;
    }

    public final void b(String str, String str2) {
        n0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            n0 n0Var = new n0(this, str, str2);
            this.f = n0Var;
            n0Var.l = false;
            this.e.add(n0Var);
            f();
            e();
        }
    }

    public final n0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            n0 n0Var = (n0) obj;
            if (TextUtils.equals(n0Var.b, str) && n0Var.h) {
                return n0Var;
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
            n0 n0Var = (n0) obj;
            n0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", n0Var.b);
                jSONObject.put("file_name", n0Var.c);
                jSONObject.put("size", n0Var.g);
                File file = n0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", n0Var.h);
                jSONObject.put("mime", n0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
