package o5;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c2.t0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.f0;
import m5.g0;
import m5.r;
import n2.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements m5.f {
    public static final r5.b k = new r5.b("RemoteMediaClient", null);
    public final Object a;
    public final t0 b;
    public final r5.n c;
    public final j9.a d;
    public final c e;
    public g0 f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j;

    static {
        String str = r5.n.v;
    }

    public h(r5.n nVar) {
        new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new t0(Looper.getMainLooper(), 1);
        j9.a aVar = new j9.a(this);
        this.d = aVar;
        this.c = nVar;
        nVar.h = new b0(this, 4);
        nVar.c = aVar;
        this.e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new m(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(n nVar) {
        try {
            nVar.p();
        } catch (IllegalArgumentException e9) {
            throw e9;
        } catch (Throwable unused) {
            nVar.a(new m(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.a) {
            y5.l.e("Must be called from the main thread.");
            o10 = this.c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.a) {
            try {
                y5.l.e("Must be called from the main thread.");
                r e9 = e();
                i10 = e9 != null ? e9.f : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public final m5.p c() {
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        if (e9 == null) {
            return null;
        }
        Integer num = (Integer) e9.J.get(e9.w);
        if (num == null) {
            return null;
        }
        return (m5.p) e9.C.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            y5.l.e("Must be called from the main thread.");
            r rVar = this.c.f;
            mediaInfo = rVar == null ? null : rVar.a;
        }
        return mediaInfo;
    }

    public final r e() {
        r rVar;
        synchronized (this.a) {
            y5.l.e("Must be called from the main thread.");
            rVar = this.c.f;
        }
        return rVar;
    }

    public final int f() {
        int i10;
        synchronized (this.a) {
            try {
                y5.l.e("Must be called from the main thread.");
                r e9 = e();
                i10 = e9 != null ? e9.e : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public final long g() {
        long j10;
        synchronized (this.a) {
            y5.l.e("Must be called from the main thread.");
            r rVar = this.c.f;
            MediaInfo mediaInfo = rVar == null ? null : rVar.a;
            j10 = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j10;
    }

    public final boolean h() {
        y5.l.e("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        return (e9 != null && e9.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        return e9 != null && e9.e == 4;
    }

    public final boolean j() {
        y5.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        return (e9 == null || e9.w == 0) ? false : true;
    }

    public final boolean l() {
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        if (e9 == null) {
            return false;
        }
        if (e9.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        return e9 != null && e9.e == 2;
    }

    public final boolean n() {
        y5.l.e("Must be called from the main thread.");
        r e9 = e();
        return e9 != null && e9.D;
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
    /* JADX WARN: Type inference failed for: r3v0, types: [r5.p] */
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
        r rVar;
        int[] m10;
        r5.n nVar = this.c;
        ?? r32 = nVar.o;
        r5.p pVar = nVar.n;
        r5.p pVar2 = nVar.j;
        List list = nVar.d;
        r5.b bVar = nVar.a;
        bVar.b("message received: %s", str);
        String str2 = bVar.a;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            try {
                optLong = jSONObject.optLong("requestId", -1L);
                c10 = 1;
            } catch (JSONException e9) {
                e = e9;
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
                            pVar2.b(optLong, 2101, r5.n.f(jSONObject));
                            break;
                        }
                        break;
                    case -1790231854:
                        if (string.equals("QUEUE_ITEMS")) {
                            nVar.s.b(optLong, 0, null);
                            nVar.h("QUEUE_ITEMS", jSONObject);
                            if (nVar.h != null) {
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                m5.p[] pVarArr = new m5.p[jSONArray.length()];
                                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                    pVarArr[i12] = new m5.o(jSONArray.getJSONObject(i12)).k();
                                }
                                Iterator it = ((h) nVar.h.b).i.iterator();
                                while (it.hasNext()) {
                                    ((g) it.next()).k(pVarArr);
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
                                ((r5.p) it2.next()).b(optLong, 2001, r5.n.f(jSONObject));
                            }
                            break;
                        }
                        break;
                    case -262628938:
                        if (string.equals("LOAD_FAILED")) {
                            pVar2.b(optLong, 2100, r5.n.f(jSONObject));
                            break;
                        }
                        break;
                    case 66247144:
                        if (string.equals("ERROR")) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                ((r5.p) it3.next()).b(optLong, 2100, r5.n.f(jSONObject));
                            }
                            if (nVar.h == null) {
                                break;
                            } else {
                                MediaError b10 = MediaError.b(jSONObject);
                                Iterator it4 = ((h) nVar.h.b).i.iterator();
                                while (it4.hasNext()) {
                                    ((g) it4.next()).b(b10);
                                }
                                break;
                            }
                        }
                        break;
                    case 154411710:
                        if (string.equals("QUEUE_CHANGE")) {
                            nVar.t.b(optLong, 0, null);
                            nVar.h("QUEUE_CHANGE", jSONObject);
                            if (nVar.h != null) {
                                String string2 = jSONObject.getString("changeType");
                                int[] m11 = r5.n.m(jSONObject.getJSONArray("itemIds"));
                                int optInt = jSONObject.optInt("insertBefore", 0);
                                if (m11 != null) {
                                    switch (string2.hashCode()) {
                                        case -2130463047:
                                            if (string2.equals("INSERT")) {
                                                Iterator it5 = ((h) nVar.h.b).i.iterator();
                                                while (it5.hasNext()) {
                                                    ((g) it5.next()).j(m11, optInt);
                                                }
                                                break;
                                            }
                                            break;
                                        case -1881281404:
                                            if (string2.equals("REMOVE")) {
                                                Iterator it6 = ((h) nVar.h.b).i.iterator();
                                                while (it6.hasNext()) {
                                                    ((g) it6.next()).l(m11);
                                                }
                                                break;
                                            }
                                            break;
                                        case -1785516855:
                                            if (string2.equals("UPDATE")) {
                                                int[] m12 = r5.n.m(jSONObject.getJSONArray("itemIds"));
                                                y5.l.i(m12, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                if (optJSONArray != null) {
                                                    ArrayList c11 = r5.a.c(m12);
                                                    int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                    int[] m13 = r5.n.m(optJSONArray);
                                                    y5.l.h(m13);
                                                    ArrayList c12 = r5.a.c(m13);
                                                    Iterator it7 = ((h) nVar.h.b).i.iterator();
                                                    while (it7.hasNext()) {
                                                        ((g) it7.next()).m(c11, c12, optInt2);
                                                    }
                                                    break;
                                                } else {
                                                    Iterator it8 = ((h) nVar.h.b).i.iterator();
                                                    while (it8.hasNext()) {
                                                        ((g) it8.next()).i(m12);
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        case 1122976047:
                                            if (string2.equals("ITEMS_CHANGE")) {
                                                Iterator it9 = ((h) nVar.h.b).i.iterator();
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
                                ((r5.p) it10.next()).b(optLong, 2100, r5.n.f(jSONObject));
                            }
                            break;
                        }
                        break;
                    case 823510221:
                        if (string.equals("MEDIA_STATUS")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                            if (jSONArray2.length() > 0) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                boolean c13 = pVar2.c(optLong);
                                if (pVar.d()) {
                                    if (pVar.c(optLong)) {
                                    }
                                    i10 = 1;
                                    if (!c13 && (rVar = nVar.f) != null) {
                                        i11 = rVar.b(i10, jSONObject2);
                                        if ((i11 & 1) != 0) {
                                            nVar.e = SystemClock.elapsedRealtime();
                                            nVar.i = -1;
                                            nVar.l();
                                        }
                                        if ((i11 & 2) != 0) {
                                            nVar.e = SystemClock.elapsedRealtime();
                                            nVar.l();
                                        }
                                        if ((i11 & 128) != 0) {
                                            nVar.e = SystemClock.elapsedRealtime();
                                        }
                                        if ((i11 & 4) != 0) {
                                            nVar.i();
                                        }
                                        if ((i11 & 8) != 0) {
                                            nVar.k();
                                        }
                                        if ((i11 & 16) != 0) {
                                            nVar.j();
                                        }
                                        if ((i11 & 32) != 0) {
                                            nVar.e = SystemClock.elapsedRealtime();
                                            b0 b0Var = nVar.h;
                                            if (b0Var != null) {
                                                b0Var.t();
                                            }
                                        }
                                        if ((i11 & 64) != 0) {
                                            nVar.e = SystemClock.elapsedRealtime();
                                            nVar.l();
                                        }
                                    }
                                    r rVar2 = new r(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    rVar2.b(0, jSONObject2);
                                    nVar.f = rVar2;
                                    nVar.e = SystemClock.elapsedRealtime();
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
                                        i11 = rVar.b(i10, jSONObject2);
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
                                    r rVar22 = new r(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    rVar22.b(0, jSONObject2);
                                    nVar.f = rVar22;
                                    nVar.e = SystemClock.elapsedRealtime();
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
                                    r rVar222 = new r(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    rVar222.b(0, jSONObject2);
                                    nVar.f = rVar222;
                                    nVar.e = SystemClock.elapsedRealtime();
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
                                nVar.f = null;
                                nVar.l();
                                nVar.i();
                                nVar.k();
                                nVar.j();
                            }
                            Iterator it11 = list.iterator();
                            while (it11.hasNext()) {
                                ((r5.p) it11.next()).b(optLong, 0, null);
                            }
                            break;
                        }
                        break;
                    case 2107149050:
                        if (string.equals("QUEUE_ITEM_IDS")) {
                            nVar.r.b(optLong, 0, null);
                            nVar.h("QUEUE_ITEM_IDS", jSONObject);
                            if (nVar.h != null && (m10 = r5.n.m(jSONObject.getJSONArray("itemIds"))) != null) {
                                Iterator it12 = ((h) nVar.h.b).i.iterator();
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
        y5.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.i.add(gVar);
        }
    }

    public final BasePendingResult q(m5.q qVar) {
        y5.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, qVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        y5.l.e("Must be called from the main thread.");
        int f10 = f();
        if (f10 == 4 || f10 == 2) {
            y5.l.e("Must be called from the main thread.");
            if (w()) {
                x(new i(this, 5));
                return;
            } else {
                t();
                return;
            }
        }
        y5.l.e("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 6));
        } else {
            t();
        }
    }

    public final int s() {
        m5.p c10;
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
        g0 g0Var = this.f;
        if (g0Var == null) {
            return;
        }
        y5.l.e("Must be called from the main thread.");
        String str = this.c.b;
        f0 f0Var = (f0) g0Var;
        r5.a.b(str);
        synchronized (f0Var.C) {
            f0Var.C.put(str, this);
        }
        v b10 = w.b();
        b10.c = new m5.b0(f0Var, str, this);
        b10.a = 8413;
        f0Var.e(1, b10.b());
        y5.l.e("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 0));
        } else {
            t();
        }
    }

    public final void v(f0 f0Var) {
        m5.f fVar;
        g0 g0Var = this.f;
        if (g0Var == f0Var) {
            return;
        }
        if (g0Var != null) {
            this.c.n();
            this.e.c();
            y5.l.e("Must be called from the main thread.");
            String str = this.c.b;
            f0 f0Var2 = (f0) g0Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (f0Var2.C) {
                fVar = (m5.f) f0Var2.C.remove(str);
            }
            v b10 = w.b();
            b10.c = new m5.b0(f0Var2, fVar, str);
            b10.a = 8414;
            f0Var2.e(1, b10.b());
            this.d.b = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = f0Var;
        if (f0Var != null) {
            this.d.b = f0Var;
        }
    }

    public final boolean w() {
        return this.f != null;
    }
}
