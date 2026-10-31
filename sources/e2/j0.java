package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class j0 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public j0(int[] iArr) {
        SecureRandom secureRandom = lc.k.a;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 : iArr) {
            if (i11 < i10) {
                i10 = i11;
            }
        }
        this.a = Math.max(i10, 1);
        int i12 = TLObject.FLAG_31;
        for (int i13 : iArr) {
            if (i12 < i13) {
                i12 = i13;
            }
        }
        this.b = i12;
        int i14 = i12 + 1;
        int[] iArr2 = new int[i14];
        for (int i15 : iArr) {
            iArr2[i15] = iArr2[i15] + 1;
        }
        int i16 = this.b + 1;
        int[] iArr3 = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr3[i17] = -1;
        }
        iArr2[0] = 0;
        int[] iArr4 = new int[i16];
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 1; i20 < i14; i20++) {
            i19 = (i19 + iArr2[i20 - 1]) << 1;
            iArr4[i20] = i19;
            i18 = (iArr2[i20] + i19) - 1;
            iArr3[i20] = i18;
        }
        Object[] objArr = {iArr4, Integer.valueOf(i18)};
        this.c = iArr3;
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = new int[((Integer) objArr[1]).intValue() + 1];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            if (i22 != 0) {
                int i23 = iArr5[i22];
                iArr5[i22] = i23 + 1;
                iArr6[i23] = i21;
            }
        }
        this.d = iArr6;
    }

    public synchronized void a(Object obj, long j10) {
        if (this.b > 0) {
            if (j10 <= ((long[]) this.c)[((this.a + r0) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i10 = this.a;
        int i11 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i10 + i11) % objArr.length;
        ((long[]) this.c)[length] = j10;
        objArr[length] = obj;
        this.b = i11 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new gg.c(this, 1));
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
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i12);
        int i13 = this.a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.d, 0, objArr, i12, this.a);
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
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.a) != -1) {
            typeface = v0.a(typeface, i10, (this.b & 2) != 0);
        }
        w0 w0Var = (w0) this.d;
        WeakReference weakReference = (WeakReference) this.c;
        if (w0Var.m) {
            w0Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = r0.h0.a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.j, 4));
                } else {
                    textView.setTypeface(typeface, w0Var.j);
                }
            }
        }
    }

    public synchronized Object i() {
        return this.b == 0 ? null : k();
    }

    public synchronized Object j(long j10) {
        Object obj;
        obj = null;
        while (this.b > 0 && j10 - ((long[]) this.c)[this.a] >= 0) {
            obj = k();
        }
        return obj;
    }

    public Object k() {
        t6.p(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.a = (i10 + 1) % objArr.length;
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

    public int m(c5.x xVar, int[] iArr) {
        int i10 = this.a;
        while (true) {
            int i11 = 1;
            if (i10 > this.b) {
                throw new j6.l(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
            }
            int i12 = ((int[]) this.c)[i10];
            if (i12 >= 0) {
                int i13 = iArr[0];
                int i14 = i10 - 1;
                int i15 = 0;
                while (i14 >= 0) {
                    if (xVar.l(i13 + i14)) {
                        i15 += i11;
                    }
                    i14--;
                    i11 *= 2;
                }
                if (i12 >= i15) {
                    int i16 = ((int[]) this.d)[i15];
                    iArr[0] = iArr[0] + i10;
                    return i16;
                }
            }
            i10++;
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
        int q6 = q(obj);
        if (q6 >= 0) {
            return q6;
        }
        throw new IllegalStateException("Negative size: " + str + "=" + obj);
    }

    public synchronized int p() {
        return this.b;
    }

    public int q(Object obj) {
        return 1;
    }

    public void r(int i10, String str) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
                while (it.hasNext() && this.a > i10 && !((LinkedHashMap) this.c).isEmpty()) {
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

    public j0(int i10, int i11) {
        switch (i11) {
            case 5:
                this.c = new w3.r[i10];
                this.b = 0;
                return;
            default:
                if (i10 > 0) {
                    this.b = i10;
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
