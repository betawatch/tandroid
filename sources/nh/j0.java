package nh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public i0 f;

    public j0(Context context, int i10, long j10) {
        this.a = context;
        this.b = i10;
        this.c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j10, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    i0 i0Var = new i0(this, new JSONObject(it.next()));
                    File file = i0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(i0Var);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
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

    public static j0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        j0 j0Var = (j0) hashMap.get(pair);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(context, i10, j10);
        hashMap.put(pair, j0Var2);
        return j0Var2;
    }

    public final void b(String str, String str2) {
        i0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            i0 i0Var = new i0(this, str, str2);
            this.f = i0Var;
            i0Var.l = false;
            this.e.add(i0Var);
            f();
            e();
        }
    }

    public final i0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (TextUtils.equals(i0Var.b, str) && i0Var.h) {
                return i0Var;
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
            i0 i0Var = (i0) obj;
            i0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", i0Var.b);
                jSONObject.put("file_name", i0Var.c);
                jSONObject.put("size", i0Var.g);
                File file = i0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", i0Var.h);
                jSONObject.put("mime", i0Var.e);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
