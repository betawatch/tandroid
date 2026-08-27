package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.e2;
import com.google.android.gms.internal.clearcut.t1;
import com.google.android.gms.internal.clearcut.u1;
import com.google.android.gms.internal.clearcut.v1;
import com.google.android.gms.internal.clearcut.x1;
import com.google.android.gms.internal.clearcut.y1;
import com.google.android.gms.internal.clearcut.z1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public r(t5.a aVar, byte[] bArr) {
        this.f = aVar;
        this.a = aVar.e;
        this.c = aVar.d;
        this.d = aVar.f;
        y1 y1Var = new y1();
        y1Var.a = 0L;
        y1Var.b = 0L;
        y1Var.c = 0;
        if (z1.a == null) {
            synchronized (com.google.android.gms.internal.clearcut.q1.a) {
                try {
                    if (z1.a == null) {
                        z1.a = new z1[0];
                    }
                } finally {
                }
            }
        }
        y1Var.d = z1.a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.o1.d;
        y1Var.e = bArr2;
        y1Var.f = bArr2;
        y1Var.h = "";
        y1Var.n = "";
        y1Var.r = "";
        y1Var.s = 180000L;
        y1Var.v = bArr2;
        y1Var.w = "";
        y1Var.x = com.google.android.gms.internal.clearcut.o1.c;
        y1Var.y = false;
        this.e = y1Var;
        this.b = false;
        y1Var.y = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        y1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        y1Var.b = SystemClock.elapsedRealtime();
        y1Var.s = TimeZone.getDefault().getOffset(y1Var.a) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        y1Var.f = bArr;
    }

    public g1 a() {
        y5.l.a("Must set register function", ((s) this.c) != null);
        y5.l.a("Must set unregister function", ((s) this.d) != null);
        y5.l.a("Must set holder", ((p) this.e) != null);
        n nVar = ((p) this.e).c;
        y5.l.i(nVar, "Key must not be null");
        return new g1(new com.google.android.exoplayer2.upstream.t(this, (p) this.e, (v5.c[]) this.f, this.b, this.a), new g1(this, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        List e9;
        String str;
        String str2;
        int i10;
        u1 u1Var;
        long parseLong;
        long parseLong2;
        t5.a aVar = (t5.a) this.f;
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z10 = true;
        this.b = true;
        e2 e2Var = new e2(aVar.b, aVar.c, this.a, (String) this.c, (com.google.android.gms.internal.clearcut.r1) this.d);
        y1 y1Var = (y1) this.e;
        t5.c cVar = new t5.c(e2Var, y1Var);
        Context context = aVar.i.a;
        boolean z11 = false;
        int i11 = y1Var != null ? y1Var.c : 0;
        boolean booleanValue = ((Boolean) d2.i.a()).booleanValue();
        String str3 = e2Var.h;
        int i12 = e2Var.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i12 >= 0 ? String.valueOf(i12) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e9 = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = d2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.i iVar = d2.c;
                        v1 f10 = v1.f();
                        iVar.getClass();
                        com.google.android.gms.internal.clearcut.g gVar = new com.google.android.gms.internal.clearcut.g(iVar, str3, f10);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, gVar);
                        if (dVar == null) {
                            dVar = gVar;
                        }
                    }
                    e9 = ((v1) dVar.a()).e();
                }
                Iterator it = e9.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u1 u1Var2 = (u1) it.next();
                    if (!u1Var2.i() || u1Var2.e() == 0 || u1Var2.e() == i11) {
                        if (!d2.b(d2.a(d2.d(context), u1Var2.j()), u1Var2.k(), u1Var2.l())) {
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
                if (context == null || !d2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = d2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.i iVar2 = d2.d;
                        iVar2.getClass();
                        com.google.android.gms.internal.clearcut.f fVar = new com.google.android.gms.internal.clearcut.f(iVar2, str3, null, 1);
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
                            u1Var = null;
                            if (u1Var != null) {
                                z10 = d2.b(d2.a(d2.d(context), u1Var.j()), u1Var.k(), u1Var.l());
                            }
                        } else {
                            t1 m10 = u1.m();
                            m10.b();
                            u1.g((u1) m10.b, str2);
                            m10.b();
                            u1.f((u1) m10.b, parseLong);
                            m10.b();
                            u1.h((u1) m10.b, parseLong2);
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
                                throw new a7.c();
                            }
                            u1Var = (u1) c10;
                            if (u1Var != null) {
                            }
                        }
                    }
                }
                u1Var = null;
                if (u1Var != null) {
                }
            }
        }
        if (!z10) {
            new u(null, 0).a(Status.e);
            return;
        }
        com.google.android.gms.internal.clearcut.v0 v0Var = aVar.g;
        v0Var.getClass();
        v0Var.d(2, new x1(cVar, v0Var.h));
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
