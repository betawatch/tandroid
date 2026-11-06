package bi;

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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a(l6.a aVar, byte[] bArr) {
        this.f = aVar;
        this.b = aVar.e;
        this.c = aVar.d;
        this.d = aVar.f;
        com.google.android.gms.internal.clearcut.w1 w1Var = new com.google.android.gms.internal.clearcut.w1();
        w1Var.a = 0L;
        w1Var.b = 0L;
        w1Var.c = 0;
        if (com.google.android.gms.internal.clearcut.x1.a == null) {
            synchronized (com.google.android.gms.internal.clearcut.o1.a) {
                try {
                    if (com.google.android.gms.internal.clearcut.x1.a == null) {
                        com.google.android.gms.internal.clearcut.x1.a = new com.google.android.gms.internal.clearcut.x1[0];
                    }
                } finally {
                }
            }
        }
        w1Var.d = com.google.android.gms.internal.clearcut.x1.a;
        byte[] bArr2 = com.google.android.gms.internal.clearcut.m1.d;
        w1Var.e = bArr2;
        w1Var.f = bArr2;
        w1Var.h = "";
        w1Var.n = "";
        w1Var.r = "";
        w1Var.s = 180000L;
        w1Var.w = bArr2;
        w1Var.x = "";
        w1Var.y = com.google.android.gms.internal.clearcut.m1.c;
        w1Var.D = false;
        this.e = w1Var;
        this.a = false;
        w1Var.D = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        w1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        w1Var.b = SystemClock.elapsedRealtime();
        w1Var.s = TimeZone.getDefault().getOffset(w1Var.a) / 1000;
        w1Var.f = bArr;
    }

    public com.google.android.gms.common.api.internal.y0 a() {
        q6.m.a("Must set register function", ((com.google.android.gms.common.api.internal.p) this.c) != null);
        q6.m.a("Must set unregister function", ((com.google.android.gms.common.api.internal.p) this.d) != null);
        q6.m.a("Must set holder", ((com.google.android.gms.common.api.internal.o) this.e) != null);
        com.google.android.gms.common.api.internal.m mVar = ((com.google.android.gms.common.api.internal.o) this.e).b;
        q6.m.h(mVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.y0(new h2.w(this, (com.google.android.gms.common.api.internal.o) this.e, (n6.c[]) this.f, this.a, this.b), new com.google.android.gms.common.api.internal.y0(this, mVar));
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
        com.google.android.gms.internal.clearcut.s1 s1Var;
        long parseLong;
        long parseLong2;
        l6.a aVar = (l6.a) this.f;
        if (this.a) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z9 = true;
        this.a = true;
        com.google.android.gms.internal.clearcut.c2 c2Var = new com.google.android.gms.internal.clearcut.c2(aVar.b, aVar.c, this.b, (String) this.c, (com.google.android.gms.internal.clearcut.p1) this.d);
        com.google.android.gms.internal.clearcut.w1 w1Var = (com.google.android.gms.internal.clearcut.w1) this.e;
        l6.c cVar = new l6.c(c2Var, w1Var);
        Context context = aVar.i.a;
        boolean z10 = false;
        int i10 = w1Var != null ? w1Var.c : 0;
        boolean booleanValue = ((Boolean) com.google.android.gms.internal.clearcut.b2.i.a()).booleanValue();
        String str3 = c2Var.h;
        int i11 = c2Var.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i11 >= 0 ? String.valueOf(i11) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e10 = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = com.google.android.gms.internal.clearcut.b2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.i iVar = com.google.android.gms.internal.clearcut.b2.c;
                        com.google.android.gms.internal.clearcut.t1 f10 = com.google.android.gms.internal.clearcut.t1.f();
                        iVar.getClass();
                        com.google.android.gms.internal.clearcut.g gVar = new com.google.android.gms.internal.clearcut.g(iVar, str3, f10);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, gVar);
                        if (dVar == null) {
                            dVar = gVar;
                        }
                    }
                    e10 = ((com.google.android.gms.internal.clearcut.t1) dVar.a()).e();
                }
                Iterator it = e10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.clearcut.s1 s1Var2 = (com.google.android.gms.internal.clearcut.s1) it.next();
                    if (!s1Var2.i() || s1Var2.e() == 0 || s1Var2.e() == i10) {
                        if (!com.google.android.gms.internal.clearcut.b2.b(com.google.android.gms.internal.clearcut.b2.a(com.google.android.gms.internal.clearcut.b2.d(context), s1Var2.j()), s1Var2.k(), s1Var2.l())) {
                            z9 = false;
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
                if (context == null || !com.google.android.gms.internal.clearcut.b2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = com.google.android.gms.internal.clearcut.b2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.i iVar2 = com.google.android.gms.internal.clearcut.b2.d;
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
                            s1Var = null;
                            if (s1Var != null) {
                                z9 = com.google.android.gms.internal.clearcut.b2.b(com.google.android.gms.internal.clearcut.b2.a(com.google.android.gms.internal.clearcut.b2.d(context), s1Var.j()), s1Var.k(), s1Var.l());
                            }
                        } else {
                            com.google.android.gms.internal.clearcut.r1 m10 = com.google.android.gms.internal.clearcut.s1.m();
                            m10.b();
                            com.google.android.gms.internal.clearcut.s1.g((com.google.android.gms.internal.clearcut.s1) m10.b, str2);
                            m10.b();
                            com.google.android.gms.internal.clearcut.s1.f((com.google.android.gms.internal.clearcut.s1) m10.b, parseLong);
                            m10.b();
                            com.google.android.gms.internal.clearcut.s1.h((com.google.android.gms.internal.clearcut.s1) m10.b, parseLong2);
                            com.google.android.gms.internal.clearcut.z c10 = m10.c();
                            byte byteValue = ((Byte) c10.a(1)).byteValue();
                            if (byteValue == 1) {
                                z10 = true;
                            } else if (byteValue != 0) {
                                com.google.android.gms.internal.clearcut.v0 v0Var = com.google.android.gms.internal.clearcut.v0.c;
                                v0Var.getClass();
                                z10 = v0Var.a(c10.getClass()).g(c10);
                                c10.a(2);
                            }
                            if (!z10) {
                                throw new androidx.car.app.j();
                            }
                            s1Var = (com.google.android.gms.internal.clearcut.s1) c10;
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
        if (!z9) {
            new com.google.android.gms.common.api.internal.r(null, 0).a(Status.e);
            return;
        }
        b9.j0 j0Var = aVar.g;
        j0Var.getClass();
        j0Var.d(2, new com.google.android.gms.internal.clearcut.v1(cVar, j0Var.i));
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
        int i7 = this.b;
        this.b = i7 + 1;
        this.f = arrayList.get(i7);
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
