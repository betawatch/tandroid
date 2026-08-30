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
import c2.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n7.qa;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.m20;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Message message) {
        Set set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 == 0) {
            o3.b bVar = (o3.b) this.b;
            qa qaVar = bVar.c;
            if (obj == bVar.x) {
                if (bVar.o == 2 || bVar.j()) {
                    bVar.x = null;
                    if (obj2 instanceof Exception) {
                        qaVar.X0((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.b.Q1((byte[]) obj2);
                        qaVar.c = null;
                        HashSet hashSet = (HashSet) qaVar.b;
                        s8.v t6 = s8.v.t(hashSet);
                        hashSet.clear();
                        s8.t listIterator = t6.listIterator(0);
                        while (listIterator.hasNext()) {
                            o3.b bVar2 = (o3.b) listIterator.next();
                            if (bVar2.m()) {
                                bVar2.i(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        qaVar.X0(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i10 != 1) {
            return;
        }
        o3.b bVar3 = (o3.b) this.b;
        if (obj == bVar3.w && bVar3.j()) {
            bVar3.w = null;
            if (obj2 instanceof Exception) {
                bVar3.l((Exception) obj2, false);
                return;
            }
            try {
                byte[] F1 = bVar3.b.F1(bVar3.u, (byte[]) obj2);
                if (bVar3.v != null && F1 != null && F1.length != 0) {
                    bVar3.v = F1;
                }
                bVar3.o = 4;
                new nh.e(3);
                h5.e eVar = bVar3.h;
                synchronized (eVar.a) {
                    set = eVar.c;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((o3.l) it.next()).a();
                }
            } catch (Exception e6) {
                bVar3.l(e6, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [uc.c] */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        r2 = null;
        r2 = null;
        d4.d dVar = null;
        int i10 = 1;
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                d dVar2 = iVar.J;
                int i11 = msg.what;
                if (i11 == 1) {
                    iVar.e((List) msg.obj);
                    return;
                }
                if (i11 == 2) {
                    if (iVar.r.isEmpty()) {
                        iVar.i(2);
                        dVar2.removeMessages(2);
                        dVar2.removeMessages(3);
                        dVar2.sendMessageDelayed(dVar2.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i11 == 3 && iVar.r.isEmpty()) {
                    iVar.i(3);
                    dVar2.removeMessages(2);
                    dVar2.removeMessages(3);
                    dVar2.removeMessages(1);
                    iVar.f.h(iVar.h);
                    return;
                }
                return;
            case 1:
                if (msg.what != 1) {
                    return;
                }
                e0 e0Var = (e0) this.b;
                List list = (List) msg.obj;
                e0Var.C = SystemClock.uptimeMillis();
                e0Var.s.clear();
                e0Var.s.addAll(list);
                e0Var.v.D();
                return;
            case 2:
                p0 p0Var = (p0) this.b;
                int i12 = msg.what;
                if (i12 == 1) {
                    p0Var.n();
                    return;
                } else {
                    if (i12 == 2 && p0Var.J != null) {
                        p0Var.J = null;
                        p0Var.o();
                        return;
                    }
                    return;
                }
            case 3:
                int i13 = msg.what;
                int i14 = msg.arg1;
                Object obj = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((c2.h) this.b).j;
                v0 v0Var = (v0) sparseArray.get(i14);
                if (v0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i14);
                if (i13 == 3) {
                    v0Var.b((Bundle) obj);
                    return;
                } else {
                    if (i13 != 4) {
                        return;
                    }
                    v0.a(peekData != null ? peekData.getString("error") : 0, (Bundle) obj);
                    return;
                }
            case 4:
                c2.t tVar = (c2.t) this.b;
                int i15 = msg.what;
                if (i15 != 1) {
                    if (i15 != 2) {
                        return;
                    }
                    tVar.b = false;
                    tVar.f((c2.o) tVar.h);
                    return;
                }
                tVar.c = false;
                ja.c cVar = (ja.c) tVar.f;
                if (cVar != null) {
                    c2.u uVar = (c2.u) tVar.n;
                    c2.e eVar = (c2.e) cVar.b;
                    c2.z d = eVar.d(tVar);
                    if (d != null) {
                        eVar.m(d, uVar);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                d4.e eVar2 = (d4.e) this.b;
                eVar2.getClass();
                int i16 = msg.what;
                if (i16 == 0) {
                    d4.d dVar3 = (d4.d) msg.obj;
                    try {
                        eVar2.a.queueInputBuffer(dVar3.a, 0, dVar3.b, dVar3.d, dVar3.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = eVar2.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    dVar = dVar3;
                } else if (i16 == 1) {
                    d4.d dVar4 = (d4.d) msg.obj;
                    int i17 = dVar4.a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar4.c;
                    long j10 = dVar4.d;
                    int i18 = dVar4.e;
                    try {
                        synchronized (d4.e.h) {
                            eVar2.a.queueSecureInputBuffer(i17, 0, cryptoInfo, j10, i18);
                        }
                    } catch (RuntimeException e6) {
                        AtomicReference atomicReference2 = eVar2.d;
                        while (!atomicReference2.compareAndSet(null, e6) && atomicReference2.get() == null) {
                        }
                    }
                    dVar = dVar4;
                } else if (i16 != 2) {
                    AtomicReference atomicReference3 = eVar2.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    eVar2.e.c();
                }
                if (dVar != null) {
                    d4.e.d(dVar);
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.j.e(msg, "msg");
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
                ld.e0.q(ld.e0.b((uc.h) this.b), new la.u(str, r2, i10));
                return;
            case 7:
                a(msg);
                return;
            case 8:
                byte[] bArr = (byte[]) msg.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((o3.e) this.b).w;
                int size = arrayList.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj2 = arrayList.get(i19);
                    i19++;
                    o3.b bVar = (o3.b) obj2;
                    bVar.o();
                    if (Arrays.equals(bVar.u, bArr)) {
                        if (msg.what == 2 && bVar.o == 4) {
                            int i20 = h5.d0.a;
                            bVar.i(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 9:
                k20 k20Var = (k20) this.b;
                j20 j20Var = k20Var.g;
                int i21 = msg.what;
                if (i21 == 1) {
                    j20Var.getClass();
                    return;
                }
                if (i21 == 2) {
                    k20Var.f.removeMessages(3);
                    k20Var.j = false;
                    k20Var.k = true;
                    j20Var.onLongPress(k20Var.n);
                    return;
                }
                if (i21 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                i20 i20Var = k20Var.h;
                if (i20Var != null) {
                    if (k20Var.i) {
                        k20Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) i20Var).Z1(k20Var.n);
                        return;
                    }
                }
                return;
            default:
                l20 l20Var = (l20) this.b;
                m20 m20Var = l20Var.f;
                int i22 = msg.what;
                if (i22 == 1) {
                    m20Var.onShowPress(l20Var.m);
                    return;
                }
                if (i22 == 2) {
                    l20Var.e.removeMessages(3);
                    l20Var.i = false;
                    l20Var.j = true;
                    m20Var.onLongPress(l20Var.m);
                    return;
                }
                if (i22 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                m20 m20Var2 = l20Var.g;
                if (m20Var2 != null) {
                    if (l20Var.h) {
                        l20Var.i = true;
                        return;
                    } else {
                        m20Var2.onSingleTapConfirmed(l20Var.m);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uc.h hVar) {
        super(Looper.getMainLooper());
        this.a = 6;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c2.h hVar) {
        super(Looper.getMainLooper());
        this.a = 3;
        this.b = hVar;
    }
}
