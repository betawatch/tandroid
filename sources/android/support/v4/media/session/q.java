package android.support.v4.media.session;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.mediarouter.app.o0;
import com.google.android.gms.internal.vision.g3;
import g2.n0;
import g9.f0;
import g9.g0;
import g9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import mi.h0;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.y00;
import org.telegram.ui.PhotoViewer;
import r4.p0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void a(Message message) {
        u uVar;
        s sVar;
        q qVar;
        if (message.what == 1) {
            synchronized (((s) this.b).b) {
                uVar = (u) ((s) this.b).d.get();
                sVar = (s) this.b;
                qVar = (q) sVar.f;
            }
            if (uVar == null || sVar != uVar.b() || qVar == null) {
                return;
            }
            uVar.f((a2.a) message.obj);
            ((s) this.b).a(uVar, qVar);
            uVar.f(null);
        }
    }

    private final void b(Message message) {
        v7.s sVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i3 = message.what;
        if (i3 == 1) {
            p2.b bVar = (p2.b) this.b;
            h0 h0Var = bVar.c;
            if (obj == bVar.z) {
                if (bVar.p == 2 || bVar.k()) {
                    bVar.z = null;
                    if (obj2 instanceof Exception) {
                        h0Var.S((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.b.F1(((p2.v) obj2).a);
                        h0Var.c = null;
                        HashSet hashSet = (HashSet) h0Var.b;
                        i0 q10 = i0.q(hashSet);
                        hashSet.clear();
                        g0 listIterator = q10.listIterator(0);
                        while (listIterator.hasNext()) {
                            p2.b bVar2 = (p2.b) listIterator.next();
                            if (bVar2.n()) {
                                bVar2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e10) {
                        h0Var.S(e10, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i3 != 2) {
            return;
        }
        p2.b bVar3 = (p2.b) this.b;
        if (obj == bVar3.x && bVar3.k()) {
            bVar3.x = null;
            synchronized (bVar3.o) {
                nh nhVar = bVar3.y;
                nhVar.getClass();
                sVar = new v7.s(20);
                ((f0) nhVar.b).f();
                bVar3.y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                bVar3.m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] o12 = bVar3.b.o1(bVar3.v, ((p2.v) obj2).a);
                if (bVar3.w != null && o12 != null && o12.length != 0) {
                    bVar3.w = o12;
                }
                bVar3.p = 4;
                bVar3.i(new e3(sVar, 6));
            } catch (Exception e11) {
                e = e11;
                bVar3.m(e, true);
            } catch (NoSuchMethodError e12) {
                e = e12;
                bVar3.m(e, true);
            }
        }
    }

    private final void c(Message message) {
        p4.l lVar;
        s sVar;
        q qVar;
        if (message.what == 1) {
            synchronized (((s) this.b).b) {
                lVar = (p4.l) ((s) this.b).d.get();
                sVar = (s) this.b;
                qVar = (q) sVar.f;
            }
            if (lVar == null || sVar != lVar.b() || qVar == null) {
                return;
            }
            lVar.d((p4.r) message.obj);
            ((s) this.b).b(lVar, qVar);
            lVar.d(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        t2.d dVar;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        t2.d dVar2 = null;
        switch (this.a) {
            case 0:
                a(message);
                return;
            case 1:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                q qVar = gVar.N;
                int i3 = message.what;
                if (i3 == 1) {
                    gVar.e((List) message.obj);
                    return;
                }
                if (i3 == 2) {
                    if (gVar.r.isEmpty()) {
                        gVar.i(2);
                        qVar.removeMessages(2);
                        qVar.removeMessages(3);
                        qVar.sendMessageDelayed(qVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i3 == 3 && gVar.r.isEmpty()) {
                    gVar.i(3);
                    qVar.removeMessages(2);
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    gVar.f.h(gVar.h);
                    return;
                }
                return;
            case 2:
                if (message.what != 1) {
                    return;
                }
                androidx.mediarouter.app.c0 c0Var = (androidx.mediarouter.app.c0) this.b;
                List list = (List) message.obj;
                c0Var.G = SystemClock.uptimeMillis();
                c0Var.s.clear();
                c0Var.s.addAll(list);
                c0Var.w.D();
                return;
            case 3:
                o0 o0Var = (o0) this.b;
                int i10 = message.what;
                if (i10 == 1) {
                    o0Var.n();
                    return;
                } else {
                    if (i10 == 2 && o0Var.N != null) {
                        o0Var.N = null;
                        o0Var.o();
                        return;
                    }
                    return;
                }
            case 4:
                o4.v vVar = (o4.v) message.obj;
                ui.f fVar = (ui.f) this.b;
                if (fVar.t(vVar)) {
                    o4.u uVar = vVar.d;
                    uVar.getClass();
                    uVar.g();
                    fVar.K(vVar);
                    return;
                }
                return;
            case 5:
                if (message.what != 1) {
                    return;
                }
                ((org.telegram.messenger.b) this.b).h = message.arg1;
                ((org.telegram.messenger.b) this.b).i = false;
                return;
            case 6:
                v00 v00Var = (v00) this.b;
                u00 u00Var = v00Var.g;
                int i11 = message.what;
                if (i11 == 1) {
                    u00Var.getClass();
                    return;
                }
                if (i11 == 2) {
                    v00Var.f.removeMessages(3);
                    v00Var.j = false;
                    v00Var.k = true;
                    u00Var.onLongPress(v00Var.n);
                    return;
                }
                if (i11 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                t00 t00Var = v00Var.h;
                if (t00Var != null) {
                    if (v00Var.i) {
                        v00Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) t00Var).d2(v00Var.n);
                        return;
                    }
                }
                return;
            case 7:
                w00 w00Var = (w00) this.b;
                x00 x00Var = w00Var.f;
                int i12 = message.what;
                if (i12 == 1) {
                    x00Var.onShowPress(w00Var.m);
                    return;
                }
                if (i12 == 2) {
                    w00Var.e.removeMessages(3);
                    w00Var.i = false;
                    w00Var.j = true;
                    x00Var.onLongPress(w00Var.m);
                    return;
                }
                if (i12 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                x00 x00Var2 = w00Var.g;
                if (x00Var2 != null) {
                    if (w00Var.h) {
                        w00Var.i = true;
                        return;
                    } else {
                        x00Var2.onSingleTapConfirmed(w00Var.m);
                        return;
                    }
                }
                return;
            case 8:
                b(message);
                return;
            case 9:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((p2.e) this.b).x;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    p2.b bVar = (p2.b) obj;
                    bVar.p();
                    if (Arrays.equals(bVar.v, bArr)) {
                        if (message.what == 2 && bVar.p == 4) {
                            String str = n0.a;
                            bVar.j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 10:
                c(message);
                return;
            case 11:
                int i14 = message.what;
                int i15 = message.arg1;
                Object obj2 = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((r4.g) this.b).j;
                p0 p0Var = (p0) sparseArray.get(i15);
                if (p0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i15);
                if (i14 == 3) {
                    p0Var.b((Bundle) obj2);
                    return;
                } else {
                    if (i14 != 4) {
                        return;
                    }
                    p0.a(peekData != null ? peekData.getString("error") : null, (Bundle) obj2);
                    return;
                }
            case 12:
                g3 g3Var = (g3) this.b;
                int i16 = message.what;
                if (i16 != 1) {
                    if (i16 != 2) {
                        return;
                    }
                    g3Var.b = false;
                    g3Var.f((r4.n) g3Var.h);
                    return;
                }
                g3Var.c = false;
                y00 y00Var = (y00) g3Var.f;
                if (y00Var != null) {
                    ba.i iVar = (ba.i) g3Var.n;
                    r4.e eVar = (r4.e) y00Var.a;
                    r4.v d = eVar.d(g3Var);
                    if (d != null) {
                        eVar.m(d, iVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                t2.e eVar2 = (t2.e) this.b;
                int i17 = message.what;
                if (i17 == 1) {
                    dVar = (t2.d) message.obj;
                    try {
                        eVar2.a.queueInputBuffer(dVar.a, 0, dVar.b, dVar.d, dVar.e);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = eVar2.d;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            eVar2.e.e();
                        } else if (i17 != 4) {
                            AtomicReference atomicReference2 = eVar2.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                eVar2.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e11) {
                                AtomicReference atomicReference3 = eVar2.d;
                                while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (dVar2 == null) {
                            t2.e.e(dVar2);
                            return;
                        }
                        return;
                    }
                    dVar = (t2.d) message.obj;
                    int i18 = dVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar.c;
                    long j10 = dVar.d;
                    int i19 = dVar.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            eVar2.a.queueSecureInputBuffer(i18, 0, cryptoInfo, j10, i19);
                        } else {
                            synchronized (t2.e.n) {
                                eVar2.a.queueSecureInputBuffer(i18, 0, cryptoInfo, j10, i19);
                            }
                        }
                    } catch (RuntimeException e12) {
                        AtomicReference atomicReference4 = eVar2.d;
                        while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                        }
                    }
                }
                dVar2 = dVar;
                if (dVar2 == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Looper looper, int i3) {
        super(looper);
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r4.g gVar) {
        super(Looper.getMainLooper());
        this.a = 11;
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Looper looper, ui.f fVar) {
        super(looper);
        this.a = 4;
        this.b = fVar;
    }
}
