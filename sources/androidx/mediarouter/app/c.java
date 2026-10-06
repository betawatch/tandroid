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
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.p20;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
            } catch (RuntimeException e7) {
                AtomicReference atomicReference = eVar.d;
                while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
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
            } catch (RuntimeException e10) {
                AtomicReference atomicReference2 = eVar.d;
                while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
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
            } catch (RuntimeException e11) {
                AtomicReference atomicReference4 = eVar.d;
                while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
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
                qi.f fVar = (qi.f) this.b;
                if (fVar.A(rVar2)) {
                    m4.q qVar = rVar2.d;
                    e2.d.h(qVar);
                    qVar.f();
                    fVar.M(rVar2);
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
                            byte[] X = bVar.b.X(bVar.u, (byte[]) obj2);
                            if (bVar.v != null && X != null && X.length != 0) {
                                bVar.v = X;
                            }
                            bVar.o = 4;
                            bVar.i(new m4.o0(23));
                            return;
                        } catch (Exception e7) {
                            e = e7;
                            bVar.m(e, true);
                            return;
                        } catch (NoSuchMethodError e10) {
                            e = e10;
                            bVar.m(e, true);
                            return;
                        }
                    }
                    return;
                }
                n2.b bVar2 = (n2.b) this.b;
                of.b bVar3 = bVar2.c;
                if (obj == bVar2.x) {
                    if (bVar2.o == 2 || bVar2.k()) {
                        bVar2.x = null;
                        if (obj2 instanceof Exception) {
                            bVar3.I((Exception) obj2, false);
                            return;
                        }
                        try {
                            bVar2.b.j0((byte[]) obj2);
                            bVar3.c = null;
                            HashSet hashSet = (HashSet) bVar3.b;
                            e9.i0 v = e9.i0.v(hashSet);
                            hashSet.clear();
                            e9.g0 listIterator = v.listIterator(0);
                            while (listIterator.hasNext()) {
                                n2.b bVar4 = (n2.b) listIterator.next();
                                if (bVar4.n()) {
                                    bVar4.j(true);
                                }
                            }
                            return;
                        } catch (Exception e11) {
                            bVar3.I(e11, true);
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
                ArrayList arrayList = ((n2.f) this.b).w;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList.get(i14);
                    i14++;
                    n2.b bVar5 = (n2.b) obj3;
                    bVar5.p();
                    if (Arrays.equals(bVar5.u, bArr)) {
                        if (msg.what == 2 && bVar5.o == 4) {
                            String str2 = e2.d0.a;
                            bVar5.j(false);
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
                n20 n20Var = (n20) this.b;
                m20 m20Var = n20Var.g;
                int i15 = msg.what;
                if (i15 == 1) {
                    m20Var.getClass();
                    return;
                }
                if (i15 == 2) {
                    n20Var.f.removeMessages(3);
                    n20Var.j = false;
                    n20Var.k = true;
                    m20Var.onLongPress(n20Var.n);
                    return;
                }
                if (i15 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                l20 l20Var = n20Var.h;
                if (l20Var != null) {
                    if (n20Var.i) {
                        n20Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) l20Var).a2(n20Var.n);
                        return;
                    }
                }
                return;
            case 8:
                o20 o20Var = (o20) this.b;
                p20 p20Var = o20Var.f;
                int i16 = msg.what;
                if (i16 == 1) {
                    p20Var.onShowPress(o20Var.m);
                    return;
                }
                if (i16 == 2) {
                    o20Var.e.removeMessages(3);
                    o20Var.i = false;
                    o20Var.j = true;
                    p20Var.onLongPress(o20Var.m);
                    return;
                }
                if (i16 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                p20 p20Var2 = o20Var.g;
                if (p20Var2 != null) {
                    if (o20Var.h) {
                        o20Var.i = true;
                        return;
                    } else {
                        p20Var2.onSingleTapConfirmed(o20Var.m);
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
                n2.c cVar3 = (n2.c) h3Var.f;
                if (cVar3 != null) {
                    b2.p pVar2 = (b2.p) h3Var.n;
                    p4.e eVar = (p4.e) cVar3.b;
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
    public c(Looper looper, qi.f fVar) {
        super(looper);
        this.a = 3;
        this.b = fVar;
    }
}
