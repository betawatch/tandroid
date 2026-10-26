package org.telegram.ui.Components;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class fb1 {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final k5 e = new k5(22);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final u7.s k = new u7.s(15);

    public static void a(db1 db1Var) {
        AndroidUtilities.cancelRunOnUIThread(db1Var.v);
        if (g.remove(db1Var)) {
            q();
            j();
        }
    }

    public static void b() {
        ArrayList arrayList = h;
        if (arrayList.isEmpty() || !o()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            AndroidUtilities.runOnUIThread((Runnable) obj);
        }
    }

    public static int c(int i10) {
        return Math.round(i10 / AndroidUtilities.density);
    }

    public static db1 d(jb1 jb1Var) {
        if (jb1Var == null) {
            return null;
        }
        return (db1) a.get(jb1Var.a);
    }

    public static jb1 e(String str) {
        String str2;
        db1 db1Var = i(str) ? (db1) a.get(str) : null;
        if (db1Var == null) {
            return null;
        }
        synchronized (db1Var) {
            try {
                if (db1Var.i == null) {
                    if (db1Var.h == null) {
                        db1Var.h = h(db1Var.g);
                    }
                    if (db1Var.h == null) {
                        return null;
                    }
                    jb1 jb1Var = new jb1(ApplicationLoader.applicationContext, db1Var.a, db1Var.h);
                    try {
                        str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    jb1Var.t = str2;
                    jb1Var.u = null;
                    jb1Var.e = k;
                    db1Var.i = jb1Var;
                }
                return db1Var.i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f() {
        AndroidUtilities.cancelRunOnUIThread(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (db1 db1Var : hashMap.values()) {
            JSONObject jSONObject = (JSONObject) c.get(db1Var.a());
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("local") : null;
            MessagesStorage.getInstance(db1Var.b).putWidgetStorage(db1Var.c, db1Var.d, (optJSONObject == null || optJSONObject.length() == 0) ? "" : optJSONObject.toString());
        }
        hashMap.clear();
    }

    public static String g(String str, jb1 jb1Var, int i10) {
        int[] iArr = null;
        db1 db1Var = i(str) ? (db1) a.get(str) : null;
        if (db1Var == null) {
            return "none";
        }
        if (db1Var.f > 0) {
            return "anchor " + db1Var.f;
        }
        if (jb1Var != null && Math.abs(jb1Var.k - i10) <= 1 && jb1Var.i > 0) {
            return "frame";
        }
        eb1 eb1Var = (eb1) b.get(db1Var.a());
        if (eb1Var != null) {
            int c10 = c(i10);
            synchronized (eb1Var) {
                ArrayList arrayList = eb1Var.a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    int[] iArr2 = (int[]) obj;
                    if (iArr == null || Math.abs(iArr2[0] - c10) < Math.abs(iArr[0] - c10)) {
                        iArr = iArr2;
                    }
                }
            }
        }
        if (iArr == null || iArr[1] <= 0) {
            return "placeholder";
        }
        if (iArr[0] == c(i10)) {
            return "cache";
        }
        return "cache of width " + iArr[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if ((r8[1] & 255) == 139) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String h(byte[] bArr) {
        boolean z10;
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 2 && (bArr[0] & 255) == 31) {
            z10 = true;
        }
        z10 = false;
        try {
            InputStream gZIPInputStream = z10 ? new GZIPInputStream(new ByteArrayInputStream(bArr)) : new InflaterInputStream(new ByteArrayInputStream(bArr));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 4);
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("widget payload: ");
                        sb2.append(z10 ? "gzip" : "zlib");
                        sb2.append(", ");
                        sb2.append(bArr.length);
                        sb2.append(" -> ");
                        sb2.append(byteArrayOutputStream.size());
                        sb2.append(" bytes");
                        FileLog.d(sb2.toString());
                    }
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    return str;
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static boolean i(String str) {
        return str != null && str.startsWith("tg-widget:");
    }

    public static void j() {
        String a2;
        while (true) {
            ArrayList arrayList = g;
            if (arrayList.size() >= 3 || j) {
                return;
            }
            ArrayList arrayList2 = f;
            long j10 = Long.MAX_VALUE;
            db1 db1Var = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                db1 db1Var2 = (db1) arrayList2.get(size);
                if (db1Var2.o) {
                    long j11 = 9223372036854775806L;
                    for (db1 db1Var3 : a.values()) {
                        if (db1Var3.m != 0 && db1Var3.b == db1Var2.b && db1Var3.c == db1Var2.c) {
                            j11 = Math.min(j11, Math.abs(db1Var3.d - db1Var2.d));
                        }
                    }
                    if (j11 < j10) {
                        db1Var = db1Var2;
                        j10 = j11;
                    }
                }
            }
            if (db1Var == null) {
                return;
            }
            arrayList2.remove(db1Var);
            jb1 jb1Var = db1Var.i;
            if (jb1Var != null && !db1Var.s && db1Var.m <= 0) {
                String g7 = g(db1Var.a, jb1Var, db1Var.t);
                if (g7.equals("placeholder") || g7.startsWith("cache of width")) {
                    jb1Var.l(db1Var.t);
                    if (jb1Var.s == null && (a2 = zb1.a(null, db1Var.u)) != null && !a2.equals(jb1Var.s)) {
                        jb1Var.s = a2;
                        jb1Var.m = a2.contains("\"dark\"");
                        yb1 yb1Var = jb1Var.f;
                        if (yb1Var != null) {
                            yb1Var.d(a2);
                        }
                    }
                    if (!jb1Var.o) {
                        arrayList.add(db1Var);
                        p(db1Var);
                        AndroidUtilities.runOnUIThread(db1Var.v, 4000L);
                    }
                }
            }
        }
    }

    public static an0 k(ArrayList arrayList) {
        int size = arrayList.size();
        an0 an0Var = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            an0 an0Var2 = (an0) obj;
            if (an0Var == null || an0Var2.h > an0Var.h) {
                an0Var = an0Var2;
            }
        }
        return an0Var;
    }

    public static void l(boolean z10) {
        if (j == z10) {
            return;
        }
        j = z10;
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            jb1 jb1Var = ((db1) it.next()).i;
            if (jb1Var != null && jb1Var.p != z10) {
                jb1Var.p = z10;
                yb1 yb1Var = jb1Var.f;
                if (yb1Var != null) {
                    yb1Var.e(jb1Var.n && !z10);
                }
            }
        }
        if (z10) {
            f();
        } else {
            j();
        }
    }

    public static void m(int i10) {
        AndroidUtilities.runOnUIThread(new hi.t2(i10, 13));
    }

    public static void n(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static boolean o() {
        yb1 yb1Var;
        vb1 vb1Var;
        for (db1 db1Var : a.values()) {
            jb1 jb1Var = db1Var.i;
            an0 an0Var = db1Var.l;
            if (db1Var.m != 0 && jb1Var != null && an0Var != null && !db1Var.s && ((yb1Var = jb1Var.f) == null || (vb1Var = yb1Var.D) == null || (!vb1Var.g && !yb1Var.v))) {
                String g7 = g(db1Var.a, jb1Var, an0Var.q());
                if (g7.equals("placeholder") || g7.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void p(db1 db1Var) {
        yb1 yb1Var;
        jb1 jb1Var = db1Var.i;
        boolean z10 = false;
        if (db1Var.s) {
            if (db1Var.q >= 2) {
                return;
            }
            db1Var.s = false;
            jb1Var.m();
        }
        if (jb1Var.o) {
            return;
        }
        jb1Var.o = true;
        yb1 yb1Var2 = jb1Var.f;
        if (yb1Var2 != null) {
            yb1Var2.y = true;
            return;
        }
        String str = jb1Var.s;
        if (str == null && jb1Var.t == null && jb1Var.u == null) {
            yb1Var = new yb1(jb1Var.c, jb1Var.b, zb1.d(jb1Var.m), jb1Var.d, null, null);
        } else {
            Context context = jb1Var.c;
            String str2 = jb1Var.b;
            if (str == null) {
                str = zb1.d(jb1Var.m);
            }
            yb1Var = new yb1(context, str2, str, jb1Var.d, jb1Var.t, jb1Var.u);
        }
        yb1Var.H = jb1Var;
        yb1Var.K = jb1Var;
        if (jb1Var.n && !jb1Var.p) {
            z10 = true;
        }
        yb1Var.e(z10);
        jb1Var.f = yb1Var;
        jb1Var.q++;
        qb1.a.execute(new h2(yb1Var, jb1Var.j, 14));
    }

    public static void q() {
        ArrayList arrayList = new ArrayList();
        for (db1 db1Var : a.values()) {
            if (db1Var.i != null && db1Var.m == 0 && !g.contains(db1Var)) {
                arrayList.add(db1Var);
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(27));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jb1 jb1Var = ((db1) arrayList.get(i10)).i;
            if (i10 >= 4) {
                jb1Var.m();
            }
            if (i10 >= 12 && jb1Var.f == null) {
                jb1Var.g = null;
            }
        }
    }
}
