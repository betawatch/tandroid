package ci;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a(k6.a aVar, byte[] bArr) {
        this.f = aVar;
        this.b = aVar.e;
        this.c = aVar.d;
        this.d = aVar.f;
        com.google.android.gms.internal.clearcut.v1 v1Var = new com.google.android.gms.internal.clearcut.v1();
        v1Var.a = 0L;
        v1Var.b = 0L;
        v1Var.c = 0;
        if (com.google.android.gms.internal.clearcut.w1.a == null) {
            synchronized (com.google.android.gms.internal.clearcut.n1.a) {
                try {
                    if (com.google.android.gms.internal.clearcut.w1.a == null) {
                        com.google.android.gms.internal.clearcut.w1.a = new com.google.android.gms.internal.clearcut.w1[0];
                    }
                } finally {
                }
            }
        }
        v1Var.d = com.google.android.gms.internal.clearcut.w1.a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.l1.d;
        v1Var.e = bArr2;
        v1Var.f = bArr2;
        v1Var.h = "";
        v1Var.n = "";
        v1Var.r = "";
        v1Var.s = 180000L;
        v1Var.w = bArr2;
        v1Var.x = "";
        v1Var.y = com.google.android.gms.internal.clearcut.l1.c;
        v1Var.E = false;
        this.e = v1Var;
        this.a = false;
        v1Var.E = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        v1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        v1Var.b = SystemClock.elapsedRealtime();
        v1Var.s = TimeZone.getDefault().getOffset(v1Var.a) / 1000;
        v1Var.f = bArr;
    }

    public com.google.android.gms.common.api.internal.z0 a() {
        p6.m.a("Must set register function", ((com.google.android.gms.common.api.internal.p) this.c) != null);
        p6.m.a("Must set unregister function", ((com.google.android.gms.common.api.internal.p) this.d) != null);
        p6.m.a("Must set holder", ((com.google.android.gms.common.api.internal.o) this.e) != null);
        com.google.android.gms.common.api.internal.m mVar = ((com.google.android.gms.common.api.internal.o) this.e).b;
        p6.m.h(mVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.z0(new g2.x(this, (com.google.android.gms.common.api.internal.o) this.e, (m6.c[]) this.f, this.a, this.b), new com.google.android.gms.common.api.internal.z0(this, mVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        List e10;
        String str;
        String str2;
        int i3;
        com.google.android.gms.internal.clearcut.r1 r1Var;
        long parseLong;
        long parseLong2;
        k6.a aVar = (k6.a) this.f;
        if (this.a) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z10 = true;
        this.a = true;
        com.google.android.gms.internal.clearcut.b2 b2Var = new com.google.android.gms.internal.clearcut.b2(aVar.b, aVar.c, this.b, (String) this.c, (com.google.android.gms.internal.clearcut.o1) this.d);
        com.google.android.gms.internal.clearcut.v1 v1Var = (com.google.android.gms.internal.clearcut.v1) this.e;
        k6.c cVar = new k6.c(b2Var, v1Var);
        Context context = aVar.i.a;
        boolean z11 = false;
        int i10 = v1Var != null ? v1Var.c : 0;
        boolean booleanValue = ((Boolean) com.google.android.gms.internal.clearcut.a2.i.a()).booleanValue();
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
                    ConcurrentHashMap concurrentHashMap = com.google.android.gms.internal.clearcut.a2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.i iVar = com.google.android.gms.internal.clearcut.a2.c;
                        com.google.android.gms.internal.clearcut.s1 f10 = com.google.android.gms.internal.clearcut.s1.f();
                        iVar.getClass();
                        com.google.android.gms.internal.clearcut.g gVar = new com.google.android.gms.internal.clearcut.g(iVar, str3, f10);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, gVar);
                        if (dVar == null) {
                            dVar = gVar;
                        }
                    }
                    e10 = ((com.google.android.gms.internal.clearcut.s1) dVar.a()).e();
                }
                Iterator it = e10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.clearcut.r1 r1Var2 = (com.google.android.gms.internal.clearcut.r1) it.next();
                    if (!r1Var2.i() || r1Var2.e() == 0 || r1Var2.e() == i10) {
                        if (!com.google.android.gms.internal.clearcut.a2.b(com.google.android.gms.internal.clearcut.a2.a(com.google.android.gms.internal.clearcut.a2.d(context), r1Var2.j()), r1Var2.k(), r1Var2.l())) {
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
                if (context == null || !com.google.android.gms.internal.clearcut.a2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = com.google.android.gms.internal.clearcut.a2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.i iVar2 = com.google.android.gms.internal.clearcut.a2.d;
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
                        i3 = indexOf + 1;
                    } else {
                        str2 = "";
                        i3 = 0;
                    }
                    int indexOf2 = str.indexOf(47, i3);
                    if (indexOf2 <= 0) {
                        Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
                    } else {
                        try {
                            parseLong = Long.parseLong(str.substring(i3, indexOf2));
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
                                z10 = com.google.android.gms.internal.clearcut.a2.b(com.google.android.gms.internal.clearcut.a2.a(com.google.android.gms.internal.clearcut.a2.d(context), r1Var.j()), r1Var.k(), r1Var.l());
                            }
                        } else {
                            com.google.android.gms.internal.clearcut.q1 m10 = com.google.android.gms.internal.clearcut.r1.m();
                            m10.b();
                            com.google.android.gms.internal.clearcut.r1.g((com.google.android.gms.internal.clearcut.r1) m10.b, str2);
                            m10.b();
                            com.google.android.gms.internal.clearcut.r1.f((com.google.android.gms.internal.clearcut.r1) m10.b, parseLong);
                            m10.b();
                            com.google.android.gms.internal.clearcut.r1.h((com.google.android.gms.internal.clearcut.r1) m10.b, parseLong2);
                            com.google.android.gms.internal.clearcut.z c2 = m10.c();
                            byte byteValue = ((Byte) c2.a(1)).byteValue();
                            if (byteValue == 1) {
                                z11 = true;
                            } else if (byteValue != 0) {
                                com.google.android.gms.internal.clearcut.v0 v0Var = com.google.android.gms.internal.clearcut.v0.c;
                                v0Var.getClass();
                                z11 = v0Var.a(c2.getClass()).g(c2);
                                c2.a(2);
                            }
                            if (!z11) {
                                throw new androidx.car.app.j();
                            }
                            r1Var = (com.google.android.gms.internal.clearcut.r1) c2;
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
            new com.google.android.gms.common.api.internal.r(null, 0).a(Status.e);
            return;
        }
        a9.j0 j0Var = aVar.g;
        j0Var.getClass();
        j0Var.d(2, new com.google.android.gms.internal.clearcut.u1(cVar, j0Var.i));
    }

    public Object c() {
        ArrayList arrayList = (ArrayList) this.d;
        if (((ArrayList) this.c).isEmpty()) {
            return null;
        }
        Object obj = this.f;
        if (this.b >= arrayList.size()) {
            if (this.a) {
                Collections.shuffle(arrayList, (Random) this.e);
                this.b = 0;
            } else {
                this.b = 0;
            }
        }
        int i3 = this.b;
        this.b = i3 + 1;
        this.f = arrayList.get(i3);
        return obj;
    }

    public a(ArrayList arrayList) {
        this.a = true;
        ArrayList arrayList2 = new ArrayList(arrayList == null ? new ArrayList() : arrayList);
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.d = arrayList3;
        this.b = 0;
        Random random = new Random();
        this.e = random;
        Collections.shuffle(arrayList3, random);
        this.b = 0;
        c();
    }
}
