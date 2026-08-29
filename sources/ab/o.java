package ab;

import ag.o1;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.biometric.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.e0;
import f2.n1;
import f2.u0;
import f5.b0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import jd.y0;
import k8.d1;
import k8.m0;
import k8.x0;
import l3.g0;
import o5.d0;
import o5.x;
import org.telegram.messenger.BuildConfig;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
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
    
        b9.l.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
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
                synchronized (((b9.l) this.c).b) {
                    if (!z10) {
                        b9.l lVar = (b9.l) this.c;
                        if (lVar.c != 4) {
                            lVar.d++;
                            lVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((b9.l) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((b9.l) this.c).c = 1;
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
        FileOutputStream fileOutputStream;
        boolean z10;
        k8.d dVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        p pVar = (p) referenceQueue.remove();
                        if (pVar.a.remove(pVar)) {
                            pVar.clear();
                            pVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 1:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (wa.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new wa.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 2:
                j jVar = (j) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = jVar.b.decrementAndGet();
                z5.l.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    jVar.c();
                    jVar.c.set(false);
                }
                f7.n.a.clear();
                f7.u.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 3:
                m mVar = (m) this.b;
                z5.l.k(((Thread) ((AtomicReference) mVar.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) mVar.d).set(null);
                    mVar.v();
                    return;
                } finally {
                }
            case 4:
                z zVar = ((androidx.biometric.q) this.c).h0;
                if (zVar.e == null) {
                    zVar.e = new androidx.biometric.w();
                }
                zVar.e.c((androidx.biometric.u) this.b);
                return;
            case 5:
                try {
                    a();
                    return;
                } catch (Error e12) {
                    synchronized (((b9.l) this.c).b) {
                        ((b9.l) this.c).c = 1;
                        throw e12;
                    }
                }
            case 6:
                ((com.google.android.gms.internal.cast.q) this.b).L0((c2.w) this.c);
                return;
            case 7:
                ((e0.f) this.b).a = this.c;
                return;
            case 8:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.f) this.c);
                return;
            case 9:
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
                } catch (RuntimeException e13) {
                    if (e13.getClass() == RuntimeException.class && e13.getMessage() != null && e13.getMessage().startsWith("Unable to stop")) {
                        throw e13;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 10:
                f2.z zVar2 = (f2.z) this.b;
                n1 n1Var = zVar2.e;
                e0 e0Var = (e0) this.c;
                RecyclerView recyclerView = e0Var.D;
                if (recyclerView == null || !recyclerView.C || zVar2.v || n1Var.b() == -1) {
                    return;
                }
                u0 itemAnimator = e0Var.D.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList = e0Var.B;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (((f2.z) arrayList.get(i11)).w) {
                        }
                    }
                    e0Var.x.q(n1Var);
                    return;
                }
                e0Var.D.post(this);
                return;
            case 11:
                g9.r.a((g9.r) this.c, (e3.f) this.b);
                return;
            case 12:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                g0 g0Var = new g0(file);
                File file2 = (File) g0Var.c;
                try {
                    fileOutputStream = g0Var.D();
                } catch (Exception e14) {
                    e = e14;
                    fileOutputStream = null;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
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
                    fileOutputStream.flush();
                    try {
                        fileOutputStream.getFD().sync();
                        z10 = true;
                    } catch (IOException unused2) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e15) {
                        Log.e("AtomicFile", "Failed to close file output stream", e15);
                    }
                    g0.C(file2, file);
                    return;
                } catch (Exception e16) {
                    e = e16;
                    Exception exc = e;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e17) {
                            Log.e("AtomicFile", "Failed to close file output stream", e17);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 13:
                c0.l lVar = (c0.l) this.c;
                try {
                    ((c0.l) this.b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e18) {
                    lVar.l(e18);
                    return;
                }
            case 14:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(h2.d.c(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e19) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e19);
                    return;
                }
            case 15:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((t8.a) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.b);
                return;
            case 16:
                if (((c0.l) this.b).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((c0.l) this.b).k(null);
                    return;
                } catch (Exception e20) {
                    ((c0.l) this.b).l(e20);
                    return;
                }
            case 17:
                DataHolder dataHolder = (DataHolder) this.b;
                j8.e eVar = new j8.e(dataHolder);
                try {
                    ((j8.m) this.c).c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    DataHolder dataHolder2 = eVar.a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th3;
                }
            case 18:
                ((j8.m) this.c).c.onMessageReceived((m0) this.b);
                return;
            case 19:
                ((j8.m) this.c).c.onConnectedNodes((List) this.b);
                return;
            case 20:
                ((j8.m) this.c).c.onCapabilityChanged((k8.b) this.b);
                return;
            case 21:
                ((j8.m) this.c).c.onNotificationReceived((d1) this.b);
                return;
            case 22:
                ((j8.m) this.c).c.onEntityUpdate((x0) this.b);
                return;
            case 23:
                k8.e eVar2 = (k8.e) this.b;
                j8.m mVar2 = (j8.m) this.c;
                eVar2.b(mVar2.c);
                dVar = mVar2.c.zzh;
                eVar2.b(dVar);
                return;
            case 24:
                ((jd.m) this.c).D((y0) this.b);
                return;
            case 25:
                ((jd.m) this.b).D((kd.d) this.c);
                return;
            case 26:
                o1 o1Var = (o1) this.b;
                Typeface typeface = (Typeface) this.c;
                b0 b0Var = (b0) o1Var.b;
                if (b0Var != null) {
                    b0Var.d(typeface);
                    return;
                }
                return;
            case 27:
                ((o0.f) this.b).accept(this.c);
                return;
            case 28:
                o5.e0 e0Var2 = ((d0) this.b).b;
                s5.d dVar2 = (s5.d) this.c;
                s5.b bVar = o5.e0.G;
                o5.d dVar3 = dVar2.d;
                x xVar = dVar2.f;
                o5.d dVar4 = e0Var2.t;
                p5.d0 d0Var = e0Var2.D;
                if (!s5.a.d(dVar3, dVar4)) {
                    e0Var2.t = dVar3;
                    d0Var.c();
                }
                double d = dVar2.a;
                if (Double.isNaN(d) || Math.abs(d - e0Var2.v) <= 1.0E-7d) {
                    z11 = false;
                } else {
                    e0Var2.v = d;
                    z11 = true;
                }
                boolean z15 = dVar2.b;
                if (z15 != e0Var2.w) {
                    e0Var2.w = z15;
                    z11 = true;
                }
                s5.b bVar2 = o5.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var2.m));
                if (d0Var != null && (z11 || e0Var2.m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar2.h);
                int i12 = dVar2.c;
                if (i12 != e0Var2.x) {
                    e0Var2.x = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var2.m));
                if (d0Var != null && (z12 || e0Var2.m)) {
                    d0Var.a();
                }
                int i13 = dVar2.e;
                if (i13 != e0Var2.y) {
                    e0Var2.y = i13;
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.m));
                if (d0Var != null && (z13 || e0Var2.m)) {
                    d0Var.e();
                }
                if (!s5.a.d(e0Var2.z, xVar)) {
                    e0Var2.z = xVar;
                }
                e0Var2.m = false;
                return;
            default:
                o5.e0 e0Var3 = ((d0) this.b).b;
                s5.c cVar = (s5.c) this.c;
                s5.b bVar3 = o5.e0.G;
                String str = cVar.a;
                if (s5.a.d(str, e0Var3.u)) {
                    z14 = false;
                } else {
                    e0Var3.u = str;
                    z14 = true;
                }
                o5.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(e0Var3.n));
                p5.d0 d0Var2 = e0Var3.D;
                if (d0Var2 != null && (z14 || e0Var3.n)) {
                    d0Var2.d();
                }
                e0Var3.n = false;
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((b9.l) this.c).c;
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.BETA_URL : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public o(b9.l lVar) {
        this.a = 5;
        this.c = lVar;
    }

    public o(e0 e0Var, f2.z zVar, int i10) {
        this.a = 10;
        this.c = e0Var;
        this.b = zVar;
    }
}
