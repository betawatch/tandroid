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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class sd extends c1 implements ls, pa, qa {
    public static volatile sd[] O = new sd[4];
    public static final String[] P = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap Q = new HashMap();
    public boolean D;
    public boolean E;
    public final SparseIntArray F;
    public final a0.h G;
    public long H;
    public final ArrayList I;
    public final a0.h J;
    public Boolean K;
    public boolean L;
    public final ta M;
    public final sa N;
    public final a0.h a;
    public final ArrayList b;
    public final a0.h c;
    public final a0.h d;
    public final LocationManager e;
    public final qd f;
    public final qd h;
    public final qd n;
    public final g6.d0 r;
    public Location s;
    public long w;
    public boolean x;
    public long y;

    public sd(int i7) {
        super(i7);
        this.a = new a0.h();
        this.b = new ArrayList();
        this.c = new a0.h();
        this.d = new a0.h();
        int i10 = 0;
        this.f = new qd(this, i10);
        this.h = new qd(this, i10);
        this.n = new qd(this, i10);
        this.r = new g6.d0(this, 26);
        this.x = true;
        this.F = new SparseIntArray();
        this.G = new a0.h();
        this.I = new ArrayList();
        this.J = new a0.h();
        this.e = (LocationManager) t0.b.getSystemService("location");
        this.M = ((h6.m) t0.j()).onCreateLocationServicesAPI(t0.b, this, this);
        sa onCreateLocationRequest = ((h6.m) t0.j()).onCreateLocationRequest();
        this.N = onCreateLocationRequest;
        ba baVar = (ba) onCreateLocationRequest;
        baVar.getClass();
        LocationRequest locationRequest = baVar.a;
        locationRequest.a = 100;
        long j3 = locationRequest.c;
        long j10 = locationRequest.b;
        if (j3 == j10 / 6) {
            locationRequest.c = 166L;
        }
        if (locationRequest.r == j10) {
            locationRequest.r = 1000L;
        }
        locationRequest.b = 1000L;
        locationRequest.c = 1000L;
        g0.h3(new jd(this, 5));
        getMessagesStorage().a.c(new jd(this, 0));
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
        for (int i7 = 0; i7 < codePointCount; i7++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i7) - (-127397)));
        }
        return sb2.toString();
    }

    public static String c(double d, double d2) {
        if (d2 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d > -88.0d && d < 40.0d && d2 > 0.0d) {
            return "Atlantic Ocean";
        }
        if (d > -60.0d && d < 20.0d && d2 <= 0.0d) {
            return "Atlantic Ocean";
        }
        if (d2 <= 30.0d && d >= 20.0d && d < 150.0d) {
            return "Indian Ocean";
        }
        if ((d > 106.0d || d < -60.0d) && d2 > 0.0d) {
            return "Pacific Ocean";
        }
        if ((d > 150.0d || d < -60.0d) && d2 <= 0.0d) {
            return "Pacific Ocean";
        }
        return null;
    }

    public static void d(Location location, int i7, jg.r0 r0Var) {
        Locale locale;
        HashMap hashMap = Q;
        Runnable runnable = (Runnable) hashMap.get(r0Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(r0Var);
        }
        if (location == null) {
            r0Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = id.E0().y;
        } catch (Exception unused) {
            locale = id.E0().z;
        }
        Locale locale2 = locale;
        Locale locale3 = locale2.getLanguage().contains("en") ? locale2 : Locale.US;
        p5 p5Var = Utilities.e;
        bk bkVar = new bk(locale2, location, i7, locale3, r0Var, 1);
        p5Var.d(bkVar, 300L);
        Q.put(r0Var, bkVar);
    }

    public static int e(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    public static sd f(int i7) {
        sd sdVar;
        sd sdVar2 = O[i7];
        if (sdVar2 != null) {
            return sdVar2;
        }
        synchronized (sd.class) {
            try {
                sdVar = O[i7];
                if (sdVar == null) {
                    sd[] sdVarArr = O;
                    sd sdVar3 = new sd(i7);
                    sdVarArr[i7] = sdVar3;
                    sdVar = sdVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sdVar;
    }

    public static int g() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i7 += f(i10).I.size();
        }
        return i7;
    }

    public static void q() {
        try {
            if (!c8.ia.d("android.permission.ACCESS_COARSE_LOCATION") && !c8.ia.d("android.permission.ACCESS_FINE_LOCATION")) {
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
        int i7 = LocationSharingService.d;
        new e0.i0(t0.b).b(6, "live_location_paused");
        t0.b.stopService(new Intent(t0.b, (Class<?>) LocationSharingService.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z9) {
        float[] fArr;
        TLRPC.InputGeoPoint inputGeoPoint;
        int i7;
        int i10;
        int i11;
        TLRPC.GeoPoint geoPoint;
        if (this.s == null) {
            return;
        }
        SparseIntArray sparseIntArray = this.F;
        if (sparseIntArray.size() != 0) {
            if (z9) {
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
                rd rdVar = (rd) arrayList.get(i13);
                TLRPC.Message message = rdVar.h.k;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && (geoPoint = messageMedia.geo) != null && rdVar.g == rdVar.f) {
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
                        tL_messages_editMessage.peer = getMessagesController().j1(rdVar.a);
                        tL_messages_editMessage.id = rdVar.b;
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
                        i7 = rdVar.g;
                        i10 = rdVar.f;
                        if (i7 != i10) {
                            inputMedia.proximity_notification_radius = i10;
                            inputMedia.flags |= 8;
                        }
                        inputMedia.heading = e(this.s);
                        tL_messages_editMessage.media.flags |= 4;
                        i11 = i13;
                        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new q6(this, rdVar, r3, tL_messages_editMessage, 1));
                        int[] iArr = {sendRequest};
                        sparseIntArray.put(sendRequest, 0);
                        i13 = i11 + 1;
                        fArr2 = fArr;
                    }
                }
                fArr = fArr2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage2.peer = getMessagesController().j1(rdVar.a);
                tL_messages_editMessage2.id = rdVar.b;
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
                i7 = rdVar.g;
                i10 = rdVar.f;
                if (i7 != i10) {
                }
                inputMedia2.heading = e(this.s);
                tL_messages_editMessage2.media.flags |= 4;
                i11 = i13;
                int sendRequest2 = getConnectionsManager().sendRequest(tL_messages_editMessage2, new q6(this, rdVar, iArr, tL_messages_editMessage2, 1));
                int[] iArr2 = {sendRequest2};
                sparseIntArray.put(sendRequest2, 0);
                i13 = i11 + 1;
                fArr2 = fArr;
            }
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (SystemClock.elapsedRealtime() > this.H) {
            r(false);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11 = qs.F4;
        a0.h hVar = this.c;
        if (i7 == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l10 = (Long) objArr[0];
            long longValue = l10.longValue();
            if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z9 = false;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ij ijVar = (ij) arrayList3.get(i12);
                    if (ijVar.C3()) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                arrayList2.add(ijVar.k);
                                break;
                            } else {
                                if (ij.B1(((TLRPC.Message) arrayList2.get(i13)).from_id) == ijVar.Z0()) {
                                    arrayList2.set(i13, ijVar.k);
                                    break;
                                }
                                i13++;
                            }
                        }
                        z9 = true;
                    } else {
                        TLRPC.Message message = ijVar.k;
                        if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                            long B0 = ij.B0(message);
                            if (m5.E(B0)) {
                                o(0, B0, false);
                            }
                        }
                    }
                }
                if (z9) {
                    qs.e().k(i11, l10, Integer.valueOf(this.currentAccount));
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == qs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            ArrayList arrayList4 = this.I;
            if (arrayList4.isEmpty()) {
                return;
            }
            ArrayList arrayList5 = (ArrayList) objArr[0];
            long longValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList6 = null;
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                rd rdVar = (rd) arrayList4.get(i14);
                ij ijVar2 = rdVar.h;
                if (longValue2 == (ijVar2 != null ? ij.v0(ijVar2.k) : 0L) && arrayList5.contains(Integer.valueOf(rdVar.b))) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(Long.valueOf(rdVar.a));
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
        if (i7 == qs.m0) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ij ijVar3 = (ij) arrayList7.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        }
                        if (ij.B1(((TLRPC.Message) arrayList.get(i17)).from_id) == ijVar3.Z0()) {
                            if (ijVar3.C3()) {
                                arrayList.set(i17, ijVar3.k);
                            } else {
                                arrayList.remove(i17);
                            }
                            z10 = true;
                        } else {
                            i17++;
                        }
                    }
                }
                if (z10) {
                    qs.e().k(i11, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final rd h(long j3) {
        return (rd) this.J.f(j3);
    }

    public final boolean i(long j3) {
        return this.J.h(j3) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.tgnet.TLRPC$TL_messages_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLRPC$TL_channels_readMessageContents] */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.tgnet.ConnectionsManager] */
    public final void j(long j3) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (m5.C(j3) || (arrayList = (ArrayList) this.c.f(j3)) == null || arrayList.isEmpty()) {
            return;
        }
        a0.h hVar = this.d;
        Integer num = (Integer) hVar.f(j3);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            hVar.k(Integer.valueOf(elapsedRealtime), j3);
            int i7 = 0;
            if (m5.z(j3)) {
                long j10 = -j3;
                if (t3.S(this.currentAccount, j10)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i7 < size) {
                        i7 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i7)).id, i7, 1, tL_messages_readMessageContents.id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().h1(j10);
                    getConnectionsManager().sendRequest(tL_messages_readMessageContents, new kd(this, 2));
                }
            }
            tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i7 < size2) {
                i7 = com.google.android.recaptcha.internal.a.f(((TLRPC.Message) arrayList.get(i7)).id, i7, 1, tL_messages_readMessageContents.id);
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new kd(this, 2));
        }
    }

    public final void k(long j3) {
        Utilities.d.c(new pd(this, j3, 0));
    }

    public final void l(rd rdVar, int i7) {
        getMessagesStorage().a.c(new l7(this, i7, rdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.s = location;
            if (location != null) {
                g0.h3(new rc(2));
            }
        }
    }

    public final void n(Location location, boolean z9) {
        Location location2;
        if (location == null) {
            return;
        }
        this.E = true;
        if (z9 || ((location2 = this.s) != null && location2.distanceTo(location) >= 20.0f)) {
            this.w = SystemClock.elapsedRealtime() - 30000;
            this.x = false;
        } else if (this.x) {
            this.w = SystemClock.elapsedRealtime() - 10000;
            this.x = false;
        }
        m(location);
    }

    public final void o(int i7, long j3, boolean z9) {
        rd rdVar = (rd) this.J.f(j3);
        if (rdVar != null) {
            rdVar.f = i7;
        }
        getMessagesStorage().a.c(new bi.ia(this, i7, j3, 2));
        if (z9) {
            Utilities.d.c(new jd(this, 3));
        }
    }

    public final void p() {
        LocationManager locationManager = this.e;
        if (this.D) {
            return;
        }
        this.y = SystemClock.elapsedRealtime();
        this.D = true;
        if (this.K == null) {
            ((h6.m) t0.j()).getClass();
            this.K = Boolean.valueOf(tt.b.hasServices());
        }
        if (this.K.booleanValue()) {
            try {
                ((com.google.android.gms.common.api.internal.d0) ((gf.g) this.M).b).e();
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

    public final void r(boolean z9) {
        this.D = false;
        if (this.K == null) {
            ((h6.m) t0.j()).getClass();
            this.K = Boolean.valueOf(tt.b.hasServices());
        }
        if (this.K.booleanValue()) {
            try {
                ((h6.m) t0.j()).removeLocationUpdates(this.r);
                ((com.google.android.gms.common.api.internal.d0) ((gf.g) this.M).b).f();
            } catch (Throwable th2) {
                a8.g(th2, false);
            }
        }
        qd qdVar = this.f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(qdVar);
        if (z9) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int i7 = 0;
            boolean z9 = false;
            while (i7 < arrayList.size()) {
                rd rdVar = (rd) arrayList.get(i7);
                if (rdVar.c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i7);
                    this.a.l(rdVar.a);
                    l(rdVar, 1);
                    g0.h3(new ld(this, rdVar, 2));
                    i7--;
                    z9 = true;
                }
                i7++;
            }
            if (z9 && arrayList.isEmpty()) {
                r(true);
            }
        }
        if (!this.D) {
            if (arrayList.isEmpty() || Math.abs(this.w - SystemClock.elapsedRealtime()) <= 30000) {
                return;
            }
            this.y = SystemClock.elapsedRealtime();
            p();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.E || Math.abs(this.y - elapsedRealtime) > 10000 || (SystemClock.elapsedRealtime() > this.H && Math.abs(this.w - SystemClock.elapsedRealtime()) >= 2000 && (location = this.s) != null && location.getElapsedRealtimeNanos() / 1000000 >= this.y)) {
            this.E = false;
            this.x = true;
            boolean z10 = SystemClock.elapsedRealtime() - this.w > 2000;
            this.y = elapsedRealtime;
            this.w = SystemClock.elapsedRealtime();
            a(z10);
        }
    }
}
