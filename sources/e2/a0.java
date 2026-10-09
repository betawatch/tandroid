package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import ci.rc;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.i0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class a0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public a0(int[] iArr) {
        this.a = 3;
        SecureRandom secureRandom = sc.k.a;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i11 : iArr) {
            if (i11 < i10) {
                i10 = i11;
            }
        }
        this.b = Math.max(i10, 1);
        int i12 = TLObject.FLAG_31;
        for (int i13 : iArr) {
            if (i12 < i13) {
                i12 = i13;
            }
        }
        this.c = i12;
        int i14 = i12 + 1;
        int[] iArr2 = new int[i14];
        for (int i15 : iArr) {
            iArr2[i15] = iArr2[i15] + 1;
        }
        int i16 = this.c + 1;
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
        this.d = iArr3;
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
        this.e = iArr6;
    }

    private final synchronized void d() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    private final synchronized void e() {
        this.c = 0;
        this.b = 0;
    }

    public synchronized void a(Object obj, long j3) {
        if (this.c > 0) {
            if (j3 <= ((long[]) this.d)[((this.b + r0) - 1) % ((Object[]) this.e).length]) {
                c();
            }
        }
        f();
        int i10 = this.b;
        int i11 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i10 + i11) % objArr.length;
        ((long[]) this.d)[length] = j3;
        objArr[length] = obj;
        this.c = i11 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new rc(this, 17));
    }

    public synchronized void c() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                e();
                break;
        }
    }

    public void f() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i12);
        int i13 = this.b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.e, 0, objArr, i12, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public void g(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.b) != -1) {
            typeface = v0.a(typeface, i10, (this.c & 2) != 0);
        }
        w0 w0Var = (w0) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (w0Var.m) {
            w0Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = i0.a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.j, 4));
                } else {
                    textView.setTypeface(typeface, w0Var.j);
                }
            }
        }
    }

    public synchronized Object h() {
        return this.c == 0 ? null : j();
    }

    public synchronized Object i(long j3) {
        Object obj;
        obj = null;
        while (this.c > 0 && j3 - ((long[]) this.d)[this.b] >= 0) {
            obj = j();
        }
        return obj;
    }

    public Object j() {
        d.g(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i10 = this.b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.b = (i10 + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public int k(c5.b0 b0Var, int[] iArr) {
        int i10 = this.b;
        while (true) {
            int i11 = 1;
            if (i10 > this.c) {
                throw new cc.k(String.format("[%s] Bad code at the bit index '%d'.", getClass().getSimpleName(), Integer.valueOf(iArr[0])));
            }
            int i12 = ((int[]) this.d)[i10];
            if (i12 >= 0) {
                int i13 = iArr[0];
                int i14 = i10 - 1;
                int i15 = 0;
                while (i14 >= 0) {
                    if (b0Var.j(i13 + i14)) {
                        i15 += i11;
                    }
                    i14--;
                    i11 *= 2;
                }
                if (i12 >= i15) {
                    int i16 = ((int[]) this.e)[i15];
                    iArr[0] = iArr[0] + i10;
                    return i16;
                }
            }
            i10++;
        }
    }

    public synchronized void l(long j3, long j10) {
        long[] jArr = (long[]) this.d;
        int i10 = this.b;
        jArr[i10] = j3;
        ((long[]) this.e)[i10] = j10;
        this.b = (i10 + 1) % jArr.length;
        this.c = Math.min(this.c + 1, jArr.length);
    }

    public synchronized int m() {
        return this.c;
    }

    public a0(int i10, byte b10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.d = new long[64];
                this.e = new long[64];
                break;
            default:
                this.d = new long[10];
                this.e = new Object[10];
                break;
        }
    }

    public a0(w0 w0Var, int i10, int i11, WeakReference weakReference) {
        this.a = 1;
        this.e = w0Var;
        this.b = i10;
        this.c = i11;
        this.d = weakReference;
    }

    public a0(int i10) {
        this.a = 4;
        this.d = new w3.r[i10];
        this.c = 0;
    }
}
