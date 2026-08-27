package d5;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e0 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public void a() {
        new Handler(Looper.getMainLooper()).post(new f2.r(this, 11));
    }

    public synchronized void b() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public void c() {
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

    public void d(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.a) != -1) {
            typeface = w0.a(typeface, i10, (this.b & 2) != 0);
        }
        x0 x0Var = (x0) this.d;
        WeakReference weakReference = (WeakReference) this.c;
        if (x0Var.m) {
            x0Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                WeakHashMap weakHashMap = j0.a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new androidx.activity.g(textView, typeface, x0Var.j, 6));
                } else {
                    textView.setTypeface(typeface, x0Var.j);
                }
            }
        }
    }

    public synchronized Object e() {
        return this.b == 0 ? null : f();
    }

    public Object f() {
        a.i(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i10 = this.a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.a = (i10 + 1) % objArr.length;
        this.b--;
        return obj;
    }
}
