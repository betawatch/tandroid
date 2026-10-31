package c5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.s1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.rf;
import v7.a8;
import w7.i7;
import w7.j9;
import w7.ja;
import w7.oa;
import w7.qa;
import w7.r2;
import w7.sa;
import y8.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ w() {
        this.a = 6;
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
        sa saVar;
        ja jaVar = (ja) this.b;
        m5.e eVar = (m5.e) this.c;
        i7 i7Var = i7.b;
        String str2 = (String) this.d;
        q5.d dVar = (q5.d) eVar.b;
        dVar.c = i7Var;
        j9 j9Var = (j9) dVar.b;
        if (j9Var != null) {
            str = j9Var.d;
            int i10 = r2.a;
            if (str != null) {
            }
        }
        str = "NA";
        a8 a8Var = new a8();
        a8Var.a = jaVar.a;
        a8Var.b = jaVar.b;
        synchronized (ja.class) {
            saVar = ja.j;
            if (saVar == null) {
                n0.c a2 = w7.c0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    a aVar = jb.c.a;
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
                oa oaVar = qa.b;
                saVar = i12 == 0 ? sa.e : new sa(i12, objArr);
                ja.j = saVar;
            }
        }
        a8Var.k = saVar;
        a8Var.g = Boolean.TRUE;
        a8Var.d = str;
        a8Var.c = str2;
        a8Var.e = jaVar.f.isSuccessful() ? (String) jaVar.f.getResult() : jaVar.d.a();
        a8Var.i = 10;
        a8Var.j = Integer.valueOf(jaVar.h);
        eVar.c = a8Var;
        jaVar.c.a(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        c6.f fVar;
        Object obj = null;
        switch (this.a) {
            case 0:
                super/*c5.b*/.c((a4.l) this.c, (s1) this.d);
                return;
            case 1:
                super/*c5.b*/.a((h) this.d, (k6.h) this.c);
                return;
            case 2:
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
            case 3:
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
            case 4:
                da.b bVar = (da.b) this.d;
                x9.b bVar2 = (x9.b) this.b;
                bVar.b(bVar2, (TaskCompletionSource) this.c);
                ((AtomicInteger) bVar.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(bVar.b, bVar.a()) * (60000.0d / bVar.a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + bVar2.b;
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
                try {
                    obj = ((o0.e) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new j9.u(23, (v) this.c, obj));
                return;
            case 7:
                ((rf) this.d).J((File) this.c, (ArrayList) this.b);
                return;
            case 8:
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
            case 9:
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
                    throw new RuntimeException(sc.e.h("Unable to write bitmap to file ", str3), e7);
                }
            case 10:
                b();
                return;
            default:
                x8.d dVar = (x8.d) this.b;
                i0 i0Var = (i0) this.c;
                y8.c0 c0Var = (y8.c0) this.d;
                WearAuthListenerService wearAuthListenerService = dVar.c;
                i0Var.getClass();
                try {
                    c0Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c0Var.c);
                    int i10 = f8.a.a;
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
                } catch (RemoteException e10) {
                    Log.e("WearableLS", "Failed to send a response back", e10);
                    return;
                }
        }
    }

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ w(ja jaVar, m5.e eVar, String str) {
        this.a = 10;
        this.b = jaVar;
        this.c = eVar;
        this.d = str;
    }
}
