package androidx.mediarouter.app;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.u20;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Message message) {
        r2.e eVar = (r2.e) this.b;
        int i10 = message.what;
        r2.d dVar = null;
        if (i10 == 1) {
            r2.d dVar2 = (r2.d) message.obj;
            try {
                eVar.a.queueInputBuffer(dVar2.a, 0, dVar2.b, dVar2.d, dVar2.e);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = eVar.d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            dVar = dVar2;
        } else if (i10 == 2) {
            r2.d dVar3 = (r2.d) message.obj;
            int i11 = dVar3.a;
            MediaCodec.CryptoInfo cryptoInfo = dVar3.c;
            long j3 = dVar3.d;
            int i12 = dVar3.e;
            try {
                synchronized (r2.e.h) {
                    eVar.a.queueSecureInputBuffer(i11, 0, cryptoInfo, j3, i12);
                }
            } catch (RuntimeException e7) {
                AtomicReference atomicReference2 = eVar.d;
                while (!atomicReference2.compareAndSet(null, e7) && atomicReference2.get() == null) {
                }
            }
            dVar = dVar3;
        } else if (i10 == 3) {
            eVar.e.e();
        } else if (i10 != 4) {
            AtomicReference atomicReference3 = eVar.d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                eVar.a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e10) {
                AtomicReference atomicReference4 = eVar.d;
                while (!atomicReference4.compareAndSet(null, e10) && atomicReference4.get() == null) {
                }
            }
        }
        if (dVar != null) {
            r2.e.e(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        n4.r rVar;
        n4.p pVar;
        c cVar;
        String str;
        Object[] objArr = 0;
        int i10 = 1;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                c cVar2 = hVar.M;
                int i11 = msg.what;
                if (i11 == 1) {
                    hVar.e((List) msg.obj);
                    return;
                }
                if (i11 == 2) {
                    if (hVar.r.isEmpty()) {
                        hVar.i(2);
                        cVar2.removeMessages(2);
                        cVar2.removeMessages(3);
                        cVar2.sendMessageDelayed(cVar2.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i11 == 3 && hVar.r.isEmpty()) {
                    hVar.i(3);
                    cVar2.removeMessages(2);
                    cVar2.removeMessages(3);
                    cVar2.removeMessages(1);
                    hVar.f.h(hVar.h);
                    return;
                }
                return;
            case 1:
                if (msg.what != 1) {
                    return;
                }
                d0 d0Var = (d0) this.b;
                List list = (List) msg.obj;
                d0Var.F = SystemClock.uptimeMillis();
                d0Var.s.clear();
                d0Var.s.addAll(list);
                d0Var.v.D();
                return;
            case 2:
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
            case 3:
                m4.r rVar2 = (m4.r) msg.obj;
                ki.f fVar = (ki.f) this.b;
                if (fVar.z(rVar2)) {
                    m4.q qVar = rVar2.d;
                    e2.d.h(qVar);
                    qVar.f();
                    fVar.K(rVar2);
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) msg.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i13 = msg.what;
                if (i13 != 1) {
                    if (i13 != 2) {
                        return;
                    }
                    n2.b bVar = (n2.b) this.b;
                    if (obj == bVar.w && bVar.k()) {
                        bVar.w = null;
                        if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                            bVar.m((Throwable) obj2, false);
                            return;
                        }
                        try {
                            byte[] J = bVar.b.J(bVar.u, (byte[]) obj2);
                            if (bVar.v != null && J != null && J.length != 0) {
                                bVar.v = J;
                            }
                            bVar.o = 4;
                            bVar.i(new gg.g0(16));
                            return;
                        } catch (Exception e) {
                            e = e;
                            bVar.m(e, true);
                            return;
                        } catch (NoSuchMethodError e7) {
                            e = e7;
                            bVar.m(e, true);
                            return;
                        }
                    }
                    return;
                }
                n2.b bVar2 = (n2.b) this.b;
                n4.y yVar = bVar2.c;
                if (obj == bVar2.x) {
                    if (bVar2.o == 2 || bVar2.k()) {
                        bVar2.x = null;
                        if (obj2 instanceof Exception) {
                            yVar.p((Exception) obj2, false);
                            return;
                        }
                        try {
                            bVar2.b.W((byte[]) obj2);
                            yVar.c = null;
                            HashSet hashSet = (HashSet) yVar.b;
                            e9.i0 v = e9.i0.v(hashSet);
                            hashSet.clear();
                            e9.g0 listIterator = v.listIterator(0);
                            while (listIterator.hasNext()) {
                                n2.b bVar3 = (n2.b) listIterator.next();
                                if (bVar3.n()) {
                                    bVar3.j(true);
                                }
                            }
                            return;
                        } catch (Exception e10) {
                            yVar.p(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                byte[] bArr = (byte[]) msg.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((n2.e) this.b).w;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    n2.b bVar4 = (n2.b) obj3;
                    bVar4.p();
                    if (Arrays.equals(bVar4.u, bArr)) {
                        if (msg.what == 2 && bVar4.o == 4) {
                            String str2 = e2.d0.a;
                            bVar4.j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 6:
                if (msg.what == 1) {
                    synchronized (((n4.p) this.b).a) {
                        rVar = (n4.r) ((n4.p) this.b).d.get();
                        pVar = (n4.p) this.b;
                        cVar = pVar.e;
                    }
                    if (rVar == null || pVar != rVar.b() || cVar == null) {
                        return;
                    }
                    rVar.d((n4.a0) msg.obj);
                    ((n4.p) this.b).a(rVar, cVar);
                    rVar.d(null);
                    return;
                }
                return;
            case 7:
                s20 s20Var = (s20) this.b;
                r20 r20Var = s20Var.g;
                int i15 = msg.what;
                if (i15 == 1) {
                    r20Var.getClass();
                    return;
                }
                if (i15 == 2) {
                    s20Var.f.removeMessages(3);
                    s20Var.j = false;
                    s20Var.k = true;
                    r20Var.onLongPress(s20Var.n);
                    return;
                }
                if (i15 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                q20 q20Var = s20Var.h;
                if (q20Var != null) {
                    if (s20Var.i) {
                        s20Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) q20Var).Z1(s20Var.n);
                        return;
                    }
                }
                return;
            case 8:
                t20 t20Var = (t20) this.b;
                u20 u20Var = t20Var.f;
                int i16 = msg.what;
                if (i16 == 1) {
                    u20Var.onShowPress(t20Var.m);
                    return;
                }
                if (i16 == 2) {
                    t20Var.e.removeMessages(3);
                    t20Var.i = false;
                    t20Var.j = true;
                    u20Var.onLongPress(t20Var.m);
                    return;
                }
                if (i16 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                u20 u20Var2 = t20Var.g;
                if (u20Var2 != null) {
                    if (t20Var.h) {
                        t20Var.i = true;
                        return;
                    } else {
                        u20Var2.onSingleTapConfirmed(t20Var.m);
                        return;
                    }
                }
                return;
            case 9:
                int i17 = msg.what;
                int i18 = msg.arg1;
                Object obj4 = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((p4.g) this.b).j;
                p4.o0 o0Var2 = (p4.o0) sparseArray.get(i18);
                if (o0Var2 == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i18);
                if (i17 == 3) {
                    o0Var2.b((Bundle) obj4);
                    return;
                } else {
                    if (i17 != 4) {
                        return;
                    }
                    p4.o0.a(peekData != null ? peekData.getString("error") : null, (Bundle) obj4);
                    return;
                }
            case 10:
                h3 h3Var = (h3) this.b;
                int i19 = msg.what;
                if (i19 != 1) {
                    if (i19 != 2) {
                        return;
                    }
                    h3Var.b = false;
                    h3Var.f((p4.n) h3Var.h);
                    return;
                }
                h3Var.c = false;
                l2.h hVar2 = (l2.h) h3Var.f;
                if (hVar2 != null) {
                    b2.p pVar2 = (b2.p) h3Var.n;
                    p4.e eVar = (p4.e) hVar2.b;
                    p4.u d = eVar.d(h3Var);
                    if (d != null) {
                        eVar.m(d, pVar2);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                a(msg);
                return;
            default:
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
                zd.e0.q(zd.e0.b((id.h) this.b), new za.t(str, objArr == true ? 1 : 0, i10));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(id.h hVar) {
        super(Looper.getMainLooper());
        this.a = 12;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p4.g gVar) {
        super(Looper.getMainLooper());
        this.a = 9;
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Looper looper, ki.f fVar) {
        super(looper);
        this.a = 3;
        this.b = fVar;
    }
}
