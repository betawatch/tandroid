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
import c5.d0;
import c5.w;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.u5;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.q6;
import org.telegram.ui.tg;
import w7.g0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l implements OnSuccessListener, me.k {
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

    public static float[] g(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            fArr[i10] = dataInputStream.readFloat();
        }
        return fArr;
    }

    public static synchronized l k(Context context) {
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

    @Override // me.k
    public void a() {
        f();
    }

    public l b() {
        if (TextUtils.isEmpty((String) this.b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!te.b.c(this.a)) {
            StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append(": ");
            int i10 = this.a;
            sb2.append(i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = this.a;
        boolean b10 = i11 != 0 ? te.b.b(i11) : false;
        if (TextUtils.isEmpty((String) this.d) && !b10) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty((String) this.d) || !b10) {
            return new l((String) this.b, (String) this.c, (String) this.d, this.a);
        }
        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
    }

    @Override // me.k
    public void c(me.l lVar) {
        f();
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

    public void f() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((me.l) this.d).iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            fArr[((Integer) gVar.a).intValue()] = gVar.c();
        }
        ((tg) this.c).run();
    }

    public void h() {
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

    public void i(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b10 = g0.b(this.a, 1 << i10, z10);
        this.a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((me.l) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        d0 d0Var = (d0) this.d;
        if (th2 instanceof TimeoutException) {
            d0Var.F(102, 28, c5.g0.p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            d0Var.F(95, 28, c5.g0.p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.c).run();
    }

    public synchronized Task l(k kVar) {
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
        ci.u5 u5Var = new ci.u5();
        u5Var.a = p0Var;
        u5Var.b = dVar;
        u5Var.c = str;
        u5Var.e = new o4(u5Var);
        gVar.a(new o4(u5Var));
        if (uVar != null) {
            y0 y0Var2 = new y0(u5Var, 1);
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:5:0x0017, B:6:0x003b, B:8:0x003f, B:11:0x004a, B:13:0x005d, B:15:0x006c, B:18:0x0070, B:19:0x0074, B:21:0x007c, B:24:0x0080, B:25:0x0084, B:27:0x008e), top: B:4:0x0017, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Context context, String str) {
        float f7;
        int i10;
        int i11;
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(context.getAssets().open(str), 16384));
            try {
                float[] g10 = g(dataInputStream);
                float[] g11 = g(dataInputStream);
                float[] g12 = g(dataInputStream);
                int readInt = dataInputStream.readInt();
                this.a = readInt;
                int i12 = readInt * 3;
                this.b = new float[i12];
                this.c = new float[readInt * 2];
                this.d = new float[i12];
                for (int i13 = 0; i13 < this.a; i13++) {
                    int readInt2 = dataInputStream.readInt() * 3;
                    for (int i14 = 0; i14 < 3; i14++) {
                        ((float[]) this.d)[(i13 * 3) + i14] = g10[readInt2 + i14] * 1.0f;
                    }
                    int readInt3 = dataInputStream.readInt() * 2;
                    float[] fArr = (float[]) this.c;
                    int i15 = i13 * 2;
                    float f10 = 0.0f;
                    if (readInt3 >= 0 && readInt3 < g11.length) {
                        f7 = g11[readInt3];
                        fArr[i15] = f7;
                        i10 = readInt3 + 1;
                        int i16 = i15 + 1;
                        if (i10 >= 0 && i10 < g11.length) {
                            f10 = 1.0f - g11[i10];
                        }
                        fArr[i16] = f10;
                        int readInt4 = dataInputStream.readInt() * 3;
                        for (i11 = 0; i11 < 3; i11++) {
                            ((float[]) this.b)[(i13 * 3) + i11] = g12[readInt4 + i11];
                        }
                    }
                    f7 = 0.0f;
                    fArr[i15] = f7;
                    i10 = readInt3 + 1;
                    int i162 = i15 + 1;
                    if (i10 >= 0) {
                        f10 = 1.0f - g11[i10];
                    }
                    fArr[i162] = f10;
                    int readInt42 = dataInputStream.readInt() * 3;
                    while (i11 < 3) {
                    }
                }
                dataInputStream.close();
            } finally {
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public l(int i10) {
        switch (i10) {
            case 2:
                this.b = null;
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
            case 8:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
            default:
                q6 q6Var = new q6(true, true, true);
                this.d = q6Var;
                Paint paint = new Paint(1);
                q6Var.w(AndroidUtilities.dp(13.0f));
                q6Var.u(-1);
                q6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                break;
        }
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
}
