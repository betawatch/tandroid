package j6;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c5.e0;
import c5.h0;
import c5.x;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.u5;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.internal.cast.z5;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Components.p6;
import org.telegram.ui.kg;
import v7.u6;
import w7.j6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l implements OnSuccessListener, ne.k {
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

    public static synchronized l j(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new x("MessengerIpcClient")));
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

    @Override // ne.k
    public void a() {
        f();
    }

    public l b() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!v7.k.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i10 = this.a;
            sb2.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = this.a;
        boolean a2 = i11 != 0 ? v7.k.a(i11) : false;
        if (TextUtils.isEmpty((String) this.d) && !a2) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a2) {
            return new l((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public int c() {
        int i10 = this.a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Looper d() {
        Looper looper;
        synchronized (this.b) {
            try {
                if (((Looper) this.c) == null) {
                    u6.p(this.a == 0 && ((HandlerThread) this.d) == null);
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

    @Override // ne.k
    public void e(ne.l lVar) {
        f();
    }

    public void f() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((ne.l) this.d).iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            fArr[((Integer) gVar.a).intValue()] = gVar.c();
        }
        ((kg) this.c).run();
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                u6.p(this.a > 0);
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

    public void h(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = j6.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((ne.l) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void i(Throwable th2) {
        e0 e0Var = (e0) this.d;
        if (th2 instanceof TimeoutException) {
            e0Var.F(102, 28, h0.p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            e0Var.F(95, 28, h0.p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.c).run();
    }

    public synchronized Task k(k kVar) {
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
        p0 p0Var = (p0) this.b;
        String str = (String) this.c;
        int i10 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        d6.g gVar = p0Var.a;
        n6.l.h(gVar);
        com.google.android.gms.internal.cast.u uVar = p0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                a1 a1Var = new a1(sharedPreferences, p0Var, p0Var.c, bundle, str);
                gVar.a(new u5(a1Var));
                if (uVar == null) {
                    y0 y0Var = new y0(a1Var, 0);
                    com.google.android.gms.internal.cast.u.i.b("register callback = %s", y0Var);
                    n6.l.e("Must be called from the main thread.");
                    uVar.b.add(y0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.d dVar = p0Var.c;
        z5 z5Var = new z5();
        z5Var.b = p0Var;
        z5Var.c = dVar;
        z5Var.a = str;
        z5Var.e = new o4(z5Var);
        gVar.a(new o4(z5Var));
        if (uVar != null) {
            y0 y0Var2 = new y0(z5Var, 1);
            com.google.android.gms.internal.cast.u.i.b("register callback = %s", y0Var2);
            n6.l.e("Must be called from the main thread.");
            uVar.b.add(y0Var2);
        }
        if (i10 != 1) {
        }
        a1 a1Var2 = new a1(sharedPreferences, p0Var, p0Var.c, bundle, str);
        gVar.a(new u5(a1Var2));
        if (uVar == null) {
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i10;
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
            case 5:
                p6 p6Var = new p6(true, true, true);
                this.d = p6Var;
                Paint paint = new Paint(1);
                p6Var.w(AndroidUtilities.dp(13.0f));
                p6Var.u(-1);
                p6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new o2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new o2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                break;
            case 6:
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
            case 7:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
        }
    }
}
