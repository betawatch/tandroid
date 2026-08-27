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
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.s5;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.tasks.OnSuccessListener;
import g7.o7;
import h7.a8;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import m.f3;
import m.m1;
import org.telegram.ui.lg;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x implements OnSuccessListener, ud.i {
    public static x e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public x(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public static void a(x xVar, int i10) {
        synchronized (xVar.d) {
            try {
                if (xVar.a == i10) {
                    return;
                }
                xVar.a = i10;
                Iterator it = ((CopyOnWriteArrayList) xVar.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    com.google.android.exoplayer2.upstream.s sVar = (com.google.android.exoplayer2.upstream.s) weakReference.get();
                    if (sVar != null) {
                        sVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) xVar.c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized x f(Context context) {
        x xVar;
        synchronized (x.class) {
            try {
                if (e == null) {
                    e = new x(context);
                }
                xVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    @Override // ud.i
    public void b() {
        i();
    }

    @Override // ud.i
    public void c(ud.j jVar) {
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

    public u5.k e() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!r1.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i10 = this.a;
            sb2.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = this.a;
        boolean a2 = i11 != 0 ? r1.a(i11) : false;
        if (TextUtils.isEmpty((String) this.d) && !a2) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a2) {
            return new u5.k((String) this.b, (String) this.c, (String) this.d, this.a);
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
        j9.a G = j9.a.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) G.c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) G.c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = o7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList x8 = G.x(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(x8);
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
            G.I();
        } catch (Throwable th) {
            G.I();
            throw th;
        }
    }

    public void i() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((ud.j) this.d).iterator();
        while (it.hasNext()) {
            ud.e eVar = (ud.e) it.next();
            fArr[((Integer) eVar.a).intValue()] = eVar.c();
        }
        ((lg) this.c).run();
    }

    public void j(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = a8.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((ud.j) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th) {
        n2.x xVar = (n2.x) this.d;
        if (th instanceof TimeoutException) {
            xVar.F(102, 28, n2.a0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            xVar.F(95, 28, n2.a0.p);
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
        o0 o0Var = (o0) this.b;
        String str = (String) this.c;
        int i10 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        n5.h hVar = o0Var.a;
        y5.l.h(hVar);
        com.google.android.gms.internal.cast.s sVar = o0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                z0 z0Var = new z0(sharedPreferences, o0Var, o0Var.c, bundle, str);
                hVar.a(new s5(z0Var));
                if (sVar == null) {
                    x0 x0Var = new x0(z0Var, 0);
                    com.google.android.gms.internal.cast.s.i.b("register callback = %s", x0Var);
                    y5.l.e("Must be called from the main thread.");
                    sVar.b.add(x0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.d dVar = o0Var.c;
        af.h hVar2 = new af.h();
        hVar2.a = o0Var;
        hVar2.b = dVar;
        hVar2.c = str;
        hVar2.e = new m4(hVar2);
        hVar.a(new m4(hVar2));
        if (sVar != null) {
            x0 x0Var2 = new x0(hVar2, 1);
            com.google.android.gms.internal.cast.s.i.b("register callback = %s", x0Var2);
            y5.l.e("Must be called from the main thread.");
            sVar.b.add(x0Var2);
        }
        if (i10 != 1) {
        }
        z0 z0Var2 = new z0(sharedPreferences, o0Var, o0Var.c, bundle, str);
        hVar.a(new s5(z0Var2));
        if (sVar == null) {
        }
    }

    public x(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        g0.M(context, new androidx.mediarouter.app.f(this, 3), intentFilter);
    }

    public x() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 0;
    }
}
