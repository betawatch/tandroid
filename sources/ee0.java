// default package

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ee0 {
    public int a;
    public boolean b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;
    public Object f;

    public ee0(fi2 fi2Var, byte[] bArr) {
        this.f = fi2Var;
        this.a = fi2Var.e;
        this.c = fi2Var.d;
        this.d = fi2Var.f;
        tce tceVar = new tce();
        tceVar.a = 0L;
        tceVar.b = 0L;
        tceVar.c = 0;
        if (yce.a == null) {
            synchronized (j5e.a) {
                if (yce.a == null) {
                    yce.a = new yce[0];
                }
            }
        }
        tceVar.d = yce.a;
        byte[] bArr2 = wed.b;
        tceVar.e = bArr2;
        tceVar.f = bArr2;
        tceVar.h = "";
        tceVar.n = "";
        tceVar.r = "";
        tceVar.s = 180000L;
        tceVar.w = bArr2;
        tceVar.x = "";
        tceVar.y = wed.a;
        tceVar.E = false;
        this.e = tceVar;
        this.b = false;
        tceVar.E = g5d.a(fi2Var.a);
        fi2Var.h.getClass();
        tceVar.a = System.currentTimeMillis();
        fi2Var.h.getClass();
        tceVar.b = SystemClock.elapsedRealtime();
        tceVar.s = TimeZone.getDefault().getOffset(tceVar.a) / 1000;
        tceVar.f = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        List e;
        String str;
        String str2;
        int i;
        long parseLong;
        long parseLong2;
        boolean g;
        fbe fbeVar;
        fi2 fi2Var = (fi2) this.f;
        if (this.b) {
            sc8.j("do not reuse LogEventBuilder");
            return;
        }
        boolean z = true;
        z = true;
        z = true;
        z = true;
        this.b = true;
        fbf fbfVar = new fbf(fi2Var.b, fi2Var.c, this.a, (String) this.c, (h7e) this.d);
        tce tceVar = (tce) this.e;
        mtd mtdVar = new mtd(fbfVar, tceVar);
        Context context = fi2Var.i.a;
        byte b = 0;
        int i2 = tceVar != null ? tceVar.c : 0;
        boolean booleanValue = ((Boolean) o7f.i.a()).booleanValue();
        x1d x1dVar = null;
        String str3 = fbfVar.h;
        int i3 = fbfVar.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = o7f.e;
                    g6d g6dVar = (g6d) concurrentHashMap.get(str3);
                    if (g6dVar == null) {
                        vk9 vk9Var = o7f.c;
                        gbe f = gbe.f();
                        vk9Var.getClass();
                        a8d a8dVar = new a8d(vk9Var, str3, f);
                        g6dVar = (g6d) concurrentHashMap.putIfAbsent(str3, a8dVar);
                        if (g6dVar == null) {
                            g6dVar = a8dVar;
                        }
                    }
                    e = ((gbe) g6dVar.a()).e();
                }
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    fbe fbeVar2 = (fbe) it.next();
                    if (!fbeVar2.f() || fbeVar2.e() == 0 || fbeVar2.e() == i2) {
                        if (!o7f.b(o7f.a(o7f.d(context), fbeVar2.g()), fbeVar2.h(), fbeVar2.i())) {
                            z = false;
                            break;
                        }
                    }
                }
            }
        } else {
            if (str3 == null || str3.isEmpty()) {
                str3 = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (str3 != null) {
                if (context == null || !o7f.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = o7f.f;
                    g6d g6dVar2 = (g6d) hashMap.get(str3);
                    if (g6dVar2 == null) {
                        vk9 vk9Var2 = o7f.d;
                        vk9Var2.getClass();
                        p7d p7dVar = new p7d(vk9Var2, str3, x1dVar, z ? (byte) 1 : (byte) 0);
                        hashMap.put(str3, p7dVar);
                        g6dVar2 = p7dVar;
                    }
                    str = (String) g6dVar2.a();
                }
                if (str != null) {
                    int indexOf = str.indexOf(44);
                    if (indexOf >= 0) {
                        str2 = str.substring(0, indexOf);
                        i = indexOf + 1;
                    } else {
                        str2 = "";
                        i = 0;
                    }
                    int indexOf2 = str.indexOf(47, i);
                    if (indexOf2 <= 0) {
                        Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
                    } else {
                        try {
                            parseLong = Long.parseLong(str.substring(i, indexOf2));
                            parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
                        } catch (NumberFormatException e2) {
                            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e2);
                        }
                        if (parseLong < 0 || parseLong2 < 0) {
                            StringBuilder sb = new StringBuilder(72);
                            sb.append("negative values not supported: ");
                            sb.append(parseLong);
                            sb.append("/");
                            sb.append(parseLong2);
                            Log.e("LogSamplerImpl", sb.toString());
                        } else {
                            ebe j = fbe.j();
                            j.b();
                            ((fbe) j.b).k(str2);
                            j.b();
                            ((fbe) j.b).l(parseLong);
                            j.b();
                            ((fbe) j.b).m(parseLong2);
                            vid c = j.c();
                            byte byteValue = ((Byte) c.a(1)).byteValue();
                            if (byteValue == 1) {
                                g = true;
                            } else if (byteValue == 0) {
                                g = false;
                            } else {
                                ttd ttdVar = ttd.c;
                                ttdVar.getClass();
                                g = ttdVar.a(c.getClass()).g(c);
                                c.a(2);
                            }
                            if (!g) {
                                throw new gp2();
                            }
                            fbeVar = (fbe) c;
                            if (fbeVar != null) {
                                z = o7f.b(o7f.a(o7f.d(context), fbeVar.g()), fbeVar.h(), fbeVar.i());
                            }
                        }
                    }
                }
                fbeVar = null;
                if (fbeVar != null) {
                }
            }
        }
        if (!z) {
            new cya(x1dVar, b).a(Status.e);
            return;
        }
        u84 u84Var = fi2Var.g;
        u84Var.getClass();
        u84Var.d(2, new bce(mtdVar, u84Var.i));
    }

    public final Object b() {
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
        int i = this.a;
        this.a = i + 1;
        this.f = arrayList.get(i);
        return obj;
    }

    public ee0(ArrayList arrayList) {
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
        b();
    }
}
