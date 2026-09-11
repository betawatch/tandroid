package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.s1;
import com.google.android.gms.internal.clearcut.t1;
import com.google.android.gms.internal.clearcut.v1;
import com.google.android.gms.internal.clearcut.w1;
import com.google.android.gms.internal.clearcut.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class r {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public r(i6.a aVar, byte[] bArr) {
        this.f = aVar;
        this.a = aVar.e;
        this.c = aVar.d;
        this.d = aVar.f;
        w1 w1Var = new w1();
        w1Var.a = 0L;
        w1Var.b = 0L;
        w1Var.c = 0;
        if (x1.a == null) {
            synchronized (com.google.android.gms.internal.clearcut.o1.a) {
                try {
                    if (x1.a == null) {
                        x1.a = new x1[0];
                    }
                } finally {
                }
            }
        }
        w1Var.d = x1.a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.m1.d;
        w1Var.e = bArr2;
        w1Var.f = bArr2;
        w1Var.h = "";
        w1Var.n = "";
        w1Var.r = "";
        w1Var.s = 180000L;
        w1Var.v = bArr2;
        w1Var.w = "";
        w1Var.x = com.google.android.gms.internal.clearcut.m1.c;
        w1Var.y = false;
        this.e = w1Var;
        this.b = false;
        w1Var.y = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        w1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        w1Var.b = SystemClock.elapsedRealtime();
        w1Var.s = TimeZone.getDefault().getOffset(w1Var.a) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        w1Var.f = bArr;
    }

    public g1 a() {
        n6.l.a("Must set register function", ((s) this.c) != null);
        n6.l.a("Must set unregister function", ((s) this.d) != null);
        n6.l.a("Must set holder", ((p) this.e) != null);
        n nVar = ((p) this.e).c;
        n6.l.i(nVar, "Key must not be null");
        return new g1(new e2.u(this, (p) this.e, (k6.c[]) this.f, this.b, this.a), new g1(this, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        List e7;
        String str;
        String str2;
        int i10;
        s1 s1Var;
        long parseLong;
        long parseLong2;
        i6.a aVar = (i6.a) this.f;
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z10 = true;
        this.b = true;
        c2 c2Var = new c2(aVar.b, aVar.c, this.a, (String) this.c, (com.google.android.gms.internal.clearcut.p1) this.d);
        w1 w1Var = (w1) this.e;
        i6.c cVar = new i6.c(c2Var, w1Var);
        Context context = aVar.i.a;
        boolean z11 = false;
        int i11 = w1Var != null ? w1Var.c : 0;
        boolean booleanValue = ((Boolean) b2.i.a()).booleanValue();
        Object obj = null;
        String str3 = c2Var.h;
        int i12 = c2Var.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i12 >= 0 ? String.valueOf(i12) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e7 = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = b2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.h hVar = b2.c;
                        t1 f7 = t1.f();
                        hVar.getClass();
                        com.google.android.gms.internal.clearcut.f fVar = new com.google.android.gms.internal.clearcut.f(hVar, str3, f7);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, fVar);
                        if (dVar == null) {
                            dVar = fVar;
                        }
                    }
                    e7 = ((t1) dVar.a()).e();
                }
                Iterator it = e7.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    s1 s1Var2 = (s1) it.next();
                    if (!s1Var2.i() || s1Var2.e() == 0 || s1Var2.e() == i11) {
                        if (!b2.b(b2.a(b2.d(context), s1Var2.j()), s1Var2.k(), s1Var2.l())) {
                            z10 = false;
                            break;
                        }
                    }
                }
            }
        } else {
            if (str3 == null || str3.isEmpty()) {
                str3 = i12 >= 0 ? String.valueOf(i12) : null;
            }
            if (str3 != null) {
                if (context == null || !b2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = b2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.h hVar2 = b2.d;
                        hVar2.getClass();
                        com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e(hVar2, str3, obj, 1);
                        hashMap.put(str3, eVar);
                        dVar2 = eVar;
                    }
                    str = (String) dVar2.a();
                }
                if (str != null) {
                    int indexOf = str.indexOf(44);
                    if (indexOf >= 0) {
                        str2 = str.substring(0, indexOf);
                        i10 = indexOf + 1;
                    } else {
                        str2 = "";
                        i10 = 0;
                    }
                    int indexOf2 = str.indexOf(47, i10);
                    if (indexOf2 <= 0) {
                        Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
                    } else {
                        try {
                            parseLong = Long.parseLong(str.substring(i10, indexOf2));
                            parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
                        } catch (NumberFormatException e10) {
                            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e10);
                        }
                        if (parseLong < 0 || parseLong2 < 0) {
                            StringBuilder sb2 = new StringBuilder(72);
                            sb2.append("negative values not supported: ");
                            sb2.append(parseLong);
                            sb2.append("/");
                            sb2.append(parseLong2);
                            Log.e("LogSamplerImpl", sb2.toString());
                            s1Var = null;
                            if (s1Var != null) {
                                z10 = b2.b(b2.a(b2.d(context), s1Var.j()), s1Var.k(), s1Var.l());
                            }
                        } else {
                            com.google.android.gms.internal.clearcut.r1 m10 = s1.m();
                            m10.b();
                            s1.g((s1) m10.b, str2);
                            m10.b();
                            s1.f((s1) m10.b, parseLong);
                            m10.b();
                            s1.h((s1) m10.b, parseLong2);
                            com.google.android.gms.internal.clearcut.y c10 = m10.c();
                            byte byteValue = ((Byte) c10.a(1)).byteValue();
                            if (byteValue == 1) {
                                z11 = true;
                            } else if (byteValue != 0) {
                                com.google.android.gms.internal.clearcut.v0 v0Var = com.google.android.gms.internal.clearcut.v0.c;
                                v0Var.getClass();
                                z11 = v0Var.a(c10.getClass()).g(c10);
                                c10.a(2);
                            }
                            if (!z11) {
                                throw new androidx.car.app.j();
                            }
                            s1Var = (s1) c10;
                            if (s1Var != null) {
                            }
                        }
                    }
                }
                s1Var = null;
                if (s1Var != null) {
                }
            }
        }
        if (!z10) {
            new u(null, 0).a(Status.e);
            return;
        }
        com.google.android.gms.internal.clearcut.u0 u0Var = aVar.g;
        u0Var.getClass();
        u0Var.d(2, new v1(cVar, u0Var.h));
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.c).isEmpty()) {
            return null;
        }
        Object obj = this.f;
        if (this.a >= arrayList.size()) {
            if (this.b) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.a = 0;
            } else {
                this.a = 0;
            }
        }
        int i10 = this.a;
        this.a = i10 + 1;
        this.f = arrayList.get(i10);
        return obj;
    }

    public r(ArrayList arrayList) {
        this.b = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.a = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.a = 0;
        c();
    }
}
