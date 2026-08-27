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
import g7.e8;
import h7.i7;
import h7.k9;
import h7.ka;
import h7.pa;
import h7.r2;
import h7.ra;
import h7.ta;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.zf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        a5.n nVar = (a5.n) bVar.b;
        nVar.c = i7Var;
        k9 k9Var = (k9) nVar.b;
        if (k9Var != null) {
            str = k9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        e8 e8Var = new e8();
        e8Var.a = kaVar.a;
        e8Var.b = kaVar.b;
        synchronized (ka.class) {
            taVar = ka.j;
            if (taVar == null) {
                n0.c a2 = h7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    c9.b bVar2 = za.c.a;
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
        e8Var.k = taVar;
        e8Var.g = Boolean.TRUE;
        e8Var.d = str;
        e8Var.c = str2;
        e8Var.e = kaVar.f.isSuccessful() ? (String) kaVar.f.getResult() : kaVar.d.a();
        e8Var.i = 10;
        e8Var.j = Integer.valueOf(kaVar.h);
        bVar.c = e8Var;
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
        int i10 = 0;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                b6.a aVar = (b6.a) this.d;
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
                g.f.b(((g.f) this.d).e, (View) this.b, (View) this.c);
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
                } catch (Exception e9) {
                    eVar.c.l(e9);
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
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e10);
                    throw new RuntimeException(s3.c.e("Unable to write bitmap to file ", str), e10);
                }
            case 4:
                a();
                return;
            case 5:
                i8.m mVar = (i8.m) this.b;
                j8.l0 l0Var = (j8.l0) this.c;
                j8.e0 e0Var = (j8.e0) this.d;
                Task<byte[]> onRequest = mVar.c.onRequest(l0Var.d, l0Var.b, l0Var.c);
                if (onRequest == null) {
                    i8.m.K0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new a9.i(e0Var, 19));
                    return;
                }
            case 6:
                l9.c cVar = (l9.c) this.d;
                f9.b bVar = (f9.b) this.b;
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
                ec.a aVar2 = (ec.a) this.d;
                n2.g gVar = n2.a0.i;
                bVar2.y(24, 4, gVar);
                hVar.a(gVar, aVar2.b);
                return;
            case 9:
                super/*n2.b*/.c((n1.d) this.c, (org.telegram.messenger.d) this.d);
                return;
            case 10:
                super/*n2.b*/.a((ec.a) this.c, (n2.h) this.d);
                return;
            case 11:
                try {
                    obj = ((o0.f) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new o0.m(i10, (n2.t) this.c, obj));
                return;
            case 12:
                ((zf) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            default:
                synchronized (((r5.w) this.b).T) {
                    fVar = (m5.f) ((r5.w) this.b).T.get((String) this.c);
                }
                if (fVar != null) {
                    ((o5.h) fVar).o((String) this.d);
                    return;
                } else {
                    r5.w.j0.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ q1(ka kaVar, g5.b bVar, String str) {
        this.a = 4;
        this.b = kaVar;
        this.d = bVar;
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
