package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import b8.df;
import b8.kg;
import b8.re;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import gi.w5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.m6;
import org.telegram.messenger.p1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.tf;
import y7.k7;
import y7.m9;
import y7.ma;
import y7.r2;
import y7.ra;
import y7.ta;
import y7.va;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ j1() {
        this.a = 7;
    }

    private final void a() {
        e6.f fVar;
        synchronized (((i6.v) this.b).I) {
            fVar = (e6.f) ((i6.v) this.b).I.get((String) this.c);
        }
        if (fVar != null) {
            ((g6.h) fVar).o((String) this.d);
        } else {
            i6.v.Y.b("Discarded message for unknown namespace '%s'", (String) this.c);
        }
    }

    private final void b() {
        int i3;
        Task k10;
        l6.a aVar = (l6.a) this.c;
        Intent intent = aVar.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            k10 = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.b;
            bundle.putBoolean("supports_message_handled", true);
            l6.n i10 = l6.n.i(context);
            synchronized (i10) {
                i3 = i10.a;
                i10.a = i3 + 1;
            }
            k10 = i10.k(new l6.l(i3, 2, bundle, 0));
        }
        k10.addOnCompleteListener(l6.d.c, new w5((CountDownLatch) this.d, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        String str;
        va vaVar;
        ma maVar = (ma) this.b;
        w9.b bVar = (w9.b) this.d;
        k7 k7Var = k7.b;
        String str2 = (String) this.c;
        p7.d dVar = (p7.d) bVar.b;
        dVar.d = k7Var;
        m9 m9Var = (m9) dVar.b;
        if (m9Var != null) {
            str = m9Var.d;
            int i3 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        df dfVar = new df();
        dfVar.a = maVar.a;
        dfVar.b = maVar.b;
        synchronized (ma.class) {
            vaVar = ma.j;
            if (vaVar == null) {
                n0.c a10 = re.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a10.a.size()) {
                    Locale locale = a10.a.get(i10);
                    m6 m6Var = mb.c.a;
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
                ra raVar = ta.b;
                vaVar = i11 == 0 ? va.e : new va(i11, objArr);
                ma.j = vaVar;
            }
        }
        dfVar.k = vaVar;
        dfVar.g = Boolean.TRUE;
        dfVar.d = str;
        dfVar.c = str2;
        dfVar.e = maVar.f.isSuccessful() ? (String) maVar.f.getResult() : maVar.d.a();
        dfVar.i = 10;
        dfVar.j = Integer.valueOf(maVar.h);
        bVar.c = dfVar;
        maVar.c.a(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e6.f fVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                kg kgVar = (kg) this.d;
                if (kgVar.b > 0) {
                    Bundle bundle = (Bundle) kgVar.d;
                    kVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (kgVar.b >= 2) {
                    kVar.onStart();
                }
                if (kgVar.b >= 3) {
                    kVar.onResume();
                }
                if (kgVar.b >= 4) {
                    kVar.onStop();
                }
                if (kgVar.b >= 5) {
                    kVar.onDestroy();
                    return;
                }
                return;
            case 1:
                super/*e5.b*/.c((android.support.v4.media.c) this.c, (p1) this.d);
                return;
            case 2:
                super/*e5.b*/.a((com.google.android.gms.internal.clearcut.e) this.c, (e5.g) this.d);
                return;
            case 3:
                e6.d0 d0Var = (e6.d0) this.b;
                HashMap hashMap = d0Var.b.D;
                String str = (String) this.c;
                synchronized (hashMap) {
                    fVar = (e6.f) d0Var.b.D.get(str);
                }
                if (fVar != null) {
                    ((g6.h) fVar).o((String) this.d);
                    return;
                } else {
                    e6.e0.H.b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
            case 4:
                ga.c cVar = (ga.c) this.d;
                z9.b bVar = (z9.b) this.b;
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
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                try {
                    obj = ((o0.f) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new l9.u(24, (e5.t) this.c, obj));
                return;
            case 8:
                ((tf) this.d).J((File) this.c, (ArrayList) this.b);
                return;
            case 9:
                w4.e eVar = (w4.e) this.d;
                eVar.d.c.remove((String) this.c);
                c0.m mVar = (c0.m) this.b;
                if (mVar.a instanceof c0.a) {
                    return;
                }
                try {
                    mVar.get();
                    return;
                } catch (Exception e10) {
                    eVar.c.l(e10);
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
                } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e11);
                    throw new RuntimeException(t4.c.f("Unable to write bitmap to file ", str3), e11);
                }
            case 11:
                c();
                return;
            default:
                z8.d dVar = (z8.d) this.b;
                a9.k0 k0Var = (a9.k0) this.c;
                a9.c0 c0Var = (a9.c0) this.d;
                WearAuthListenerService wearAuthListenerService = dVar.c;
                k0Var.getClass();
                try {
                    c0Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c0Var.c);
                    int i3 = h8.a.a;
                    obtain.writeInt(0);
                    obtain.writeByteArray(null);
                    try {
                        c0Var.b.transact(1, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th4) {
                        obtain.recycle();
                        throw th4;
                    }
                } catch (RemoteException e12) {
                    Log.e("WearableLS", "Failed to send a response back", e12);
                    return;
                }
        }
    }

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ j1(ma maVar, w9.b bVar, String str) {
        this.a = 11;
        this.b = maVar;
        this.d = bVar;
        this.c = str;
    }

    public j1(w4.e eVar, String str, c0.m mVar) {
        this.a = 9;
        this.d = eVar;
        this.c = str;
        this.b = mVar;
    }
}
