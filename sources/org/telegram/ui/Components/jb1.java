package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class jb1 {
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
    public static final HashMap k = new HashMap();
    public static final u7.s l = new u7.s(15);

    public static void a(gb1 gb1Var) {
        AndroidUtilities.cancelRunOnUIThread(gb1Var.F);
        if (g.remove(gb1Var)) {
            x();
            n();
        }
    }

    public static void b() {
        ArrayList arrayList = h;
        if (arrayList.isEmpty() || !u()) {
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

    public static void c(gb1 gb1Var, String str, String str2) {
        if (TextUtils.equals(gb1Var.n, str) && TextUtils.equals(gb1Var.o, str2)) {
            return;
        }
        gb1Var.n = str;
        gb1Var.o = str2;
        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = gb1Var.q;
        if (tL_messageMediaWidget != null) {
            tL_messageMediaWidget.chat_data = str;
            tL_messageMediaWidget.public_data = str2;
            tL_messageMediaWidget.public_data_hash = gb1Var.p;
        }
        nb1 nb1Var = gb1Var.s;
        if (nb1Var != null) {
            nb1Var.n(g(str, str2));
        }
    }

    public static int d(String str, nb1 nb1Var, int i10) {
        int i11;
        gb1 gb1Var = m(str) ? (gb1) a.get(str) : null;
        int i12 = 0;
        if (gb1Var == null) {
            return 0;
        }
        if (gb1Var.f > 0) {
            return AndroidUtilities.dp(Math.max(50, Math.min(600, r1)));
        }
        int i13 = (nb1Var == null || Math.abs(nb1Var.k - i10) > 1) ? 0 : nb1Var.i;
        if (i13 > 0) {
            return Math.min(AndroidUtilities.dp(600.0f), Math.max(AndroidUtilities.dp(50.0f), i13));
        }
        hb1 hb1Var = (hb1) b.get(gb1Var.a());
        if (hb1Var != null) {
            int f7 = f(i10);
            synchronized (hb1Var) {
                ArrayList arrayList = hb1Var.a;
                int size = arrayList.size();
                int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i11 = 0;
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - f7);
                    if (abs < i14) {
                        i11 = iArr[1];
                        i14 = abs;
                    }
                }
            }
            i12 = i11;
        }
        if (i12 <= 0) {
            i12 = 160;
        }
        return AndroidUtilities.dp(Math.max(50, Math.min(600, i12)));
    }

    public static String e(gb1 gb1Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = gb1Var.h;
            boolean z11 = gb1Var.i;
            jSONObject.put("isCopy", z10);
            jSONObject.put("canQuery", z11);
            jSONObject.put("backgroundQuery", gb1Var.j);
            jSONObject.put("preview", gb1Var.k);
            Object obj = gb1Var.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            TLRPC.User currentUser = z11 ? UserConfig.getInstance(gb1Var.b).getCurrentUser() : null;
            if (currentUser != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", currentUser.id);
                if (!TextUtils.isEmpty(currentUser.first_name)) {
                    jSONObject2.put("firstName", currentUser.first_name);
                }
                if (!TextUtils.isEmpty(currentUser.last_name)) {
                    jSONObject2.put("lastName", currentUser.last_name);
                }
                String publicUsername = UserObject.getPublicUsername(currentUser);
                if (!TextUtils.isEmpty(publicUsername)) {
                    jSONObject2.put("username", publicUsername);
                }
                jSONObject2.put("isPremium", currentUser.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int f(int i10) {
        return Math.round(i10 / AndroidUtilities.density);
    }

    public static String g(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = str;
            if (str == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("chatData", obj);
            Object obj2 = str2;
            if (str2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("publicData", obj2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static gb1 h(nb1 nb1Var) {
        if (nb1Var == null) {
            return null;
        }
        return (gb1) a.get(nb1Var.a);
    }

    public static nb1 i(String str) {
        String str2;
        gb1 gb1Var = m(str) ? (gb1) a.get(str) : null;
        if (gb1Var == null) {
            return null;
        }
        synchronized (gb1Var) {
            try {
                if (gb1Var.s == null) {
                    if (gb1Var.r == null) {
                        gb1Var.r = l(gb1Var.g);
                    }
                    if (gb1Var.r == null) {
                        return null;
                    }
                    nb1 nb1Var = new nb1(ApplicationLoader.applicationContext, gb1Var.a, gb1Var.r);
                    try {
                        str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str2 = null;
                    }
                    nb1Var.t = str2;
                    nb1Var.u = null;
                    String e10 = e(gb1Var);
                    if (e10 != null) {
                        nb1Var.w = e10;
                    }
                    nb1Var.n(g(gb1Var.n, gb1Var.o));
                    nb1Var.e = l;
                    gb1Var.s = nb1Var;
                }
                return gb1Var.s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j() {
        AndroidUtilities.cancelRunOnUIThread(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (gb1 gb1Var : hashMap.values()) {
            JSONObject jSONObject = (JSONObject) c.get(gb1Var.a());
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("local") : null;
            MessagesStorage.getInstance(gb1Var.b).putWidgetStorage(gb1Var.c, gb1Var.d, (optJSONObject == null || optJSONObject.length() == 0) ? "" : optJSONObject.toString());
        }
        hashMap.clear();
    }

    public static String k(String str, nb1 nb1Var, int i10) {
        int[] iArr = null;
        gb1 gb1Var = m(str) ? (gb1) a.get(str) : null;
        if (gb1Var == null) {
            return "none";
        }
        if (gb1Var.f > 0) {
            return "anchor " + gb1Var.f;
        }
        if (nb1Var != null && Math.abs(nb1Var.k - i10) <= 1 && nb1Var.i > 0) {
            return "frame";
        }
        hb1 hb1Var = (hb1) b.get(gb1Var.a());
        if (hb1Var != null) {
            int f7 = f(i10);
            synchronized (hb1Var) {
                ArrayList arrayList = hb1Var.a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    int[] iArr2 = (int[]) obj;
                    if (iArr == null || Math.abs(iArr2[0] - f7) < Math.abs(iArr[0] - f7)) {
                        iArr = iArr2;
                    }
                }
            }
        }
        if (iArr == null || iArr[1] <= 0) {
            return "placeholder";
        }
        if (iArr[0] == f(i10)) {
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
    public static String l(byte[] bArr) {
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

    public static boolean m(String str) {
        return str != null && str.startsWith("tg-widget:");
    }

    public static void n() {
        while (true) {
            ArrayList arrayList = g;
            if (arrayList.size() >= 3 || j) {
                return;
            }
            ArrayList arrayList2 = f;
            long j10 = Long.MAX_VALUE;
            gb1 gb1Var = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                gb1 gb1Var2 = (gb1) arrayList2.get(size);
                if (gb1Var2.y) {
                    long j11 = 9223372036854775806L;
                    for (gb1 gb1Var3 : a.values()) {
                        if (gb1Var3.w != 0 && gb1Var3.b == gb1Var2.b && gb1Var3.c == gb1Var2.c) {
                            j11 = Math.min(j11, Math.abs(gb1Var3.d - gb1Var2.d));
                        }
                    }
                    if (j11 < j10) {
                        gb1Var = gb1Var2;
                        j10 = j11;
                    }
                }
            }
            if (gb1Var == null) {
                return;
            }
            arrayList2.remove(gb1Var);
            nb1 nb1Var = gb1Var.s;
            if (nb1Var != null && !gb1Var.C && gb1Var.w <= 0) {
                String k10 = k(gb1Var.a, nb1Var, gb1Var.D);
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    nb1Var.q(gb1Var.D);
                    if (nb1Var.s == null) {
                        nb1Var.o(ec1.a(null, gb1Var.E));
                    }
                    if (!nb1Var.o) {
                        arrayList.add(gb1Var);
                        v(gb1Var);
                        AndroidUtilities.runOnUIThread(gb1Var.F, 4000L);
                    }
                }
            }
        }
    }

    public static bn0 o(ArrayList arrayList) {
        int size = arrayList.size();
        bn0 bn0Var = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bn0 bn0Var2 = (bn0) obj;
            if (bn0Var == null || bn0Var2.h > bn0Var.h) {
                bn0Var = bn0Var2;
            }
        }
        return bn0Var;
    }

    public static void p(boolean z10) {
        if (j == z10) {
            return;
        }
        j = z10;
        Iterator it = a.values().iterator();
        while (it.hasNext()) {
            nb1 nb1Var = ((gb1) it.next()).s;
            if (nb1Var != null && nb1Var.p != z10) {
                nb1Var.p = z10;
                dc1 dc1Var = nb1Var.f;
                if (dc1Var != null) {
                    dc1Var.f(nb1Var.n && !z10);
                }
            }
        }
        if (z10) {
            j();
        } else {
            n();
        }
        y();
    }

    public static void q(nb1 nb1Var) {
        gb1 h10 = h(nb1Var);
        if (h10 == null) {
            return;
        }
        h10.w = Math.max(0, h10.w - 1);
        h10.x = System.currentTimeMillis();
        x();
        j();
        y();
    }

    public static void r(nb1 nb1Var) {
        gb1 h10 = h(nb1Var);
        if (h10 == null) {
            return;
        }
        h10.w++;
        h10.x = System.currentTimeMillis();
        boolean z10 = j;
        if (nb1Var.p != z10) {
            nb1Var.p = z10;
            dc1 dc1Var = nb1Var.f;
            if (dc1Var != null) {
                dc1Var.f(nb1Var.n && !z10);
            }
        }
        if (h10.y) {
            v(h10);
        } else {
            h10.z = true;
        }
        x();
        y();
    }

    public static void s(int i10) {
        AndroidUtilities.runOnUIThread(new hi.t2(i10, 13));
    }

    public static void t(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static boolean u() {
        dc1 dc1Var;
        ac1 ac1Var;
        for (gb1 gb1Var : a.values()) {
            nb1 nb1Var = gb1Var.s;
            bn0 bn0Var = gb1Var.v;
            if (gb1Var.w != 0 && nb1Var != null && bn0Var != null && !gb1Var.C && ((dc1Var = nb1Var.f) == null || (ac1Var = dc1Var.E) == null || (!ac1Var.g && !dc1Var.w))) {
                String k10 = k(gb1Var.a, nb1Var, bn0Var.u());
                if (k10.equals("placeholder") || k10.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void v(gb1 gb1Var) {
        dc1 dc1Var;
        nb1 nb1Var = gb1Var.s;
        boolean z10 = false;
        if (gb1Var.C) {
            if (gb1Var.A >= 2) {
                return;
            }
            gb1Var.C = false;
            nb1Var.r();
        }
        if (nb1Var.o) {
            return;
        }
        nb1Var.o = true;
        dc1 dc1Var2 = nb1Var.f;
        if (dc1Var2 != null) {
            dc1Var2.z = true;
            return;
        }
        String str = nb1Var.s;
        if (str == null && nb1Var.t == null && nb1Var.u == null) {
            dc1Var = new dc1(nb1Var.c, nb1Var.b, ec1.d(nb1Var.m), nb1Var.d, null, null);
        } else {
            Context context = nb1Var.c;
            String str2 = nb1Var.b;
            if (str == null) {
                str = ec1.d(nb1Var.m);
            }
            dc1Var = new dc1(context, str2, str, nb1Var.d, nb1Var.t, nb1Var.u);
        }
        StringBuilder sb2 = new StringBuilder("{\"data\":");
        sb2.append(nb1Var.v);
        sb2.append(",\"context\":");
        String s10 = a1.g.s(sb2, nb1Var.w, "}");
        if (s10 != null) {
            dc1Var.h = s10;
        }
        dc1Var.I = nb1Var;
        dc1Var.L = nb1Var;
        if (nb1Var.n && !nb1Var.p) {
            z10 = true;
        }
        dc1Var.f(z10);
        nb1Var.f = dc1Var;
        nb1Var.q++;
        vb1.a.execute(new h2(dc1Var, nb1Var.j, 14));
    }

    public static String w(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static void x() {
        ArrayList arrayList = new ArrayList();
        for (gb1 gb1Var : a.values()) {
            if (gb1Var.s != null && gb1Var.w == 0 && !g.contains(gb1Var)) {
                arrayList.add(gb1Var);
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(27));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            nb1 nb1Var = ((gb1) arrayList.get(i10)).s;
            if (i10 >= 4) {
                nb1Var.r();
            }
            if (i10 >= 12 && nb1Var.f == null) {
                nb1Var.g = null;
            }
        }
    }

    public static void y() {
        nb1 nb1Var;
        HashMap hashMap = new HashMap();
        for (gb1 gb1Var : a.values()) {
            if (gb1Var.l != 0 && !gb1Var.k && gb1Var.w != 0 && !j && (nb1Var = gb1Var.s) != null && nb1Var.f != null && nb1Var.x) {
                hashMap.put(gb1Var.b + "/" + gb1Var.l, gb1Var);
            }
        }
        HashMap hashMap2 = k;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                ib1 ib1Var = (ib1) entry.getValue();
                AndroidUtilities.cancelRunOnUIThread(ib1Var.f);
                if (ib1Var.e != 0) {
                    ConnectionsManager.getInstance(ib1Var.a).cancelRequest(ib1Var.e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                gb1 gb1Var2 = (gb1) entry2.getValue();
                ib1 ib1Var2 = new ib1(gb1Var2.b, gb1Var2.l);
                ib1Var2.c = gb1Var2.p;
                hashMap2.put((String) entry2.getKey(), ib1Var2);
                AndroidUtilities.runOnUIThread(ib1Var2.f, ib1Var2.d * 1000);
            }
        }
    }
}
