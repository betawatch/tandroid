package org.telegram.messenger;

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ld extends c1 implements cs, ia, ja {
    public static volatile ld[] P = new ld[4];
    public static final String[] Q = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap R = new HashMap();
    public boolean E;
    public boolean F;
    public final SparseIntArray G;
    public final a0.h H;
    public long I;
    public final ArrayList J;
    public final a0.h K;
    public Boolean L;
    public boolean M;
    public final ma N;
    public final la O;
    public final a0.h a;
    public final ArrayList b;
    public final a0.h c;
    public final a0.h d;
    public final LocationManager e;
    public final jd f;
    public final jd h;
    public final jd n;
    public final gi.w5 r;
    public Location s;
    public long w;
    public boolean x;
    public long y;

    public ld(int i3) {
        super(i3);
        this.a = new a0.h();
        this.b = new ArrayList();
        this.c = new a0.h();
        this.d = new a0.h();
        int i10 = 0;
        this.f = new jd(this, i10);
        this.h = new jd(this, i10);
        this.n = new jd(this, i10);
        this.r = new gi.w5(this, 25);
        this.x = true;
        this.G = new SparseIntArray();
        this.H = new a0.h();
        this.J = new ArrayList();
        this.K = new a0.h();
        this.e = (LocationManager) t0.b.getSystemService("location");
        this.N = ((k4.j) t0.j()).onCreateLocationServicesAPI(t0.b, this, this);
        la onCreateLocationRequest = ((k4.j) t0.j()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        v9 v9Var = (v9) onCreateLocationRequest;
        v9Var.getClass();
        LocationRequest locationRequest = v9Var.a;
        locationRequest.a = 100;
        long j10 = locationRequest.c;
        long j11 = locationRequest.b;
        if (j10 == j11 / 6) {
            locationRequest.c = 166L;
        }
        if (locationRequest.r == j11) {
            locationRequest.r = 1000L;
        }
        locationRequest.b = 1000L;
        locationRequest.c = 1000L;
        g0.h3(new cd(this, 5));
        getMessagesStorage().a.c(new cd(this, 0));
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int codePointCount = upperCase.codePointCount(0, upperCase.length());
        if (codePointCount > 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < codePointCount; i3++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i3) - (-127397)));
        }
        return sb2.toString();
    }

    public static String c(double d, double d10) {
        if (d10 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d > -88.0d && d < 40.0d && d10 > 0.0d) {
            return "Atlantic Ocean";
        }
        if (d > -60.0d && d < 20.0d && d10 <= 0.0d) {
            return "Atlantic Ocean";
        }
        if (d10 <= 30.0d && d >= 20.0d && d < 150.0d) {
            return "Indian Ocean";
        }
        if ((d > 106.0d || d < -60.0d) && d10 > 0.0d) {
            return "Pacific Ocean";
        }
        if ((d > 150.0d || d < -60.0d) && d10 <= 0.0d) {
            return "Pacific Ocean";
        }
        return null;
    }

    public static void d(Location location, int i3, kg.o0 o0Var) {
        Locale locale;
        HashMap hashMap = R;
        Runnable runnable = (Runnable) hashMap.get(o0Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(o0Var);
        }
        if (location == null) {
            o0Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = bd.E0().y;
        } catch (Exception unused) {
            locale = bd.E0().z;
        }
        Locale locale2 = locale;
        Locale locale3 = locale2.getLanguage().contains("en") ? locale2 : Locale.US;
        p5 p5Var = Utilities.e;
        sj sjVar = new sj(locale2, location, i3, locale3, o0Var, 1);
        p5Var.e(sjVar, 300L);
        R.put(o0Var, sjVar);
    }

    public static int e(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    public static ld f(int i3) {
        ld ldVar;
        ld ldVar2 = P[i3];
        if (ldVar2 != null) {
            return ldVar2;
        }
        synchronized (ld.class) {
            try {
                ldVar = P[i3];
                if (ldVar == null) {
                    ld[] ldVarArr = P;
                    ld ldVar3 = new ld(i3);
                    ldVarArr[i3] = ldVar3;
                    ldVar = ldVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ldVar;
    }

    public static int g() {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i3 += f(i10).J.size();
        }
        return i3;
    }

    public static void q() {
        try {
            if (!b8.nf.d("android.permission.ACCESS_COARSE_LOCATION") && !b8.nf.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
                return;
            }
            t0.b.startService(new Intent(t0.b, (Class<?>) LocationSharingService.class));
        } catch (Throwable th2) {
            a8.g(th2, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i3 = LocationSharingService.d;
        new e0.j0(t0.b).b(6, "live_location_paused");
        t0.b.stopService(new Intent(t0.b, (Class<?>) LocationSharingService.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        float[] fArr;
        TLRPC.InputGeoPoint inputGeoPoint;
        int i3;
        int i10;
        int i11;
        TLRPC.GeoPoint geoPoint;
        if (this.s == null) {
            return;
        }
        SparseIntArray sparseIntArray = this.G;
        if (sparseIntArray.size() != 0) {
            if (z10) {
                for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                    getConnectionsManager().cancelRequest(sparseIntArray.keyAt(i12), false);
                }
            }
            sparseIntArray.clear();
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr2 = new float[1];
            int i13 = 0;
            while (i13 < arrayList.size()) {
                kd kdVar = (kd) arrayList.get(i13);
                TLRPC.Message message = kdVar.h.k;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && (geoPoint = messageMedia.geo) != null && kdVar.g == kdVar.f) {
                    int i14 = message.edit_date;
                    if (i14 == 0) {
                        i14 = message.date;
                    }
                    if (Math.abs(currentTime - i14) < 10) {
                        fArr = fArr2;
                        Location.distanceBetween(geoPoint.lat, geoPoint._long, this.s.getLatitude(), this.s.getLongitude(), fArr);
                        if (fArr[0] < 1.0f) {
                            i11 = i13;
                            i13 = i11 + 1;
                            fArr2 = fArr;
                        }
                        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                        tL_messages_editMessage.peer = getMessagesController().j1(kdVar.a);
                        tL_messages_editMessage.id = kdVar.b;
                        tL_messages_editMessage.flags |= TLObject.FLAG_14;
                        TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                        tL_messages_editMessage.media = tL_inputMediaGeoLive;
                        tL_inputMediaGeoLive.stopped = false;
                        tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                        tL_messages_editMessage.media.geo_point.lat = g0.b0(this.s.getLatitude());
                        tL_messages_editMessage.media.geo_point._long = g0.b0(this.s.getLongitude());
                        tL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.s.getAccuracy();
                        TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                        inputGeoPoint = inputMedia.geo_point;
                        if (inputGeoPoint.accuracy_radius != 0) {
                            inputGeoPoint.flags |= 1;
                        }
                        i3 = kdVar.g;
                        i10 = kdVar.f;
                        if (i3 != i10) {
                            inputMedia.proximity_notification_radius = i10;
                            inputMedia.flags |= 8;
                        }
                        inputMedia.heading = e(this.s);
                        tL_messages_editMessage.media.flags |= 4;
                        i11 = i13;
                        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new q6(this, kdVar, r3, tL_messages_editMessage, 1));
                        int[] iArr = {sendRequest};
                        sparseIntArray.put(sendRequest, 0);
                        i13 = i11 + 1;
                        fArr2 = fArr;
                    }
                }
                fArr = fArr2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage2.peer = getMessagesController().j1(kdVar.a);
                tL_messages_editMessage2.id = kdVar.b;
                tL_messages_editMessage2.flags |= TLObject.FLAG_14;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive2 = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage2.media = tL_inputMediaGeoLive2;
                tL_inputMediaGeoLive2.stopped = false;
                tL_inputMediaGeoLive2.geo_point = new TLRPC.TL_inputGeoPoint();
                tL_messages_editMessage2.media.geo_point.lat = g0.b0(this.s.getLatitude());
                tL_messages_editMessage2.media.geo_point._long = g0.b0(this.s.getLongitude());
                tL_messages_editMessage2.media.geo_point.accuracy_radius = (int) this.s.getAccuracy();
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage2.media;
                inputGeoPoint = inputMedia2.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                }
                i3 = kdVar.g;
                i10 = kdVar.f;
                if (i3 != i10) {
                }
                inputMedia2.heading = e(this.s);
                tL_messages_editMessage2.media.flags |= 4;
                i11 = i13;
                int sendRequest2 = getConnectionsManager().sendRequest(tL_messages_editMessage2, new q6(this, kdVar, iArr, tL_messages_editMessage2, 1));
                int[] iArr2 = {sendRequest2};
                sparseIntArray.put(sendRequest2, 0);
                i13 = i11 + 1;
                fArr2 = fArr;
            }
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (SystemClock.elapsedRealtime() > this.I) {
            r(false);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11 = hs.F4;
        a0.h hVar = this.c;
        if (i3 == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l10 = (Long) objArr[0];
            long longValue = l10.longValue();
            if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    zi ziVar = (zi) arrayList3.get(i12);
                    if (ziVar.D3()) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                arrayList2.add(ziVar.k);
                                break;
                            } else {
                                if (zi.C1(((TLRPC.Message) arrayList2.get(i13)).from_id) == ziVar.Z0()) {
                                    arrayList2.set(i13, ziVar.k);
                                    break;
                                }
                                i13++;
                            }
                        }
                        z10 = true;
                    } else {
                        TLRPC.Message message = ziVar.k;
                        if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                            long B0 = zi.B0(message);
                            if (m5.E(B0)) {
                                o(0, B0, false);
                            }
                        }
                    }
                }
                if (z10) {
                    hs.e().k(i11, l10, Integer.valueOf(this.currentAccount));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == hs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            ArrayList arrayList4 = this.J;
            if (arrayList4.isEmpty()) {
                return;
            }
            ArrayList arrayList5 = (ArrayList) objArr[0];
            long longValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList6 = null;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                kd kdVar = (kd) arrayList4.get(i14);
                zi ziVar2 = kdVar.h;
                if (longValue2 == (ziVar2 != null ? zi.v0(ziVar2.k) : 0L) && arrayList5.contains(Integer.valueOf(kdVar.b))) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(Long.valueOf(kdVar.a));
                }
            }
            if (arrayList6 != null) {
                for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                    k(((Long) arrayList6.get(i15)).longValue());
                }
                return;
            }
            return;
        }
        if (i3 == hs.m0) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    zi ziVar3 = (zi) arrayList7.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        }
                        if (zi.C1(((TLRPC.Message) arrayList.get(i17)).from_id) == ziVar3.Z0()) {
                            if (ziVar3.D3()) {
                                arrayList.set(i17, ziVar3.k);
                            } else {
                                arrayList.remove(i17);
                            }
                            z11 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z11) {
                    hs.e().k(i11, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final kd h(long j10) {
        return (kd) this.K.f(j10);
    }

    public final boolean i(long j10) {
        return this.K.h(j10) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.tgnet.TLRPC$TL_messages_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLRPC$TL_channels_readMessageContents] */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.tgnet.ConnectionsManager] */
    public final void j(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (m5.C(j10) || (arrayList = (ArrayList) this.c.f(j10)) == null || arrayList.isEmpty()) {
            return;
        }
        a0.h hVar = this.d;
        Integer num = (Integer) hVar.f(j10);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            hVar.k(Integer.valueOf(elapsedRealtime), j10);
            int i3 = 0;
            if (m5.z(j10)) {
                long j11 = -j10;
                if (t3.S(this.currentAccount, j11)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i3 < size) {
                        i3 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i3)).id, i3, 1, tL_messages_readMessageContents.id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().h1(j11);
                    getConnectionsManager().sendRequest(tL_messages_readMessageContents, new dd(this, 2));
                }
            }
            tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i3 < size2) {
                i3 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i3)).id, i3, 1, tL_messages_readMessageContents.id);
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new dd(this, 2));
        }
    }

    public final void k(long j10) {
        Utilities.d.c(new id(this, j10, 0));
    }

    public final void l(kd kdVar, int i3) {
        getMessagesStorage().a.c(new k7(this, i3, kdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.s = location;
            if (location != null) {
                g0.h3(new hc(4));
            }
        }
    }

    public final void n(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.F = true;
        if (z10 || ((location2 = this.s) != null && location2.distanceTo(location) >= 20.0f)) {
            this.w = SystemClock.elapsedRealtime() - 30000;
            this.x = false;
        } else if (this.x) {
            this.w = SystemClock.elapsedRealtime() - 10000;
            this.x = false;
        }
        m(location);
    }

    public final void o(int i3, long j10, boolean z10) {
        kd kdVar = (kd) this.K.f(j10);
        if (kdVar != null) {
            kdVar.f = i3;
        }
        getMessagesStorage().a.c(new ci.i9(this, i3, j10, 2));
        if (z10) {
            Utilities.d.c(new cd(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.e;
        if (this.E) {
            return;
        }
        this.y = SystemClock.elapsedRealtime();
        this.E = true;
        if (this.L == null) {
            ((k4.j) t0.j()).getClass();
            this.L = Boolean.valueOf(lt.b.hasServices());
        }
        if (this.L.booleanValue()) {
            try {
                ((com.google.android.gms.common.api.internal.d0) ((gi.v5) this.N).b).f();
                return;
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        try {
            this.e.requestLocationUpdates("gps", 1L, 0.0f, this.f);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            this.e.requestLocationUpdates("network", 1L, 0.0f, this.h);
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            this.e.requestLocationUpdates("passive", 1L, 0.0f, this.n);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        if (this.s == null) {
            try {
                m(locationManager.getLastKnownLocation("gps"));
                if (this.s == null) {
                    m(locationManager.getLastKnownLocation("network"));
                }
            } catch (Exception e13) {
                a8.g(e13, true);
            }
        }
    }

    public final void r(boolean z10) {
        this.E = false;
        if (this.L == null) {
            ((k4.j) t0.j()).getClass();
            this.L = Boolean.valueOf(lt.b.hasServices());
        }
        if (this.L.booleanValue()) {
            try {
                ((k4.j) t0.j()).removeLocationUpdates(this.r);
                ((com.google.android.gms.common.api.internal.d0) ((gi.v5) this.N).b).g();
            } catch (Throwable th2) {
                a8.g(th2, false);
            }
        }
        jd jdVar = this.f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(jdVar);
        if (z10) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            boolean z10 = false;
            while (i3 < arrayList.size()) {
                kd kdVar = (kd) arrayList.get(i3);
                if (kdVar.c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i3);
                    this.a.l(kdVar.a);
                    l(kdVar, 1);
                    g0.h3(new ed(this, kdVar, 2));
                    i3--;
                    z10 = true;
                }
                i3++;
            }
            if (z10 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (!this.E) {
            if (arrayList.isEmpty() || Math.abs(this.w - SystemClock.elapsedRealtime()) <= 30000) {
                return;
            }
            this.y = SystemClock.elapsedRealtime();
            p();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.F || Math.abs(this.y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.I && Math.abs(this.w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.y)) {
            this.F = false;
            this.x = true;
            boolean z11 = SystemClock.elapsedRealtime() - this.w > 2000;
            this.y = elapsedRealtime;
            this.w = SystemClock.elapsedRealtime();
            a(z11);
        }
    }
}
