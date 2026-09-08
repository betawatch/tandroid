package e6;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c6.a0;
import c6.e0;
import c6.f0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h implements c6.f {
    public static final g6.b k = new g6.b("RemoteMediaClient", null);
    public final Object a;
    public final c0 b;
    public final g6.m c;
    public final aa.a d;
    public final c e;
    public f0 f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j;

    static {
        String str = g6.m.v;
    }

    public h(g6.m mVar) {
        new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new c0(Looper.getMainLooper(), 0);
        aa.a aVar = new aa.a(this);
        this.d = aVar;
        this.c = mVar;
        mVar.h = new a4.m(this, 17);
        mVar.c = aVar;
        this.e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new o(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(p pVar) {
        try {
            pVar.p();
        } catch (IllegalArgumentException e7) {
            throw e7;
        } catch (Throwable unused) {
            pVar.a(new o(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o9;
        synchronized (this.a) {
            n6.l.e("Must be called from the main thread.");
            o9 = this.c.o();
        }
        return o9;
    }

    public final int b() {
        int i10;
        synchronized (this.a) {
            try {
                n6.l.e("Must be called from the main thread.");
                c6.q e7 = e();
                i10 = e7 != null ? e7.f : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final c6.o c() {
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        if (e7 == null) {
            return null;
        }
        Integer num = (Integer) e7.N.get(e7.w);
        if (num == null) {
            return null;
        }
        return (c6.o) e7.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            n6.l.e("Must be called from the main thread.");
            c6.q qVar = this.c.f;
            mediaInfo = qVar == null ? null : qVar.a;
        }
        return mediaInfo;
    }

    public final c6.q e() {
        c6.q qVar;
        synchronized (this.a) {
            n6.l.e("Must be called from the main thread.");
            qVar = this.c.f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.a) {
            try {
                n6.l.e("Must be called from the main thread.");
                c6.q e7 = e();
                i10 = e7 != null ? e7.e : 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final long g() {
        long j3;
        synchronized (this.a) {
            n6.l.e("Must be called from the main thread.");
            c6.q qVar = this.c.f;
            MediaInfo mediaInfo = qVar == null ? null : qVar.a;
            j3 = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j3;
    }

    public final boolean h() {
        n6.l.e("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        return (e7 != null && e7.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        return e7 != null && e7.e == 4;
    }

    public final boolean j() {
        n6.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        return (e7 == null || e7.w == 0) ? false : true;
    }

    public final boolean l() {
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        if (e7 == null) {
            return false;
        }
        if (e7.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        return e7 != null && e7.e == 2;
    }

    public final boolean n() {
        n6.l.e("Must be called from the main thread.");
        c6.q e7 = e();
        return e7 != null && e7.H;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3 A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110 A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120 A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137 A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145 A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d A[Catch: JSONException -> 0x0084, TryCatch #0 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c3, B:40:0x00c8, B:41:0x010c, B:43:0x0110, B:44:0x011c, B:46:0x0120, B:47:0x0129, B:49:0x012d, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:59:0x0148, B:61:0x014c, B:63:0x0156, B:64:0x0159, B:66:0x015d, B:67:0x0175, B:68:0x0179, B:70:0x017f, B:73:0x00cd, B:74:0x00b3, B:76:0x00b9, B:80:0x0167, B:84:0x0192), top: B:8:0x0040 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [g6.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(String str) {
        char c10;
        JSONObject jSONObject;
        String string;
        long optLong;
        int i10;
        int i11;
        c6.q qVar;
        int[] m10;
        g6.m mVar = this.c;
        ?? r32 = mVar.o;
        g6.o oVar = mVar.n;
        g6.o oVar2 = mVar.j;
        List list = mVar.d;
        g6.b bVar = mVar.a;
        bVar.b("message received: %s", str);
        String str2 = bVar.a;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            try {
                optLong = jSONObject.optLong("requestId", -1L);
                c10 = 1;
            } catch (JSONException e7) {
                e = e7;
                r32 = str2;
                c10 = 1;
                Object[] objArr = new Object[2];
                objArr[0] = e.getMessage();
                objArr[c10] = str;
                Log.w((String) r32, bVar.d("Message is malformed (%s); ignoring: %s", objArr));
            }
        } catch (JSONException e10) {
            e = e10;
            r32 = str2;
        }
        try {
            try {
                switch (string.hashCode()) {
                    case -1830647528:
                        if (string.equals("LOAD_CANCELLED")) {
                            oVar2.b(optLong, 2101, g6.m.f(jSONObject));
                            break;
                        }
                        break;
                    case -1790231854:
                        if (string.equals("QUEUE_ITEMS")) {
                            mVar.s.b(optLong, 0, null);
                            mVar.h("QUEUE_ITEMS", jSONObject);
                            if (mVar.h != null) {
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                c6.o[] oVarArr = new c6.o[jSONArray.length()];
                                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                    oVarArr[i12] = new xa.c(jSONArray.getJSONObject(i12)).B();
                                }
                                Iterator it = ((h) mVar.h.b).i.iterator();
                                while (it.hasNext()) {
                                    ((g) it.next()).k(oVarArr);
                                }
                                break;
                            }
                        }
                        break;
                    case -1125000185:
                        if (string.equals("INVALID_REQUEST")) {
                            Log.w(str2, bVar.d("received unexpected error: Invalid Request.", new Object[0]));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((g6.o) it2.next()).b(optLong, 2001, g6.m.f(jSONObject));
                            }
                            break;
                        }
                        break;
                    case -262628938:
                        if (string.equals("LOAD_FAILED")) {
                            oVar2.b(optLong, 2100, g6.m.f(jSONObject));
                            break;
                        }
                        break;
                    case 66247144:
                        if (string.equals("ERROR")) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                ((g6.o) it3.next()).b(optLong, 2100, g6.m.f(jSONObject));
                            }
                            if (mVar.h == null) {
                                break;
                            } else {
                                MediaError b10 = MediaError.b(jSONObject);
                                Iterator it4 = ((h) mVar.h.b).i.iterator();
                                while (it4.hasNext()) {
                                    ((g) it4.next()).b(b10);
                                }
                                break;
                            }
                        }
                        break;
                    case 154411710:
                        if (string.equals("QUEUE_CHANGE")) {
                            mVar.t.b(optLong, 0, null);
                            mVar.h("QUEUE_CHANGE", jSONObject);
                            if (mVar.h != null) {
                                String string2 = jSONObject.getString("changeType");
                                int[] m11 = g6.m.m(jSONObject.getJSONArray("itemIds"));
                                int optInt = jSONObject.optInt("insertBefore", 0);
                                if (m11 != null) {
                                    switch (string2.hashCode()) {
                                        case -2130463047:
                                            if (string2.equals("INSERT")) {
                                                Iterator it5 = ((h) mVar.h.b).i.iterator();
                                                while (it5.hasNext()) {
                                                    ((g) it5.next()).j(m11, optInt);
                                                }
                                                break;
                                            }
                                            break;
                                        case -1881281404:
                                            if (string2.equals("REMOVE")) {
                                                Iterator it6 = ((h) mVar.h.b).i.iterator();
                                                while (it6.hasNext()) {
                                                    ((g) it6.next()).l(m11);
                                                }
                                                break;
                                            }
                                            break;
                                        case -1785516855:
                                            if (string2.equals("UPDATE")) {
                                                int[] m12 = g6.m.m(jSONObject.getJSONArray("itemIds"));
                                                n6.l.i(m12, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                if (optJSONArray != null) {
                                                    ArrayList c11 = g6.a.c(m12);
                                                    int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                    int[] m13 = g6.m.m(optJSONArray);
                                                    n6.l.h(m13);
                                                    ArrayList c12 = g6.a.c(m13);
                                                    Iterator it7 = ((h) mVar.h.b).i.iterator();
                                                    while (it7.hasNext()) {
                                                        ((g) it7.next()).m(c11, c12, optInt2);
                                                    }
                                                    break;
                                                } else {
                                                    Iterator it8 = ((h) mVar.h.b).i.iterator();
                                                    while (it8.hasNext()) {
                                                        ((g) it8.next()).i(m12);
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 1122976047:
                                            if (string2.equals("ITEMS_CHANGE")) {
                                                Iterator it9 = ((h) mVar.h.b).i.iterator();
                                                while (it9.hasNext()) {
                                                    ((g) it9.next()).n(m11);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 431600379:
                        if (string.equals("INVALID_PLAYER_STATE")) {
                            Log.w(str2, bVar.d("received unexpected error: Invalid Player State.", new Object[0]));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                ((g6.o) it10.next()).b(optLong, 2100, g6.m.f(jSONObject));
                            }
                            break;
                        }
                        break;
                    case 823510221:
                        if (string.equals("MEDIA_STATUS")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                            if (jSONArray2.length() > 0) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                boolean c13 = oVar2.c(optLong);
                                if (oVar.d()) {
                                    if (oVar.c(optLong)) {
                                    }
                                    i10 = 1;
                                    if (!c13 && (qVar = mVar.f) != null) {
                                        i11 = qVar.b(i10, jSONObject2);
                                        if ((i11 & 1) != 0) {
                                            mVar.e = SystemClock.elapsedRealtime();
                                            mVar.i = -1;
                                            mVar.l();
                                        }
                                        if ((i11 & 2) != 0) {
                                            mVar.e = SystemClock.elapsedRealtime();
                                            mVar.l();
                                        }
                                        if ((i11 & 128) != 0) {
                                            mVar.e = SystemClock.elapsedRealtime();
                                        }
                                        if ((i11 & 4) != 0) {
                                            mVar.i();
                                        }
                                        if ((i11 & 8) != 0) {
                                            mVar.k();
                                        }
                                        if ((i11 & 16) != 0) {
                                            mVar.j();
                                        }
                                        if ((i11 & 32) != 0) {
                                            mVar.e = SystemClock.elapsedRealtime();
                                            a4.m mVar2 = mVar.h;
                                            if (mVar2 != null) {
                                                mVar2.n0();
                                            }
                                        }
                                        if ((i11 & 64) != 0) {
                                            mVar.e = SystemClock.elapsedRealtime();
                                            mVar.l();
                                        }
                                    }
                                    c6.q qVar2 = new c6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    qVar2.b(0, jSONObject2);
                                    mVar.f = qVar2;
                                    mVar.e = SystemClock.elapsedRealtime();
                                    i11 = 127;
                                    if ((i11 & 1) != 0) {
                                    }
                                    if ((i11 & 2) != 0) {
                                    }
                                    if ((i11 & 128) != 0) {
                                    }
                                    if ((i11 & 4) != 0) {
                                    }
                                    if ((i11 & 8) != 0) {
                                    }
                                    if ((i11 & 16) != 0) {
                                    }
                                    if ((i11 & 32) != 0) {
                                    }
                                    if ((i11 & 64) != 0) {
                                    }
                                }
                                if (!r32.d() || r32.c(optLong)) {
                                    i10 = 0;
                                    if (!c13) {
                                        i11 = qVar.b(i10, jSONObject2);
                                        if ((i11 & 1) != 0) {
                                        }
                                        if ((i11 & 2) != 0) {
                                        }
                                        if ((i11 & 128) != 0) {
                                        }
                                        if ((i11 & 4) != 0) {
                                        }
                                        if ((i11 & 8) != 0) {
                                        }
                                        if ((i11 & 16) != 0) {
                                        }
                                        if ((i11 & 32) != 0) {
                                        }
                                        if ((i11 & 64) != 0) {
                                        }
                                    }
                                    c6.q qVar22 = new c6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    qVar22.b(0, jSONObject2);
                                    mVar.f = qVar22;
                                    mVar.e = SystemClock.elapsedRealtime();
                                    i11 = 127;
                                    if ((i11 & 1) != 0) {
                                    }
                                    if ((i11 & 2) != 0) {
                                    }
                                    if ((i11 & 128) != 0) {
                                    }
                                    if ((i11 & 4) != 0) {
                                    }
                                    if ((i11 & 8) != 0) {
                                    }
                                    if ((i11 & 16) != 0) {
                                    }
                                    if ((i11 & 32) != 0) {
                                    }
                                    if ((i11 & 64) != 0) {
                                    }
                                } else {
                                    i10 = 1;
                                    if (!c13) {
                                    }
                                    c6.q qVar222 = new c6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    qVar222.b(0, jSONObject2);
                                    mVar.f = qVar222;
                                    mVar.e = SystemClock.elapsedRealtime();
                                    i11 = 127;
                                    if ((i11 & 1) != 0) {
                                    }
                                    if ((i11 & 2) != 0) {
                                    }
                                    if ((i11 & 128) != 0) {
                                    }
                                    if ((i11 & 4) != 0) {
                                    }
                                    if ((i11 & 8) != 0) {
                                    }
                                    if ((i11 & 16) != 0) {
                                    }
                                    if ((i11 & 32) != 0) {
                                    }
                                    if ((i11 & 64) != 0) {
                                    }
                                }
                            } else {
                                mVar.f = null;
                                mVar.l();
                                mVar.i();
                                mVar.k();
                                mVar.j();
                            }
                            Iterator it11 = list.iterator();
                            while (it11.hasNext()) {
                                ((g6.o) it11.next()).b(optLong, 0, null);
                            }
                            break;
                        }
                        break;
                    case 2107149050:
                        if (string.equals("QUEUE_ITEM_IDS")) {
                            mVar.r.b(optLong, 0, null);
                            mVar.h("QUEUE_ITEM_IDS", jSONObject);
                            if (mVar.h != null && (m10 = g6.m.m(jSONObject.getJSONArray("itemIds"))) != null) {
                                Iterator it12 = ((h) mVar.h.b).i.iterator();
                                while (it12.hasNext()) {
                                    ((g) it12.next()).i(m10);
                                }
                                break;
                            }
                        }
                        break;
                }
            } catch (JSONException e11) {
                e = e11;
                r32 = str2;
                Object[] objArr2 = new Object[2];
                objArr2[0] = e.getMessage();
                objArr2[c10] = str;
                Log.w((String) r32, bVar.d("Message is malformed (%s); ignoring: %s", objArr2));
            }
        } catch (JSONException e12) {
            e = e12;
            Object[] objArr22 = new Object[2];
            objArr22[0] = e.getMessage();
            objArr22[c10] = str;
            Log.w((String) r32, bVar.d("Message is malformed (%s); ignoring: %s", objArr22));
        }
    }

    public final void p(g gVar) {
        n6.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.i.add(gVar);
        }
    }

    public final BasePendingResult q(c6.p pVar) {
        n6.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        k kVar = new k(this, pVar, 2);
        x(kVar);
        return kVar;
    }

    public final void r() {
        n6.l.e("Must be called from the main thread.");
        int f7 = f();
        if (f7 == 4 || f7 == 2) {
            n6.l.e("Must be called from the main thread.");
            if (w()) {
                x(new j(this, 5));
                return;
            } else {
                t();
                return;
            }
        }
        n6.l.e("Must be called from the main thread.");
        if (w()) {
            x(new j(this, 6));
        } else {
            t();
        }
    }

    public final int s() {
        c6.o c10;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c10 = c()) != null && c10.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f;
        if (f0Var == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        String str = this.c.b;
        e0 e0Var = (e0) f0Var;
        g6.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v e7 = w.e();
        e7.c = new a0(e0Var, str, this);
        e7.a = 8413;
        e0Var.e(1, e7.a());
        n6.l.e("Must be called from the main thread.");
        if (w()) {
            x(new j(this, 0));
        } else {
            t();
        }
    }

    public final void v(e0 e0Var) {
        c6.f fVar;
        f0 f0Var = this.f;
        if (f0Var == e0Var) {
            return;
        }
        if (f0Var != null) {
            this.c.n();
            this.e.c();
            n6.l.e("Must be called from the main thread.");
            String str = this.c.b;
            e0 e0Var2 = (e0) f0Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (e0Var2.C) {
                fVar = (c6.f) e0Var2.C.remove(str);
            }
            v e7 = w.e();
            e7.c = new a0(e0Var2, fVar, str);
            e7.a = 8414;
            e0Var2.e(1, e7.a());
            this.d.b = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = e0Var;
        if (e0Var != null) {
            this.d.b = e0Var;
        }
    }

    public final boolean w() {
        return this.f != null;
    }
}
