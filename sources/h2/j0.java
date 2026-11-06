package h2;

import a8.ia;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import fi.h9;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class j0 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public j0(int[] iArr) {
        SecureRandom secureRandom = rc.k.a;
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i10 : iArr) {
            if (i10 < i7) {
                i7 = i10;
            }
        }
        this.a = Math.max(i7, 1);
        int i11 = TLObject.FLAG_31;
        for (int i12 : iArr) {
            if (i11 < i12) {
                i11 = i12;
            }
        }
        this.b = i11;
        int i13 = i11 + 1;
        int[] iArr2 = new int[i13];
        for (int i14 : iArr) {
            iArr2[i14] = iArr2[i14] + 1;
        }
        int i15 = this.b + 1;
        int[] iArr3 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr3[i16] = -1;
        }
        iArr2[0] = 0;
        int[] iArr4 = new int[i15];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 1; i19 < i13; i19++) {
            i18 = (i18 + iArr2[i19 - 1]) << 1;
            iArr4[i19] = i18;
            i17 = (iArr2[i19] + i18) - 1;
            iArr3[i19] = i17;
        }
        Object[] objArr = {iArr4, Integer.valueOf(i17)};
        this.c = iArr3;
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = new int[((Integer) objArr[1]).intValue() + 1];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            if (i21 != 0) {
                int i22 = iArr5[i21];
                iArr5[i21] = i22 + 1;
                iArr6[i22] = i20;
            }
        }
        this.d = iArr6;
    }

    public synchronized void a(Object obj, long j3) {
        if (this.b > 0) {
            if (j3 <= ((long[]) this.c)[((this.a + r0) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i7 = this.a;
        int i10 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i7 + i10) % objArr.length;
        ((long[]) this.c)[length] = j3;
        objArr[length] = obj;
        this.b = i10 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new h9(this, 9));
    }

    public synchronized void c() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i10 = this.a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i11);
        int i12 = this.a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.d, 0, objArr, i11, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public Object f(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj = ((LinkedHashMap) this.c).get(str);
                if (obj != null) {
                    return obj;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object remove = linkedHashMap.remove(str);
        if (remove != null) {
            linkedHashMap.put(str, remove);
        }
    }

    public void h(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.a) != -1) {
            typeface = w0.a(typeface, i7, (this.b & 2) != 0);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.c;
        if (x0Var.m) {
            x0Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = r0.i0.a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.j, 4));
                } else {
                    textView.setTypeface(typeface, x0Var.j);
                }
            }
        }
    }

    public synchronized Object i() {
        return this.b == 0 ? null : k();
    }

    public synchronized Object j(long j3) {
        Object obj;
        obj = null;
        while (this.b > 0 && j3 - ((long[]) this.c)[this.a] >= 0) {
            obj = k();
        }
        return obj;
    }

    public Object k() {
        ia.p(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i7 = this.a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.a = (i7 + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public Object l(String str, Object obj) {
        Object put;
        if (str == null || obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.a += o(obj, str);
                put = ((LinkedHashMap) this.c).put(str, obj);
                if (put != null) {
                    this.a -= o(put, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String[] split = str.split("@");
        if (split.length > 1) {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0]);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((LinkedHashMap) this.d).put(split[0], arrayList);
            }
            if (!arrayList.contains(split[1])) {
                arrayList.add(split[1]);
            }
        }
        if (put != null) {
            e(str, put, obj);
        }
        r(this.b, str);
        return put;
    }

    public int m(f5.u uVar, int[] iArr) {
        int i7 = this.a;
        while (true) {
            int i10 = 1;
            if (i7 > this.b) {
                throw new ab.a0(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
            }
            int i11 = ((int[]) this.c)[i7];
            if (i11 >= 0) {
                int i12 = iArr[0];
                int i13 = i7 - 1;
                int i14 = 0;
                while (i13 >= 0) {
                    if (uVar.k(i12 + i13)) {
                        i14 += i10;
                    }
                    i13--;
                    i10 *= 2;
                }
                if (i11 >= i14) {
                    int i15 = ((int[]) this.d)[i14];
                    iArr[0] = iArr[0] + i7;
                    return i15;
                }
            }
            i7++;
        }
    }

    public void n(String str) {
        Object remove;
        ArrayList arrayList;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                remove = ((LinkedHashMap) this.c).remove(str);
                if (remove != null) {
                    this.a -= o(remove, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (remove != null) {
            String[] split = str.split("@");
            if (split.length > 1 && (arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0])) != null) {
                arrayList.remove(split[1]);
                if (arrayList.isEmpty()) {
                    ((LinkedHashMap) this.d).remove(split[0]);
                }
            }
            e(str, remove, null);
        }
    }

    public int o(Object obj, String str) {
        int q10 = q(obj);
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + obj);
    }

    public synchronized int p() {
        return this.b;
    }

    public int q(Object obj) {
        return 1;
    }

    public void r(int i7, String str) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
                while (it.hasNext() && this.a > i7 && !((LinkedHashMap) this.c).isEmpty()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    if (str == null || !str.equals(str2)) {
                        Object value = entry.getValue();
                        this.a -= o(value, str2);
                        it.remove();
                        String[] split = str2.split("@");
                        if (split.length > 1 && (arrayList = (ArrayList) ((LinkedHashMap) this.d).get(split[0])) != null) {
                            arrayList.remove(split[1]);
                            if (arrayList.isEmpty()) {
                                ((LinkedHashMap) this.d).remove(split[0]);
                            }
                        }
                        e(str2, value, null);
                    }
                }
            } finally {
            }
        }
    }

    public j0(int i7, int i10) {
        switch (i10) {
            case 5:
                this.c = new z3.r[i7];
                this.b = 0;
                return;
            default:
                if (i7 > 0) {
                    this.b = i7;
                    this.c = new LinkedHashMap(0, 0.75f, true);
                    this.d = new LinkedHashMap();
                    return;
                }
                throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public j0() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public void e(String str, Object obj, Object obj2) {
    }
}
