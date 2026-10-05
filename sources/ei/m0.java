package ei;

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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class m0 {
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public l0 f;

    public m0(Context context, int i10, long j3) {
        this.a = context;
        this.b = i10;
        this.c = j3;
        this.d = (DownloadManager) context.getSystemService("download");
        Set<String> stringSet = context.getSharedPreferences("botdownloads_" + i10, 0).getStringSet("" + j3, null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    l0 l0Var = new l0(this, new JSONObject(it.next()));
                    File file = l0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(l0Var);
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

    public static m0 c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = g;
        m0 m0Var = (m0) hashMap.get(pair);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(context, i10, j3);
        hashMap.put(pair, m0Var2);
        return m0Var2;
    }

    public final void b(String str, String str2) {
        l0 d = d(str);
        if (d != null) {
            this.f = d;
            d.k = true;
            e();
        } else {
            l0 l0Var = new l0(this, str, str2);
            this.f = l0Var;
            l0Var.l = false;
            this.e.add(l0Var);
            f();
            e();
        }
    }

    public final l0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            if (TextUtils.equals(l0Var.b, str) && l0Var.h) {
                return l0Var;
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
            l0 l0Var = (l0) obj;
            l0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", l0Var.b);
                jSONObject.put("file_name", l0Var.c);
                jSONObject.put("size", l0Var.g);
                File file = l0Var.d;
                jSONObject.put("path", file == null ? null : file.getAbsolutePath());
                jSONObject.put("done", l0Var.h);
                jSONObject.put("mime", l0Var.e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.c, hashSet);
        edit.apply();
    }
}
