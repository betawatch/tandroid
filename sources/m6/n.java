package m6;

import a8.ia;
import a8.k1;
import a8.r7;
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
import c8.zc;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.q5;
import com.google.android.gms.internal.cast.s;
import com.google.android.gms.internal.cast.v0;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import f5.r;
import f5.w;
import f5.z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.i6;
import org.telegram.ui.xf;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n implements OnSuccessListener, te.i {
    public static n e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i7) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i7;
    }

    public static synchronized n i(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new r("MessengerIpcClient")));
                    n nVar2 = new n();
                    nVar2.d = new l(nVar2);
                    nVar2.a = 1;
                    nVar2.c = unconfigurableScheduledExecutorService;
                    nVar2.b = context.getApplicationContext();
                    e = nVar2;
                }
                nVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // te.i
    public void a() {
        e();
    }

    public n b() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!k1.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i7 = this.a;
            sb2.append(i7 != 15 ? i7 != 255 ? i7 != 32768 ? i7 != 32783 ? i7 != 33023 ? String.valueOf(i7) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i10 = this.a;
        boolean a10 = i10 != 0 ? k1.a(i10) : false;
        if (TextUtils.isEmpty((String) this.d) && !a10) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a10) {
            return new n((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public int c() {
        int i7 = this.a;
        if (i7 != 2) {
            return i7 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Looper d() {
        Looper looper;
        synchronized (this.b) {
            try {
                if (((Looper) this.c) == null) {
                    ia.p(this.a == 0 && ((HandlerThread) this.d) == null);
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

    public void e() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((te.j) this.d).iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            fArr[((Integer) eVar.a).intValue()] = eVar.c();
        }
        ((xf) this.c).run();
    }

    @Override // te.i
    public void f(te.j jVar) {
        e();
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                ia.p(this.a > 0);
                int i7 = this.a - 1;
                this.a = i7;
                if (i7 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i7, boolean z9, boolean z10) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = zc.b(this.a, 1 << i7, z9);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((te.j) this.d).f(Integer.valueOf(numberOfLeadingZeros2), z10);
        }
    }

    public void j(Throwable th2) {
        w wVar = (w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.F(qs.n1, 28, z.p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.F(95, 28, z.p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.c).run();
    }

    public synchronized Task k(m mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(mVar.toString()));
            }
            if (!((l) this.d).a(mVar)) {
                l lVar = new l(this);
                this.d = lVar;
                lVar.a(mVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        m0 m0Var = (m0) this.b;
        String str = (String) this.c;
        int i7 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        g6.g gVar = m0Var.a;
        q6.m.g(gVar);
        s sVar = m0Var.b;
        if (i7 != 3) {
            if (i7 == 2) {
                i7 = 2;
            }
            if (i7 != 1 || i7 == 2) {
                x0 x0Var = new x0(sharedPreferences, m0Var, m0Var.c, bundle, str);
                gVar.a(new q5(x0Var));
                if (sVar == null) {
                    v0 v0Var = new v0(x0Var, 0);
                    s.i.b("register callback = %s", v0Var);
                    q6.m.d("Must be called from the main thread.");
                    sVar.b.add(v0Var);
                    return;
                }
                return;
            }
            return;
        }
        r7 r7Var = new r7(m0Var, m0Var.c, str);
        gVar.a(new l4(r7Var));
        if (sVar != null) {
            v0 v0Var2 = new v0(r7Var, 1);
            s.i.b("register callback = %s", v0Var2);
            q6.m.d("Must be called from the main thread.");
            sVar.b.add(v0Var2);
        }
        if (i7 != 1) {
        }
        x0 x0Var2 = new x0(sharedPreferences, m0Var, m0Var.c, bundle, str);
        gVar.a(new q5(x0Var2));
        if (sVar == null) {
        }
    }

    public n(int i7, String str, int i10, ArrayList arrayList, byte[] bArr) {
        this.b = str;
        this.a = i10;
        this.c = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.d = bArr;
    }

    public n(int i7) {
        switch (i7) {
            case 4:
                i6 i6Var = new i6(true, true, true);
                this.d = i6Var;
                Paint paint = new Paint(1);
                i6Var.w(g0.L(13.0f));
                i6Var.u(-1);
                i6Var.x(g0.o());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                break;
            case 7:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
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
