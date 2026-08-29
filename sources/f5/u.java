package f5;

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
import com.google.android.gms.internal.cast.b1;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.u5;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.tasks.OnSuccessListener;
import h7.s7;
import i7.n8;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import l3.g0;
import m.f3;
import m.m1;
import org.telegram.ui.ig;
import r0.j0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u implements OnSuccessListener, vd.j {
    public static u e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public u(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public static void c(u uVar, int i10) {
        synchronized (uVar.d) {
            try {
                if (uVar.a == i10) {
                    return;
                }
                uVar.a = i10;
                Iterator it = ((CopyOnWriteArrayList) uVar.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    com.google.android.exoplayer2.upstream.s sVar = (com.google.android.exoplayer2.upstream.s) weakReference.get();
                    if (sVar != null) {
                        sVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) uVar.c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized u f(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (e == null) {
                    e = new u(context);
                }
                uVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    @Override // vd.j
    public void a() {
        i();
    }

    @Override // vd.j
    public void b(vd.k kVar) {
        i();
    }

    public void d() {
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
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

    public v5.l e() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!h7.u.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i10 = this.a;
            sb2.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = this.a;
        boolean a2 = i11 != 0 ? h7.u.a(i11) : false;
        if (TextUtils.isEmpty((String) this.d) && !a2) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a2) {
            return new v5.l((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public int g() {
        int i10;
        synchronized (this.d) {
            i10 = this.a;
        }
        return i10;
    }

    public void h(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        g0 z10 = g0.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) z10.c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) z10.c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = s7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList p10 = z10.p(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(p10);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = m1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            z10.B();
        } catch (Throwable th2) {
            z10.B();
            throw th2;
        }
    }

    public void i() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((vd.k) this.d).iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            fArr[((Integer) fVar.a).intValue()] = fVar.c();
        }
        ((ig) this.c).run();
    }

    public void j(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = n8.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((vd.k) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th2) {
        p2.w wVar = (p2.w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.F(102, 28, p2.z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.F(95, 28, p2.z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
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
        int i10 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        p5.g gVar = p0Var.a;
        z5.l.h(gVar);
        com.google.android.gms.internal.cast.t tVar = p0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                b1 b1Var = new b1(sharedPreferences, p0Var, p0Var.c, bundle, str);
                gVar.a(new u5(b1Var));
                if (tVar == null) {
                    z0 z0Var = new z0(b1Var, 0);
                    com.google.android.gms.internal.cast.t.i.b("register callback = %s", z0Var);
                    z5.l.e("Must be called from the main thread.");
                    tVar.b.add(z0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.d dVar = p0Var.c;
        a5.j jVar = new a5.j();
        jVar.a = p0Var;
        jVar.b = dVar;
        jVar.c = str;
        jVar.e = new o4(jVar);
        gVar.a(new o4(jVar));
        if (tVar != null) {
            z0 z0Var2 = new z0(jVar, 1);
            com.google.android.gms.internal.cast.t.i.b("register callback = %s", z0Var2);
            z5.l.e("Must be called from the main thread.");
            tVar.b.add(z0Var2);
        }
        if (i10 != 1) {
        }
        b1 b1Var2 = new b1(sharedPreferences, p0Var, p0Var.c, bundle, str);
        gVar.a(new u5(b1Var2));
        if (tVar == null) {
        }
    }

    public u(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        d0.M(context, new af.c(this, 4), intentFilter);
    }

    public u() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 0;
    }
}
