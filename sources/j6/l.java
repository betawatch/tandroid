package j6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import bi.u6;
import c5.d0;
import c5.g0;
import c5.w;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.cast.w5;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import m.c3;
import m.e3;
import m.l1;
import m.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.n6;
import org.telegram.ui.vg;
import r0.i0;
import v7.v7;
import w7.c0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l implements OnSuccessListener, le.k {
    public static l e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public l(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i10;
        this.d = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public static synchronized l l(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new w("MessengerIpcClient")));
                    l lVar2 = new l();
                    lVar2.d = new j(lVar2);
                    lVar2.a = 1;
                    lVar2.c = unconfigurableScheduledExecutorService;
                    lVar2.b = context.getApplicationContext();
                    e = lVar2;
                }
                lVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override // le.k
    public void a() {
        h();
    }

    public void b() {
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
                if (((c3) this.d) == null) {
                    this.d = new c3();
                }
                c3 c3Var = (c3) this.d;
                c3Var.c = null;
                c3Var.b = false;
                c3Var.d = null;
                c3Var.a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    c3Var.b = true;
                    c3Var.c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    c3Var.a = true;
                    c3Var.d = imageTintMode;
                }
                if (c3Var.b || c3Var.a) {
                    q.d(drawable, c3Var, imageView.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.c;
            if (c3Var2 != null) {
                q.d(drawable, c3Var2, imageView.getDrawableState());
            }
        }
    }

    public l c() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!v7.m.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i10 = this.a;
            sb2.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = this.a;
        boolean a2 = i11 != 0 ? v7.m.a(i11) : false;
        if (TextUtils.isEmpty((String) this.d) && !a2) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (!TextUtils.isEmpty((String) this.d) && a2) {
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
        }
        String str = (String) this.b;
        String str2 = (String) this.c;
        String str3 = (String) this.d;
        int i12 = this.a;
        l lVar = new l();
        lVar.b = str;
        lVar.c = str2;
        lVar.d = str3;
        lVar.a = i12;
        return lVar;
    }

    public int d() {
        int i10 = this.a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // le.k
    public void e(le.l lVar) {
        h();
    }

    public void f(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f;
        e3 P = e3.P(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) P.c;
        i0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) P.c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = v7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                l1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList C = P.C(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(C);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = l1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            P.Q();
        } catch (Throwable th2) {
            P.Q();
            throw th2;
        }
    }

    public Looper g() {
        Looper looper;
        synchronized (this.b) {
            try {
                if (((Looper) this.c) == null) {
                    e2.d.g(this.a == 0 && ((HandlerThread) this.d) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.c = ((HandlerThread) this.d).getLooper();
                }
                this.a++;
                looper = (Looper) this.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void h() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((le.l) this.d).iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            fArr[((Integer) gVar.a).intValue()] = gVar.c();
        }
        ((vg) this.c).run();
    }

    public void i() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                e2.d.g(this.a > 0);
                int i10 = this.a - 1;
                this.a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = c0.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((le.l) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th2) {
        d0 d0Var = (d0) this.d;
        if (th2 instanceof TimeoutException) {
            d0Var.F(102, 28, g0.p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            d0Var.F(95, 28, g0.p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.c).run();
    }

    public synchronized Task m(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.d).d(kVar)) {
                j jVar = new j(this);
                this.d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        r0 r0Var = (r0) this.b;
        String str = (String) this.c;
        int i10 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        d6.g gVar = r0Var.a;
        n6.l.h(gVar);
        com.google.android.gms.internal.cast.u uVar = r0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                c1 c1Var = new c1(sharedPreferences, r0Var, r0Var.c, bundle, str);
                gVar.a(new w5(c1Var));
                if (uVar == null) {
                    a1 a1Var = new a1(c1Var, 0);
                    com.google.android.gms.internal.cast.u.i.b("register callback = %s", a1Var);
                    n6.l.e("Must be called from the main thread.");
                    uVar.b.add(a1Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.d dVar = r0Var.c;
        u6 u6Var = new u6();
        u6Var.a = r0Var;
        u6Var.b = dVar;
        u6Var.c = str;
        u6Var.e = new q4(u6Var);
        gVar.a(new q4(u6Var));
        if (uVar != null) {
            a1 a1Var2 = new a1(u6Var, 1);
            com.google.android.gms.internal.cast.u.i.b("register callback = %s", a1Var2);
            n6.l.e("Must be called from the main thread.");
            uVar.b.add(a1Var2);
        }
        if (i10 != 1) {
        }
        c1 c1Var2 = new c1(sharedPreferences, r0Var, r0Var.c, bundle, str);
        gVar.a(new w5(c1Var2));
        if (uVar == null) {
        }
    }

    public l(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public l(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.b = str;
        this.a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    public l(int i10) {
        switch (i10) {
            case 7:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
            case 11:
                n6 n6Var = new n6(true, true, true, false);
                this.d = n6Var;
                Paint paint = new Paint(1);
                n6Var.t(AndroidUtilities.dp(13.0f));
                n6Var.r(-1);
                n6Var.u(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
        }
    }
}
