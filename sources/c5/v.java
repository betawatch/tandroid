package c5;

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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ng;
import v7.a6;
import v7.c8;
import w7.j7;
import w7.l9;
import w7.la;
import w7.qa;
import w7.r2;
import w7.sa;
import w7.ua;
import y8.k0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ v() {
        this.a = 8;
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
        o0.a aVar = (o0.a) this.c;
        j7 j7Var = j7.b;
        String str2 = (String) this.d;
        a6 a6Var = (a6) aVar.b;
        a6Var.c = j7Var;
        l9 l9Var = (l9) a6Var.b;
        if (l9Var != null) {
            str = l9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        c8 c8Var = new c8();
        c8Var.a = laVar.a;
        c8Var.b = laVar.b;
        synchronized (la.class) {
            uaVar = la.j;
            if (uaVar == null) {
                n0.c a2 = w7.y.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    m2.u uVar = qb.c.a;
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
        c8Var.k = uaVar;
        c8Var.g = Boolean.TRUE;
        c8Var.d = str;
        c8Var.c = str2;
        c8Var.e = laVar.f.isSuccessful() ? (String) laVar.f.getResult() : laVar.d.a();
        c8Var.i = 10;
        c8Var.j = Integer.valueOf(laVar.h);
        aVar.c = c8Var;
        laVar.c.a(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        c6.f fVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                j jVar = (j) this.c;
                i iVar = (i) this.d;
                h hVar = g0.i;
                cVar.y(24, 4, hVar);
                jVar.a(hVar, iVar.a);
                return;
            case 1:
                super/*c5.c*/.c((xa.c) this.c, (org.telegram.messenger.c0) this.d);
                return;
            case 2:
                super/*c5.c*/.a((i) this.d, (j) this.c);
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
                ca.c cVar2 = (ca.c) this.d;
                w9.b bVar = (w9.b) this.b;
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
            case 5:
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
            case 6:
                g.f.b(((g.f) this.d).e, (View) this.b, (View) this.c);
                return;
            case 7:
                a();
                return;
            case 8:
                try {
                    obj = ((o0.f) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new i9.s(20, (z) this.c, obj));
                return;
            case 9:
                ((ng) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            case 10:
                u4.f fVar2 = (u4.f) this.d;
                fVar2.d.c.remove((String) this.b);
                c0.l lVar2 = (c0.l) this.c;
                if (lVar2.a instanceof c0.a) {
                    return;
                }
                try {
                    lVar2.get();
                    return;
                } catch (Exception e7) {
                    fVar2.c.l(e7);
                    return;
                }
            case 11:
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
                    throw new RuntimeException(p6.i("Unable to write bitmap to file ", str3), e10);
                }
            case 12:
                b();
                return;
            default:
                x8.m mVar = (x8.m) this.b;
                k0 k0Var = (k0) this.c;
                y8.e0 e0Var = (y8.e0) this.d;
                Task<byte[]> onRequest = mVar.c.onRequest(k0Var.d, k0Var.b, k0Var.c);
                if (onRequest == null) {
                    x8.m.M0(e0Var, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new k2.g0(e0Var, 25));
                    return;
                }
        }
    }

    public /* synthetic */ v(d0 d0Var, i iVar, j jVar) {
        this.a = 2;
        this.b = d0Var;
        this.d = iVar;
        this.c = jVar;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ v(la laVar, o0.a aVar, String str) {
        this.a = 12;
        this.b = laVar;
        this.c = aVar;
        this.d = str;
    }
}
