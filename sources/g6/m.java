package g6;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import v7.w7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m extends p {
    public static final String v;
    public long e;
    public c6.q f;
    public Long g;
    public a4.m h;
    public int i;
    public final o j;
    public final o k;
    public final o l;
    public final o m;
    public final o n;
    public final o o;
    public final o p;
    public final o q;
    public final o r;
    public final o s;
    public final o t;
    public final o u;

    static {
        Pattern pattern = a.a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.i = -1;
        o oVar = new o(86400000L, "load");
        this.j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.t = oVar16;
        this.s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.u = oVar17;
        o oVar18 = new o(86400000L, "skipAd");
        a(oVar);
        a(oVar2);
        a(oVar3);
        a(oVar4);
        a(oVar5);
        a(oVar6);
        a(oVar7);
        a(oVar8);
        a(oVar9);
        a(oVar10);
        a(oVar11);
        a(oVar12);
        a(oVar13);
        a(oVar14);
        a(oVar15);
        a(oVar16);
        a(oVar16);
        a(oVar17);
        a(oVar18);
        g();
    }

    public static l f(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        l lVar = new l();
        Pattern pattern = a.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return lVar;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final void d(n nVar, int i10, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i10 != 0) {
                jSONObject.put("jump", i10);
            }
            String b11 = w7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.q.a(b10, new of.b(15, this, nVar));
    }

    public final long e(double d, long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j3;
        }
        long j11 = j3 + ((long) (elapsedRealtime * d));
        if (j10 > 0 && j11 > j10) {
            return j10;
        }
        if (j11 >= 0) {
            return j11;
        }
        return 0L;
    }

    public final void g() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            b bVar = this.a;
            Log.w(bVar.a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void i() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.b;
            Iterator it = hVar.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = hVar.i.iterator();
            while (it2.hasNext()) {
                ((e6.g) it2.next()).c();
            }
        }
    }

    public final void j() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.b;
            Iterator it = hVar.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = hVar.i.iterator();
            while (it2.hasNext()) {
                ((e6.g) it2.next()).d();
            }
        }
    }

    public final void k() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.b;
            Iterator it = hVar.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = hVar.i.iterator();
            while (it2.hasNext()) {
                ((e6.g) it2.next()).e();
            }
        }
    }

    public final void l() {
        a4.m mVar = this.h;
        if (mVar != null) {
            e6.h hVar = (e6.h) mVar.b;
            Iterator it = hVar.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (hVar.h()) {
                    throw null;
                }
                if (!hVar.h()) {
                    throw null;
                }
                throw null;
            }
            Iterator it2 = hVar.h.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            Iterator it3 = hVar.i.iterator();
            while (it3.hasNext()) {
                ((e6.g) it3.next()).g();
            }
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).f(2002);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final long o() {
        c6.j jVar;
        c6.q qVar = this.f;
        MediaInfo mediaInfo = qVar == null ? null : qVar.a;
        if (mediaInfo != null && qVar != null) {
            Long l4 = this.g;
            if (l4 != null) {
                if (l4.equals(4294967296000L)) {
                    c6.q qVar2 = this.f;
                    if (qVar2.K != null) {
                        long longValue = l4.longValue();
                        c6.q qVar3 = this.f;
                        if (qVar3 != null && (jVar = qVar3.K) != null) {
                            long j3 = jVar.b;
                            r3 = !jVar.d ? e(1.0d, j3, -1L) : j3;
                        }
                        return Math.min(longValue, r3);
                    }
                    MediaInfo mediaInfo2 = qVar2 == null ? null : qVar2.a;
                    if ((mediaInfo2 != null ? mediaInfo2.e : 0L) >= 0) {
                        long longValue2 = l4.longValue();
                        c6.q qVar4 = this.f;
                        MediaInfo mediaInfo3 = qVar4 != null ? qVar4.a : null;
                        return Math.min(longValue2, mediaInfo3 != null ? mediaInfo3.e : 0L);
                    }
                }
                return l4.longValue();
            }
            if (this.e != 0) {
                double d = qVar.d;
                long j10 = qVar.h;
                return (d == 0.0d || qVar.e != 2) ? j10 : e(d, j10, mediaInfo.e);
            }
        }
        return 0L;
    }

    public final long p() {
        c6.q qVar = this.f;
        if (qVar != null) {
            return qVar.b;
        }
        throw new k();
    }
}
