// default package

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i69 {
    public static final dc6 k = new dc6("RemoteMediaClient", null);
    public final y8d c;
    public final vk9 d;
    public final wr6 e;
    public afd f;
    public TaskCompletionSource g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Object a = new Object();
    public final o59 b = new o59(Looper.getMainLooper(), (byte) 3);

    static {
        String str = y8d.v;
    }

    public i69(y8d y8dVar) {
        vk9 vk9Var = new vk9(this);
        this.d = vk9Var;
        this.c = y8dVar;
        y8dVar.h = new xdd(this);
        y8dVar.c = vk9Var;
        this.e = new wr6(this);
    }

    public static cya t() {
        cya cyaVar = new cya(null, (byte) 1);
        cyaVar.a(new vcd(new Status(17, null, null, null), (byte) 0));
        return cyaVar;
    }

    public static final void x(ndd nddVar) {
        try {
            nddVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            nddVar.a(new vcd(new Status(2100, null, null, null), (byte) 1));
        }
    }

    public final long a() {
        long o;
        synchronized (this.a) {
            fre.e("Must be called from the main thread.");
            o = this.c.o();
        }
        return o;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            fre.e("Must be called from the main thread.");
            fy6 e = e();
            i = e != null ? e.f : 0;
        }
        return i;
    }

    public final zr6 c() {
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.O.get(e.x);
        if (num == null) {
            return null;
        }
        return (zr6) e.H.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            fre.e("Must be called from the main thread.");
            fy6 fy6Var = this.c.f;
            mediaInfo = fy6Var == null ? null : fy6Var.a;
        }
        return mediaInfo;
    }

    public final fy6 e() {
        fy6 fy6Var;
        synchronized (this.a) {
            fre.e("Must be called from the main thread.");
            fy6Var = this.c.f;
        }
        return fy6Var;
    }

    public final int f() {
        int i;
        synchronized (this.a) {
            fre.e("Must be called from the main thread.");
            fy6 e = e();
            i = e != null ? e.e : 1;
        }
        return i;
    }

    public final long g() {
        long j;
        synchronized (this.a) {
            fre.e("Must be called from the main thread.");
            fy6 fy6Var = this.c.f;
            MediaInfo mediaInfo = fy6Var == null ? null : fy6Var.a;
            j = mediaInfo != null ? mediaInfo.e : 0L;
        }
        return j;
    }

    public final boolean h() {
        fre.e("Must be called from the main thread.");
        if (i()) {
            return true;
        }
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        return (e != null && e.e == 5) || m() || l() || k();
    }

    public final boolean i() {
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        return e != null && e.e == 4;
    }

    public final boolean j() {
        fre.e("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean k() {
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        return (e == null || e.x == 0) ? false : true;
    }

    public final boolean l() {
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        if (e == null) {
            return false;
        }
        if (e.e != 3) {
            return j() && b() == 2;
        }
        return true;
    }

    public final boolean m() {
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        return e != null && e.e == 2;
    }

    public final boolean n() {
        fre.e("Must be called from the main thread.");
        fy6 e = e();
        return e != null && e.I;
    }

    public final void o(String str) {
        char c;
        JSONObject jSONObject;
        String string;
        long optLong;
        int i;
        fy6 fy6Var;
        int[] j;
        y8d y8dVar = this.c;
        u9d u9dVar = y8dVar.o;
        u9d u9dVar2 = y8dVar.n;
        u9d u9dVar3 = y8dVar.j;
        List list = y8dVar.d;
        dc6 dc6Var = y8dVar.a;
        dc6Var.b("message received: %s", str);
        String str2 = dc6Var.a;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            optLong = jSONObject.optLong("requestId", -1L);
            c = 1;
        } catch (JSONException e) {
            e = e;
            c = 1;
        }
        try {
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        u9dVar3.b(optLong, 2101, y8d.c(jSONObject));
                        return;
                    }
                    return;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        y8dVar.s.b(optLong, 0, null);
                        y8dVar.e("QUEUE_ITEMS", jSONObject);
                        if (y8dVar.h != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            zr6[] zr6VarArr = new zr6[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                gi3 gi3Var = new gi3();
                                gi3Var.a = new zr6(jSONObject2);
                                zr6VarArr[i2] = gi3Var.d();
                            }
                            Iterator it = ((i69) y8dVar.h.a).i.iterator();
                            while (it.hasNext()) {
                                ((h69) it.next()).k(zr6VarArr);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        Log.w(str2, dc6Var.d("received unexpected error: Invalid Request.", new Object[0]));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((u9d) it2.next()).b(optLong, 2001, y8d.c(jSONObject));
                        }
                        return;
                    }
                    return;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        u9dVar3.b(optLong, 2100, y8d.c(jSONObject));
                        return;
                    }
                    return;
                case 66247144:
                    if (string.equals("ERROR")) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((u9d) it3.next()).b(optLong, 2100, y8d.c(jSONObject));
                        }
                        if (y8dVar.h != null) {
                            MediaError b = MediaError.b(jSONObject);
                            Iterator it4 = ((i69) y8dVar.h.a).i.iterator();
                            while (it4.hasNext()) {
                                ((h69) it4.next()).b(b);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        y8dVar.t.b(optLong, 0, null);
                        y8dVar.e("QUEUE_CHANGE", jSONObject);
                        if (y8dVar.h != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] j2 = y8d.j(jSONObject.getJSONArray("itemIds"));
                            int optInt = jSONObject.optInt("insertBefore", 0);
                            if (j2 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            Iterator it5 = ((i69) y8dVar.h.a).i.iterator();
                                            while (it5.hasNext()) {
                                                ((h69) it5.next()).j(j2, optInt);
                                            }
                                            return;
                                        }
                                        return;
                                    case -1881281404:
                                        if (string2.equals("REMOVE")) {
                                            Iterator it6 = ((i69) y8dVar.h.a).i.iterator();
                                            while (it6.hasNext()) {
                                                ((h69) it6.next()).l(j2);
                                            }
                                            return;
                                        }
                                        return;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] j3 = y8d.j(jSONObject.getJSONArray("itemIds"));
                                            fre.i(j3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (optJSONArray == null) {
                                                Iterator it7 = ((i69) y8dVar.h.a).i.iterator();
                                                while (it7.hasNext()) {
                                                    ((h69) it7.next()).i(j3);
                                                }
                                                return;
                                            }
                                            ArrayList c2 = id1.c(j3);
                                            int optInt2 = jSONObject.optInt("insertBefore", 0);
                                            int[] j4 = y8d.j(optJSONArray);
                                            fre.h(j4);
                                            ArrayList c3 = id1.c(j4);
                                            Iterator it8 = ((i69) y8dVar.h.a).i.iterator();
                                            while (it8.hasNext()) {
                                                ((h69) it8.next()).m(c2, c3, optInt2);
                                            }
                                            return;
                                        }
                                        return;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            Iterator it9 = ((i69) y8dVar.h.a).i.iterator();
                                            while (it9.hasNext()) {
                                                ((h69) it9.next()).n(j2);
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
                        Log.w(str2, dc6Var.d("received unexpected error: Invalid Player State.", new Object[0]));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            ((u9d) it10.next()).b(optLong, 2100, y8d.c(jSONObject));
                        }
                        return;
                    }
                    return;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                            boolean c4 = u9dVar3.c(optLong);
                            int i3 = ((!u9dVar2.d() || u9dVar2.c(optLong)) && (!u9dVar.d() || u9dVar.c(optLong))) ? 0 : 1;
                            if (c4 || (fy6Var = y8dVar.f) == null) {
                                fy6 fy6Var2 = new fy6(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                                fy6Var2.b(jSONObject3, 0);
                                y8dVar.f = fy6Var2;
                                y8dVar.e = SystemClock.elapsedRealtime();
                                i = kk7.K1;
                            } else {
                                i = fy6Var.b(jSONObject3, i3);
                            }
                            if ((i & 1) != 0) {
                                y8dVar.e = SystemClock.elapsedRealtime();
                                y8dVar.i = -1;
                                y8dVar.i();
                            }
                            if ((i & 2) != 0) {
                                y8dVar.e = SystemClock.elapsedRealtime();
                                y8dVar.i();
                            }
                            if ((i & 128) != 0) {
                                y8dVar.e = SystemClock.elapsedRealtime();
                            }
                            if ((i & 4) != 0) {
                                y8dVar.f();
                            }
                            if ((i & 8) != 0) {
                                y8dVar.h();
                            }
                            if ((i & 16) != 0) {
                                y8dVar.g();
                            }
                            if ((i & 32) != 0) {
                                y8dVar.e = SystemClock.elapsedRealtime();
                                xdd xddVar = y8dVar.h;
                                if (xddVar != null) {
                                    i69 i69Var = (i69) xddVar.a;
                                    Iterator it11 = i69Var.h.iterator();
                                    if (it11.hasNext()) {
                                        throw ls6.l(it11);
                                    }
                                    Iterator it12 = i69Var.i.iterator();
                                    while (it12.hasNext()) {
                                        ((h69) it12.next()).a();
                                    }
                                }
                            }
                            if ((i & 64) != 0) {
                                y8dVar.e = SystemClock.elapsedRealtime();
                                y8dVar.i();
                            }
                        } else {
                            y8dVar.f = null;
                            y8dVar.i();
                            y8dVar.f();
                            y8dVar.h();
                            y8dVar.g();
                        }
                        Iterator it13 = list.iterator();
                        while (it13.hasNext()) {
                            ((u9d) it13.next()).b(optLong, 0, null);
                        }
                        return;
                    }
                    return;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        y8dVar.r.b(optLong, 0, null);
                        y8dVar.e("QUEUE_ITEM_IDS", jSONObject);
                        if (y8dVar.h == null || (j = y8d.j(jSONObject.getJSONArray("itemIds"))) == null) {
                            return;
                        }
                        Iterator it14 = ((i69) y8dVar.h.a).i.iterator();
                        while (it14.hasNext()) {
                            ((h69) it14.next()).i(j);
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (JSONException e2) {
            e = e2;
            Object[] objArr = new Object[2];
            objArr[0] = e.getMessage();
            objArr[c] = str;
            Log.w(str2, dc6Var.d("Message is malformed (%s); ignoring: %s", objArr));
        }
    }

    public final void p(h69 h69Var) {
        fre.e("Must be called from the main thread.");
        if (h69Var != null) {
            this.i.add(h69Var);
        }
    }

    public final BasePendingResult q(nu6 nu6Var) {
        fre.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        o9d o9dVar = new o9d(this, nu6Var, (byte) 2);
        x(o9dVar);
        return o9dVar;
    }

    public final void r() {
        fre.e("Must be called from the main thread.");
        int f = f();
        if (f == 4 || f == 2) {
            fre.e("Must be called from the main thread.");
            if (w()) {
                x(new x5d(this, (byte) 5));
                return;
            } else {
                t();
                return;
            }
        }
        fre.e("Must be called from the main thread.");
        if (w()) {
            x(new x5d(this, (byte) 6));
        } else {
            t();
        }
    }

    public final int s() {
        zr6 c;
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
            if (k() && (c = c()) != null && c.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        afd afdVar = this.f;
        if (afdVar == null) {
            return;
        }
        fre.e("Must be called from the main thread.");
        String str = this.c.b;
        id1.b(str);
        synchronized (afdVar.D) {
            afdVar.D.put(str, this);
        }
        agb b = bgb.b();
        b.a = new ybd(afdVar, str, this);
        b.d = (char) 8413;
        afdVar.e(1, b.a());
        fre.e("Must be called from the main thread.");
        if (w()) {
            x(new x5d(this, (byte) 0));
        } else {
            t();
        }
    }

    public final void v(afd afdVar) {
        i69 i69Var;
        afd afdVar2 = this.f;
        if (afdVar2 != afdVar) {
            if (afdVar2 != null) {
                this.c.m();
                this.e.b();
                fre.e("Must be called from the main thread.");
                String str = this.c.b;
                if (TextUtils.isEmpty(str)) {
                    w26.j("Channel namespace cannot be null or empty");
                    return;
                }
                synchronized (afdVar2.D) {
                    i69Var = (i69) afdVar2.D.remove(str);
                }
                agb b = bgb.b();
                b.a = new ybd(afdVar2, i69Var, str);
                b.d = (char) 8414;
                afdVar2.e(1, b.a());
                this.d.b = null;
                this.b.removeCallbacksAndMessages(null);
            }
            this.f = afdVar;
            if (afdVar != null) {
                this.d.b = afdVar;
            }
        }
    }

    public final boolean w() {
        return this.f != null;
    }
}
