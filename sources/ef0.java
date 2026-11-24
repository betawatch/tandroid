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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ef0 {
    public int a;
    public boolean b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;
    public Object f;

    public ef0(tj2 tj2Var, byte[] bArr) {
        this.f = tj2Var;
        this.a = tj2Var.e;
        this.c = tj2Var.d;
        this.d = tj2Var.f;
        uee ueeVar = new uee();
        ueeVar.a = 0L;
        ueeVar.b = 0L;
        ueeVar.c = 0;
        if (zee.a == null) {
            synchronized (m7e.a) {
                if (zee.a == null) {
                    zee.a = new zee[0];
                }
            }
        }
        ueeVar.d = zee.a;
        byte[] bArr2 = xgd.b;
        ueeVar.e = bArr2;
        ueeVar.f = bArr2;
        ueeVar.h = "";
        ueeVar.n = "";
        ueeVar.r = "";
        ueeVar.s = 180000L;
        ueeVar.w = bArr2;
        ueeVar.x = "";
        ueeVar.y = xgd.a;
        ueeVar.E = false;
        this.e = ueeVar;
        this.b = false;
        ueeVar.E = i7d.a(tj2Var.a);
        tj2Var.h.getClass();
        ueeVar.a = System.currentTimeMillis();
        tj2Var.h.getClass();
        ueeVar.b = SystemClock.elapsedRealtime();
        ueeVar.s = TimeZone.getDefault().getOffset(ueeVar.a) / 1000;
        ueeVar.f = bArr;
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
        gde gdeVar;
        tj2 tj2Var = (tj2) this.f;
        if (this.b) {
            dq9.m("do not reuse LogEventBuilder");
            return;
        }
        boolean z = true;
        z = true;
        z = true;
        z = true;
        this.b = true;
        gdf gdfVar = new gdf(tj2Var.b, tj2Var.c, this.a, (String) this.c, (i9e) this.d);
        uee ueeVar = (uee) this.e;
        pvd pvdVar = new pvd(gdfVar, ueeVar);
        Context context = tj2Var.i.a;
        byte b = 0;
        int i2 = ueeVar != null ? ueeVar.c : 0;
        boolean booleanValue = ((Boolean) q9f.i.a()).booleanValue();
        z3d z3dVar = null;
        String str3 = gdfVar.h;
        int i3 = gdfVar.c;
        if (booleanValue) {
            if (str3 == null || str3.isEmpty()) {
                str3 = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (str3 != null) {
                if (context == null) {
                    e = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = q9f.e;
                    i8d i8dVar = (i8d) concurrentHashMap.get(str3);
                    if (i8dVar == null) {
                        wm9 wm9Var = q9f.c;
                        hde f = hde.f();
                        wm9Var.getClass();
                        cad cadVar = new cad(wm9Var, str3, f);
                        i8dVar = (i8d) concurrentHashMap.putIfAbsent(str3, cadVar);
                        if (i8dVar == null) {
                            i8dVar = cadVar;
                        }
                    }
                    e = ((hde) i8dVar.a()).e();
                }
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    gde gdeVar2 = (gde) it.next();
                    if (!gdeVar2.f() || gdeVar2.e() == 0 || gdeVar2.e() == i2) {
                        if (!q9f.b(q9f.a(q9f.d(context), gdeVar2.g()), gdeVar2.h(), gdeVar2.i())) {
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
                if (context == null || !q9f.c(context)) {
                    str = null;
                } else {
                    HashMap hashMap = q9f.f;
                    i8d i8dVar2 = (i8d) hashMap.get(str3);
                    if (i8dVar2 == null) {
                        wm9 wm9Var2 = q9f.d;
                        wm9Var2.getClass();
                        r9d r9dVar = new r9d(wm9Var2, str3, z3dVar, z ? (byte) 1 : (byte) 0);
                        hashMap.put(str3, r9dVar);
                        i8dVar2 = r9dVar;
                    }
                    str = (String) i8dVar2.a();
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
                            fde j = gde.j();
                            j.b();
                            ((gde) j.b).k(str2);
                            j.b();
                            ((gde) j.b).l(parseLong);
                            j.b();
                            ((gde) j.b).m(parseLong2);
                            xkd c = j.c();
                            byte byteValue = ((Byte) c.a(1)).byteValue();
                            if (byteValue == 1) {
                                g = true;
                            } else if (byteValue == 0) {
                                g = false;
                            } else {
                                wvd wvdVar = wvd.c;
                                wvdVar.getClass();
                                g = wvdVar.a(c.getClass()).g(c);
                                c.a(2);
                            }
                            if (!g) {
                                throw new rq2();
                            }
                            gdeVar = (gde) c;
                            if (gdeVar != null) {
                                z = q9f.b(q9f.a(q9f.d(context), gdeVar.g()), gdeVar.h(), gdeVar.i());
                            }
                        }
                    }
                }
                gdeVar = null;
                if (gdeVar != null) {
                }
            }
        }
        if (!z) {
            new f0b(z3dVar, b).a(Status.e);
            return;
        }
        ua4 ua4Var = tj2Var.g;
        ua4Var.getClass();
        ua4Var.d(2, new cee(pvdVar, ua4Var.i));
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

    public ef0(ArrayList arrayList) {
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
