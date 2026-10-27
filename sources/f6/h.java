package f6;

import a8.h0;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.a0;
import d6.e0;
import d6.f0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h implements d6.f {
    public static final h6.b k = new h6.b("RemoteMediaClient", null);
    public final Object a;
    public final y b;
    public final h6.m c;
    public final h0 d;
    public final c e;
    public f0 f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j;

    static {
        String str = h6.m.v;
    }

    public h(h6.m mVar) {
        new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new y(Looper.getMainLooper(), 0);
        h0 h0Var = new h0(this);
        this.d = h0Var;
        this.c = mVar;
        mVar.h = new rb.c(this, 19);
        mVar.c = h0Var;
        this.e = new c(this);
    }

    public static t t() {
        t tVar = new t(null, 1);
        tVar.a(new n(new Status(17, null, null, null), 0));
        return tVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.a) {
            o6.l.e("Must be called from the main thread.");
            o10 = this.c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.a) {
            try {
                o6.l.e("Must be called from the main thread.");
                d6.q e = e();
                i10 = e != null ? e.f : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final d6.o c() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.N.get(e.w);
        if (num == null) {
            return null;
        }
        return (d6.o) e.G.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            o6.l.e("Must be called from the main thread.");
            d6.q qVar = this.c.f;
            mediaInfo = qVar == null ? null : qVar.a;
        }
        return mediaInfo;
    }

    public final d6.q e() {
        d6.q qVar;
        synchronized (this.a) {
            o6.l.e("Must be called from the main thread.");
            qVar = this.c.f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.a) {
            try {
                o6.l.e("Must be called from the main thread.");
                d6.q e = e();
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
            o6.l.e("Must be called from the main thread.");
            d6.q qVar = this.c.f;
            MediaInfo mediaInfo = qVar == null ? null : qVar.a;
            j10 = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j10;
    }

    public final boolean h() {
        o6.l.e("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        return (e != null && e.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        return e != null && e.e == 4;
    }

    public final boolean j() {
        o6.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        return (e == null || e.w == 0) ? false : true;
    }

    public final boolean l() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        if (e == null) {
            return false;
        }
        if (e.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        return e != null && e.e == 2;
    }

    public final boolean n() {
        o6.l.e("Must be called from the main thread.");
        d6.q e = e();
        return e != null && e.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4 A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111 A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121 A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146 A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186 A[Catch: JSONException -> 0x0084, TryCatch #2 {JSONException -> 0x0084, blocks: (B:12:0x004d, B:14:0x005a, B:16:0x0064, B:17:0x0070, B:19:0x0076, B:28:0x008e, B:30:0x009b, B:32:0x00aa, B:37:0x00c4, B:40:0x00c9, B:41:0x010d, B:43:0x0111, B:44:0x011d, B:46:0x0121, B:47:0x012a, B:49:0x012e, B:50:0x0134, B:52:0x0138, B:53:0x013b, B:55:0x013f, B:56:0x0142, B:58:0x0146, B:59:0x0149, B:61:0x014d, B:63:0x0157, B:65:0x0167, B:66:0x016d, B:68:0x0173, B:70:0x017d, B:71:0x0181, B:72:0x0182, B:74:0x0186, B:75:0x019e, B:76:0x01a2, B:78:0x01a8, B:81:0x00ce, B:82:0x00b4, B:84:0x00ba, B:88:0x0190, B:92:0x01bb), top: B:8:0x0040 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [h6.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(String str) {
        char c10;
        int i10;
        int i11;
        d6.q qVar;
        int[] m10;
        h6.m mVar = this.c;
        String str2 = mVar.o;
        h6.o oVar = mVar.n;
        h6.o oVar2 = mVar.j;
        List list = mVar.d;
        h6.b bVar = mVar.a;
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
                                    oVar2.b(optLong, 2101, h6.m.f(jSONObject));
                                    return;
                                }
                                return;
                            case -1790231854:
                                if (string.equals("QUEUE_ITEMS")) {
                                    mVar.s.b(optLong, 0, null);
                                    mVar.h("QUEUE_ITEMS", jSONObject);
                                    if (mVar.h != null) {
                                        JSONArray jSONArray = jSONObject.getJSONArray("items");
                                        d6.o[] oVarArr = new d6.o[jSONArray.length()];
                                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                            oVarArr[i12] = new a4.l(jSONArray.getJSONObject(i12)).o();
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
                                        ((h6.o) it2.next()).b(optLong, 2001, h6.m.f(jSONObject));
                                    }
                                    return;
                                }
                                return;
                            case -262628938:
                                if (string.equals("LOAD_FAILED")) {
                                    oVar2.b(optLong, 2100, h6.m.f(jSONObject));
                                    return;
                                }
                                return;
                            case 66247144:
                                if (string.equals("ERROR")) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        ((h6.o) it3.next()).b(optLong, 2100, h6.m.f(jSONObject));
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
                                        int[] m11 = h6.m.m(jSONObject.getJSONArray("itemIds"));
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
                                                        int[] m12 = h6.m.m(jSONObject.getJSONArray("itemIds"));
                                                        o6.l.i(m12, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                                        JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                                        if (optJSONArray == null) {
                                                            Iterator it7 = ((h) mVar.h.b).i.iterator();
                                                            while (it7.hasNext()) {
                                                                ((g) it7.next()).i(m12);
                                                            }
                                                            return;
                                                        }
                                                        ArrayList c11 = h6.a.c(m12);
                                                        int optInt2 = jSONObject.optInt("insertBefore", 0);
                                                        int[] m13 = h6.m.m(optJSONArray);
                                                        o6.l.h(m13);
                                                        ArrayList c12 = h6.a.c(m13);
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
                                        ((h6.o) it10.next()).b(optLong, 2100, h6.m.f(jSONObject));
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
                                                    rb.c cVar = mVar.h;
                                                    if (cVar != null) {
                                                        h hVar = (h) cVar.b;
                                                        Iterator it11 = hVar.h.iterator();
                                                        if (it11.hasNext()) {
                                                            throw a1.g.j(it11);
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
                                            d6.q qVar2 = new d6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
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
                                        if (!str2.d() || str2.c(optLong)) {
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
                                            d6.q qVar22 = new d6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
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
                                            d6.q qVar222 = new d6.q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
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
                                    Iterator it13 = list.iterator();
                                    while (it13.hasNext()) {
                                        ((h6.o) it13.next()).b(optLong, 0, null);
                                    }
                                    return;
                                }
                                return;
                            case 2107149050:
                                if (string.equals("QUEUE_ITEM_IDS")) {
                                    mVar.r.b(optLong, 0, null);
                                    mVar.h("QUEUE_ITEM_IDS", jSONObject);
                                    if (mVar.h == null || (m10 = h6.m.m(jSONObject.getJSONArray("itemIds"))) == null) {
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
                    } catch (JSONException e) {
                        e = e;
                        Object[] objArr = new Object[2];
                        objArr[0] = e.getMessage();
                        objArr[c10] = str;
                        Log.w(str2, bVar.d("Message is malformed (%s); ignoring: %s", objArr));
                    }
                } catch (JSONException e10) {
                    e = e10;
                    str2 = str3;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = e.getMessage();
                    objArr2[c10] = str;
                    Log.w(str2, bVar.d("Message is malformed (%s); ignoring: %s", objArr2));
                }
            } catch (JSONException e11) {
                e = e11;
                c10 = 1;
            }
        } catch (JSONException e12) {
            e = e12;
            c10 = 1;
            str2 = str3;
        }
    }

    public final void p(g gVar) {
        o6.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.i.add(gVar);
        }
    }

    public final BasePendingResult q(d6.p pVar) {
        o6.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        k kVar = new k(this, pVar, 2);
        x(kVar);
        return kVar;
    }

    public final void r() {
        o6.l.e("Must be called from the main thread.");
        int f7 = f();
        if (f7 == 4 || f7 == 2) {
            o6.l.e("Must be called from the main thread.");
            if (w()) {
                x(new j(this, 5));
                return;
            } else {
                t();
                return;
            }
        }
        o6.l.e("Must be called from the main thread.");
        if (w()) {
            x(new j(this, 6));
        } else {
            t();
        }
    }

    public final int s() {
        d6.o c10;
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
        o6.l.e("Must be called from the main thread.");
        String str = this.c.b;
        e0 e0Var = (e0) f0Var;
        h6.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        u b10 = v.b();
        b10.c = new a0(e0Var, str, this);
        b10.a = 8413;
        e0Var.e(1, b10.a());
        o6.l.e("Must be called from the main thread.");
        if (w()) {
            x(new j(this, 0));
        } else {
            t();
        }
    }

    public final void v(e0 e0Var) {
        d6.f fVar;
        f0 f0Var = this.f;
        if (f0Var == e0Var) {
            return;
        }
        if (f0Var != null) {
            this.c.n();
            this.e.c();
            o6.l.e("Must be called from the main thread.");
            String str = this.c.b;
            e0 e0Var2 = (e0) f0Var;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (e0Var2.C) {
                fVar = (d6.f) e0Var2.C.remove(str);
            }
            u b10 = v.b();
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
