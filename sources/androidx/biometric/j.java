package androidx.biometric;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import f2.q1;
import f2.w0;
import hd.z0;
import i8.d1;
import i8.m0;
import i8.x0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ j(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        FileOutputStream I;
        boolean z10;
        i8.d dVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        FileOutputStream fileOutputStream = null;
        int i9 = 0;
        switch (this.a) {
            case 0:
                y yVar = ((q) this.c).h0;
                if (yVar.e == null) {
                    yVar.e = new v();
                }
                yVar.e.c((t) this.b);
                return;
            case 1:
                ((com.google.android.gms.internal.cast.q) this.b).L0((c2.v) this.c);
                return;
            case 2:
                ((e0.f) this.b).a = this.c;
                return;
            case 3:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.f) this.c);
                return;
            case 4:
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
            case 5:
                e9.q.a((e9.q) this.c, (c3.h) this.b);
                return;
            case 6:
                f2.b0 b0Var = (f2.b0) this.b;
                q1 q1Var = b0Var.e;
                f2.h0 h0Var = (f2.h0) this.c;
                RecyclerView recyclerView = h0Var.D;
                if (recyclerView == null || !recyclerView.C || b0Var.v || q1Var.b() == -1) {
                    return;
                }
                w0 itemAnimator = h0Var.D.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList = h0Var.B;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((f2.b0) arrayList.get(i10)).w) {
                        }
                    }
                    h0Var.x.q(q1Var);
                    return;
                }
                h0Var.D.post(this);
                return;
            case 7:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                j4.c cVar = new j4.c(file);
                File file2 = (File) cVar.c;
                try {
                    I = cVar.I();
                } catch (Exception e11) {
                    exc = e11;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(I);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        Object obj3 = arrayList2.get(i9);
                        i9++;
                        h2.d.h(newSerializer, (h2.f) obj3);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    I.flush();
                    try {
                        I.getFD().sync();
                        z10 = true;
                    } catch (IOException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        I.close();
                    } catch (IOException e12) {
                        Log.e("AtomicFile", "Failed to close file output stream", e12);
                    }
                    j4.c.H(file2, file);
                    return;
                } catch (Exception e13) {
                    exc = e13;
                    fileOutputStream = I;
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
            case 8:
                c0.l lVar = (c0.l) this.c;
                try {
                    ((c0.l) this.b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e15) {
                    lVar.l(e15);
                    return;
                }
            case 9:
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
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((r8.a) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.b);
                return;
            case 11:
                if (((c0.l) this.b).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((c0.l) this.b).k(null);
                    return;
                } catch (Exception e17) {
                    ((c0.l) this.b).l(e17);
                    return;
                }
            case 12:
                DataHolder dataHolder = (DataHolder) this.b;
                h8.e eVar = new h8.e(dataHolder);
                try {
                    ((h8.m) this.c).c.onDataChanged(eVar);
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
            case 13:
                ((h8.m) this.c).c.onMessageReceived((m0) this.b);
                return;
            case 14:
                ((h8.m) this.c).c.onConnectedNodes((List) this.b);
                return;
            case 15:
                ((h8.m) this.c).c.onCapabilityChanged((i8.b) this.b);
                return;
            case 16:
                ((h8.m) this.c).c.onNotificationReceived((d1) this.b);
                return;
            case 17:
                ((h8.m) this.c).c.onEntityUpdate((x0) this.b);
                return;
            case 18:
                i8.e eVar2 = (i8.e) this.b;
                h8.m mVar = (h8.m) this.c;
                eVar2.b(mVar.c);
                dVar = mVar.c.zzh;
                eVar2.b(dVar);
                return;
            case 19:
                ((hd.m) this.c).D((z0) this.b);
                return;
            case 20:
                ((hd.m) this.b).D((id.e) this.c);
                return;
            case 21:
                m5.f0 f0Var = ((m5.e0) this.b).b;
                q5.d dVar2 = (q5.d) this.c;
                q5.b bVar = m5.f0.G;
                m5.d dVar3 = dVar2.d;
                m5.x xVar = dVar2.f;
                m5.d dVar4 = f0Var.t;
                n5.f0 f0Var2 = f0Var.D;
                if (!q5.a.d(dVar3, dVar4)) {
                    f0Var.t = dVar3;
                    f0Var2.c();
                }
                double d = dVar2.a;
                if (Double.isNaN(d) || Math.abs(d - f0Var.v) <= 1.0E-7d) {
                    z11 = false;
                } else {
                    f0Var.v = d;
                    z11 = true;
                }
                boolean z15 = dVar2.b;
                if (z15 != f0Var.w) {
                    f0Var.w = z15;
                    z11 = true;
                }
                q5.b bVar2 = m5.f0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(f0Var.m));
                if (f0Var2 != null && (z11 || f0Var.m)) {
                    f0Var2.f();
                }
                Double.isNaN(dVar2.h);
                int i11 = dVar2.c;
                if (i11 != f0Var.x) {
                    f0Var.x = i11;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(f0Var.m));
                if (f0Var2 != null && (z12 || f0Var.m)) {
                    f0Var2.a();
                }
                int i12 = dVar2.e;
                if (i12 != f0Var.y) {
                    f0Var.y = i12;
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(f0Var.m));
                if (f0Var2 != null && (z13 || f0Var.m)) {
                    f0Var2.e();
                }
                if (!q5.a.d(f0Var.z, xVar)) {
                    f0Var.z = xVar;
                }
                f0Var.m = false;
                return;
            case 22:
                m5.f0 f0Var3 = ((m5.e0) this.b).b;
                q5.c cVar2 = (q5.c) this.c;
                q5.b bVar3 = m5.f0.G;
                String str = cVar2.a;
                if (q5.a.d(str, f0Var3.u)) {
                    z14 = false;
                } else {
                    f0Var3.u = str;
                    z14 = true;
                }
                m5.f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(f0Var3.n));
                n5.f0 f0Var4 = f0Var3.D;
                if (f0Var4 != null && (z14 || f0Var3.n)) {
                    f0Var4.d();
                }
                f0Var3.n = false;
                return;
            case 23:
                md.i iVar = (md.i) this.c;
                hd.a0 a0Var = iVar.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th3) {
                        hd.f0.m(th3, qc.i.a);
                    }
                    Runnable f10 = iVar.f();
                    if (f10 == null) {
                        return;
                    }
                    this.b = f10;
                    i9++;
                    if (i9 >= 16 && a0Var.e()) {
                        a0Var.c(iVar, this);
                        return;
                    }
                }
                break;
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
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
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
                n2.g gVar2 = n2.b0.i;
                bVar5.y(24, 7, gVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                dVar5.a(gVar2, new n2.q(vVar, vVar));
                return;
            case 27:
                n2.b bVar6 = (n2.b) this.b;
                n2.m mVar2 = (n2.m) this.c;
                n2.g gVar3 = n2.b0.i;
                bVar6.y(24, 9, gVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                mVar2.c(gVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 28:
                k5.i iVar2 = (k5.i) this.b;
                Typeface typeface = (Typeface) this.c;
                d5.d0 d0Var = (d5.d0) iVar2.b;
                if (d0Var != null) {
                    d0Var.d(typeface);
                    return;
                }
                return;
            default:
                ((n2.u) this.b).accept(this.c);
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public j(f2.h0 h0Var, f2.b0 b0Var, int i9) {
        this.a = 6;
        this.c = h0Var;
        this.b = b0Var;
    }
}
