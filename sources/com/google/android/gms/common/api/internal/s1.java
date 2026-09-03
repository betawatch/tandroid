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
import j7.g8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import k7.j7;
import k7.k9;
import k7.ka;
import k7.pa;
import k7.r2;
import k7.ra;
import k7.ta;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.dg;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ s1() {
        this.a = 6;
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
        f7.b bVar = (f7.b) this.d;
        j7 j7Var = j7.b;
        String str2 = (String) this.c;
        af.d dVar = (af.d) bVar.b;
        dVar.c = j7Var;
        k9 k9Var = (k9) dVar.b;
        if (k9Var != null) {
            str = k9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        g8 g8Var = new g8();
        g8Var.a = kaVar.a;
        g8Var.b = kaVar.b;
        synchronized (ka.class) {
            taVar = ka.j;
            if (taVar == null) {
                n0.c a2 = k7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    b6.h hVar = cb.c.a;
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
        g8Var.k = taVar;
        g8Var.g = Boolean.TRUE;
        g8Var.d = str;
        g8Var.c = str2;
        g8Var.e = kaVar.f.isSuccessful() ? (String) kaVar.f.getResult() : kaVar.d.a();
        g8Var.i = 10;
        g8Var.j = Integer.valueOf(kaVar.h);
        bVar.c = g8Var;
        kaVar.c.a(bVar);
    }

    private final void b() {
        q5.f fVar;
        q5.e0 e0Var = (q5.e0) this.b;
        HashMap hashMap = e0Var.b.C;
        String str = (String) this.c;
        synchronized (hashMap) {
            fVar = (q5.f) e0Var.b.C.get(str);
        }
        if (fVar != null) {
            ((s5.h) fVar).o((String) this.d);
        } else {
            q5.f0.G.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5.f fVar;
        int i10 = 24;
        Object obj = null;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                b4.e0 e0Var = (b4.e0) this.d;
                if (e0Var.b > 0) {
                    Bundle bundle = (Bundle) e0Var.d;
                    lVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (e0Var.b >= 2) {
                    lVar.onStart();
                }
                if (e0Var.b >= 3) {
                    lVar.onResume();
                }
                if (e0Var.b >= 4) {
                    lVar.onStop();
                }
                if (e0Var.b >= 5) {
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
                } catch (Exception e) {
                    eVar.c.l(e);
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
                } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e6);
                    throw new RuntimeException(w2.e("Unable to write bitmap to file ", str), e6);
                }
            case 4:
                a();
                return;
            case 5:
                l8.m mVar = (l8.m) this.b;
                m8.l0 l0Var = (m8.l0) this.c;
                m8.e0 e0Var2 = (m8.e0) this.d;
                Task<byte[]> onRequest = mVar.c.onRequest(l0Var.d, l0Var.b, l0Var.c);
                if (onRequest == null) {
                    l8.m.K0(e0Var2, false, null);
                    return;
                } else {
                    onRequest.addOnCompleteListener(new bb.b(e0Var2, i10));
                    return;
                }
            case 6:
                try {
                    obj = ((o0.e) this.b).call();
                } catch (Exception unused) {
                }
                ((Handler) this.d).post(new androidx.biometric.j((o0.f) this.c, obj, z4, 27));
                return;
            case 7:
                o9.c cVar = (o9.c) this.d;
                i9.b bVar = (i9.b) this.b;
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
                } catch (InterruptedException unused2) {
                    return;
                }
            case 8:
                ((dg) this.d).n((File) this.c, (ArrayList) this.b);
                return;
            case 9:
                p2.b bVar2 = (p2.b) this.b;
                p2.i iVar = (p2.i) this.c;
                com.google.android.gms.internal.clearcut.e eVar2 = (com.google.android.gms.internal.clearcut.e) this.d;
                p2.h hVar = p2.b0.i;
                bVar2.y(24, 4, hVar);
                iVar.a(hVar, eVar2.a);
                return;
            case 10:
                super/*p2.b*/.c((o3.c) this.c, (org.telegram.messenger.d0) this.d);
                return;
            case 11:
                super/*p2.b*/.a((com.google.android.gms.internal.clearcut.e) this.c, (p2.i) this.d);
                return;
            case 12:
                b();
                return;
            default:
                synchronized (((u5.w) this.b).U) {
                    fVar = (q5.f) ((u5.w) this.b).U.get((String) this.c);
                }
                if (fVar != null) {
                    ((s5.h) fVar).o((String) this.d);
                    return;
                } else {
                    u5.w.k0.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ s1(ka kaVar, f7.b bVar, String str) {
        this.a = 4;
        this.b = kaVar;
        this.d = bVar;
        this.c = str;
    }

    public s1(h2.e eVar, String str, c0.l lVar) {
        this.a = 2;
        this.d = eVar;
        this.c = str;
        this.b = lVar;
    }
}
