package l6;

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
import b8.k0;
import b8.ke;
import b8.zb;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.r5;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.cast.w0;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e5.r;
import e5.w;
import e5.z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.g6;
import org.telegram.ui.tf;
import x7.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements OnSuccessListener, qe.i {
    public static n e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i3;
    }

    public static synchronized n i(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new r("MessengerIpcClient")));
                    n nVar2 = new n();
                    nVar2.d = new k(nVar2);
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

    @Override // qe.i
    public void a() {
        f();
    }

    @Override // qe.i
    public void b(qe.j jVar) {
        f();
    }

    public n c() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!k0.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i3 = this.a;
            sb2.append(i3 != 15 ? i3 != 255 ? i3 != 32768 ? i3 != 32783 ? i3 != 33023 ? String.valueOf(i3) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i10 = this.a;
        boolean a10 = i10 != 0 ? k0.a(i10) : false;
        if (TextUtils.isEmpty((String) this.d) && !a10) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a10) {
            return new n((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    public int d() {
        int i3 = this.a;
        if (i3 != 2) {
            return i3 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Looper e() {
        Looper looper;
        synchronized (this.b) {
            try {
                if (((Looper) this.c) == null) {
                    zb.p(this.a == 0 && ((HandlerThread) this.d) == null);
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
        Iterator it = ((qe.j) this.d).iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            fArr[((Integer) eVar.a).intValue()] = eVar.c();
        }
        ((tf) this.c).run();
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                zb.p(this.a > 0);
                int i3 = this.a - 1;
                this.a = i3;
                if (i3 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i3, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = u.b(this.a, 1 << i3, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((qe.j) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        w wVar = (w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.F(hs.n1, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.F(95, 28, z.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.c).run();
    }

    public synchronized Task k(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.d).a(lVar)) {
                k kVar = new k(this);
                this.d = kVar;
                kVar.a(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        n0 n0Var = (n0) this.b;
        String str = (String) this.c;
        int i3 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        f6.g gVar = n0Var.a;
        p6.m.g(gVar);
        t tVar = n0Var.b;
        if (i3 != 3) {
            if (i3 == 2) {
                i3 = 2;
            }
            if (i3 != 1 || i3 == 2) {
                y0 y0Var = new y0(sharedPreferences, n0Var, n0Var.c, bundle, str);
                gVar.a(new r5(y0Var));
                if (tVar == null) {
                    w0 w0Var = new w0(y0Var, 0);
                    t.i.b("register callback = %s", w0Var);
                    p6.m.d("Must be called from the main thread.");
                    tVar.b.add(w0Var);
                    return;
                }
                return;
            }
            return;
        }
        ke keVar = new ke(n0Var, n0Var.c, str);
        gVar.a(new m4(keVar));
        if (tVar != null) {
            w0 w0Var2 = new w0(keVar, 1);
            t.i.b("register callback = %s", w0Var2);
            p6.m.d("Must be called from the main thread.");
            tVar.b.add(w0Var2);
        }
        if (i3 != 1) {
        }
        y0 y0Var2 = new y0(sharedPreferences, n0Var, n0Var.c, bundle, str);
        gVar.a(new r5(y0Var2));
        if (tVar == null) {
        }
    }

    public n(int i3, String str, int i10, ArrayList arrayList, byte[] bArr) {
        this.b = str;
        this.a = i10;
        this.c = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.d = bArr;
    }

    public n(int i3) {
        switch (i3) {
            case 5:
                g6 g6Var = new g6(true, true, true);
                this.d = g6Var;
                Paint paint = new Paint(1);
                g6Var.w(g0.L(13.0f));
                g6Var.u(-1);
                g6Var.x(g0.o());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                break;
            case 6:
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
