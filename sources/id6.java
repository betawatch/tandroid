// default package

import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class id6 extends rf0 implements fn7, nj5, oj5 {
    public static volatile id6[] P = new id6[4];
    public static final String[] Q = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    public static final HashMap R = new HashMap();
    public boolean E;
    public boolean F;
    public final SparseIntArray G;
    public final zh6 H;
    public long I;
    public final ArrayList J;
    public final zh6 K;
    public Boolean L;
    public boolean M;
    public final rj5 N;
    public final qj5 O;
    public final zh6 a;
    public final ArrayList b;
    public final zh6 c;
    public final zh6 d;
    public final LocationManager e;
    public final gd6 f;
    public final gd6 h;
    public final gd6 n;
    public final aj3 r;
    public Location s;
    public long w;
    public boolean x;
    public long y;

    public id6(int i) {
        super(i);
        this.a = new zh6();
        this.b = new ArrayList();
        this.c = new zh6();
        this.d = new zh6();
        byte b = 0;
        this.f = new gd6(this, b);
        this.h = new gd6(this, b);
        this.n = new gd6(this, b);
        this.r = new aj3((Object) this, (byte) 17);
        this.x = true;
        this.G = new SparseIntArray();
        this.H = new zh6();
        this.J = new ArrayList();
        this.K = new zh6();
        this.e = (LocationManager) a.b.getSystemService("location");
        this.N = ((pm3) a.i()).onCreateLocationServicesAPI(a.b, this, this);
        qj5 onCreateLocationRequest = ((pm3) a.i()).onCreateLocationRequest();
        this.O = onCreateLocationRequest;
        t05 t05Var = (t05) onCreateLocationRequest;
        t05Var.c();
        t05Var.b();
        t05Var.a();
        hl.c3(new zc6(this, (byte) 4));
        getMessagesStorage().a.c(new zc6(this, (byte) 0));
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codePointCount; i++) {
            sb.append(Character.toChars(Character.codePointAt(upperCase, i) - (-127397)));
        }
        return sb.toString();
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

    public static void d(Location location, int i, vc6 vc6Var) {
        Locale locale;
        HashMap hashMap = R;
        Runnable runnable = (Runnable) hashMap.get(vc6Var);
        if (runnable != null) {
            Utilities.e.a(runnable);
            hashMap.remove(vc6Var);
        }
        if (location == null) {
            vc6Var.K(null, null, null, null, null);
            return;
        }
        try {
            locale = ob6.D0().y;
        } catch (Exception unused) {
            locale = ob6.D0().z;
        }
        Locale locale2 = locale;
        Locale locale3 = locale2.getLanguage().contains("en") ? locale2 : Locale.US;
        to3 to3Var = Utilities.e;
        fd6 fd6Var = new fd6(locale2, location, i, locale3, vc6Var);
        to3Var.d(fd6Var, 300L);
        R.put(vc6Var, fd6Var);
    }

    public static int e(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    public static id6 f(int i) {
        id6 id6Var;
        id6 id6Var2 = P[i];
        if (id6Var2 != null) {
            return id6Var2;
        }
        synchronized (id6.class) {
            id6Var = P[i];
            if (id6Var == null) {
                id6[] id6VarArr = P;
                id6 id6Var3 = new id6(i);
                id6VarArr[i] = id6Var3;
                id6Var = id6Var3;
            }
        }
        return id6Var;
    }

    public static int g() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += f(i2).J.size();
        }
        return i;
    }

    public static void q() {
        try {
            if (jve.d("android.permission.ACCESS_COARSE_LOCATION") || jve.d("android.permission.ACCESS_FINE_LOCATION")) {
                a.b.startService(new Intent(a.b, (Class<?>) LocationSharingService.class));
            } else {
                LocationSharingService.b();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
            LocationSharingService.b();
        }
    }

    public static void s() {
        if (g() > 0) {
            return;
        }
        int i = LocationSharingService.d;
        new oo7(a.b).b(6, "live_location_paused");
        a.b.stopService(new Intent(a.b, (Class<?>) LocationSharingService.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        float[] fArr;
        TLRPC.InputGeoPoint inputGeoPoint;
        int i;
        int i2;
        int i3;
        TLRPC.GeoPoint geoPoint;
        if (this.s == null) {
            return;
        }
        SparseIntArray sparseIntArray = this.G;
        if (sparseIntArray.size() != 0) {
            if (z) {
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    getConnectionsManager().cancelRequest(sparseIntArray.keyAt(i4), false);
                }
            }
            sparseIntArray.clear();
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr2 = new float[1];
            int i5 = 0;
            while (i5 < arrayList.size()) {
                hd6 hd6Var = (hd6) arrayList.get(i5);
                TLRPC.Message message = hd6Var.h.k;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && (geoPoint = messageMedia.geo) != null && hd6Var.g == hd6Var.f) {
                    int i6 = message.edit_date;
                    if (i6 == 0) {
                        i6 = message.date;
                    }
                    if (Math.abs(currentTime - i6) < 10) {
                        fArr = fArr2;
                        Location.distanceBetween(geoPoint.lat, geoPoint._long, this.s.getLatitude(), this.s.getLongitude(), fArr);
                        if (fArr[0] < 1.0f) {
                            i3 = i5;
                            i5 = i3 + 1;
                            fArr2 = fArr;
                        }
                        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                        tL_messages_editMessage.peer = getMessagesController().j1(hd6Var.a);
                        tL_messages_editMessage.id = hd6Var.b;
                        tL_messages_editMessage.flags |= TLObject.FLAG_14;
                        TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                        tL_messages_editMessage.media = tL_inputMediaGeoLive;
                        tL_inputMediaGeoLive.stopped = false;
                        tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                        tL_messages_editMessage.media.geo_point.lat = hl.b0(this.s.getLatitude());
                        tL_messages_editMessage.media.geo_point._long = hl.b0(this.s.getLongitude());
                        tL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.s.getAccuracy();
                        TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                        inputGeoPoint = inputMedia.geo_point;
                        if (inputGeoPoint.accuracy_radius != 0) {
                            inputGeoPoint.flags |= 1;
                        }
                        i = hd6Var.g;
                        i2 = hd6Var.f;
                        if (i != i2) {
                            inputMedia.proximity_notification_radius = i2;
                            inputMedia.flags |= 8;
                        }
                        inputMedia.heading = e(this.s);
                        tL_messages_editMessage.media.flags |= 4;
                        i3 = i5;
                        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new au0((Object) this, (Object) hd6Var, (Object) r3, (Object) tL_messages_editMessage, (byte) 7));
                        int[] iArr = {sendRequest};
                        sparseIntArray.put(sendRequest, 0);
                        i5 = i3 + 1;
                        fArr2 = fArr;
                    }
                }
                fArr = fArr2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage2 = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage2.peer = getMessagesController().j1(hd6Var.a);
                tL_messages_editMessage2.id = hd6Var.b;
                tL_messages_editMessage2.flags |= TLObject.FLAG_14;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive2 = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage2.media = tL_inputMediaGeoLive2;
                tL_inputMediaGeoLive2.stopped = false;
                tL_inputMediaGeoLive2.geo_point = new TLRPC.TL_inputGeoPoint();
                tL_messages_editMessage2.media.geo_point.lat = hl.b0(this.s.getLatitude());
                tL_messages_editMessage2.media.geo_point._long = hl.b0(this.s.getLongitude());
                tL_messages_editMessage2.media.geo_point.accuracy_radius = (int) this.s.getAccuracy();
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage2.media;
                inputGeoPoint = inputMedia2.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                }
                i = hd6Var.g;
                i2 = hd6Var.f;
                if (i != i2) {
                }
                inputMedia2.heading = e(this.s);
                tL_messages_editMessage2.media.flags |= 4;
                i3 = i5;
                int sendRequest2 = getConnectionsManager().sendRequest(tL_messages_editMessage2, new au0((Object) this, (Object) hd6Var, (Object) iArr, (Object) tL_messages_editMessage2, (byte) 7));
                int[] iArr2 = {sendRequest2};
                sparseIntArray.put(sendRequest2, 0);
                i5 = i3 + 1;
                fArr2 = fArr;
            }
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (SystemClock.elapsedRealtime() > this.I) {
            r(false);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3 = jn7.I4;
        zh6 zh6Var = this.c;
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l = (Long) objArr[0];
            long longValue = l.longValue();
            if (!i(longValue) || (arrayList2 = (ArrayList) zh6Var.f(longValue)) == null) {
                return;
            }
            ArrayList arrayList3 = (ArrayList) objArr[1];
            boolean z = false;
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                r47 r47Var = (r47) arrayList3.get(i4);
                if (r47Var.C3()) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            arrayList2.add(r47Var.k);
                            break;
                        } else {
                            if (r47.B1(((TLRPC.Message) arrayList2.get(i5)).from_id) == r47Var.Z0()) {
                                arrayList2.set(i5, r47Var.k);
                                break;
                            }
                            i5++;
                        }
                    }
                    z = true;
                } else {
                    TLRPC.Message message = r47Var.k;
                    if (message.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                        long B0 = r47.B0(message);
                        if (wf3.D(B0)) {
                            o(0, B0, false);
                        }
                    }
                }
            }
            if (z) {
                jn7.e().k(i3, l, Integer.valueOf(this.currentAccount));
                return;
            }
            return;
        }
        if (i == jn7.v) {
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
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                hd6 hd6Var = (hd6) arrayList4.get(i6);
                r47 r47Var2 = hd6Var.h;
                if (longValue2 == (r47Var2 != null ? r47.v0(r47Var2.k) : 0L) && arrayList5.contains(Integer.valueOf(hd6Var.b))) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(Long.valueOf(hd6Var.a));
                }
            }
            if (arrayList6 != null) {
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    k(((Long) arrayList6.get(i7)).longValue());
                }
                return;
            }
            return;
        }
        if (i == jn7.m0) {
            Long l2 = (Long) objArr[0];
            long longValue3 = l2.longValue();
            if (!i(longValue3) || (arrayList = (ArrayList) zh6Var.f(longValue3)) == null) {
                return;
            }
            ArrayList arrayList7 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                r47 r47Var3 = (r47) arrayList7.get(i8);
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        break;
                    }
                    if (r47.B1(((TLRPC.Message) arrayList.get(i9)).from_id) == r47Var3.Z0()) {
                        if (r47Var3.C3()) {
                            arrayList.set(i9, r47Var3.k);
                        } else {
                            arrayList.remove(i9);
                        }
                        z2 = true;
                    } else {
                        i9++;
                    }
                }
            }
            if (z2) {
                jn7.e().k(i3, l2, Integer.valueOf(this.currentAccount));
            }
        }
    }

    public final hd6 h(long j) {
        return (hd6) this.K.f(j);
    }

    public final boolean i(long j) {
        return this.K.h(j) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.tgnet.TLRPC$TL_messages_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLRPC$TL_channels_readMessageContents] */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.tgnet.ConnectionsManager] */
    public final void j(long j) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (wf3.B(j) || (arrayList = (ArrayList) this.c.f(j)) == null || arrayList.isEmpty()) {
            return;
        }
        zh6 zh6Var = this.d;
        Integer num = (Integer) zh6Var.f(j);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            zh6Var.k(j, Integer.valueOf(elapsedRealtime));
            int i = 0;
            if (wf3.y(j)) {
                long j2 = -j;
                if (xc2.S(this.currentAccount, j2)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i < size) {
                        i = qd4.g(((TLRPC.Message) arrayList.get(i)).id, i, 1, tL_messages_readMessageContents.id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().h1(j2);
                    getConnectionsManager().sendRequest(tL_messages_readMessageContents, new ad6(this, (byte) 2));
                }
            }
            tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i < size2) {
                i = qd4.g(((TLRPC.Message) arrayList.get(i)).id, i, 1, tL_messages_readMessageContents.id);
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new ad6(this, (byte) 2));
        }
    }

    public final void k(long j) {
        Utilities.d.c(new kt((Object) this, j, (byte) 19));
    }

    public final void l(hd6 hd6Var, int i) {
        getMessagesStorage().a.c(new sb4((Object) this, i, (Object) hd6Var, (byte) 5));
    }

    public final void m(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.s = location;
            if (location != null) {
                hl.c3(new jm3((byte) 26));
            }
        }
    }

    public final void n(Location location, boolean z) {
        Location location2;
        if (location == null) {
            return;
        }
        this.F = true;
        if (z || ((location2 = this.s) != null && location2.distanceTo(location) >= 20.0f)) {
            this.w = SystemClock.elapsedRealtime() - 30000;
            this.x = false;
        } else if (this.x) {
            this.w = SystemClock.elapsedRealtime() - 10000;
            this.x = false;
        }
        m(location);
    }

    public final void o(int i, long j, boolean z) {
        hd6 hd6Var = (hd6) this.K.f(j);
        if (hd6Var != null) {
            hd6Var.f = i;
        }
        getMessagesStorage().a.c(new lb2((Object) this, i, j, (byte) 1));
        if (z) {
            Utilities.d.c(new zc6(this, (byte) 6));
        }
    }

    public final void p() {
        LocationManager locationManager = this.e;
        if (this.E) {
            return;
        }
        this.y = SystemClock.elapsedRealtime();
        this.E = true;
        Boolean bool = this.L;
        if (bool == null) {
            ((pm3) a.i()).getClass();
            bool = Boolean.valueOf(b.b.hasServices());
            this.L = bool;
        }
        if (bool.booleanValue()) {
            try {
                ((d6d) ((aj3) this.N).b).c();
                return;
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        try {
            this.e.requestLocationUpdates("gps", 1L, 0.0f, this.f);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            this.e.requestLocationUpdates("network", 1L, 0.0f, this.h);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            this.e.requestLocationUpdates("passive", 1L, 0.0f, this.n);
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        if (this.s == null) {
            try {
                m(locationManager.getLastKnownLocation("gps"));
                if (this.s == null) {
                    m(locationManager.getLastKnownLocation("network"));
                }
            } catch (Exception e4) {
                cc4.g(e4, true);
            }
        }
    }

    public final void r(boolean z) {
        this.E = false;
        Boolean bool = this.L;
        if (bool == null) {
            ((pm3) a.i()).getClass();
            bool = Boolean.valueOf(b.b.hasServices());
            this.L = bool;
        }
        if (bool.booleanValue()) {
            try {
                ((pm3) a.i()).removeLocationUpdates(this.r);
                ((d6d) ((aj3) this.N).b).d();
            } catch (Throwable th) {
                cc4.g(th, false);
            }
        }
        gd6 gd6Var = this.f;
        LocationManager locationManager = this.e;
        locationManager.removeUpdates(gd6Var);
        if (z) {
            locationManager.removeUpdates(this.h);
            locationManager.removeUpdates(this.n);
        }
    }

    public final void t() {
        Location location;
        getUserConfig();
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int i = 0;
            boolean z = false;
            while (i < arrayList.size()) {
                hd6 hd6Var = (hd6) arrayList.get(i);
                if (hd6Var.c <= getConnectionsManager().getCurrentTime()) {
                    arrayList.remove(i);
                    this.a.l(hd6Var.a);
                    l(hd6Var, 1);
                    hl.c3(new dd6(this, hd6Var, (byte) 2));
                    i--;
                    z = true;
                }
                i++;
            }
            if (z && arrayList.isEmpty()) {
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
            boolean z2 = SystemClock.elapsedRealtime() - this.w > 2000;
            this.y = elapsedRealtime;
            this.w = SystemClock.elapsedRealtime();
            a(z2);
        }
    }
}
