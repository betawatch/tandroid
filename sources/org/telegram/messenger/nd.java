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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class nd extends f1 implements us, pa, qa {
    public static volatile nd[] O = new nd[4];
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
    public final ld f;
    public final ld h;
    public final ld n;
    public final m2.t r;
    public Location s;
    public long w;
    public boolean x;
    public long y;

    public nd(int i10) {
        super(i10);
        this.a = new a0.h();
        this.b = new ArrayList();
        this.c = new a0.h();
        this.d = new a0.h();
        int i11 = 0;
        this.f = new ld(this, i11);
        this.h = new ld(this, i11);
        this.n = new ld(this, i11);
        this.r = new m2.t(this, 6);
        this.x = true;
        this.F = new SparseIntArray();
        this.G = new a0.h();
        this.I = new ArrayList();
        this.J = new a0.h();
        this.e = (LocationManager) w0.b.getSystemService("location");
        this.M = ((li.k) w0.j()).onCreateLocationServicesAPI(w0.b, this, this);
        sa onCreateLocationRequest = ((li.k) w0.j()).onCreateLocationRequest();
        this.N = onCreateLocationRequest;
        ca caVar = (ca) onCreateLocationRequest;
        caVar.getClass();
        LocationRequest locationRequest = caVar.a;
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
        i0.g3(new ed(this, 5));
        getMessagesStorage().a.c(new ed(this, 0));
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
        for (int i10 = 0; i10 < codePointCount; i10++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i10) - (-127397)));
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

    public static void d(Location location, int i10, zf.h0 h0Var) {
        Locale locale;
        HashMap hashMap = Q;
        Runnable runnable = (Runnable) hashMap.get(h0Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(h0Var);
        }
        if (location == null) {
            h0Var.L(null, null, null, null, null);
            return;
        }
        try {
            locale = cd.D0().y;
        } catch (Exception unused) {
            locale = cd.D0().z;
        }
        Locale locale2 = locale;
        Locale locale3 = locale2.getLanguage().contains("en") ? locale2 : Locale.US;
        r5 r5Var = Utilities.e;
        kk kkVar = new kk(locale2, location, i10, locale3, h0Var, 1);
        r5Var.d(kkVar, 300L);
        Q.put(h0Var, kkVar);
    }

    public static int e(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    public static nd f(int i10) {
        nd ndVar;
        nd ndVar2 = O[i10];
        if (ndVar2 != null) {
            return ndVar2;
        }
        synchronized (nd.class) {
            try {
                ndVar = O[i10];
                if (ndVar == null) {
                    nd[] ndVarArr = O;
                    nd ndVar3 = new nd(i10);
                    ndVarArr[i10] = ndVar3;
                    ndVar = ndVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ndVar;
    }

    public static int g() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 += f(i11).I.size();
        }
        return i10;
    }

    public static void q() {
        try {
            if (!w7.c6.d("android.permission.ACCESS_COARSE_LOCATION") && !w7.c6.d("android.permission.ACCESS_FINE_LOCATION")) {
                LocationSharingService.b();
                return;
            }
            w0.b.startService(new Intent(w0.b, (Class<?>) LocationSharingService.class));
        } catch (Throwable th2) {
            f8.g(th2, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i10 = LocationSharingService.d;
        new e0.k0(w0.b).b(6, "live_location_paused");
        w0.b.stopService(new Intent(w0.b, (Class<?>) LocationSharingService.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        float[] fArr;
        TLRPC.InputGeoPoint inputGeoPoint;
        int i10;
        int i11;
        int i12;
        TLRPC.GeoPoint geoPoint;
        if (this.s == null) {
            return;
        }
        SparseIntArray sparseIntArray = this.F;
        if (sparseIntArray.size() != 0) {
            if (z10) {
                for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                    getConnectionsManager().cancelRequest(sparseIntArray.keyAt(i13), false);
                }
            }
            sparseIntArray.clear();
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr2 = new float[1];
            int i14 = 0;
            while (i14 < arrayList.size()) {
                md mdVar = (md) arrayList.get(i14);
                TLRPC.Message message = mdVar.h.k;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && (geoPoint = messageMedia.geo) != null && mdVar.g == mdVar.f) {
                    int i15 = message.edit_date;
                    if (i15 == 0) {
                        i15 = message.date;
                    }
                    if (Math.abs(currentTime - i15) < 10) {
                        fArr = fArr2;
                        Location.distanceBetween(geoPoint.lat, geoPoint._long, this.s.getLatitude(), this.s.getLongitude(), fArr);
                        if (fArr[0] < 1.0f) {
                            i12 = i14;
                            i14 = i12 + 1;
                            fArr2 = fArr;
                        }
                        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                        tL_messages_editMessage.peer = getMessagesController().i1(mdVar.a);
                        tL_messages_editMessage.id = mdVar.b;
                        tL_messages_editMessage.flags |= TLObject.FLAG_14;
                        TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                        tL_messages_editMessage.media = tL_inputMediaGeoLive;
                        tL_inputMediaGeoLive.stopped = false;
                        tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                        tL_messages_editMessage.media.geo_point.lat = i0.b0(this.s.getLatitude());
                        tL_messages_editMessage.media.geo_point._long = i0.b0(this.s.getLongitude());
                        tL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.s.getAccuracy();
                        TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                        inputGeoPoint = inputMedia.geo_point;
                        if (inputGeoPoint.accuracy_radius != 0) {
                            inputGeoPoint.flags |= 1;
                        }
                        i10 = mdVar.g;
                        i11 = mdVar.f;
                        if (i10 != i11) {
                            inputMedia.proximity_notification_radius = i11;
                            inputMedia.flags |= 8;
                        }
                        inputMedia.heading = e(this.s);
                        tL_messages_editMessage.media.flags |= 4;
                        i12 = i14;
                        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new r6(this, mdVar, r3, tL_messages_editMessage, 1));
                        int[] iArr = {sendRequest};
                        sparseIntArray.put(sendRequest, 0);
                        i14 = i12 + 1;
                        fArr2 = fArr;
                    }
                }
                fArr = fArr2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage2.peer = getMessagesController().i1(mdVar.a);
                tL_messages_editMessage2.id = mdVar.b;
                tL_messages_editMessage2.flags |= TLObject.FLAG_14;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive2 = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage2.media = tL_inputMediaGeoLive2;
                tL_inputMediaGeoLive2.stopped = false;
                tL_inputMediaGeoLive2.geo_point = new TLRPC.TL_inputGeoPoint();
                tL_messages_editMessage2.media.geo_point.lat = i0.b0(this.s.getLatitude());
                tL_messages_editMessage2.media.geo_point._long = i0.b0(this.s.getLongitude());
                tL_messages_editMessage2.media.geo_point.accuracy_radius = (int) this.s.getAccuracy();
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage2.media;
                inputGeoPoint = inputMedia2.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                }
                i10 = mdVar.g;
                i11 = mdVar.f;
                if (i10 != i11) {
                }
                inputMedia2.heading = e(this.s);
                tL_messages_editMessage2.media.flags |= 4;
                i12 = i14;
                int sendRequest2 = getConnectionsManager().sendRequest(tL_messages_editMessage2, new r6(this, mdVar, iArr, tL_messages_editMessage2, 1));
                int[] iArr2 = {sendRequest2};
                sparseIntArray.put(sendRequest2, 0);
                i14 = i12 + 1;
                fArr2 = fArr;
            }
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (SystemClock.elapsedRealtime() > this.H) {
            r(false);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12 = zs.F4;
        a0.h hVar = this.c;
        if (i10 == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l4 = (Long) objArr[0];
            long longValue = l4.longValue();
            if (i(longValue) && (arrayList2 = (ArrayList) hVar.f(longValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    jj jjVar = (jj) arrayList3.get(i13);
                    if (jjVar.C3()) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                arrayList2.add(jjVar.k);
                                break;
                            } else {
                                if (jj.C1(((TLRPC.Message) arrayList2.get(i14)).from_id) == jjVar.Z0()) {
                                    arrayList2.set(i14, jjVar.k);
                                    break;
                                }
                                i14++;
                            }
                        }
                        z10 = true;
                    } else {
                        TLRPC.Message message = jjVar.k;
                        if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                            long B0 = jj.B0(message);
                            if (o5.E(B0)) {
                                o(0, B0, false);
                            }
                        }
                    }
                }
                if (z10) {
                    zs.e().k(i12, l4, Integer.valueOf(this.currentAccount));
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == zs.w) {
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
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                md mdVar = (md) arrayList4.get(i15);
                jj jjVar2 = mdVar.h;
                if (longValue2 == (jjVar2 != null ? jj.v0(jjVar2.k) : 0L) && arrayList5.contains(Integer.valueOf(mdVar.b))) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(Long.valueOf(mdVar.a));
                }
            }
            if (arrayList6 != null) {
                for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                    k(((Long) arrayList6.get(i16)).longValue());
                }
                return;
            }
            return;
        }
        if (i10 == zs.m0) {
            Long l10 = (Long) objArr[0];
            long longValue3 = l10.longValue();
            if (i(longValue3) && (arrayList = (ArrayList) hVar.f(longValue3)) != null) {
                ArrayList arrayList7 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    jj jjVar3 = (jj) arrayList7.get(i17);
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        if (jj.C1(((TLRPC.Message) arrayList.get(i18)).from_id) == jjVar3.Z0()) {
                            if (jjVar3.C3()) {
                                arrayList.set(i18, jjVar3.k);
                            } else {
                                arrayList.remove(i18);
                            }
                            z11 = true;
                        } else {
                            i18++;
                        }
                    }
                }
                if (z11) {
                    zs.e().k(i12, l10, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public final md h(long j10) {
        return (md) this.J.f(j10);
    }

    public final boolean i(long j10) {
        return this.J.h(j10) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.tgnet.TLRPC$TL_messages_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLRPC$TL_channels_readMessageContents] */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.tgnet.ConnectionsManager] */
    public final void j(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (o5.C(j10) || (arrayList = (ArrayList) this.c.f(j10)) == null || arrayList.isEmpty()) {
            return;
        }
        a0.h hVar = this.d;
        Integer num = (Integer) hVar.f(j10);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            hVar.k(Integer.valueOf(elapsedRealtime), j10);
            int i10 = 0;
            if (o5.z(j10)) {
                long j11 = -j10;
                if (w3.S(this.currentAccount, j11)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i10 < size) {
                        i10 = c3.i0.j(((TLRPC.Message) arrayList.get(i10)).id, i10, 1, tL_messages_readMessageContents.id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().g1(j11);
                    getConnectionsManager().sendRequest(tL_messages_readMessageContents, new fd(this, 2));
                }
            }
            tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i10 < size2) {
                i10 = c3.i0.j(((TLRPC.Message) arrayList.get(i10)).id, i10, 1, tL_messages_readMessageContents.id);
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new fd(this, 2));
        }
    }

    public final void k(long j10) {
        Utilities.d.c(new kd(this, j10, 0));
    }

    public final void l(md mdVar, int i10) {
        getMessagesStorage().a.c(new o7(this, i10, mdVar, 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.s = location;
            if (location != null) {
                i0.g3(new ag.f3(21));
            }
        }
    }

    public final void n(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.E = true;
        if (z10 || ((location2 = this.s) != null && location2.distanceTo(location) >= 20.0f)) {
            this.w = SystemClock.elapsedRealtime() - 30000;
            this.x = false;
        } else if (this.x) {
            this.w = SystemClock.elapsedRealtime() - 10000;
            this.x = false;
        }
        m(location);
    }

    public final void o(int i10, long j10, boolean z10) {
        md mdVar = (md) this.J.f(j10);
        if (mdVar != null) {
            mdVar.f = i10;
        }
        getMessagesStorage().a.c(new dd(this, i10, j10, 0));
        if (z10) {
            Utilities.d.c(new ed(this, 3));
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
            ((li.k) w0.j()).getClass();
            this.K = Boolean.valueOf(eu.b.hasServices());
        }
        if (this.K.booleanValue()) {
            try {
                ((com.google.android.gms.common.api.internal.h0) this.M).a.d();
                return;
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        try {
            this.e.requestLocationUpdates("gps", 1L, 0.0f, this.f);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            this.e.requestLocationUpdates("network", 1L, 0.0f, this.h);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            this.e.requestLocationUpdates("passive", 1L, 0.0f, this.n);
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        if (this.s == null) {
            try {
                m(locationManager.getLastKnownLocation("gps"));
                if (this.s == null) {
                    m(locationManager.getLastKnownLocation("network"));
                }
            } catch (Exception e11) {
                f8.g(e11, true);
            }
        }
    }

    public final void r(boolean z10) {
        this.D = false;
        if (this.K == null) {
            ((li.k) w0.j()).getClass();
            this.K = Boolean.valueOf(eu.b.hasServices());
        }
        if (this.K.booleanValue()) {
            try {
                ((li.k) w0.j()).removeLocationUpdates(this.r);
                ((com.google.android.gms.common.api.internal.h0) this.M).a.e();
            } catch (Throwable th2) {
                f8.g(th2, false);
            }
        }
        ld ldVar = this.f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(ldVar);
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
            int i10 = 0;
            boolean z10 = false;
            while (i10 < arrayList.size()) {
                md mdVar = (md) arrayList.get(i10);
                if (mdVar.c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i10);
                    this.a.l(mdVar.a);
                    l(mdVar, 1);
                    i0.g3(new gd(this, mdVar, 2));
                    i10--;
                    z10 = true;
                }
                i10++;
            }
            if (z10 && arrayList.isEmpty()) {
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
            boolean z11 = SystemClock.elapsedRealtime() - this.w > 2000;
            this.y = elapsedRealtime;
            this.w = SystemClock.elapsedRealtime();
            a(z11);
        }
    }
}
