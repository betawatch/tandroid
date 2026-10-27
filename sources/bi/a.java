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
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a {
    public boolean a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a(j6.a aVar, byte[] bArr) {
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
        v1Var.v = bArr2;
        v1Var.w = "";
        v1Var.x = com.google.android.gms.internal.clearcut.l1.c;
        v1Var.y = false;
        this.e = v1Var;
        this.a = false;
        v1Var.y = com.google.android.gms.internal.clearcut.a.a(aVar.a);
        aVar.h.getClass();
        v1Var.a = System.currentTimeMillis();
        aVar.h.getClass();
        v1Var.b = SystemClock.elapsedRealtime();
        v1Var.s = TimeZone.getDefault().getOffset(v1Var.a) / MediaDataController.MAX_STYLE_RUNS_COUNT;
        v1Var.f = bArr;
    }

    public com.google.android.gms.common.api.internal.f1 a() {
        o6.l.a("Must set register function", ((com.google.android.gms.common.api.internal.r) this.c) != null);
        o6.l.a("Must set unregister function", ((com.google.android.gms.common.api.internal.r) this.d) != null);
        o6.l.a("Must set holder", ((com.google.android.gms.common.api.internal.p) this.e) != null);
        com.google.android.gms.common.api.internal.n nVar = ((com.google.android.gms.common.api.internal.p) this.e).c;
        o6.l.i(nVar, "Key must not be null");
        return new com.google.android.gms.common.api.internal.f1(new e2.w(this, (com.google.android.gms.common.api.internal.p) this.e, (l6.c[]) this.f, this.a, this.b), new com.google.android.gms.common.api.internal.f1(this, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        List e;
        String str;
        String str2;
        int i10;
        com.google.android.gms.internal.clearcut.r1 r1Var;
        long parseLong;
        long parseLong2;
        j6.a aVar = (j6.a) this.f;
        if (this.a) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        boolean z10 = true;
        this.a = true;
        com.google.android.gms.internal.clearcut.b2 b2Var = new com.google.android.gms.internal.clearcut.b2(aVar.b, aVar.c, this.b, (String) this.c, (com.google.android.gms.internal.clearcut.o1) this.d);
        com.google.android.gms.internal.clearcut.v1 v1Var = (com.google.android.gms.internal.clearcut.v1) this.e;
        j6.c cVar = new j6.c(b2Var, v1Var);
        Context context = aVar.i.a;
        boolean z11 = false;
        int i11 = v1Var != null ? v1Var.c : 0;
        boolean booleanValue = ((Boolean) com.google.android.gms.internal.clearcut.a2.i.a()).booleanValue();
        Object obj = null;
        String str3 = b2Var.h;
        int i12 = b2Var.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i12 >= 0 ? String.valueOf(i12) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = com.google.android.gms.internal.clearcut.a2.e;
                    com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.get(str3);
                    if (dVar == null) {
                        com.google.android.gms.internal.clearcut.i iVar = com.google.android.gms.internal.clearcut.a2.c;
                        com.google.android.gms.internal.clearcut.s1 f7 = com.google.android.gms.internal.clearcut.s1.f();
                        iVar.getClass();
                        com.google.android.gms.internal.clearcut.g gVar = new com.google.android.gms.internal.clearcut.g(iVar, str3, f7);
                        dVar = (com.google.android.gms.internal.clearcut.d) concurrentHashMap.putIfAbsent(str3, gVar);
                        if (dVar == null) {
                            dVar = gVar;
                        }
                    }
                    e = ((com.google.android.gms.internal.clearcut.s1) dVar.a()).e();
                }
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.clearcut.r1 r1Var2 = (com.google.android.gms.internal.clearcut.r1) it.next();
                    if (!r1Var2.i() || r1Var2.e() == 0 || r1Var2.e() == i11) {
                        if (!com.google.android.gms.internal.clearcut.a2.b(com.google.android.gms.internal.clearcut.a2.a(com.google.android.gms.internal.clearcut.a2.d(context), r1Var2.j()), r1Var2.k(), r1Var2.l())) {
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
                if (context == null || !com.google.android.gms.internal.clearcut.a2.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = com.google.android.gms.internal.clearcut.a2.f;
                    com.google.android.gms.internal.clearcut.d dVar2 = (com.google.android.gms.internal.clearcut.d) hashMap.get(str3);
                    if (dVar2 == null) {
                        com.google.android.gms.internal.clearcut.i iVar2 = com.google.android.gms.internal.clearcut.a2.d;
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
                            com.google.android.gms.internal.clearcut.z c10 = m10.c();
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
                            r1Var = (com.google.android.gms.internal.clearcut.r1) c10;
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
            new com.google.android.gms.common.api.internal.t(null, 0).a(Status.e);
            return;
        }
        a6.a aVar2 = aVar.g;
        aVar2.getClass();
        aVar2.d(2, new com.google.android.gms.internal.clearcut.u1(cVar, aVar2.h));
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
        int i10 = this.b;
        this.b = i10 + 1;
        this.f = arrayList.get(i10);
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
