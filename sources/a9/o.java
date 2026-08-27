package a9;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c2.u;
import com.google.android.gms.common.data.DataHolder;
import f2.a0;
import f2.f0;
import f2.o1;
import f2.v0;
import id.z0;
import j8.c1;
import j8.l0;
import j8.w0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import m5.e0;
import org.telegram.messenger.BuildConfig;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        a9.q.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            try {
                synchronized (((q) this.c).b) {
                    if (!z10) {
                        q qVar = (q) this.c;
                        if (qVar.c != 4) {
                            qVar.d++;
                            qVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((q) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((q) this.c).c = 1;
                    }
                }
                if (!z11) {
                    return;
                }
            } finally {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        FileOutputStream K;
        boolean z10;
        j8.d dVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        FileOutputStream fileOutputStream = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e9) {
                    synchronized (((q) this.c).b) {
                        ((q) this.c).c = 1;
                        throw e9;
                    }
                }
            case 1:
                y yVar = ((androidx.biometric.p) this.c).h0;
                if (yVar.e == null) {
                    yVar.e = new v();
                }
                yVar.e.c((t) this.b);
                return;
            case 2:
                ((com.google.android.gms.internal.cast.p) this.b).L0((u) this.c);
                return;
            case 3:
                ((e0.f) this.b).a = this.c;
                return;
            case 4:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.f) this.c);
                return;
            case 5:
                Object obj = this.c;
                Object obj2 = this.b;
                try {
                    Method method = e0.g.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.g.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 6:
                a0 a0Var = (a0) this.b;
                o1 o1Var = a0Var.e;
                f0 f0Var = (f0) this.c;
                RecyclerView recyclerView = f0Var.D;
                if (recyclerView == null || !recyclerView.C || a0Var.v || o1Var.b() == -1) {
                    return;
                }
                v0 itemAnimator = f0Var.D.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList = f0Var.B;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (((a0) arrayList.get(i11)).w) {
                        }
                    }
                    f0Var.x.q(o1Var);
                    return;
                }
                f0Var.D.post(this);
                return;
            case 7:
                f9.q.a((f9.q) this.c, (c3.g) this.b);
                return;
            case 8:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                j9.a aVar = new j9.a(file);
                File file2 = (File) aVar.c;
                try {
                    K = aVar.K();
                } catch (Exception e11) {
                    exc = e11;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(K);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj3 = arrayList2.get(i10);
                        i10++;
                        h2.d.h(newSerializer, (h2.f) obj3);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    K.flush();
                    try {
                        K.getFD().sync();
                        z10 = true;
                    } catch (IOException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        K.close();
                    } catch (IOException e12) {
                        Log.e("AtomicFile", "Failed to close file output stream", e12);
                    }
                    j9.a.J(file2, file);
                    return;
                } catch (Exception e13) {
                    exc = e13;
                    fileOutputStream = K;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused2) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e14) {
                            Log.e("AtomicFile", "Failed to close file output stream", e14);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 9:
                c0.l lVar = (c0.l) this.c;
                try {
                    ((c0.l) this.b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e15) {
                    lVar.l(e15);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(h2.d.c(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e16) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e16);
                    return;
                }
            case 11:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((s8.a) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.b);
                return;
            case 12:
                if (((c0.l) this.c).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.b).run();
                    ((c0.l) this.c).k(null);
                    return;
                } catch (Exception e17) {
                    ((c0.l) this.c).l(e17);
                    return;
                }
            case 13:
                DataHolder dataHolder = (DataHolder) this.b;
                i8.e eVar = new i8.e(dataHolder);
                try {
                    ((i8.m) this.c).c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 14:
                ((i8.m) this.c).c.onMessageReceived((l0) this.b);
                return;
            case 15:
                ((i8.m) this.c).c.onConnectedNodes((List) this.b);
                return;
            case 16:
                ((i8.m) this.c).c.onCapabilityChanged((j8.b) this.b);
                return;
            case 17:
                ((i8.m) this.c).c.onNotificationReceived((c1) this.b);
                return;
            case 18:
                ((i8.m) this.c).c.onEntityUpdate((w0) this.b);
                return;
            case 19:
                j8.e eVar2 = (j8.e) this.b;
                i8.m mVar = (i8.m) this.c;
                eVar2.b(mVar.c);
                dVar = mVar.c.zzh;
                eVar2.b(dVar);
                return;
            case 20:
                ((id.m) this.c).D((z0) this.b);
                return;
            case 21:
                ((id.m) this.b).D((jd.e) this.c);
                return;
            case 22:
                m5.f0 f0Var2 = ((e0) this.b).b;
                r5.d dVar2 = (r5.d) this.c;
                r5.b bVar = m5.f0.G;
                m5.d dVar3 = dVar2.d;
                m5.y yVar2 = dVar2.f;
                m5.d dVar4 = f0Var2.t;
                n5.e0 e0Var = f0Var2.D;
                if (!r5.a.d(dVar3, dVar4)) {
                    f0Var2.t = dVar3;
                    e0Var.c();
                }
                double d = dVar2.a;
                if (Double.isNaN(d) || Math.abs(d - f0Var2.v) <= 1.0E-7d) {
                    z11 = false;
                } else {
                    f0Var2.v = d;
                    z11 = true;
                }
                boolean z15 = dVar2.b;
                if (z15 != f0Var2.w) {
                    f0Var2.w = z15;
                    z11 = true;
                }
                r5.b bVar2 = m5.f0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(f0Var2.m));
                if (e0Var != null && (z11 || f0Var2.m)) {
                    e0Var.f();
                }
                Double.isNaN(dVar2.h);
                int i12 = dVar2.c;
                if (i12 != f0Var2.x) {
                    f0Var2.x = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(f0Var2.m));
                if (e0Var != null && (z12 || f0Var2.m)) {
                    e0Var.a();
                }
                int i13 = dVar2.e;
                if (i13 != f0Var2.y) {
                    f0Var2.y = i13;
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(f0Var2.m));
                if (e0Var != null && (z13 || f0Var2.m)) {
                    e0Var.e();
                }
                if (!r5.a.d(f0Var2.z, yVar2)) {
                    f0Var2.z = yVar2;
                }
                f0Var2.m = false;
                return;
            case 23:
                m5.f0 f0Var3 = ((e0) this.b).b;
                r5.c cVar = (r5.c) this.c;
                r5.b bVar3 = m5.f0.G;
                String str = cVar.a;
                if (r5.a.d(str, f0Var3.u)) {
                    z14 = false;
                } else {
                    f0Var3.u = str;
                    z14 = true;
                }
                m5.f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(f0Var3.n));
                n5.e0 e0Var2 = f0Var3.D;
                if (e0Var2 != null && (z14 || f0Var3.n)) {
                    e0Var2.d();
                }
                f0Var3.n = false;
                return;
            case 24:
                n2.b bVar4 = (n2.b) this.b;
                n2.g gVar = (n2.g) this.c;
                if (((n2.n) bVar4.f.c) != null) {
                    ((n2.n) bVar4.f.c).onPurchasesUpdated(gVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 25:
                Future future = (Future) this.c;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.b;
                future.cancel(true);
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                n2.b bVar5 = (n2.b) this.b;
                org.telegram.messenger.d dVar5 = (org.telegram.messenger.d) this.c;
                n2.g gVar2 = n2.a0.i;
                bVar5.y(24, 7, gVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                dVar5.a(gVar2, new n2.p(vVar, vVar));
                return;
            case 27:
                n2.b bVar6 = (n2.b) this.b;
                n2.m mVar2 = (n2.m) this.c;
                n2.g gVar3 = n2.a0.i;
                bVar6.y(24, 9, gVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                mVar2.c(gVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 28:
                nd.i iVar = (nd.i) this.c;
                id.a0 a0Var2 = iVar.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th3) {
                        id.f0.m(th3, rc.i.a);
                    }
                    Runnable f10 = iVar.f();
                    if (f10 == null) {
                        return;
                    }
                    this.b = f10;
                    i10++;
                    if (i10 >= 16 && a0Var2.e()) {
                        a0Var2.c(iVar, this);
                        return;
                    }
                }
                break;
            default:
                i iVar2 = (i) this.b;
                Typeface typeface = (Typeface) this.c;
                d5.e0 e0Var3 = (d5.e0) iVar2.b;
                if (e0Var3 != null) {
                    e0Var3.d(typeface);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((q) this.c).c;
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.BETA_URL : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public o(q qVar) {
        this.a = 0;
        this.c = qVar;
    }

    public o(f0 f0Var, a0 a0Var, int i10) {
        this.a = 6;
        this.c = f0Var;
        this.b = a0Var;
    }
}
