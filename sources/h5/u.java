package h5;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.t5;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import k7.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Components.j6;
import org.telegram.ui.pg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u implements OnSuccessListener, xd.i {
    public static u e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public u(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new androidx.mediarouter.app.h(this, 6), intentFilter);
    }

    public static void b(u uVar, int i10) {
        synchronized (uVar.d) {
            try {
                if (uVar.a == i10) {
                    return;
                }
                uVar.a = i10;
                Iterator it = ((CopyOnWriteArrayList) uVar.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    g5.r rVar = (g5.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) uVar.c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized u d(Context context) {
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

    @Override // xd.i
    public void a() {
        g();
    }

    public x5.k c() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!com.google.android.gms.internal.cast.n.b(this.a)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            int i10 = this.a;
            sb.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        int i11 = this.a;
        boolean a2 = i11 != 0 ? com.google.android.gms.internal.cast.n.a(i11) : false;
        if (TextUtils.isEmpty((String) this.d) && !a2) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !a2) {
            return new x5.k((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    @Override // xd.i
    public void e(xd.j jVar) {
        g();
    }

    public int f() {
        int i10;
        synchronized (this.d) {
            i10 = this.a;
        }
        return i10;
    }

    public void g() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((xd.j) this.d).iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            fArr[((Integer) eVar.a).intValue()] = eVar.c();
        }
        ((pg) this.c).run();
    }

    public void h(int i10, boolean z4, boolean z10) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = w8.b(this.a, 1 << i10, z4);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((xd.j) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z10);
        }
    }

    public void i(Throwable th2) {
        p2.y yVar = (p2.y) this.d;
        if (th2 instanceof TimeoutException) {
            yVar.F(102, 28, p2.b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            yVar.F(95, 28, p2.b0.p);
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
        o0 o0Var = (o0) this.b;
        String str = (String) this.c;
        int i10 = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        r5.g gVar = o0Var.a;
        b6.m.h(gVar);
        com.google.android.gms.internal.cast.s sVar = o0Var.b;
        if (i10 != 3) {
            if (i10 == 2) {
                i10 = 2;
            }
            if (i10 != 1 || i10 == 2) {
                a1 a1Var = new a1(sharedPreferences, o0Var, o0Var.c, bundle, str);
                gVar.a(new t5(a1Var));
                if (sVar == null) {
                    y0 y0Var = new y0(a1Var, 0);
                    com.google.android.gms.internal.cast.s.i.b("register callback = %s", y0Var);
                    b6.m.e("Must be called from the main thread.");
                    sVar.b.add(y0Var);
                    return;
                }
                return;
            }
            return;
        }
        com.google.android.gms.internal.cast.c cVar = o0Var.c;
        c5.j jVar = new c5.j();
        jVar.a = o0Var;
        jVar.b = cVar;
        jVar.c = str;
        jVar.e = new o4(jVar);
        gVar.a(new o4(jVar));
        if (sVar != null) {
            y0 y0Var2 = new y0(jVar, 1);
            com.google.android.gms.internal.cast.s.i.b("register callback = %s", y0Var2);
            b6.m.e("Must be called from the main thread.");
            sVar.b.add(y0Var2);
        }
        if (i10 != 1) {
        }
        a1 a1Var2 = new a1(sharedPreferences, o0Var, o0Var.c, bundle, str);
        gVar.a(new t5(a1Var2));
        if (sVar == null) {
        }
    }

    public u(int i10) {
        switch (i10) {
            case 3:
                j6 j6Var = new j6(true, true, true, false);
                this.d = j6Var;
                Paint paint = new Paint(1);
                j6Var.t(AndroidUtilities.dp(13.0f));
                j6Var.r(-1);
                j6Var.u(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new o2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new o2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
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
