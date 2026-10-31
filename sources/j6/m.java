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
import c5.c0;
import c5.s;
import c5.z;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.s5;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.e6;
import org.telegram.ui.lg;
import v7.t6;
import v7.u7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m implements OnSuccessListener, fe.l {
    public static m e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i10;
    }

    public static synchronized m j(Context context) {
        m mVar;
        synchronized (m.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new s("MessengerIpcClient")));
                    m mVar2 = new m();
                    mVar2.d = new j(mVar2);
                    mVar2.a = 1;
                    mVar2.c = unconfigurableScheduledExecutorService;
                    mVar2.b = context.getApplicationContext();
                    e = mVar2;
                }
                mVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override // fe.l
    public void a() {
        f();
    }

    @Override // fe.l
    public void b(fe.m mVar) {
        f();
    }

    public m c() {
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
            return new m((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public int d() {
        int i10 = this.a;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Looper e() {
        Looper looper;
        synchronized (this.b) {
            try {
                if (((Looper) this.c) == null) {
                    t6.p(this.a == 0 && ((HandlerThread) this.d) == null);
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

    public void f() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((fe.m) this.d).iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            fArr[((Integer) hVar.a).intValue()] = hVar.c();
        }
        ((lg) this.c).run();
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                t6.p(this.a > 0);
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
        int b10 = u7.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((fe.m) this.d).l(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void i(Throwable th2) {
        z zVar = (z) this.d;
        if (th2 instanceof TimeoutException) {
            zVar.F(zs.n1, 28, c0.p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            zVar.F(95, 28, c0.p);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
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
        d6.g gVar = o0Var.a;
        n6.l.g(gVar);
        t tVar = o0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                z0 z0Var = new z0(sharedPreferences, o0Var, o0Var.c, bundle, str);
                gVar.a(new s5(z0Var));
                if (tVar == null) {
                    x0 x0Var = new x0(z0Var, 0);
                    t.i.b("register callback = %s", x0Var);
                    n6.l.d("Must be called from the main thread.");
                    tVar.b.add(x0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.c cVar = o0Var.c;
        bh.d dVar = new bh.d();
        dVar.a = o0Var;
        dVar.b = cVar;
        dVar.c = str;
        dVar.e = new m4(dVar);
        gVar.a(new m4(dVar));
        if (tVar != null) {
            x0 x0Var2 = new x0(dVar, 1);
            t.i.b("register callback = %s", x0Var2);
            n6.l.d("Must be called from the main thread.");
            tVar.b.add(x0Var2);
        }
        if (i10 != 1) {
        }
        z0 z0Var2 = new z0(sharedPreferences, o0Var, o0Var.c, bundle, str);
        gVar.a(new s5(z0Var2));
        if (tVar == null) {
        }
    }

    public m(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        this.b = str;
        this.a = i11;
        this.c = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.d = bArr;
    }

    public m(int i10) {
        switch (i10) {
            case 5:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
            case 8:
                e6 e6Var = new e6(true, true, true);
                this.d = e6Var;
                Paint paint = new Paint(1);
                e6Var.w(i0.L(13.0f));
                e6Var.u(-1);
                e6Var.x(i0.o());
                paint.setColor(i0.b.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new t2(i0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new t2(i0.L(1.0f)), 0, 1, 0);
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
