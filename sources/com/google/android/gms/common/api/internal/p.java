package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.a2;
import com.google.android.gms.internal.clearcut.b2;
import com.google.android.gms.internal.clearcut.l1;
import com.google.android.gms.internal.clearcut.n1;
import com.google.android.gms.internal.clearcut.o1;
import com.google.android.gms.internal.clearcut.q1;
import com.google.android.gms.internal.clearcut.r1;
import com.google.android.gms.internal.clearcut.s1;
import com.google.android.gms.internal.clearcut.u1;
import com.google.android.gms.internal.clearcut.v1;
import com.google.android.gms.internal.clearcut.w1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class p {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public p(l6.a aVar, byte[] bArr) {
        this.f = aVar;
        this.a = aVar.e;
        this.c = aVar.d;
        this.d = aVar.f;
        v1 v1Var = new v1();
        v1Var.a = 0L;
        v1Var.b = 0L;
        v1Var.c = 0;
        if (w1.a == null) {
            synchronized (n1.a) {
                try {
                    if (w1.a == null) {
                        w1.a = new w1[0];
                    }
                } finally {
                }
            }
        }
        v1Var.d = w1.a;
        byte[] bArr2 = l1.d;
        v1Var.e = bArr2;
        v1Var.f = bArr2;
        v1Var.h = "";
        v1Var.n = "";
        v1Var.r = "";
        v1Var.s = 180000L;
        v1Var.w = bArr2;
        v1Var.x = "";
        v1Var.y = l1.c;
        v1Var.E = false;
        this.e = v1Var;
        this.b = false;
        v1Var.E = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        v1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        v1Var.b = SystemClock.elapsedRealtime();
        v1Var.s = TimeZone.getDefault().getOffset(v1Var.a) / 1000;
        v1Var.f = bArr;
    }

    public a1 a() {
        q6.m.a("Must set register function", ((q) this.c) != null);
        q6.m.a("Must set unregister function", ((q) this.d) != null);
        q6.m.a("Must set holder", ((o) this.e) != null);
        m mVar = ((o) this.e).b;
        q6.m.i(mVar, "Key must not be null");
        return new a1(new h2.w(this, (o) this.e, (n6.c[]) this.f, this.b, this.a), new a1(this, mVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        List e10;
        String str;
        String str2;
        int i7;
        r1 r1Var;
        long parseLong;
        long parseLong2;
        l6.a aVar = (l6.a) this.f;
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z10 = true;
        this.b = true;
        b2 b2Var = new b2(aVar.b, aVar.c, this.a, (String) this.c, (o1) this.d);
        v1 v1Var = (v1) this.e;
        l6.c cVar = new l6.c(b2Var, v1Var);
        Context context = aVar.i.a;
        boolean z11 = false;
        int i10 = v1Var != null ? v1Var.c : 0;
        boolean booleanValue = ((Boolean) a2.i.a()).booleanValue();
        String str3 = b2Var.h;
        int i11 = b2Var.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i11 >= 0 ? String.valueOf(i11) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e10 = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = a2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.h hVar = a2.c;
                        s1 f10 = s1.f();
                        hVar.getClass();
                        com.google.android.gms.internal.clearcut.f fVar = new com.google.android.gms.internal.clearcut.f(hVar, str3, f10);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, fVar);
                        if (dVar == null) {
                            dVar = fVar;
                        }
                    }
                    e10 = ((s1) dVar.a()).e();
                }
                Iterator it = e10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r1 r1Var2 = (r1) it.next();
                    if (!r1Var2.i() || r1Var2.e() == 0 || r1Var2.e() == i10) {
                        if (!a2.b(a2.a(a2.d(context), r1Var2.j()), r1Var2.k(), r1Var2.l())) {
                            z10 = false;
                            break;
                        }
                    }
                }
            }
        } else {
            if (str3 == null || str3.isEmpty()) {
                str3 = i11 >= 0 ? String.valueOf(i11) : null;
            }
            if (str3 != null) {
                if (context == null || !a2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = a2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.h hVar2 = a2.d;
                        hVar2.getClass();
                        com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e(hVar2, str3, null, 1);
                        hashMap.put(str3, eVar);
                        dVar2 = eVar;
                    }
                    str = (String) dVar2.a();
                }
                if (str != null) {
                    int indexOf = str.indexOf(44);
                    if (indexOf >= 0) {
                        str2 = str.substring(0, indexOf);
                        i7 = indexOf + 1;
                    } else {
                        str2 = "";
                        i7 = 0;
                    }
                    int indexOf2 = str.indexOf(47, i7);
                    if (indexOf2 <= 0) {
                        Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
                    } else {
                        try {
                            parseLong = Long.parseLong(str.substring(i7, indexOf2));
                            parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
                        } catch (NumberFormatException e11) {
                            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e11);
                        }
                        if (parseLong < 0 || parseLong2 < 0) {
                            StringBuilder sb2 = new StringBuilder(72);
                            sb2.append("negative values not supported: ");
                            sb2.append(parseLong);
                            sb2.append("/");
                            sb2.append(parseLong2);
                            Log.e("LogSamplerImpl", sb2.toString());
                            r1Var = null;
                            if (r1Var != null) {
                                z10 = a2.b(a2.a(a2.d(context), r1Var.j()), r1Var.k(), r1Var.l());
                            }
                        } else {
                            q1 m10 = r1.m();
                            m10.b();
                            r1.g((r1) m10.b, str2);
                            m10.b();
                            r1.f((r1) m10.b, parseLong);
                            m10.b();
                            r1.h((r1) m10.b, parseLong2);
                            com.google.android.gms.internal.clearcut.y c10 = m10.c();
                            byte byteValue = ((Byte) c10.a(1)).byteValue();
                            if (byteValue == 1) {
                                z11 = true;
                            } else if (byteValue != 0) {
                                com.google.android.gms.internal.clearcut.u0 u0Var = com.google.android.gms.internal.clearcut.u0.c;
                                u0Var.getClass();
                                z11 = u0Var.a(c10.getClass()).g(c10);
                                c10.a(2);
                            }
                            if (!z11) {
                                throw new androidx.car.app.j();
                            }
                            r1Var = (r1) c10;
                            if (r1Var != null) {
                            }
                        }
                    }
                }
                r1Var = null;
                if (r1Var != null) {
                }
            }
        }
        if (!z10) {
            new s(null, 0).a(Status.e);
            return;
        }
        b9.k0 k0Var = aVar.g;
        k0Var.getClass();
        k0Var.d(2, new u1(cVar, k0Var.i));
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
        int i7 = this.a;
        this.a = i7 + 1;
        this.f = arrayList.get(i7);
        return obj;
    }

    public p(ArrayList arrayList) {
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
