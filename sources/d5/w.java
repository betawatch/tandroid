package d5;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.u5;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.tasks.OnSuccessListener;
import f7.t7;
import g7.z7;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import m.f3;
import m.m1;
import org.telegram.ui.jg;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w implements OnSuccessListener, td.i {
    public static w e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public w(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public static void a(w wVar, int i9) {
        synchronized (wVar.d) {
            try {
                if (wVar.a == i9) {
                    return;
                }
                wVar.a = i9;
                Iterator it = ((CopyOnWriteArrayList) wVar.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    com.google.android.exoplayer2.upstream.s sVar = (com.google.android.exoplayer2.upstream.s) weakReference.get();
                    if (sVar != null) {
                        sVar.a(i9);
                    } else {
                        ((CopyOnWriteArrayList) wVar.c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized w f(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (e == null) {
                    e = new w(context);
                }
                wVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    @Override // td.i
    public void b() {
        i();
    }

    @Override // td.i
    public void c(td.j jVar) {
        i();
    }

    public void d() {
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 <= 21 && i9 == 21) {
                if (((f3) this.d) == null) {
                    this.d = new f3();
                }
                f3 f3Var = (f3) this.d;
                f3Var.c = null;
                f3Var.b = false;
                f3Var.d = null;
                f3Var.a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    f3Var.b = true;
                    f3Var.c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    f3Var.a = true;
                    f3Var.d = imageTintMode;
                }
                if (f3Var.b || f3Var.a) {
                    m.r.d(drawable, f3Var, imageView.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.c;
            if (f3Var2 != null) {
                m.r.d(drawable, f3Var2, imageView.getDrawableState());
            }
        }
    }

    public t5.l e() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!f7.m.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i9 = this.a;
            sb2.append(i9 != 15 ? i9 != 255 ? i9 != 32768 ? i9 != 32783 ? i9 != 33023 ? String.valueOf(i9) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i10 = this.a;
        boolean a2 = i10 != 0 ? f7.m.a(i10) : false;
        if (TextUtils.isEmpty((String) this.d) && !a2) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a2) {
            return new t5.l((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public int g() {
        int i9;
        synchronized (this.d) {
            i9 = this.a;
        }
        return i9;
    }

    public void h(AttributeSet attributeSet, int i9) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        TypedArray typedArray = (TypedArray) E.c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E.c, i9);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = t7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList v = E.v(2);
                int i10 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(v);
                if (i10 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = m1.b(typedArray.getInt(3, -1), null);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i11 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    public void i() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((td.j) this.d).iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            fArr[((Integer) eVar.a).intValue()] = eVar.c();
        }
        ((jg) this.c).run();
    }

    public void j(int i9, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = z7.b(this.a, 1 << i9, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((td.j) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th) {
        n2.y yVar = (n2.y) this.d;
        if (th instanceof TimeoutException) {
            yVar.F(102, 28, n2.b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            yVar.F(95, 28, n2.b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        p0 p0Var = (p0) this.b;
        String str = (String) this.c;
        int i9 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        n5.g gVar = p0Var.a;
        x5.l.h(gVar);
        com.google.android.gms.internal.cast.t tVar = p0Var.b;
        if (i9 != 3) {
            if (i9 == 2) {
                i9 = 2;
            }
            if (i9 != 1 || i9 == 2) {
                a1 a1Var = new a1(sharedPreferences, p0Var, p0Var.c, bundle, str);
                gVar.a(new u5(a1Var));
                if (tVar == null) {
                    y0 y0Var = new y0(a1Var, 0);
                    com.google.android.gms.internal.cast.t.i.b("register callback = %s", y0Var);
                    x5.l.e("Must be called from the main thread.");
                    tVar.b.add(y0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.d dVar = p0Var.c;
        b3.b bVar = new b3.b();
        bVar.a = p0Var;
        bVar.b = dVar;
        bVar.c = str;
        bVar.e = new o4(bVar);
        gVar.a(new o4(bVar));
        if (tVar != null) {
            y0 y0Var2 = new y0(bVar, 1);
            com.google.android.gms.internal.cast.t.i.b("register callback = %s", y0Var2);
            x5.l.e("Must be called from the main thread.");
            tVar.b.add(y0Var2);
        }
        if (i9 != 1) {
        }
        a1 a1Var2 = new a1(sharedPreferences, p0Var, p0Var.c, bundle, str);
        gVar.a(new u5(a1Var2));
        if (tVar == null) {
        }
    }

    public w(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        f0.M(context, new androidx.mediarouter.app.h(this, 3), intentFilter);
    }

    public w() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 0;
    }
}
