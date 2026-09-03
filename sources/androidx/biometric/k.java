package androidx.biometric;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.m1;
import f2.u0;
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
import l7.w0;
import ld.y0;
import m8.c1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.kr;
import org.telegram.ui.mr;
import org.telegram.ui.nm;
import org.telegram.ui.qr;
import org.telegram.ui.xn;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
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
    
        d9.k.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
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
        boolean z4 = false;
        boolean z10 = false;
        while (true) {
            try {
                synchronized (((d9.k) this.c).b) {
                    if (!z4) {
                        d9.k kVar = (d9.k) this.c;
                        if (kVar.c != 4) {
                            kVar.d++;
                            kVar.c = 4;
                            z4 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((d9.k) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((d9.k) this.c).c = 1;
                    }
                }
                if (!z10) {
                    return;
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        boolean z4;
        m8.d dVar;
        int i10 = 0;
        switch (this.a) {
            case 0:
                a0 a0Var = ((r) this.c).i0;
                if (a0Var.e == null) {
                    a0Var.e = new x();
                }
                a0Var.e.d((v) this.b);
                return;
            case 1:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        cb.n nVar = (cb.n) referenceQueue.remove();
                        if (nVar.a.remove(nVar)) {
                            nVar.clear();
                            nVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 2:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ya.a e6) {
                    taskCompletionSource.setException(e6);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(new ya.a("Internal error has occurred when executing ML Kit tasks", e10));
                    return;
                }
            case 3:
                cb.j jVar = (cb.j) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = jVar.b.decrementAndGet();
                b6.m.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    jVar.c();
                    jVar.c.set(false);
                }
                h7.n.a.clear();
                h7.t.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 4:
                cb.m mVar = (cb.m) this.b;
                b6.m.k(((Thread) ((AtomicReference) mVar.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) mVar.d).set(null);
                    mVar.y();
                    return;
                } finally {
                }
            case 5:
                ((com.google.android.gms.internal.cast.o) this.b).L0((c2.v) this.c);
                return;
            case 6:
                try {
                    a();
                    return;
                } catch (Error e11) {
                    synchronized (((d9.k) this.c).b) {
                        ((d9.k) this.c).c = 1;
                        throw e11;
                    }
                }
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
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 10:
                f2.z zVar = (f2.z) this.b;
                m1 m1Var = zVar.e;
                f2.f0 f0Var = (f2.f0) this.c;
                RecyclerView recyclerView = f0Var.E;
                if (recyclerView == null || !recyclerView.D || zVar.v || m1Var.b() == -1) {
                    return;
                }
                u0 itemAnimator = f0Var.E.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList = f0Var.C;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (((f2.z) arrayList.get(i11)).w) {
                        }
                    }
                    f0Var.x.q(m1Var);
                    return;
                }
                f0Var.E.post(this);
                return;
            case 11:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f;
                w0 w0Var = new w0(file);
                File file2 = (File) w0Var.c;
                try {
                    fileOutputStream = w0Var.C();
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
                            h2.d.h(newSerializer, (h2.h) obj3);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.getFD().sync();
                            z4 = true;
                        } catch (IOException unused2) {
                            z4 = false;
                        }
                        if (!z4) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            Log.e("AtomicFile", "Failed to close file output stream", e13);
                        }
                        w0.B(file2, file);
                        return;
                    } catch (Exception e14) {
                        e = e14;
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
                            } catch (IOException e15) {
                                Log.e("AtomicFile", "Failed to close file output stream", e15);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                        }
                        throw new RuntimeException("Failed to write to file " + file, exc);
                    }
                } catch (Exception e16) {
                    e = e16;
                    fileOutputStream = null;
                }
            case 12:
                c0.l lVar = (c0.l) this.c;
                try {
                    ((c0.l) this.b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e17) {
                    lVar.l(e17);
                    return;
                }
            case 13:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.g);
                    fVar.putAll(h2.d.c(shortcutInfoCompatSaverImpl2.f, shortcutInfoCompatSaverImpl2.a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e18) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e18);
                    return;
                }
            case 14:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl3.b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((v8.a) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.b);
                return;
            case 15:
                if (((c0.l) this.b).a instanceof c0.a) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((c0.l) this.b).k(null);
                    return;
                } catch (Exception e19) {
                    ((c0.l) this.b).l(e19);
                    return;
                }
            case 16:
                i9.p.a((i9.p) this.c, (e3.g) this.b);
                return;
            case 17:
                DataHolder dataHolder = (DataHolder) this.b;
                l8.e eVar = new l8.e(dataHolder);
                try {
                    ((l8.m) this.c).c.onDataChanged(eVar);
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
                ((l8.m) this.c).c.onMessageReceived((m8.l0) this.b);
                return;
            case 19:
                ((l8.m) this.c).c.onConnectedNodes((List) this.b);
                return;
            case 20:
                ((l8.m) this.c).c.onCapabilityChanged((m8.b) this.b);
                return;
            case 21:
                ((l8.m) this.c).c.onNotificationReceived((c1) this.b);
                return;
            case 22:
                ((l8.m) this.c).c.onEntityUpdate((m8.w0) this.b);
                return;
            case 23:
                m8.e eVar2 = (m8.e) this.b;
                l8.m mVar2 = (l8.m) this.c;
                eVar2.e(mVar2.c);
                dVar = mVar2.c.zzh;
                eVar2.e(dVar);
                return;
            case 24:
                ((ld.m) this.c).D((y0) this.b);
                return;
            case 25:
                ((ld.m) this.b).D((md.d) this.c);
                return;
            case 26:
                y5.h hVar = (y5.h) this.b;
                Typeface typeface = (Typeface) this.c;
                h5.b0 b0Var = (h5.b0) hVar.b;
                if (b0Var != null) {
                    b0Var.e(typeface);
                    return;
                }
                return;
            case 27:
                ((o0.f) this.b).accept(this.c);
                return;
            case 28:
                xn xnVar = ((nm) this.c).c;
                if (this == xnVar.G5) {
                    xnVar.Ya((CharSequence) this.b, false);
                    xnVar.G5 = null;
                    return;
                }
                return;
            default:
                r8 r8Var = (r8) this.b;
                boolean z10 = r8Var.d.h;
                r8Var.setChecked(!z10);
                qr qrVar = ((mr) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = qrVar.B;
                tL_chatBannedRights.send_media = z10;
                tL_chatBannedRights.send_gifs = z10;
                tL_chatBannedRights.send_inline = z10;
                tL_chatBannedRights.send_games = z10;
                tL_chatBannedRights.send_photos = z10;
                tL_chatBannedRights.send_videos = z10;
                tL_chatBannedRights.send_stickers = z10;
                tL_chatBannedRights.send_audios = z10;
                tL_chatBannedRights.send_docs = z10;
                tL_chatBannedRights.send_voices = z10;
                tL_chatBannedRights.send_roundvideos = z10;
                tL_chatBannedRights.embed_links = z10;
                tL_chatBannedRights.send_polls = z10;
                tL_chatBannedRights.send_reactions = z10;
                AndroidUtilities.updateVisibleRows(qrVar.c);
                kr w02 = qrVar.w0();
                qrVar.B0();
                qrVar.A0(w02);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((d9.k) this.c).c;
                sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.BETA_URL : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public k(d9.k kVar) {
        this.a = 6;
        this.c = kVar;
    }

    public k(f2.f0 f0Var, f2.z zVar, int i10) {
        this.a = 10;
        this.c = f0Var;
        this.b = zVar;
    }
}
