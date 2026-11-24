// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class igf implements j79, OnSuccessListener {
    public static igf e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public igf(byte b) {
        switch (b) {
            case 3:
                gn gnVar = new gn(true, true, true);
                this.d = gnVar;
                Paint paint = new Paint(1);
                gnVar.w(gl.L(13.0f));
                gnVar.u(-1);
                gnVar.x(gl.o());
                paint.setColor(bm2.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new se3(gl.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new se3(gl.L(1.0f)), 0, 1, 0);
                break;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                this.a = 0;
                break;
        }
    }

    public static synchronized igf t(Context context) {
        igf igfVar;
        synchronized (igf.class) {
            igfVar = e;
            if (igfVar == null) {
                igfVar = new igf(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new kn7("MessengerIpcClient"))));
                e = igfVar;
            }
        }
        return igfVar;
    }

    public final igf a(w4a w4aVar) {
        byte b;
        w4aVar.getClass();
        lu5 lu5Var = (lu5) this.b;
        uyc b2 = lye.b(lu5Var, w4aVar);
        cyb cybVar = (cyb) this.d;
        kp kpVar = (kp) cybVar.c;
        int i = kpVar.b + 1;
        kpVar.b = i;
        Object[] objArr = (Object[]) kpVar.c;
        if (i == objArr.length) {
            int i2 = i << 1;
            kpVar.c = Arrays.copyOf(objArr, i2);
            kpVar.d = Arrays.copyOf((int[]) kpVar.d, i2);
        }
        ((Object[]) kpVar.c)[i] = w4aVar;
        cybVar.h(b2.a);
        String str = (String) cybVar.f;
        int i3 = cybVar.b;
        while (true) {
            int r = cybVar.r(i3);
            b = 10;
            if (r == -1) {
                cybVar.b = r;
                break;
            }
            char charAt = str.charAt(r);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                cybVar.b = r;
                b = ukd.a(charAt);
                break;
            }
            i3 = r + 1;
        }
        if (b != 4) {
            int ordinal = b2.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new igf(lu5Var, b2, cybVar, w4aVar) : ((uyc) this.c) == b2 ? this : new igf(lu5Var, b2, cybVar, w4aVar);
        }
        cyb.m(cybVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public final int b(w4a w4aVar) {
        lu5 lu5Var = (lu5) this.b;
        cyb cybVar = (cyb) this.d;
        w4aVar.getClass();
        uyc uycVar = (uyc) this.c;
        int ordinal = uycVar.ordinal();
        boolean z = false;
        byte b = 2;
        int i = -1;
        if (ordinal == 0) {
            boolean u = cybVar.u();
            if (cybVar.e()) {
                String g = cybVar.g();
                cybVar.h(':');
                w4aVar.getClass();
                g.getClass();
                kad.a(lu5Var, w4aVar);
                int d = w4aVar.d(g);
                if (d != -3) {
                    i = d;
                } else {
                    i4d i4dVar = lu5Var.c;
                    x13 x13Var = new x13(w4aVar, lu5Var, b);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i4dVar.a;
                    Map map = (Map) concurrentHashMap.get(w4aVar);
                    pd5 pd5Var = kad.a;
                    Object obj = map != null ? map.get(pd5Var) : null;
                    if (obj == null) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = x13Var.invoke();
                        Object obj2 = concurrentHashMap.get(w4aVar);
                        if (obj2 == null) {
                            obj2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(w4aVar, obj2);
                        }
                        ((Map) obj2).put(pd5Var, obj);
                    }
                    Integer num = (Integer) ((Map) obj).get(g);
                    i = num != null ? num.intValue() : -3;
                }
                if (i == -3) {
                    String obj3 = ((String) cybVar.f).subSequence(0, cybVar.b).toString();
                    obj3.getClass();
                    cybVar.l(obj3.lastIndexOf(g, obj3.length() - 1), "Encountered an unknown key '" + g + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
            } else if (u) {
                ple.a(cybVar, "object");
                throw null;
            }
        } else if (ordinal != 2) {
            boolean u2 = cybVar.u();
            if (cybVar.e()) {
                int i2 = this.a;
                if (i2 != -1 && !u2) {
                    cyb.m(cybVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i = i2 + 1;
                this.a = i;
            } else if (u2) {
                ple.a(cybVar, "array");
                throw null;
            }
        } else {
            int i3 = this.a;
            boolean z2 = i3 % 2 != 0;
            if (!z2) {
                cybVar.h(':');
            } else if (i3 != -1) {
                z = cybVar.u();
            }
            if (cybVar.e()) {
                if (z2) {
                    int i4 = this.a;
                    int i5 = cybVar.b;
                    if (i4 == -1) {
                        if (z) {
                            cyb.m(cybVar, "Unexpected leading comma", i5, 4);
                            throw null;
                        }
                    } else if (!z) {
                        cyb.m(cybVar, "Expected comma after the key-value pair", i5, 4);
                        throw null;
                    }
                }
                i = this.a + 1;
                this.a = i;
            } else if (z) {
                ple.a(cybVar, "object");
                throw null;
            }
        }
        if (uycVar != uyc.e) {
            kp kpVar = (kp) cybVar.c;
            ((int[]) kpVar.d)[kpVar.b] = i;
        }
        return i;
    }

    @Override // j79
    public final void c() {
        q();
    }

    public final int d() {
        cyb cybVar = (cyb) this.d;
        long i = cybVar.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        cyb.m(cybVar, "Failed to parse int for input '" + i + '\'', 0, 6);
        throw null;
    }

    public final int e(w4a w4aVar, int i) {
        w4aVar.getClass();
        return d();
    }

    @Override // j79
    public final void f(k79 k79Var) {
        q();
    }

    public final long g() {
        return ((cyb) this.d).i();
    }

    public final long h(w4a w4aVar, int i) {
        w4aVar.getClass();
        return g();
    }

    public final boolean i() {
        boolean z;
        cyb cybVar = (cyb) this.d;
        int r = cybVar.r(cybVar.t());
        String str = (String) cybVar.f;
        int length = str.length() - r;
        if (length >= 4 && r != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != str.charAt(r + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || ukd.a(str.charAt(r + 4)) != 0) {
                    cybVar.b = r + 4;
                    z = true;
                }
            }
        }
        z = false;
        return !z;
    }

    public final Object j(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        w4aVar.getClass();
        cv5Var.getClass();
        if (cv5Var.d().c() || i()) {
            return l(cv5Var);
        }
        return null;
    }

    public final Object k(w4a w4aVar, int i, cv5 cv5Var, Object obj) {
        kp kpVar = (kp) ((cyb) this.d).c;
        w4aVar.getClass();
        cv5Var.getClass();
        boolean z = ((uyc) this.c) == uyc.e && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) kpVar.d;
            int i2 = kpVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) kpVar.c)[i2] = ie7.c;
            }
        }
        Object l = l(cv5Var);
        if (z) {
            int[] iArr2 = (int[]) kpVar.d;
            int i3 = kpVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                kpVar.b = i4;
                Object[] objArr = (Object[]) kpVar.c;
                if (i4 == objArr.length) {
                    int i5 = i4 << 1;
                    kpVar.c = Arrays.copyOf(objArr, i5);
                    iArr2 = Arrays.copyOf((int[]) kpVar.d, i5);
                    kpVar.d = iArr2;
                }
            }
            Object[] objArr2 = (Object[]) kpVar.c;
            int i6 = kpVar.b;
            objArr2[i6] = l;
            iArr2[i6] = -2;
        }
        return l;
    }

    public final Object l(cv5 cv5Var) {
        cv5Var.getClass();
        try {
            return cv5Var.c(this);
        } catch (zd7 e2) {
            String message = e2.getMessage();
            message.getClass();
            if (f9b.f(0, 2, message, "at path") >= 0) {
                throw e2;
            }
            throw new zd7(e2.a, e2.getMessage() + " at path: " + ((kp) ((cyb) this.d).c).m(), e2);
        }
    }

    public final String m() {
        return ((cyb) this.d).j();
    }

    public final String n(w4a w4aVar, int i) {
        w4aVar.getClass();
        return m();
    }

    public final void o(w4a w4aVar) {
        cyb cybVar = (cyb) this.d;
        w4aVar.getClass();
        if (cybVar.u()) {
            ple.a(cybVar, "");
            throw null;
        }
        cybVar.h(((uyc) this.c).b);
        kp kpVar = (kp) cybVar.c;
        int i = kpVar.b;
        int[] iArr = (int[]) kpVar.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            kpVar.b = i;
        }
        if (i != -1) {
            kpVar.b = i - 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSuccess(Object obj) {
        h6e h6eVar = (h6e) this.b;
        String str = (String) this.c;
        int i = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        j6a j6aVar = h6eVar.a;
        fre.h(j6aVar);
        ydd yddVar = h6eVar.b;
        byte b = 2;
        if (i != 3) {
            if (i == 2) {
                i = 2;
            }
            if (i != 1 || i == 2) {
                ese eseVar = new ese(sharedPreferences, h6eVar, h6eVar.c, bundle, str);
                j6aVar.a(new e6e(eseVar, b));
                if (yddVar == null) {
                    yme ymeVar = new yme(eseVar, (byte) 0);
                    ydd.i.b("register callback = %s", ymeVar);
                    fre.e("Must be called from the main thread.");
                    yddVar.b.add(ymeVar);
                    return;
                }
                return;
            }
            return;
        }
        gl2 gl2Var = new gl2(h6eVar, h6eVar.c, str);
        j6aVar.a(new g6e((Object) gl2Var, (byte) 4));
        if (yddVar != null) {
            yme ymeVar2 = new yme(gl2Var, (byte) 1);
            ydd.i.b("register callback = %s", ymeVar2);
            fre.e("Must be called from the main thread.");
            yddVar.b.add(ymeVar2);
        }
        if (i != 1) {
        }
        ese eseVar2 = new ese(sharedPreferences, h6eVar, h6eVar.c, bundle, str);
        j6aVar.a(new e6e(eseVar2, b));
        if (yddVar == null) {
        }
    }

    public final Looper p() {
        Looper looper;
        synchronized (this.b) {
            looper = (Looper) this.c;
            if (looper == null) {
                gre.p(this.a == 0 && ((HandlerThread) this.d) == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.d = handlerThread;
                handlerThread.start();
                looper = ((HandlerThread) this.d).getLooper();
                this.c = looper;
            }
            this.a++;
        }
        return looper;
    }

    public final void q() {
        float[] fArr = (float[]) this.b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((k79) this.d).iterator();
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            fArr[((Integer) u46Var.a).intValue()] = u46Var.c();
        }
        ((vm1) this.c).run();
    }

    public final void r() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            gre.p(this.a > 0);
            int i = this.a - 1;
            this.a = i;
            if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                handlerThread.quit();
                this.d = null;
                this.c = null;
            }
        }
    }

    public final void s(int i, boolean z, boolean z2) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.a);
        int b = fod.b(this.a, 1 << i, z);
        this.a = b;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((k79) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z2);
        }
    }

    public final synchronized Task u(ebf ebfVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(ebfVar.toString()));
        }
        if (!((l7f) this.d).a(ebfVar)) {
            l7f l7fVar = new l7f(this);
            this.d = l7fVar;
            l7fVar.a(ebfVar);
        }
        return ebfVar.b.getTask();
    }

    public igf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new l7f(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public igf(vm1 vm1Var) {
        this.b = new float[32];
        this.a = 1;
        this.d = new k79(this, tn.a, 240L);
        this.c = vm1Var;
    }

    public igf(lu5 lu5Var, uyc uycVar, cyb cybVar, w4a w4aVar) {
        w4aVar.getClass();
        this.b = lu5Var;
        this.c = uycVar;
        this.d = cybVar;
        this.a = -1;
    }

    public /* synthetic */ igf(h6e h6eVar, String str, int i, SharedPreferences sharedPreferences) {
        this.b = h6eVar;
        this.c = str;
        this.a = i;
        this.d = sharedPreferences;
    }
}
