// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ey1 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ ey1(f1f f1fVar, aec aecVar, String str) {
        this.a = (byte) 10;
        this.b = f1fVar;
        this.c = aecVar;
        this.d = str;
    }

    private final void a() {
        i69 i69Var;
        ted tedVar = (ted) this.b;
        HashMap hashMap = tedVar.c.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            i69Var = (i69) tedVar.c.D.get(str);
        }
        if (i69Var != null) {
            i69Var.o((String) this.d);
        } else {
            afd.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        int i;
        Task u;
        aj2 aj2Var = (aj2) this.c;
        Intent intent = aj2Var.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            u = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aj2Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aj2Var.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.b;
            bundle.putBoolean("supports_message_handled", true);
            igf t = igf.t(context);
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            u = t.u(new ebf(i, 2, bundle, (byte) 0));
        }
        u.addOnCompleteListener(wn3.e, new v39((CountDownLatch) this.d, (byte) 29));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        String str;
        kff kffVar;
        f1f f1fVar = (f1f) this.b;
        aec aecVar = (aec) this.c;
        ule uleVar = ule.b;
        String str2 = (String) this.d;
        rod rodVar = (rod) aecVar.b;
        rodVar.c = uleVar;
        pwe pweVar = (pwe) rodVar.b;
        if (pweVar != null) {
            str = pweVar.d;
            int i = ftd.a;
            if (str != null) {
            }
        }
        str = "NA";
        pse pseVar = new pse();
        pseVar.a = f1fVar.a;
        pseVar.b = f1fVar.b;
        synchronized (f1f.class) {
            kffVar = f1f.j;
            if (kffVar == null) {
                m96 a = rtd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    ce3 ce3Var = om2.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArr.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i3) << 1;
                        }
                        if (i5 < 0) {
                            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    objArr[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                t2f t2fVar = f7f.f;
                kffVar = i3 == 0 ? kff.r : new kff(i3, objArr);
                f1f.j = kffVar;
            }
        }
        pseVar.k = kffVar;
        pseVar.g = Boolean.TRUE;
        pseVar.d = str;
        pseVar.c = str2;
        pseVar.e = f1fVar.f.isSuccessful() ? (String) f1fVar.f.getResult() : f1fVar.d.a();
        pseVar.i = 10;
        pseVar.j = Integer.valueOf(f1fVar.h);
        aecVar.c = pseVar;
        f1fVar.c.a(aecVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i69 i69Var;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((gy1) this.d).K((File) this.c, (ArrayList) this.b);
                return;
            case 1:
                f89 f89Var = (f89) this.d;
                b80 b80Var = (b80) this.b;
                f89Var.b(b80Var, (TaskCompletionSource) this.c);
                ((AtomicInteger) f89Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(f89Var.b, f89Var.a()) * (60000.0d / f89Var.a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + b80Var.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 2:
                try {
                    obj = ((sl4) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new tq4(this.c, obj, (byte) 10));
                return;
            case 3:
                rga rgaVar = (rga) this.d;
                rgaVar.d.c.remove((String) this.b);
                ea9 ea9Var = (ea9) this.c;
                if (ea9Var.a instanceof t3) {
                    return;
                }
                try {
                    ea9Var.get();
                    return;
                } catch (Exception e) {
                    rgaVar.c.l(e);
                    return;
                }
            case 4:
                cxc.h((View) this.b, (v8b) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 5:
                y06 y06Var = (y06) this.b;
                ab8 ab8Var = (ab8) this.d;
                if (ab8Var.a > 0) {
                    Bundle bundle = (Bundle) ab8Var.c;
                    y06Var.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (ab8Var.a >= 2) {
                    y06Var.onStart();
                }
                if (ab8Var.a >= 3) {
                    y06Var.onResume();
                }
                if (ab8Var.a >= 4) {
                    y06Var.onStop();
                }
                if (ab8Var.a >= 5) {
                    y06Var.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                super/*uh0*/.c((z24) this.c, (sg0) this.d);
                return;
            case 8:
                super/*uh0*/.a((ss2) this.c, (ts2) this.d);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            default:
                synchronized (((ygf) this.b).I) {
                    i69Var = (i69) ((ygf) this.b).I.get((String) this.c);
                }
                if (i69Var != null) {
                    i69Var.o((String) this.d);
                    return;
                } else {
                    ygf.X.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ ey1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ey1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ey1() {
        this.a = (byte) 2;
    }

    public ey1(View view, gxc gxcVar, v8b v8bVar, ValueAnimator valueAnimator) {
        this.a = (byte) 4;
        this.b = view;
        this.c = v8bVar;
        this.d = valueAnimator;
    }
}
