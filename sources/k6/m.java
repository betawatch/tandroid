package k6;

import a8.me;
import a8.pf;
import a8.yb;
import a8.z0;
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
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.r5;
import com.google.android.gms.internal.cast.s;
import com.google.android.gms.internal.cast.v0;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d5.b0;
import d5.e0;
import d5.v;
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
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Components.r6;
import org.telegram.ui.ig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m implements OnSuccessListener, oe.k {
    public static m e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public m(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i10;
        this.d = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public static synchronized m j(Context context) {
        m mVar;
        synchronized (m.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v("MessengerIpcClient")));
                    m mVar2 = new m();
                    mVar2.d = new k(mVar2);
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

    @Override // oe.k
    public void a() {
        f();
    }

    @Override // oe.k
    public void b(oe.l lVar) {
        f();
    }

    public m c() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!z0.b(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i10 = this.a;
            sb2.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = this.a;
        boolean a2 = i11 != 0 ? z0.a(i11) : false;
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
                    yb.p(this.a == 0 && ((HandlerThread) this.d) == null);
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
        Iterator it = ((oe.l) this.d).iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            fArr[((Integer) gVar.a).intValue()] = gVar.c();
        }
        ((ig) this.c).run();
    }

    public void g() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                yb.p(this.a > 0);
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
        int b10 = pf.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((oe.l) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void i(Throwable th2) {
        b0 b0Var = (b0) this.d;
        if (th2 instanceof TimeoutException) {
            b0Var.F(102, 28, e0.p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            b0Var.F(95, 28, e0.p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.c).run();
    }

    public synchronized Task k(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.d).d(lVar)) {
                k kVar = new k(this);
                this.d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar.b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        m0 m0Var = (m0) this.b;
        String str = (String) this.c;
        int i10 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        e6.g gVar = m0Var.a;
        o6.l.h(gVar);
        s sVar = m0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                x0 x0Var = new x0(sharedPreferences, m0Var, m0Var.c, bundle, str);
                gVar.a(new r5(x0Var));
                if (sVar == null) {
                    v0 v0Var = new v0(x0Var, 0);
                    s.i.b("register callback = %s", v0Var);
                    o6.l.e("Must be called from the main thread.");
                    sVar.b.add(v0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.c cVar = m0Var.c;
        me meVar = new me();
        meVar.a = m0Var;
        meVar.b = cVar;
        meVar.c = str;
        meVar.e = new l4(meVar);
        gVar.a(new l4(meVar));
        if (sVar != null) {
            v0 v0Var2 = new v0(meVar, 1);
            s.i.b("register callback = %s", v0Var2);
            o6.l.e("Must be called from the main thread.");
            sVar.b.add(v0Var2);
        }
        if (i10 != 1) {
        }
        x0 x0Var2 = new x0(sharedPreferences, m0Var, m0Var.c, bundle, str);
        gVar.a(new r5(x0Var2));
        if (sVar == null) {
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i10;
    }

    public m(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
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

    public m(int i10) {
        switch (i10) {
            case 6:
                r6 r6Var = new r6(true, true, true);
                this.d = r6Var;
                Paint paint = new Paint(1);
                r6Var.w(AndroidUtilities.dp(13.0f));
                r6Var.u(-1);
                r6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
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
