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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ge0 {
    public int a;
    public boolean b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;
    public Object f;

    public ge0(bj2 bj2Var, byte[] bArr) {
        this.f = bj2Var;
        this.a = bj2Var.e;
        this.c = bj2Var.d;
        this.d = bj2Var.f;
        khe kheVar = new khe();
        kheVar.a = 0L;
        kheVar.b = 0L;
        kheVar.c = 0;
        if (phe.a == null) {
            synchronized (z9e.a) {
                if (phe.a == null) {
                    phe.a = new phe[0];
                }
            }
        }
        kheVar.d = phe.a;
        byte[] bArr2 = njd.b;
        kheVar.e = bArr2;
        kheVar.f = bArr2;
        kheVar.h = "";
        kheVar.n = "";
        kheVar.r = "";
        kheVar.s = 180000L;
        kheVar.w = bArr2;
        kheVar.x = "";
        kheVar.y = njd.a;
        kheVar.E = false;
        this.e = kheVar;
        this.b = false;
        kheVar.E = z9d.a(bj2Var.a);
        bj2Var.h.getClass();
        kheVar.a = System.currentTimeMillis();
        bj2Var.h.getClass();
        kheVar.b = SystemClock.elapsedRealtime();
        kheVar.s = TimeZone.getDefault().getOffset(kheVar.a) / 1000;
        kheVar.f = bArr;
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
        vfe vfeVar;
        bj2 bj2Var = (bj2) this.f;
        if (this.b) {
            grb.i("do not reuse LogEventBuilder");
            return;
        }
        boolean z = true;
        z = true;
        z = true;
        z = true;
        this.b = true;
        vff vffVar = new vff(bj2Var.b, bj2Var.c, this.a, (String) this.c, (xbe) this.d);
        khe kheVar = (khe) this.e;
        cyd cydVar = new cyd(vffVar, kheVar);
        Context context = bj2Var.i.a;
        byte b = 0;
        int i2 = kheVar != null ? kheVar.c : 0;
        boolean booleanValue = ((Boolean) fcf.i.a()).booleanValue();
        o6d o6dVar = null;
        String str3 = vffVar.h;
        int i3 = vffVar.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = fcf.e;
                    zad zadVar = (zad) concurrentHashMap.get(str3);
                    if (zadVar == null) {
                        ko9 ko9Var = fcf.c;
                        wfe f = wfe.f();
                        ko9Var.getClass();
                        tcd tcdVar = new tcd(ko9Var, str3, f);
                        zadVar = (zad) concurrentHashMap.putIfAbsent(str3, tcdVar);
                        if (zadVar == null) {
                            zadVar = tcdVar;
                        }
                    }
                    e = ((wfe) zadVar.a()).e();
                }
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    vfe vfeVar2 = (vfe) it.next();
                    if (!vfeVar2.f() || vfeVar2.e() == 0 || vfeVar2.e() == i2) {
                        if (!fcf.b(fcf.a(fcf.d(context), vfeVar2.g()), vfeVar2.h(), vfeVar2.i())) {
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
                if (context == null || !fcf.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = fcf.f;
                    zad zadVar2 = (zad) hashMap.get(str3);
                    if (zadVar2 == null) {
                        ko9 ko9Var2 = fcf.d;
                        ko9Var2.getClass();
                        icd icdVar = new icd(ko9Var2, str3, o6dVar, z ? (byte) 1 : (byte) 0);
                        hashMap.put(str3, icdVar);
                        zadVar2 = icdVar;
                    }
                    str = (String) zadVar2.a();
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
                            ufe j = vfe.j();
                            j.b();
                            ((vfe) j.b).k(str2);
                            j.b();
                            ((vfe) j.b).l(parseLong);
                            j.b();
                            ((vfe) j.b).m(parseLong2);
                            mnd c = j.c();
                            byte byteValue = ((Byte) c.a(1)).byteValue();
                            if (byteValue == 1) {
                                g = true;
                            } else if (byteValue == 0) {
                                g = false;
                            } else {
                                jyd jydVar = jyd.c;
                                jydVar.getClass();
                                g = jydVar.a(c.getClass()).g(c);
                                c.a(2);
                            }
                            if (!g) {
                                throw new zp2();
                            }
                            vfeVar = (vfe) c;
                            if (vfeVar != null) {
                                z = fcf.b(fcf.a(fcf.d(context), vfeVar.g()), vfeVar.h(), vfeVar.i());
                            }
                        }
                    }
                }
                vfeVar = null;
                if (vfeVar != null) {
                }
            }
        }
        if (!z) {
            new e2b(o6dVar, b).a(Status.e);
            return;
        }
        qa4 qa4Var = bj2Var.g;
        qa4Var.getClass();
        qa4Var.d(2, new rge(cydVar, qa4Var.i));
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

    public ge0(ArrayList arrayList) {
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
