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
import e9.k0;
import e9.l0;
import e9.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.r10;
import org.telegram.ui.PhotoViewer;
import p4.p0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
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
            uVar.f((y1.a) message.obj);
            ((s) this.b).a(uVar, qVar);
            uVar.f(null);
        }
    }

    private final void b(Message message) {
        oa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 == 1) {
            n2.b bVar = (n2.b) this.b;
            m5.e eVar = bVar.c;
            if (obj == bVar.z) {
                if (bVar.p == 2 || bVar.k()) {
                    bVar.z = null;
                    if (obj2 instanceof Exception) {
                        eVar.U((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.b.X0(((n2.w) obj2).a);
                        eVar.c = null;
                        HashSet hashSet = (HashSet) eVar.b;
                        n0 u10 = n0.u(hashSet);
                        hashSet.clear();
                        l0 listIterator = u10.listIterator(0);
                        while (listIterator.hasNext()) {
                            n2.b bVar2 = (n2.b) listIterator.next();
                            if (bVar2.n()) {
                                bVar2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        eVar.U(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        n2.b bVar3 = (n2.b) this.b;
        if (obj == bVar3.x && bVar3.k()) {
            bVar3.x = null;
            synchronized (bVar3.o) {
                n2.u uVar = bVar3.y;
                uVar.getClass();
                dVar = new oa.d(12);
                ((k0) uVar.b).f();
                bVar3.y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                bVar3.m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] P0 = bVar3.b.P0(bVar3.v, ((n2.w) obj2).a);
                if (bVar3.w != null && P0 != null && P0.length != 0) {
                    bVar3.w = P0;
                }
                bVar3.p = 4;
                bVar3.i(new mg.l(dVar, 3));
            } catch (Exception e7) {
                e = e7;
                bVar3.m(e, true);
            } catch (NoSuchMethodError e10) {
                e = e10;
                bVar3.m(e, true);
            }
        }
    }

    private final void c(Message message) {
        n4.l lVar;
        s sVar;
        q qVar;
        if (message.what == 1) {
            synchronized (((s) this.b).b) {
                lVar = (n4.l) ((s) this.b).d.get();
                sVar = (s) this.b;
                qVar = (q) sVar.f;
            }
            if (lVar == null || sVar != lVar.b() || qVar == null) {
                return;
            }
            lVar.d((n4.r) message.obj);
            ((s) this.b).b(lVar, qVar);
            lVar.d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [cd.c] */
    /* JADX WARN: Type inference failed for: r2v21 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        String str;
        r2.d dVar;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2.d dVar2 = null;
        int i10 = 1;
        switch (this.a) {
            case 0:
                a(msg);
                return;
            case 1:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                q qVar = gVar.M;
                int i11 = msg.what;
                if (i11 == 1) {
                    gVar.e((List) msg.obj);
                    return;
                }
                if (i11 == 2) {
                    if (gVar.r.isEmpty()) {
                        gVar.i(2);
                        qVar.removeMessages(2);
                        qVar.removeMessages(3);
                        qVar.sendMessageDelayed(qVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i11 == 3 && gVar.r.isEmpty()) {
                    gVar.i(3);
                    qVar.removeMessages(2);
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    gVar.f.h(gVar.h);
                    return;
                }
                return;
            case 2:
                if (msg.what != 1) {
                    return;
                }
                androidx.mediarouter.app.c0 c0Var = (androidx.mediarouter.app.c0) this.b;
                List list = (List) msg.obj;
                c0Var.F = SystemClock.uptimeMillis();
                c0Var.s.clear();
                c0Var.s.addAll(list);
                c0Var.w.D();
                return;
            case 3:
                o0 o0Var = (o0) this.b;
                int i12 = msg.what;
                if (i12 == 1) {
                    o0Var.n();
                    return;
                } else {
                    if (i12 == 2 && o0Var.M != null) {
                        o0Var.M = null;
                        o0Var.o();
                        return;
                    }
                    return;
                }
            case 4:
                kotlin.jvm.internal.i.e(msg, "msg");
                if (msg.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                    super.handleMessage(msg);
                    return;
                }
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                Log.d("SessionLifecycleClient", "Session update received: ".concat(str));
                td.e0.q(td.e0.b((cd.h) this.b), new bb.v(str, r2, i10));
                return;
            case 5:
                m4.w wVar = (m4.w) msg.obj;
                xa.n nVar = (xa.n) this.b;
                if (nVar.L(wVar)) {
                    m4.v vVar = wVar.d;
                    vVar.getClass();
                    vVar.g();
                    nVar.U(wVar);
                    return;
                }
                return;
            case 6:
                b(msg);
                return;
            case 7:
                byte[] bArr = (byte[]) msg.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((n2.e) this.b).x;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    n2.b bVar = (n2.b) obj;
                    bVar.p();
                    if (Arrays.equals(bVar.v, bArr)) {
                        if (msg.what == 2 && bVar.p == 4) {
                            String str2 = e2.l0.a;
                            bVar.j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                c(msg);
                return;
            case 9:
                if (msg.what != 1) {
                    return;
                }
                ((org.telegram.messenger.b) this.b).h = msg.arg1;
                ((org.telegram.messenger.b) this.b).i = false;
                return;
            case 10:
                p10 p10Var = (p10) this.b;
                o10 o10Var = p10Var.g;
                int i14 = msg.what;
                if (i14 == 1) {
                    o10Var.getClass();
                    return;
                }
                if (i14 == 2) {
                    p10Var.f.removeMessages(3);
                    p10Var.j = false;
                    p10Var.k = true;
                    o10Var.onLongPress(p10Var.n);
                    return;
                }
                if (i14 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                n10 n10Var = p10Var.h;
                if (n10Var != null) {
                    if (p10Var.i) {
                        p10Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) n10Var).d2(p10Var.n);
                        return;
                    }
                }
                return;
            case 11:
                q10 q10Var = (q10) this.b;
                r10 r10Var = q10Var.f;
                int i15 = msg.what;
                if (i15 == 1) {
                    r10Var.onShowPress(q10Var.m);
                    return;
                }
                if (i15 == 2) {
                    q10Var.e.removeMessages(3);
                    q10Var.i = false;
                    q10Var.j = true;
                    r10Var.onLongPress(q10Var.m);
                    return;
                }
                if (i15 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                r10 r10Var2 = q10Var.g;
                if (r10Var2 != null) {
                    if (q10Var.h) {
                        q10Var.i = true;
                        return;
                    } else {
                        r10Var2.onSingleTapConfirmed(q10Var.m);
                        return;
                    }
                }
                return;
            case 12:
                int i16 = msg.what;
                int i17 = msg.arg1;
                Object obj2 = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((p4.g) this.b).j;
                p0 p0Var = (p0) sparseArray.get(i17);
                if (p0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i17);
                if (i16 == 3) {
                    p0Var.b((Bundle) obj2);
                    return;
                } else {
                    if (i16 != 4) {
                        return;
                    }
                    p0.a(peekData != null ? peekData.getString("error") : 0, (Bundle) obj2);
                    return;
                }
            case 13:
                g3 g3Var = (g3) this.b;
                int i18 = msg.what;
                if (i18 != 1) {
                    if (i18 != 2) {
                        return;
                    }
                    g3Var.b = false;
                    g3Var.f((p4.n) g3Var.h);
                    return;
                }
                g3Var.c = false;
                m2.t tVar = (m2.t) g3Var.f;
                if (tVar != null) {
                    b2.u uVar = (b2.u) g3Var.n;
                    p4.e eVar = (p4.e) tVar.b;
                    p4.v d = eVar.d(g3Var);
                    if (d != null) {
                        eVar.m(d, uVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                r2.e eVar2 = (r2.e) this.b;
                int i19 = msg.what;
                if (i19 == 1) {
                    dVar = (r2.d) msg.obj;
                    try {
                        eVar2.a.queueInputBuffer(dVar.a, 0, dVar.b, dVar.d, dVar.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = eVar2.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i19 != 2) {
                        if (i19 == 3) {
                            eVar2.e.e();
                        } else if (i19 != 4) {
                            AtomicReference atomicReference2 = eVar2.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                eVar2.a.setParameters((Bundle) msg.obj);
                            } catch (RuntimeException e7) {
                                AtomicReference atomicReference3 = eVar2.d;
                                while (!atomicReference3.compareAndSet(null, e7) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (dVar2 == null) {
                            r2.e.d(dVar2);
                            return;
                        }
                        return;
                    }
                    dVar = (r2.d) msg.obj;
                    int i20 = dVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar.c;
                    long j10 = dVar.d;
                    int i21 = dVar.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            eVar2.a.queueSecureInputBuffer(i20, 0, cryptoInfo, j10, i21);
                        } else {
                            synchronized (r2.e.n) {
                                eVar2.a.queueSecureInputBuffer(i20, 0, cryptoInfo, j10, i21);
                            }
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference4 = eVar2.d;
                        while (!atomicReference4.compareAndSet(null, e10) && atomicReference4.get() == null) {
                        }
                    }
                }
                dVar2 = dVar;
                if (dVar2 == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cd.h hVar) {
        super(Looper.getMainLooper());
        this.a = 4;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p4.g gVar) {
        super(Looper.getMainLooper());
        this.a = 12;
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Looper looper, xa.n nVar) {
        super(looper);
        this.a = 5;
        this.b = nVar;
    }
}
