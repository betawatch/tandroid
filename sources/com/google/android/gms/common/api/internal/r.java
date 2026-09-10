package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.s1;
import com.google.android.gms.internal.clearcut.t1;
import com.google.android.gms.internal.clearcut.u1;
import com.google.android.gms.internal.clearcut.w1;
import com.google.android.gms.internal.clearcut.x1;
import com.google.android.gms.internal.clearcut.y1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        x1 x1Var = new x1();
        x1Var.a = 0L;
        x1Var.b = 0L;
        x1Var.c = 0;
        if (y1.a == null) {
            synchronized (com.google.android.gms.internal.clearcut.p1.a) {
                try {
                    if (y1.a == null) {
                        y1.a = new y1[0];
                    }
                } finally {
                }
            }
        }
        x1Var.d = y1.a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.n1.d;
        x1Var.e = bArr2;
        x1Var.f = bArr2;
        x1Var.h = "";
        x1Var.n = "";
        x1Var.r = "";
        x1Var.s = 180000L;
        x1Var.v = bArr2;
        x1Var.w = "";
        x1Var.x = com.google.android.gms.internal.clearcut.n1.c;
        x1Var.y = false;
        this.e = x1Var;
        this.b = false;
        x1Var.y = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        x1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        x1Var.b = SystemClock.elapsedRealtime();
        x1Var.s = TimeZone.getDefault().getOffset(x1Var.a) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        x1Var.f = bArr;
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
        List e;
        String str;
        String str2;
        int i10;
        t1 t1Var;
        long parseLong;
        long parseLong2;
        i6.a aVar = (i6.a) this.f;
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z10 = true;
        this.b = true;
        d2 d2Var = new d2(aVar.b, aVar.c, this.a, (String) this.c, (com.google.android.gms.internal.clearcut.q1) this.d);
        x1 x1Var = (x1) this.e;
        i6.c cVar = new i6.c(d2Var, x1Var);
        Context context = aVar.i.a;
        boolean z11 = false;
        int i11 = x1Var != null ? x1Var.c : 0;
        boolean booleanValue = ((Boolean) c2.i.a()).booleanValue();
        Object obj = null;
        String str3 = d2Var.h;
        int i12 = d2Var.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i12 >= 0 ? String.valueOf(i12) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = c2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.i iVar = c2.c;
                        u1 f7 = u1.f();
                        iVar.getClass();
                        com.google.android.gms.internal.clearcut.g gVar = new com.google.android.gms.internal.clearcut.g(iVar, str3, f7);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, gVar);
                        if (dVar == null) {
                            dVar = gVar;
                        }
                    }
                    e = ((u1) dVar.a()).e();
                }
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t1 t1Var2 = (t1) it.next();
                    if (!t1Var2.i() || t1Var2.e() == 0 || t1Var2.e() == i11) {
                        if (!c2.b(c2.a(c2.d(context), t1Var2.j()), t1Var2.k(), t1Var2.l())) {
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
                if (context == null || !c2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = c2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.i iVar2 = c2.d;
                        iVar2.getClass();
                        com.google.android.gms.internal.clearcut.f fVar = new com.google.android.gms.internal.clearcut.f(iVar2, str3, obj, 1);
                        hashMap.put(str3, fVar);
                        dVar2 = fVar;
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
                        } catch (NumberFormatException e7) {
                            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e7);
                        }
                        if (parseLong < 0 || parseLong2 < 0) {
                            StringBuilder sb2 = new StringBuilder(72);
                            sb2.append("negative values not supported: ");
                            sb2.append(parseLong);
                            sb2.append("/");
                            sb2.append(parseLong2);
                            Log.e("LogSamplerImpl", sb2.toString());
                            t1Var = null;
                            if (t1Var != null) {
                                z10 = c2.b(c2.a(c2.d(context), t1Var.j()), t1Var.k(), t1Var.l());
                            }
                        } else {
                            s1 m10 = t1.m();
                            m10.b();
                            t1.g((t1) m10.b, str2);
                            m10.b();
                            t1.f((t1) m10.b, parseLong);
                            m10.b();
                            t1.h((t1) m10.b, parseLong2);
                            com.google.android.gms.internal.clearcut.z c10 = m10.c();
                            byte byteValue = ((Byte) c10.a(1)).byteValue();
                            if (byteValue == 1) {
                                z11 = true;
                            } else if (byteValue != 0) {
                                com.google.android.gms.internal.clearcut.w0 w0Var = com.google.android.gms.internal.clearcut.w0.c;
                                w0Var.getClass();
                                z11 = w0Var.a(c10.getClass()).g(c10);
                                c10.a(2);
                            }
                            if (!z11) {
                                throw new androidx.car.app.j();
                            }
                            t1Var = (t1) c10;
                            if (t1Var != null) {
                            }
                        }
                    }
                }
                t1Var = null;
                if (t1Var != null) {
                }
            }
        }
        if (!z10) {
            new u(null, 0).a(Status.e);
            return;
        }
        com.google.android.gms.internal.clearcut.v0 v0Var = aVar.g;
        v0Var.getClass();
        v0Var.d(2, new w1(cVar, v0Var.h));
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
