package com.google.android.gms.common.api.internal;

import ag.j2;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.d8;
import i7.j7;
import i7.k9;
import i7.ka;
import i7.pa;
import i7.r2;
import i7.ra;
import i7.ta;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import nh.d6;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.gg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ q1() {
        this.a = 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        ta taVar;
        ka kaVar = (ka) this.b;
        g9.l lVar = (g9.l) this.d;
        j7 j7Var = j7.b;
        String str2 = (String) this.c;
        androidx.biometric.e eVar = (androidx.biometric.e) lVar.b;
        eVar.c = j7Var;
        k9 k9Var = (k9) eVar.b;
        if (k9Var != null) {
            str = k9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        d8 d8Var = new d8();
        d8Var.a = kaVar.a;
        d8Var.b = kaVar.b;
        synchronized (ka.class) {
            taVar = ka.j;
            if (taVar == null) {
                n0.c a2 = i7.c0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    d9.c cVar = ab.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i13 = i12 + 1;
                    int length = objArr.length;
                    if (length < i13) {
                        int i14 = length + (length >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = languageTag;
                    i11++;
                    i12 = i13;
                }
                pa paVar = ra.b;
                taVar = i12 == 0 ? ta.e : new ta(i12, objArr);
                ka.j = taVar;
            }
        }
        d8Var.k = taVar;
        d8Var.g = Boolean.TRUE;
        d8Var.d = str;
        d8Var.c = str2;
        d8Var.e = kaVar.f.isSuccessful() ? (String) kaVar.f.getResult() : kaVar.d.a();
        d8Var.i = 10;
        d8Var.j = Integer.valueOf(kaVar.h);
        lVar.c = d8Var;
        kaVar.c.a(lVar);
    }

    private final void b() {
        o5.f fVar;
        o5.d0 d0Var = (o5.d0) this.b;
        HashMap hashMap = d0Var.b.C;
        String str = (String) this.c;
        synchronized (hashMap) {
            fVar = (o5.f) d0Var.b.C.get(str);
        }
        if (fVar != null) {
            ((q5.h) fVar).o((String) this.d);
        } else {
            o5.e0.G.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o5.f fVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                j2 j2Var = (j2) this.d;
                if (j2Var.b > 0) {
                    Bundle bundle = (Bundle) j2Var.d;
                    lVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (j2Var.b >= 2) {
                    lVar.onStart();
                }
                if (j2Var.b >= 3) {
                    lVar.onResume();
                }
                if (j2Var.b >= 4) {
                    lVar.onStop();
                }
                if (j2Var.b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 1:
                g.e.b(((g.e) this.d).e, (View) this.b, (View) this.c);
                return;
            case 2:
                h2.e eVar = (h2.e) this.d;
                eVar.d.c.remove((String) this.c);
                c0.l lVar2 = (c0.l) this.b;
                if (lVar2.a instanceof c0.a) {
                    return;
                }
                try {
                    lVar2.get();
                    return;
                } catch (Exception e10) {
                    eVar.c.l(e10);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.d;
                Bitmap bitmap = (Bitmap) this.b;
                String str = (String) this.c;
                shortcutInfoCompatSaverImpl.getClass();
                if (bitmap == null) {
                    throw new IllegalArgumentException("bitmap is null");
                }
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("path is empty");
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    try {
                        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                            fileOutputStream.close();
                            return;
                        }
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException("Unable to compress bitmap for saving " + str);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e11);
                    throw new RuntimeException(u3.c.e("Unable to write bitmap to file ", str), e11);
                }
            case 4:
                a();
                return;
            case 5:
                j8.m mVar = (j8.m) this.b;
                k8.m0 m0Var = (k8.m0) this.c;
                k8.e0 e0Var = (k8.e0) this.d;
                Task<byte[]> onRequest = mVar.c.onRequest(m0Var.d, m0Var.b, m0Var.c);
                if (onRequest == null) {
                    j8.m.K0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new ag.o1(e0Var, 18));
                    return;
                }
            case 6:
                m9.c cVar = (m9.c) this.d;
                g9.b bVar = (g9.b) this.b;
                cVar.b(bVar, (TaskCompletionSource) this.c);
                ((AtomicInteger) cVar.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar.b, cVar.a()) * (60000.0d / cVar.a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 7:
                try {
                    obj = ((o0.e) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new ab.o(27, (o0.f) this.c, obj));
                return;
            case 8:
                b();
                return;
            case 9:
                ((gg) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            case 10:
                p2.b bVar2 = (p2.b) this.b;
                p2.h hVar = (p2.h) this.c;
                g5.c cVar2 = (g5.c) this.d;
                p2.g gVar = p2.z.i;
                bVar2.y(24, 4, gVar);
                hVar.a(gVar, cVar2.a);
                return;
            case 11:
                super/*p2.b*/.c((d6) this.c, (org.telegram.messenger.d) this.d);
                return;
            case 12:
                super/*p2.b*/.a((g5.c) this.c, (p2.h) this.d);
                return;
            default:
                synchronized (((s5.w) this.b).T) {
                    fVar = (o5.f) ((s5.w) this.b).T.get((String) this.c);
                }
                if (fVar != null) {
                    ((q5.h) fVar).o((String) this.d);
                    return;
                } else {
                    s5.w.j0.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ q1(ka kaVar, g9.l lVar, String str) {
        this.a = 4;
        this.b = kaVar;
        this.d = lVar;
        this.c = str;
    }

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public q1(h2.e eVar, String str, c0.l lVar) {
        this.a = 2;
        this.d = eVar;
        this.c = str;
        this.b = lVar;
    }
}
