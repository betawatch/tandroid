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
import androidx.mediarouter.app.n0;
import com.google.android.gms.internal.vision.g3;
import h2.m0;
import h9.f0;
import h9.g0;
import h9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.z00;
import org.telegram.ui.PhotoViewer;
import s4.o0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class q extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q(Object obj, int i7) {
        this.a = i7;
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
            uVar.f((b2.a) message.obj);
            ((s) this.b).a(uVar, qVar);
            uVar.f(null);
        }
    }

    private final void b(Message message) {
        qb.a aVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i7 = message.what;
        if (i7 == 1) {
            q2.b bVar = (q2.b) this.b;
            m4.d0 d0Var = bVar.c;
            if (obj == bVar.z) {
                if (bVar.p == 2 || bVar.k()) {
                    bVar.z = null;
                    if (obj2 instanceof Exception) {
                        d0Var.j0((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.b.W(((q2.v) obj2).a);
                        d0Var.b = null;
                        HashSet hashSet = (HashSet) d0Var.a;
                        i0 q10 = i0.q(hashSet);
                        hashSet.clear();
                        g0 listIterator = q10.listIterator(0);
                        while (listIterator.hasNext()) {
                            q2.b bVar2 = (q2.b) listIterator.next();
                            if (bVar2.n()) {
                                bVar2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e10) {
                        d0Var.j0(e10, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i7 != 2) {
            return;
        }
        q2.b bVar3 = (q2.b) this.b;
        if (obj == bVar3.x && bVar3.k()) {
            bVar3.x = null;
            synchronized (bVar3.o) {
                qt qtVar = bVar3.y;
                qtVar.getClass();
                aVar = new qb.a(21);
                ((f0) qtVar.b).f();
                bVar3.y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                bVar3.m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] O = bVar3.b.O(bVar3.v, ((q2.v) obj2).a);
                if (bVar3.w != null && O != null && O.length != 0) {
                    bVar3.w = O;
                }
                bVar3.p = 4;
                bVar3.i(new m3(aVar, 14));
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
        q4.l lVar;
        s sVar;
        q qVar;
        if (message.what == 1) {
            synchronized (((s) this.b).b) {
                lVar = (q4.l) ((s) this.b).d.get();
                sVar = (s) this.b;
                qVar = (q) sVar.f;
            }
            if (lVar == null || sVar != lVar.b() || qVar == null) {
                return;
            }
            lVar.d((q4.r) message.obj);
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
        u2.d dVar;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        u2.d dVar2 = null;
        switch (this.a) {
            case 0:
                a(message);
                return;
            case 1:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                q qVar = gVar.M;
                int i7 = message.what;
                if (i7 == 1) {
                    gVar.e((List) message.obj);
                    return;
                }
                if (i7 == 2) {
                    if (gVar.r.isEmpty()) {
                        gVar.i(2);
                        qVar.removeMessages(2);
                        qVar.removeMessages(3);
                        qVar.sendMessageDelayed(qVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i7 == 3 && gVar.r.isEmpty()) {
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
                androidx.mediarouter.app.b0 b0Var = (androidx.mediarouter.app.b0) this.b;
                List list = (List) message.obj;
                b0Var.F = SystemClock.uptimeMillis();
                b0Var.s.clear();
                b0Var.s.addAll(list);
                b0Var.w.D();
                return;
            case 3:
                n0 n0Var = (n0) this.b;
                int i10 = message.what;
                if (i10 == 1) {
                    n0Var.n();
                    return;
                } else {
                    if (i10 == 2 && n0Var.M != null) {
                        n0Var.M = null;
                        n0Var.o();
                        return;
                    }
                    return;
                }
            case 4:
                if (message.what != 1) {
                    return;
                }
                ((org.telegram.messenger.b) this.b).h = message.arg1;
                ((org.telegram.messenger.b) this.b).i = false;
                return;
            case 5:
                z00 z00Var = (z00) this.b;
                y00 y00Var = z00Var.g;
                int i11 = message.what;
                if (i11 == 1) {
                    y00Var.getClass();
                    return;
                }
                if (i11 == 2) {
                    z00Var.f.removeMessages(3);
                    z00Var.j = false;
                    z00Var.k = true;
                    y00Var.onLongPress(z00Var.n);
                    return;
                }
                if (i11 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                x00 x00Var = z00Var.h;
                if (x00Var != null) {
                    if (z00Var.i) {
                        z00Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) x00Var).Y1(z00Var.n);
                        return;
                    }
                }
                return;
            case 6:
                a10 a10Var = (a10) this.b;
                b10 b10Var = a10Var.f;
                int i12 = message.what;
                if (i12 == 1) {
                    b10Var.onShowPress(a10Var.m);
                    return;
                }
                if (i12 == 2) {
                    a10Var.e.removeMessages(3);
                    a10Var.i = false;
                    a10Var.j = true;
                    b10Var.onLongPress(a10Var.m);
                    return;
                }
                if (i12 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                b10 b10Var2 = a10Var.g;
                if (b10Var2 != null) {
                    if (a10Var.h) {
                        a10Var.i = true;
                        return;
                    } else {
                        b10Var2.onSingleTapConfirmed(a10Var.m);
                        return;
                    }
                }
                return;
            case 7:
                p4.v vVar = (p4.v) message.obj;
                ui.e eVar = (ui.e) this.b;
                if (eVar.D(vVar)) {
                    p4.u uVar = vVar.d;
                    uVar.getClass();
                    uVar.g();
                    eVar.T(vVar);
                    return;
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
                ArrayList arrayList = ((q2.e) this.b).x;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    q2.b bVar = (q2.b) obj;
                    bVar.p();
                    if (Arrays.equals(bVar.v, bArr)) {
                        if (message.what == 2 && bVar.p == 4) {
                            String str = m0.a;
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
                SparseArray sparseArray = ((s4.g) this.b).j;
                o0 o0Var = (o0) sparseArray.get(i15);
                if (o0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i15);
                if (i14 == 3) {
                    o0Var.b((Bundle) obj2);
                    return;
                } else {
                    if (i14 != 4) {
                        return;
                    }
                    o0.a(peekData != null ? peekData.getString("error") : null, (Bundle) obj2);
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
                    g3Var.f((s4.n) g3Var.h);
                    return;
                }
                g3Var.c = false;
                org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) g3Var.f;
                if (nVar != null) {
                    ca.i iVar = (ca.i) g3Var.n;
                    s4.e eVar2 = (s4.e) nVar.a;
                    s4.u d = eVar2.d(g3Var);
                    if (d != null) {
                        eVar2.m(d, iVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                u2.e eVar3 = (u2.e) this.b;
                int i17 = message.what;
                if (i17 == 1) {
                    dVar = (u2.d) message.obj;
                    try {
                        eVar3.a.queueInputBuffer(dVar.a, 0, dVar.b, dVar.d, dVar.e);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = eVar3.d;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i17 != 2) {
                        if (i17 == 3) {
                            eVar3.e.e();
                        } else if (i17 != 4) {
                            AtomicReference atomicReference2 = eVar3.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                eVar3.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e11) {
                                AtomicReference atomicReference3 = eVar3.d;
                                while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (dVar2 == null) {
                            u2.e.d(dVar2);
                            return;
                        }
                        return;
                    }
                    dVar = (u2.d) message.obj;
                    int i18 = dVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar.c;
                    long j3 = dVar.d;
                    int i19 = dVar.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            eVar3.a.queueSecureInputBuffer(i18, 0, cryptoInfo, j3, i19);
                        } else {
                            synchronized (u2.e.n) {
                                eVar3.a.queueSecureInputBuffer(i18, 0, cryptoInfo, j3, i19);
                            }
                        }
                    } catch (RuntimeException e12) {
                        AtomicReference atomicReference4 = eVar3.d;
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
    public /* synthetic */ q(Object obj, Looper looper, int i7) {
        super(looper);
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s4.g gVar) {
        super(Looper.getMainLooper());
        this.a = 11;
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Looper looper, ui.e eVar) {
        super(looper);
        this.a = 7;
        this.b = eVar;
    }
}
