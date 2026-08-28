package com.google.android.gms.common.api.internal;

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
import f7.d7;
import f7.f8;
import g7.i7;
import g7.k9;
import g7.ka;
import g7.pa;
import g7.r2;
import g7.ra;
import g7.ta;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.dg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ q1() {
        this.a = 11;
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
        g5.b bVar = (g5.b) this.d;
        i7 i7Var = i7.b;
        String str2 = (String) this.c;
        a5.m mVar = (a5.m) bVar.b;
        mVar.c = i7Var;
        k9 k9Var = (k9) mVar.b;
        if (k9Var != null) {
            str = k9Var.d;
            int i9 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        f8 f8Var = new f8();
        f8Var.a = kaVar.a;
        f8Var.b = kaVar.b;
        synchronized (ka.class) {
            taVar = ka.j;
            if (taVar == null) {
                n0.c a2 = g7.a0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a2.a.size()) {
                    Locale locale = a2.a.get(i10);
                    b9.c cVar = ya.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i12 = i11 + 1;
                    int length = objArr.length;
                    if (length < i12) {
                        int i13 = length + (length >> 1) + 1;
                        if (i13 < i12) {
                            int highestOneBit = Integer.highestOneBit(i11);
                            i13 = highestOneBit + highestOneBit;
                        }
                        if (i13 < 0) {
                            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    objArr[i11] = languageTag;
                    i10++;
                    i11 = i12;
                }
                pa paVar = ra.b;
                taVar = i11 == 0 ? ta.e : new ta(i11, objArr);
                ka.j = taVar;
            }
        }
        f8Var.k = taVar;
        f8Var.g = Boolean.TRUE;
        f8Var.d = str;
        f8Var.c = str2;
        f8Var.e = kaVar.f.isSuccessful() ? (String) kaVar.f.getResult() : kaVar.d.a();
        f8Var.i = 10;
        f8Var.j = Integer.valueOf(kaVar.h);
        bVar.c = f8Var;
        kaVar.c.a(bVar);
    }

    private final void b() {
        m5.f fVar;
        m5.e0 e0Var = (m5.e0) this.b;
        HashMap hashMap = e0Var.b.C;
        String str = (String) this.c;
        synchronized (hashMap) {
            fVar = (m5.f) e0Var.b.C.get(str);
        }
        if (fVar != null) {
            ((o5.h) fVar).o((String) this.d);
        } else {
            m5.f0.G.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        m5.f fVar;
        Object obj = null;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                a6.a aVar = (a6.a) this.d;
                if (aVar.c > 0) {
                    Bundle bundle = (Bundle) aVar.d;
                    lVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (aVar.c >= 2) {
                    lVar.onStart();
                }
                if (aVar.c >= 3) {
                    lVar.onResume();
                }
                if (aVar.c >= 4) {
                    lVar.onStop();
                }
                if (aVar.c >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 1:
                g.e.b(((g.e) this.d).e, (View) this.b, (View) this.c);
                return;
            case 2:
                a();
                return;
            case 3:
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
            case 4:
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
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e11);
                    throw new RuntimeException(ta.b.d("Unable to write bitmap to file ", str), e11);
                }
            case 5:
                h8.m mVar = (h8.m) this.b;
                i8.m0 m0Var = (i8.m0) this.c;
                i8.e0 e0Var = (i8.e0) this.d;
                Task<byte[]> onRequest = mVar.c.onRequest(m0Var.d, m0Var.b, m0Var.c);
                if (onRequest == null) {
                    h8.m.K0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new k5.i(e0Var, 17));
                    return;
                }
            case 6:
                k9.c cVar = (k9.c) this.d;
                e9.b bVar = (e9.b) this.b;
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
                b();
                return;
            case 8:
                n2.b bVar2 = (n2.b) this.b;
                n2.h hVar = (n2.h) this.c;
                d7 d7Var = (d7) this.d;
                n2.g gVar = n2.b0.i;
                bVar2.y(24, 4, gVar);
                hVar.a(gVar, d7Var.a);
                return;
            case 9:
                super/*n2.b*/.c((n2.p) this.c, (org.telegram.messenger.d) this.d);
                return;
            case 10:
                super/*n2.b*/.a((d7) this.c, (n2.h) this.d);
                return;
            case 11:
                try {
                    obj = ((o0.e) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new androidx.biometric.j((n2.u) this.c, obj, z10, 29));
                return;
            case 12:
                ((dg) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            default:
                synchronized (((q5.w) this.b).T) {
                    fVar = (m5.f) ((q5.w) this.b).T.get((String) this.c);
                }
                if (fVar != null) {
                    ((o5.h) fVar).o((String) this.d);
                    return;
                } else {
                    q5.w.j0.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ q1(ka kaVar, g5.b bVar, String str) {
        this.a = 2;
        this.b = kaVar;
        this.d = bVar;
        this.c = str;
    }

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public q1(h2.e eVar, String str, c0.l lVar) {
        this.a = 3;
        this.d = eVar;
        this.c = str;
        this.b = lVar;
    }
}
