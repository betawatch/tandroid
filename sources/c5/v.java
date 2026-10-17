package c5;

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
import org.telegram.ui.Components.ng;
import v7.d8;
import w7.j7;
import w7.l9;
import w7.la;
import w7.qa;
import w7.r2;
import w7.sa;
import w7.ua;
import y8.k0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ v() {
        this.a = 7;
    }

    private final void a() {
        c6.f fVar;
        synchronized (((g6.v) this.b).X) {
            fVar = (c6.f) ((g6.v) this.b).X.get((String) this.c);
        }
        if (fVar != null) {
            ((e6.h) fVar).o((String) this.d);
        } else {
            g6.v.n0.b("Discarded message for unknown namespace '%s'", (String) this.c);
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
        ua uaVar;
        la laVar = (la) this.b;
        n2.e eVar = (n2.e) this.c;
        j7 j7Var = j7.b;
        String str2 = (String) this.d;
        u2.c cVar = (u2.c) eVar.b;
        cVar.c = j7Var;
        l9 l9Var = (l9) cVar.b;
        if (l9Var != null) {
            str = l9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        d8 d8Var = new d8();
        d8Var.a = laVar.a;
        d8Var.b = laVar.b;
        synchronized (la.class) {
            uaVar = la.j;
            if (uaVar == null) {
                n0.c a2 = w7.z.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    m2.t tVar = rb.c.a;
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
                qa qaVar = sa.b;
                uaVar = i12 == 0 ? ua.e : new ua(i12, objArr);
                la.j = uaVar;
            }
        }
        d8Var.k = uaVar;
        d8Var.g = Boolean.TRUE;
        d8Var.d = str;
        d8Var.c = str2;
        d8Var.e = laVar.f.isSuccessful() ? (String) laVar.f.getResult() : laVar.d.a();
        d8Var.i = 10;
        d8Var.j = Integer.valueOf(laVar.h);
        eVar.c = d8Var;
        laVar.c.a(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        c6.f fVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                k kVar = (k) this.c;
                j jVar = (j) this.d;
                i iVar = g0.i;
                cVar.y(24, 4, iVar);
                kVar.a(iVar, jVar.a);
                return;
            case 1:
                super/*c5.c*/.c((a6.i) this.c, (org.telegram.messenger.e0) this.d);
                return;
            case 2:
                super/*c5.c*/.a((j) this.d, (k) this.c);
                return;
            case 3:
                c6.d0 d0Var = (c6.d0) this.b;
                HashMap hashMap = d0Var.b.C;
                String str = (String) this.c;
                synchronized (hashMap) {
                    fVar = (c6.f) d0Var.b.C.get(str);
                }
                if (fVar != null) {
                    ((e6.h) fVar).o((String) this.d);
                    return;
                } else {
                    c6.e0.G.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 4:
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.b;
                a5.a aVar = (a5.a) this.d;
                if (aVar.b > 0) {
                    Bundle bundle = (Bundle) aVar.d;
                    lVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (aVar.b >= 2) {
                    lVar.onStart();
                }
                if (aVar.b >= 3) {
                    lVar.onResume();
                }
                if (aVar.b >= 4) {
                    lVar.onStop();
                }
                if (aVar.b >= 5) {
                    lVar.onDestroy();
                    return;
                }
                return;
            case 5:
                da.c cVar2 = (da.c) this.d;
                x9.b bVar = (x9.b) this.b;
                cVar2.b(bVar, (TaskCompletionSource) this.c);
                ((AtomicInteger) cVar2.i.c).set(0);
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
                ((Handler) this.d).post(new j9.u(21, (z) this.c, obj));
                return;
            case 8:
                ((ng) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            case 9:
                u4.e eVar = (u4.e) this.d;
                eVar.d.c.remove((String) this.b);
                c0.m mVar = (c0.m) this.c;
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
                } catch (IOException | OutOfMemoryError | RuntimeException e7) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e7);
                    throw new RuntimeException(r.c.g("Unable to write bitmap to file ", str3), e7);
                }
            case 11:
                b();
                return;
            default:
                x8.m mVar2 = (x8.m) this.b;
                k0 k0Var = (k0) this.c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = mVar2.c.onRequest(k0Var.d, k0Var.b, k0Var.c);
                if (onRequest == null) {
                    x8.m.L0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new u3.c(e0Var));
                    return;
                }
        }
    }

    public /* synthetic */ v(d0 d0Var, j jVar, k kVar) {
        this.a = 2;
        this.b = d0Var;
        this.d = jVar;
        this.c = kVar;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ v(la laVar, n2.e eVar, String str) {
        this.a = 11;
        this.b = laVar;
        this.c = eVar;
        this.d = str;
    }
}
