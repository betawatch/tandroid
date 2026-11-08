package a9;

import a8.s9;
import a8.wa;
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
import b9.c0;
import b9.k0;
import c8.y9;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f5.t;
import f6.d0;
import f6.e0;
import j6.v;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import m6.m;
import m6.n;
import m9.u;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.j1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.vf;
import sg.i0;
import y7.d6;
import z7.k7;
import z7.m9;
import z7.ma;
import z7.r2;
import z7.ra;
import z7.ta;
import z7.va;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ h() {
        this.a = 8;
    }

    private final void a() {
        f6.f fVar;
        d0 d0Var = (d0) this.b;
        HashMap hashMap = d0Var.b.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            fVar = (f6.f) d0Var.b.D.get(str);
        }
        if (fVar != null) {
            ((h6.h) fVar).o((String) this.d);
        } else {
            e0.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        f6.f fVar;
        synchronized (((v) this.b).I) {
            fVar = (f6.f) ((v) this.b).I.get((String) this.c);
        }
        if (fVar != null) {
            ((h6.h) fVar).o((String) this.d);
        } else {
            v.Y.b("Discarded message for unknown namespace '%s'", (String) this.c);
        }
    }

    private final void c() {
        int i7;
        Task k10;
        m6.a aVar = (m6.a) this.c;
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
            n i10 = n.i(context);
            synchronized (i10) {
                i7 = i10.a;
                i10.a = i7 + 1;
            }
            k10 = i10.k(new m(i7, 2, bundle, 0));
        }
        k10.addOnCompleteListener(m6.d.c, new g6.d0((CountDownLatch) this.d, 18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r4.isEmpty() == false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        va vaVar;
        Object obj = null;
        int i7 = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                k0 k0Var = (k0) this.c;
                c0 c0Var = (c0) this.d;
                WearAuthListenerService wearAuthListenerService = dVar.c;
                k0Var.getClass();
                try {
                    c0Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c0Var.c);
                    int i10 = i8.a.a;
                    obtain.writeInt(0);
                    obtain.writeByteArray(null);
                    try {
                        c0Var.b.transact(1, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e10) {
                    Log.e("WearableLS", "Failed to send a response back", e10);
                    return;
                }
            case 1:
                k kVar = (k) this.b;
                wa waVar = (wa) this.d;
                if (waVar.b > 0) {
                    Bundle bundle = (Bundle) waVar.d;
                    kVar.onCreate(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (waVar.b >= 2) {
                    kVar.onStart();
                }
                if (waVar.b >= 3) {
                    kVar.onResume();
                }
                if (waVar.b >= 4) {
                    kVar.onStop();
                }
                if (waVar.b >= 5) {
                    kVar.onDestroy();
                    return;
                }
                return;
            case 2:
                super/*f5.b*/.c((aa.n) this.c, (j1) this.d);
                return;
            case 3:
                super/*f5.b*/.a((aa.c0) this.c, (f5.g) this.d);
                return;
            case 4:
                a();
                return;
            case 5:
                ha.c cVar = (ha.c) this.d;
                aa.b bVar = (aa.b) this.b;
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
            case 6:
                b();
                return;
            case 7:
                c();
                return;
            case 8:
                try {
                    obj = ((o0.e) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new u(26, (t) this.c, obj));
                return;
            case 9:
                ((vf) this.d).J((File) this.c, (ArrayList) this.b);
                return;
            case 10:
                x4.e eVar = (x4.e) this.d;
                eVar.d.c.remove((String) this.b);
                c0.m mVar = (c0.m) this.c;
                if (mVar.a instanceof c0.a) {
                    return;
                }
                try {
                    mVar.get();
                    return;
                } catch (Exception e11) {
                    eVar.c.l(e11);
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
                    } finally {
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e12) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e12);
                    throw new RuntimeException(rf.b.i("Unable to write bitmap to file ", str3), e12);
                }
            default:
                ma maVar = (ma) this.b;
                i0 i0Var = (i0) this.c;
                k7 k7Var = k7.b;
                String str4 = (String) this.d;
                d6 d6Var = (d6) i0Var.b;
                d6Var.b = k7Var;
                m9 m9Var = (m9) d6Var.a;
                if (m9Var != null) {
                    str = m9Var.d;
                    int i11 = r2.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                s9 s9Var = new s9();
                s9Var.a = maVar.a;
                s9Var.b = maVar.b;
                synchronized (ma.class) {
                    vaVar = ma.j;
                    if (vaVar == null) {
                        n0.c a10 = y9.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i12 = 0;
                        while (i7 < a10.a.size()) {
                            Locale locale = a10.a.get(i7);
                            f5.a aVar = pb.c.a;
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
                            i7++;
                            i12 = i13;
                        }
                        ra raVar = ta.b;
                        vaVar = i12 == 0 ? va.e : new va(i12, objArr);
                        ma.j = vaVar;
                    }
                }
                s9Var.k = vaVar;
                s9Var.g = Boolean.TRUE;
                s9Var.d = str;
                s9Var.c = str4;
                s9Var.e = maVar.f.isSuccessful() ? (String) maVar.f.getResult() : maVar.d.a();
                s9Var.i = 10;
                s9Var.j = Integer.valueOf(maVar.h);
                i0Var.c = s9Var;
                maVar.c.a(i0Var);
                return;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ h(ma maVar, i0 i0Var, String str) {
        this.a = 12;
        this.b = maVar;
        this.c = i0Var;
        this.d = str;
    }
}
