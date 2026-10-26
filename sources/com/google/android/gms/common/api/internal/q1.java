package com.google.android.gms.common.api.internal;

import a8.ff;
import a8.ng;
import a8.se;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.b10;
import x7.k7;
import x7.m9;
import x7.ma;
import x7.r2;
import x7.ra;
import x7.ta;
import x7.va;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ q1() {
        this.a = 7;
    }

    private final void a() {
        d6.f fVar;
        synchronized (((h6.v) this.b).X) {
            fVar = (d6.f) ((h6.v) this.b).X.get((String) this.c);
        }
        if (fVar != null) {
            ((f6.h) fVar).o((String) this.d);
        } else {
            h6.v.n0.b("Discarded message for unknown namespace '%s'", (String) this.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        va vaVar;
        ma maVar = (ma) this.b;
        m4.c cVar = (m4.c) this.d;
        k7 k7Var = k7.b;
        String str2 = (String) this.c;
        s4.d dVar = (s4.d) cVar.b;
        dVar.c = k7Var;
        m9 m9Var = (m9) dVar.b;
        if (m9Var != null) {
            str = m9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        ff ffVar = new ff();
        ffVar.a = maVar.a;
        ffVar.b = maVar.b;
        synchronized (ma.class) {
            vaVar = ma.j;
            if (vaVar == null) {
                n0.c a2 = se.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    d5.a aVar = sb.c.a;
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
                ra raVar = ta.b;
                vaVar = i12 == 0 ? va.e : new va(i12, objArr);
                ma.j = vaVar;
            }
        }
        ffVar.g = vaVar;
        ffVar.i = Boolean.TRUE;
        ffVar.e = str;
        ffVar.d = str2;
        ffVar.f = maVar.f.isSuccessful() ? (String) maVar.f.getResult() : maVar.d.a();
        ffVar.c = 10;
        ffVar.k = Integer.valueOf(maVar.h);
        cVar.c = ffVar;
        maVar.c.a(cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d6.f fVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ng ngVar = (ng) this.d;
                if (ngVar.b > 0) {
                    Bundle bundle = (Bundle) ngVar.d;
                    lVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (ngVar.b >= 2) {
                    lVar.onStart();
                }
                if (ngVar.b >= 3) {
                    lVar.onResume();
                }
                if (ngVar.b >= 4) {
                    lVar.onStop();
                }
                if (ngVar.b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 1:
                d5.c cVar = (d5.c) this.b;
                d5.k kVar = (d5.k) this.c;
                d5.j jVar = (d5.j) this.d;
                d5.i iVar = d5.e0.i;
                cVar.y(24, 4, iVar);
                kVar.a(iVar, jVar.a);
                return;
            case 2:
                super/*d5.c*/.c((a4.l) this.c, (org.telegram.messenger.g0) this.d);
                return;
            case 3:
                super/*d5.c*/.a((d5.j) this.c, (d5.k) this.d);
                return;
            case 4:
                d6.d0 d0Var = (d6.d0) this.b;
                HashMap hashMap = d0Var.b.C;
                String str = (String) this.c;
                synchronized (hashMap) {
                    fVar = (d6.f) d0Var.b.C.get(str);
                }
                if (fVar != null) {
                    ((f6.h) fVar).o((String) this.d);
                    return;
                } else {
                    d6.e0.G.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 5:
                ea.c cVar2 = (ea.c) this.d;
                y9.b bVar = (y9.b) this.b;
                cVar2.b(bVar, (TaskCompletionSource) this.c);
                ((AtomicInteger) cVar2.i.b).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar2.b, cVar2.a()) * (60000.0d / cVar2.a));
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
            case 6:
                a();
                return;
            case 7:
                try {
                    obj = ((o0.e) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new k9.u(21, (d5.x) this.c, obj));
                return;
            case 8:
                ((org.telegram.ui.Components.ng) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            case 9:
                u4.e eVar = (u4.e) this.d;
                eVar.d.c.remove((String) this.c);
                c0.m mVar = (c0.m) this.b;
                if (mVar.a instanceof c0.a) {
                    return;
                }
                try {
                    mVar.get();
                    return;
                } catch (Exception e) {
                    eVar.c.l(e);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.d;
                Bitmap bitmap = (Bitmap) this.b;
                String str3 = (String) this.c;
                shortcutInfoCompatSaverImpl.getClass();
                if (bitmap == null) {
                    throw new IllegalArgumentException("bitmap is null");
                }
                if (TextUtils.isEmpty(str3)) {
                    throw new IllegalArgumentException("path is empty");
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
                    try {
                        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                            fileOutputStream.close();
                            return;
                        }
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException("Unable to compress bitmap for saving " + str3);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e10);
                    throw new RuntimeException(b10.j("Unable to write bitmap to file ", str3), e10);
                }
            case 11:
                b();
                return;
            default:
                y8.m mVar2 = (y8.m) this.b;
                z8.l0 l0Var = (z8.l0) this.c;
                z8.f0 f0Var = (z8.f0) this.d;
                Task<byte[]> onRequest = mVar2.c.onRequest(l0Var.d, l0Var.b, l0Var.c);
                if (onRequest == null) {
                    y8.m.L0(f0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new s4.o0(f0Var));
                    return;
                }
        }
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

    public /* synthetic */ q1(ma maVar, m4.c cVar, String str) {
        this.a = 11;
        this.b = maVar;
        this.d = cVar;
        this.c = str;
    }

    public q1(u4.e eVar, String str, c0.m mVar) {
        this.a = 9;
        this.d = eVar;
        this.c = str;
        this.b = mVar;
    }
}
