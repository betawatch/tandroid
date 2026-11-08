package h6;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.a0;
import f6.e0;
import f6.f0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class h implements f6.f {
    public static final j6.b k = new j6.b("RemoteMediaClient", null);
    public final Object a;
    public final y b;
    public final j6.m c;
    public final m d;
    public final c e;
    public f0 f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j;

    static {
        String str = j6.m.v;
    }

    public h(j6.m mVar) {
        new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new y(Looper.getMainLooper(), 0);
        m mVar2 = new m(this);
        this.d = mVar2;
        this.c = mVar;
        mVar.h = new gf.g(this, 1);
        mVar.c = mVar2;
        this.e = new c(this);
    }

    public static com.google.android.gms.common.api.internal.r t() {
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(null, 1);
        rVar.a(new n(new Status(17, null, null, null), 0));
        return rVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o4;
        synchronized (this.a) {
            q6.m.d("Must be called from the main thread.");
            o4 = this.c.o();
        }
        return o4;
    }

    public final int b() {
        int i7;
        synchronized (this.a) {
            try {
                q6.m.d("Must be called from the main thread.");
                f6.q e10 = e();
                i7 = e10 != null ? e10.f : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7;
    }

    public final f6.o c() {
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 == null) {
            return null;
        }
        Integer num = (Integer) e10.N.get(e10.x);
        if (num == null) {
            return null;
        }
        return (f6.o) e10.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            q6.m.d("Must be called from the main thread.");
            f6.q qVar = this.c.f;
            mediaInfo = qVar == null ? null : qVar.a;
        }
        return mediaInfo;
    }

    public final f6.q e() {
        f6.q qVar;
        synchronized (this.a) {
            q6.m.d("Must be called from the main thread.");
            qVar = this.c.f;
        }
        return qVar;
    }

    public final int f() {
        int i7;
        synchronized (this.a) {
            try {
                q6.m.d("Must be called from the main thread.");
                f6.q e10 = e();
                i7 = e10 != null ? e10.e : 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i7;
    }

    public final long g() {
        long j3;
        synchronized (this.a) {
            q6.m.d("Must be called from the main thread.");
            f6.q qVar = this.c.f;
            MediaInfo mediaInfo = qVar == null ? null : qVar.a;
            j3 = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j3;
    }

    public final boolean h() {
        q6.m.d("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        return (e10 != null && e10.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        return e10 != null && e10.e == 4;
    }

    public final boolean j() {
        q6.m.d("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        return (e10 == null || e10.x == 0) ? false : true;
    }

    public final boolean l() {
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        if (e10 == null) {
            return false;
        }
        if (e10.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        return e10 != null && e10.e == 2;
    }

    public final boolean n() {
        q6.m.d("Must be called from the main thread.");
        f6.q e10 = e();
        return e10 != null && e10.H;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:12:0x004b, B:14:0x0058, B:16:0x0062, B:17:0x006e, B:19:0x0074, B:28:0x008c, B:30:0x0098, B:32:0x00a7, B:37:0x00c1, B:40:0x00c6, B:41:0x010a, B:43:0x010e, B:44:0x011a, B:46:0x011e, B:47:0x0127, B:49:0x012b, B:50:0x0131, B:52:0x0135, B:53:0x0138, B:55:0x013c, B:56:0x013f, B:58:0x0143, B:59:0x0146, B:61:0x014a, B:63:0x0154, B:64:0x0157, B:66:0x015b, B:67:0x0173, B:68:0x0177, B:70:0x017d, B:73:0x00cb, B:74:0x00b1, B:76:0x00b7, B:80:0x0165, B:84:0x0190), top: B:8:0x003e }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [j6.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(String str) {
        char c10;
        int i7;
        int i10;
        f6.q qVar;
        int[] m10;
        j6.m mVar = this.c;
        String str2 = mVar.o;
        j6.o oVar = mVar.n;
        j6.o oVar2 = mVar.j;
        List list = mVar.d;
        j6.b bVar = mVar.a;
        bVar.b("message received: %s", str);
        String str3 = bVar.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            try {
                long optLong = jSONObject.optLong("requestId", -1L);
                c10 = 1;
                try {
                    try {
                        switch (string.hashCode()) {
                            case -1830647528:
                                if (string.equals("LOAD_CANCELLED")) {
                                    oVar2.b(optLong, 2101, j6.m.f(jSONObject));
                                    break;
                                }
                                break;
                            case -1790231854:
                                if (string.equals("QUEUE_ITEMS")) {
                                    mVar.s.b(optLong, 0, null);
                                    mVar.h("QUEUE_ITEMS", jSONObject);
                                    if (mVar.h != null) {
                                        JSONArray jSONArray = jSONObject.getJSONArray("items");
                                        f6.o[] oVarArr = new f6.o[jSONArray.length()];
                                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                            oVarArr[i11] = new cb.c(jSONArray.getJSONObject(i11)).n();
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
                                    Log.w(str3, bVar.d("received unexpected error: Invalid Request.", new Object[0]));
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((j6.o) it2.next()).b(optLong, 2001, j6.m.f(jSONObject));
                                    }
                                    break;
                                }
                                break;
                            case -262628938:
                                if (string.equals("LOAD_FAILED")) {
                                    oVar2.b(optLong, 2100, j6.m.f(jSONObject));
                                    break;
                                }
                                break;
                            case 66247144:
                                if (string.equals("ERROR")) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        ((j6.o) it3.next()).b(optLong, 2100, j6.m.f(jSONObject));
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
                                        int[] m11 = j6.m.m(jSONObject.getJSONArray("itemIds"));
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
                                                        int[] m12 = j6.m.m(jSONObject.getJSONArray("itemIds"));
                                                        q6.m.h(m12, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                        JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                        if (optJSONArray != null) {
                                                            ArrayList c11 = j6.a.c(m12);
                                                            int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                            int[] m13 = j6.m.m(optJSONArray);
                                                            q6.m.g(m13);
                                                            ArrayList c12 = j6.a.c(m13);
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
                                    Log.w(str3, bVar.d("received unexpected error: Invalid Player State.", new Object[0]));
                                    Iterator it10 = list.iterator();
                                    while (it10.hasNext()) {
                                        ((j6.o) it10.next()).b(optLong, 2100, j6.m.f(jSONObject));
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
                                            i7 = 1;
                                            if (!c13 && (qVar = mVar.f) != null) {
                                                i10 = qVar.b(jSONObject2, i7);
                                                if ((i10 & 1) != 0) {
                                                    mVar.e = SystemClock.elapsedRealtime();
                                                    mVar.i = -1;
                                                    mVar.l();
                                                }
                                                if ((i10 & 2) != 0) {
                                                    mVar.e = SystemClock.elapsedRealtime();
                                                    mVar.l();
                                                }
                                                if ((i10 & 128) != 0) {
                                                    mVar.e = SystemClock.elapsedRealtime();
                                                }
                                                if ((i10 & 4) != 0) {
                                                    mVar.i();
                                                }
                                                if ((i10 & 8) != 0) {
                                                    mVar.k();
                                                }
                                                if ((i10 & 16) != 0) {
                                                    mVar.j();
                                                }
                                                if ((i10 & 32) != 0) {
                                                    mVar.e = SystemClock.elapsedRealtime();
                                                    gf.g gVar = mVar.h;
                                                    if (gVar != null) {
                                                        gVar.E();
                                                    }
                                                }
                                                if ((i10 & 64) != 0) {
                                                    mVar.e = SystemClock.elapsedRealtime();
                                                    mVar.l();
                                                }
                                            }
                                            f6.q qVar2 = new f6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                            qVar2.b(jSONObject2, 0);
                                            mVar.f = qVar2;
                                            mVar.e = SystemClock.elapsedRealtime();
                                            i10 = qs.L1;
                                            if ((i10 & 1) != 0) {
                                            }
                                            if ((i10 & 2) != 0) {
                                            }
                                            if ((i10 & 128) != 0) {
                                            }
                                            if ((i10 & 4) != 0) {
                                            }
                                            if ((i10 & 8) != 0) {
                                            }
                                            if ((i10 & 16) != 0) {
                                            }
                                            if ((i10 & 32) != 0) {
                                            }
                                            if ((i10 & 64) != 0) {
                                            }
                                        }
                                        if (!str2.d() || str2.c(optLong)) {
                                            i7 = 0;
                                            if (!c13) {
                                                i10 = qVar.b(jSONObject2, i7);
                                                if ((i10 & 1) != 0) {
                                                }
                                                if ((i10 & 2) != 0) {
                                                }
                                                if ((i10 & 128) != 0) {
                                                }
                                                if ((i10 & 4) != 0) {
                                                }
                                                if ((i10 & 8) != 0) {
                                                }
                                                if ((i10 & 16) != 0) {
                                                }
                                                if ((i10 & 32) != 0) {
                                                }
                                                if ((i10 & 64) != 0) {
                                                }
                                            }
                                            f6.q qVar22 = new f6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                            qVar22.b(jSONObject2, 0);
                                            mVar.f = qVar22;
                                            mVar.e = SystemClock.elapsedRealtime();
                                            i10 = qs.L1;
                                            if ((i10 & 1) != 0) {
                                            }
                                            if ((i10 & 2) != 0) {
                                            }
                                            if ((i10 & 128) != 0) {
                                            }
                                            if ((i10 & 4) != 0) {
                                            }
                                            if ((i10 & 8) != 0) {
                                            }
                                            if ((i10 & 16) != 0) {
                                            }
                                            if ((i10 & 32) != 0) {
                                            }
                                            if ((i10 & 64) != 0) {
                                            }
                                        } else {
                                            i7 = 1;
                                            if (!c13) {
                                            }
                                            f6.q qVar222 = new f6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                            qVar222.b(jSONObject2, 0);
                                            mVar.f = qVar222;
                                            mVar.e = SystemClock.elapsedRealtime();
                                            i10 = qs.L1;
                                            if ((i10 & 1) != 0) {
                                            }
                                            if ((i10 & 2) != 0) {
                                            }
                                            if ((i10 & 128) != 0) {
                                            }
                                            if ((i10 & 4) != 0) {
                                            }
                                            if ((i10 & 8) != 0) {
                                            }
                                            if ((i10 & 16) != 0) {
                                            }
                                            if ((i10 & 32) != 0) {
                                            }
                                            if ((i10 & 64) != 0) {
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
                                        ((j6.o) it11.next()).b(optLong, 0, null);
                                    }
                                    break;
                                }
                                break;
                            case 2107149050:
                                if (string.equals("QUEUE_ITEM_IDS")) {
                                    mVar.r.b(optLong, 0, null);
                                    mVar.h("QUEUE_ITEM_IDS", jSONObject);
                                    if (mVar.h != null && (m10 = j6.m.m(jSONObject.getJSONArray("itemIds"))) != null) {
                                        Iterator it12 = ((h) mVar.h.b).i.iterator();
                                        while (it12.hasNext()) {
                                            ((g) it12.next()).i(m10);
                                        }
                                        break;
                                    }
                                }
                                break;
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
            } catch (JSONException e12) {
                e = e12;
                c10 = 1;
            }
        } catch (JSONException e13) {
            e = e13;
            c10 = 1;
            str2 = str3;
        }
    }

    public final void p(g gVar) {
        q6.m.d("Must be called from the main thread.");
        if (gVar != null) {
            this.i.add(gVar);
        }
    }

    public final BasePendingResult q(f6.p pVar) {
        q6.m.d("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        q6.m.d("Must be called from the main thread.");
        int f10 = f();
        if (f10 == 4 || f10 == 2) {
            q6.m.d("Must be called from the main thread.");
            if (w()) {
                x(new i(this, 5));
                return;
            } else {
                t();
                return;
            }
        }
        q6.m.d("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 6));
        } else {
            t();
        }
    }

    public final int s() {
        f6.o c10;
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
        q6.m.d("Must be called from the main thread.");
        String str = this.c.b;
        e0 e0Var = (e0) f0Var;
        j6.a.b(str);
        synchronized (e0Var.D) {
            e0Var.D.put(str, this);
        }
        s b10 = t.b();
        b10.c = new a0(e0Var, str, this);
        b10.a = 8413;
        e0Var.e(1, b10.a());
        q6.m.d("Must be called from the main thread.");
        if (w()) {
            x(new i(this, 0));
        } else {
            t();
        }
    }

    public final void v(e0 e0Var) {
        f6.f fVar;
        f0 f0Var = this.f;
        if (f0Var == e0Var) {
            return;
        }
        if (f0Var != null) {
            this.c.n();
            this.e.c();
            q6.m.d("Must be called from the main thread.");
            String str = this.c.b;
            e0 e0Var2 = (e0) f0Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (e0Var2.D) {
                fVar = (f6.f) e0Var2.D.remove(str);
            }
            s b10 = t.b();
            b10.c = new a0(e0Var2, fVar, str);
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
