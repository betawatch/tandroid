package e2;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import di.nb;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.v0;
import m.w0;
import r0.i0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a0 {
    public int a;
    public int b;
    public Object c = new long[10];
    public Object d = new Object[10];

    public synchronized void a(Object obj, long j3) {
        if (this.b > 0) {
            if (j3 <= ((long[]) this.c)[((this.a + r0) - 1) % ((Object[]) this.d).length]) {
                c();
            }
        }
        d();
        int i10 = this.a;
        int i11 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i10 + i11) % objArr.length;
        ((long[]) this.c)[length] = j3;
        objArr[length] = obj;
        this.b = i11 + 1;
    }

    public void b() {
        new Handler(Looper.getMainLooper()).post(new nb(this, 20));
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

    public void e(Typeface typeface) {
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
                WeakHashMap weakHashMap = i0.a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, w0Var.j, 5));
                } else {
                    textView.setTypeface(typeface, w0Var.j);
                }
            }
        }
    }

    public synchronized Object f() {
        return this.b == 0 ? null : h();
    }

    public synchronized Object g(long j3) {
        Object obj;
        obj = null;
        while (this.b > 0 && j3 - ((long[]) this.c)[this.a] >= 0) {
            obj = h();
        }
        return obj;
    }

    public Object h() {
        d.g(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.a = (i10 + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public synchronized int i() {
        return this.b;
    }
}
