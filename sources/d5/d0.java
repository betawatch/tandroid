package d5;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import fh.o1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.w0;
import m.x0;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public void a() {
        new Handler(Looper.getMainLooper()).post(new o1(this, 22));
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
        int i9 = length * 2;
        long[] jArr = new long[i9];
        Object[] objArr = new Object[i9];
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

    public void d(Typeface typeface) {
        int i9;
        if (Build.VERSION.SDK_INT >= 28 && (i9 = this.a) != -1) {
            typeface = w0.a(typeface, i9, (this.b & 2) != 0);
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
        int i9 = this.a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.a = (i9 + 1) % objArr.length;
        this.b--;
        return obj;
    }
}
