package e6;

import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import c6.e0;
import c6.f0;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.cast.z;
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
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements c6.f {
    public static final g6.b k = new g6.b("RemoteMediaClient", null);
    public final Object a;
    public final z b;
    public final g6.m c;
    public final a0 d;
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
        this.b = new z(Looper.getMainLooper(), 0);
        a0 a0Var = new a0(this);
        this.d = a0Var;
        this.c = mVar;
        mVar.h = new za.c(this, 17);
        mVar.c = a0Var;
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
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            nVar.a(new m(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.a) {
            n6.l.d("Must be called from the main thread.");
            o10 = this.c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.a) {
            try {
                n6.l.d("Must be called from the main thread.");
                c6.q e = e();
                i10 = e != null ? e.f : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final c6.o c() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.N.get(e.x);
        if (num == null) {
            return null;
        }
        return (c6.o) e.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            n6.l.d("Must be called from the main thread.");
            c6.q qVar = this.c.f;
            mediaInfo = qVar == null ? null : qVar.a;
        }
        return mediaInfo;
    }

    public final c6.q e() {
        c6.q qVar;
        synchronized (this.a) {
            n6.l.d("Must be called from the main thread.");
            qVar = this.c.f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.a) {
            try {
                n6.l.d("Must be called from the main thread.");
                c6.q e = e();
                i10 = e != null ? e.e : 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final long g() {
        long j10;
        synchronized (this.a) {
            n6.l.d("Must be called from the main thread.");
            c6.q qVar = this.c.f;
            MediaInfo mediaInfo = qVar == null ? null : qVar.a;
            j10 = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j10;
    }

    public final boolean h() {
        n6.l.d("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        return (e != null && e.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        return e != null && e.e == 4;
    }

    public final boolean j() {
        n6.l.d("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        return (e == null || e.x == 0) ? false : true;
    }

    public final boolean l() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        if (e == null) {
            return false;
        }
        if (e.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        return e != null && e.e == 2;
    }

    public final boolean n() {
        n6.l.d("Must be called from the main thread.");
        c6.q e = e();
        return e != null && e.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:65:0x0164, B:66:0x016a, B:68:0x0170, B:70:0x017a, B:71:0x017e, B:72:0x017f, B:74:0x0183, B:75:0x019b, B:76:0x019f, B:78:0x01a5, B:81:0x00cb, B:82:0x00b1, B:84:0x00b7, B:88:0x018d, B:92:0x01b8), top: B:8:0x003e }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [g6.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
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
        String str2 = mVar.o;
        g6.o oVar = mVar.n;
        g6.o oVar2 = mVar.j;
        List list = mVar.d;
        g6.b bVar = mVar.a;
        bVar.b("message received: %s", str);
        String str3 = bVar.a;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            try {
                optLong = jSONObject.optLong("requestId", -1L);
                c10 = 1;
            } catch (JSONException e) {
                e = e;
                c10 = 1;
            }
        } catch (JSONException e7) {
            e = e7;
            c10 = 1;
            str2 = str3;
        }
        try {
            try {
                switch (string.hashCode()) {
                    case -1830647528:
                        if (string.equals("LOAD_CANCELLED")) {
                            oVar2.b(optLong, 2101, g6.m.f(jSONObject));
                            return;
                        }
                        return;
                    case -1790231854:
                        if (string.equals("QUEUE_ITEMS")) {
                            mVar.s.b(optLong, 0, null);
                            mVar.h("QUEUE_ITEMS", jSONObject);
                            if (mVar.h != null) {
                                JSONArray jSONArray = jSONObject.getJSONArray("items");
                                c6.o[] oVarArr = new c6.o[jSONArray.length()];
                                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                    oVarArr[i12] = new a4.l(jSONArray.getJSONObject(i12)).k();
                                }
                                Iterator it = ((h) mVar.h.b).i.iterator();
                                while (it.hasNext()) {
                                    ((g) it.next()).k(oVarArr);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -1125000185:
                        if (string.equals("INVALID_REQUEST")) {
                            Log.w(str3, bVar.d("received unexpected error: Invalid Request.", new Object[0]));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((g6.o) it2.next()).b(optLong, 2001, g6.m.f(jSONObject));
                            }
                            return;
                        }
                        return;
                    case -262628938:
                        if (string.equals("LOAD_FAILED")) {
                            oVar2.b(optLong, 2100, g6.m.f(jSONObject));
                            return;
                        }
                        return;
                    case 66247144:
                        if (string.equals("ERROR")) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                ((g6.o) it3.next()).b(optLong, 2100, g6.m.f(jSONObject));
                            }
                            if (mVar.h == null) {
                                return;
                            }
                            MediaError b10 = MediaError.b(jSONObject);
                            Iterator it4 = ((h) mVar.h.b).i.iterator();
                            while (it4.hasNext()) {
                                ((g) it4.next()).b(b10);
                            }
                            return;
                        }
                        return;
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
                                                return;
                                            }
                                            return;
                                        case -1881281404:
                                            if (string2.equals("REMOVE")) {
                                                Iterator it6 = ((h) mVar.h.b).i.iterator();
                                                while (it6.hasNext()) {
                                                    ((g) it6.next()).l(m11);
                                                }
                                                return;
                                            }
                                            return;
                                        case -1785516855:
                                            if (string2.equals("UPDATE")) {
                                                int[] m12 = g6.m.m(jSONObject.getJSONArray("itemIds"));
                                                n6.l.h(m12, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                if (optJSONArray == null) {
                                                    Iterator it7 = ((h) mVar.h.b).i.iterator();
                                                    while (it7.hasNext()) {
                                                        ((g) it7.next()).i(m12);
                                                    }
                                                    return;
                                                }
                                                ArrayList c11 = g6.a.c(m12);
                                                int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                int[] m13 = g6.m.m(optJSONArray);
                                                n6.l.g(m13);
                                                ArrayList c12 = g6.a.c(m13);
                                                Iterator it8 = ((h) mVar.h.b).i.iterator();
                                                while (it8.hasNext()) {
                                                    ((g) it8.next()).m(c11, c12, optInt2);
                                                }
                                                return;
                                            }
                                            return;
                                        case 1122976047:
                                            if (string2.equals("ITEMS_CHANGE")) {
                                                Iterator it9 = ((h) mVar.h.b).i.iterator();
                                                while (it9.hasNext()) {
                                                    ((g) it9.next()).n(m11);
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 431600379:
                        if (string.equals("INVALID_PLAYER_STATE")) {
                            Log.w(str3, bVar.d("received unexpected error: Invalid Player State.", new Object[0]));
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                ((g6.o) it10.next()).b(optLong, 2100, g6.m.f(jSONObject));
                            }
                            return;
                        }
                        return;
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
                                        i11 = qVar.b(jSONObject2, i10);
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
                                            za.c cVar = mVar.h;
                                            if (cVar != null) {
                                                h hVar = (h) cVar.b;
                                                Iterator it11 = hVar.h.iterator();
                                                if (it11.hasNext()) {
                                                    throw a1.g.h(it11);
                                                }
                                                Iterator it12 = hVar.i.iterator();
                                                while (it12.hasNext()) {
                                                    ((g) it12.next()).a();
                                                }
                                            }
                                        }
                                        if ((i11 & 64) != 0) {
                                            mVar.e = SystemClock.elapsedRealtime();
                                            mVar.l();
                                        }
                                    }
                                    c6.q qVar2 = new c6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                    qVar2.b(jSONObject2, 0);
                                    mVar.f = qVar2;
                                    mVar.e = SystemClock.elapsedRealtime();
                                    i11 = zs.L1;
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
                                if (!str2.d() || str2.c(optLong)) {
                                    i10 = 0;
                                    if (!c13) {
                                        i11 = qVar.b(jSONObject2, i10);
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
                                    qVar22.b(jSONObject2, 0);
                                    mVar.f = qVar22;
                                    mVar.e = SystemClock.elapsedRealtime();
                                    i11 = zs.L1;
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
                                    qVar222.b(jSONObject2, 0);
                                    mVar.f = qVar222;
                                    mVar.e = SystemClock.elapsedRealtime();
                                    i11 = zs.L1;
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
                            Iterator it13 = list.iterator();
                            while (it13.hasNext()) {
                                ((g6.o) it13.next()).b(optLong, 0, null);
                            }
                            return;
                        }
                        return;
                    case 2107149050:
                        if (string.equals("QUEUE_ITEM_IDS")) {
                            mVar.r.b(optLong, 0, null);
                            mVar.h("QUEUE_ITEM_IDS", jSONObject);
                            if (mVar.h == null || (m10 = g6.m.m(jSONObject.getJSONArray("itemIds"))) == null) {
                                return;
                            }
                            Iterator it14 = ((h) mVar.h.b).i.iterator();
                            while (it14.hasNext()) {
                                ((g) it14.next()).i(m10);
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (JSONException e10) {
                e = e10;
                str2 = str3;
                Object[] objArr = new Object[2];
                objArr[0] = e.getMessage();
                objArr[c10] = str;
                Log.w(str2, bVar.d("Message is malformed (%s); ignoring: %s", objArr));
            }
        } catch (JSONException e11) {
            e = e11;
            Object[] objArr2 = new Object[2];
            objArr2[0] = e.getMessage();
            objArr2[c10] = str;
            Log.w(str2, bVar.d("Message is malformed (%s); ignoring: %s", objArr2));
        }
    }

    public final void p(g gVar) {
        n6.l.d("Must be called from the main thread.");
        if (gVar != null) {
            this.i.add(gVar);
        }
    }

    public final BasePendingResult q(c6.p pVar) {
        n6.l.d("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        n6.l.d("Must be called from the main thread.");
        int f7 = f();
        if (f7 == 4 || f7 == 2) {
            n6.l.d("Must be called from the main thread.");
            if (w()) {
                x(new i(this, 5));
                return;
            } else {
                t();
                return;
            }
        }
        n6.l.d("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 6));
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
        n6.l.d("Must be called from the main thread.");
        String str = this.c.b;
        e0 e0Var = (e0) f0Var;
        g6.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v b10 = w.b();
        b10.c = new c6.a0(e0Var, str, this);
        b10.a = 8413;
        e0Var.e(1, b10.a());
        n6.l.d("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 0));
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
            n6.l.d("Must be called from the main thread.");
            String str = this.c.b;
            e0 e0Var2 = (e0) f0Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (e0Var2.C) {
                fVar = (c6.f) e0Var2.C.remove(str);
            }
            v b10 = w.b();
            b10.c = new c6.a0(e0Var2, fVar, str);
            b10.a = 8414;
            e0Var2.e(1, b10.a());
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
