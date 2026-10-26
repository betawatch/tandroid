package androidx.mediarouter.app;

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
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jg.e1;
import jg.s0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.w20;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Message message) {
        pa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 == 1) {
            n2.b bVar = (n2.b) this.b;
            m4.c cVar = bVar.c;
            if (obj == bVar.z) {
                if (bVar.p == 2 || bVar.k()) {
                    bVar.z = null;
                    if (obj2 instanceof Exception) {
                        cVar.i0((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.b.U(((n2.v) obj2).a);
                        cVar.c = null;
                        HashSet hashSet = (HashSet) cVar.b;
                        f9.i0 u10 = f9.i0.u(hashSet);
                        hashSet.clear();
                        f9.g0 listIterator = u10.listIterator(0);
                        while (listIterator.hasNext()) {
                            n2.b bVar2 = (n2.b) listIterator.next();
                            if (bVar2.n()) {
                                bVar2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        cVar.i0(e, true);
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
                jg.i iVar = bVar3.y;
                iVar.getClass();
                dVar = new pa.d();
                ((f9.f0) iVar.a).f();
                bVar3.y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                bVar3.m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] R = bVar3.b.R(bVar3.v, ((n2.v) obj2).a);
                if (bVar3.w != null && R != null && R.length != 0) {
                    bVar3.w = R;
                }
                bVar3.p = 4;
                bVar3.i(new e1(dVar, 23));
            } catch (Exception e10) {
                e = e10;
                bVar3.m(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                bVar3.m(e, true);
            }
        }
    }

    private final void b(Message message) {
        n4.n nVar;
        n4.l lVar;
        c cVar;
        if (message.what == 1) {
            synchronized (((n4.l) this.b).a) {
                nVar = (n4.n) ((n4.l) this.b).d.get();
                lVar = (n4.l) this.b;
                cVar = lVar.e;
            }
            if (nVar == null || lVar != nVar.b() || cVar == null) {
                return;
            }
            nVar.d((n4.t) message.obj);
            ((n4.l) this.b).a(nVar, cVar);
            nVar.d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ld.c] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        String str;
        r2.d dVar;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r2.d dVar2 = null;
        int i10 = 1;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                c cVar = hVar.M;
                int i11 = msg.what;
                if (i11 == 1) {
                    hVar.e((List) msg.obj);
                    return;
                }
                if (i11 == 2) {
                    if (hVar.r.isEmpty()) {
                        hVar.i(2);
                        cVar.removeMessages(2);
                        cVar.removeMessages(3);
                        cVar.sendMessageDelayed(cVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i11 == 3 && hVar.r.isEmpty()) {
                    hVar.i(3);
                    cVar.removeMessages(2);
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
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
                ce.f0.q(ce.f0.b((ld.h) this.b), new bb.v(str, r3, i10));
                return;
            case 4:
                m4.w wVar = (m4.w) msg.obj;
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.b;
                if (qVar.u(wVar)) {
                    m4.v vVar = wVar.d;
                    vVar.getClass();
                    vVar.g();
                    qVar.B(wVar);
                    return;
                }
                return;
            case 5:
                a(msg);
                return;
            case 6:
                byte[] bArr = (byte[]) msg.obj;
                if (bArr == null) {
                    return;
                }
                ArrayList arrayList = ((n2.e) this.b).w;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    n2.b bVar = (n2.b) obj;
                    bVar.p();
                    if (Arrays.equals(bVar.v, bArr)) {
                        if (msg.what == 2 && bVar.p == 4) {
                            String str2 = e2.n0.a;
                            bVar.j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 7:
                b(msg);
                return;
            case 8:
                u20 u20Var = (u20) this.b;
                t20 t20Var = u20Var.g;
                int i14 = msg.what;
                if (i14 == 1) {
                    t20Var.getClass();
                    return;
                }
                if (i14 == 2) {
                    u20Var.f.removeMessages(3);
                    u20Var.j = false;
                    u20Var.k = true;
                    t20Var.onLongPress(u20Var.n);
                    return;
                }
                if (i14 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                s20 s20Var = u20Var.h;
                if (s20Var != null) {
                    if (u20Var.i) {
                        u20Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) s20Var).c2(u20Var.n);
                        return;
                    }
                }
                return;
            case 9:
                v20 v20Var = (v20) this.b;
                w20 w20Var = v20Var.f;
                int i15 = msg.what;
                if (i15 == 1) {
                    w20Var.onShowPress(v20Var.m);
                    return;
                }
                if (i15 == 2) {
                    v20Var.e.removeMessages(3);
                    v20Var.i = false;
                    v20Var.j = true;
                    w20Var.onLongPress(v20Var.m);
                    return;
                }
                if (i15 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                w20 w20Var2 = v20Var.g;
                if (w20Var2 != null) {
                    if (v20Var.h) {
                        v20Var.i = true;
                        return;
                    } else {
                        w20Var2.onSingleTapConfirmed(v20Var.m);
                        return;
                    }
                }
                return;
            case 10:
                int i16 = msg.what;
                int i17 = msg.arg1;
                Object obj2 = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((p4.g) this.b).j;
                p4.o0 o0Var2 = (p4.o0) sparseArray.get(i17);
                if (o0Var2 == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i17);
                if (i16 == 3) {
                    o0Var2.b((Bundle) obj2);
                    return;
                } else {
                    if (i16 != 4) {
                        return;
                    }
                    p4.o0.a(peekData != null ? peekData.getString("error") : 0, (Bundle) obj2);
                    return;
                }
            case 11:
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
                s0 s0Var = (s0) g3Var.f;
                if (s0Var != null) {
                    b2.u uVar = (b2.u) g3Var.n;
                    p4.e eVar = (p4.e) s0Var.b;
                    p4.u d = eVar.d(g3Var);
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
                            } catch (RuntimeException e10) {
                                AtomicReference atomicReference3 = eVar2.d;
                                while (!atomicReference3.compareAndSet(null, e10) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (dVar2 == null) {
                            r2.e.b(dVar2);
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
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference4 = eVar2.d;
                        while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                        }
                    }
                }
                dVar2 = dVar;
                if (dVar2 == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ld.h hVar) {
        super(Looper.getMainLooper());
        this.a = 3;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p4.g gVar) {
        super(Looper.getMainLooper());
        this.a = 10;
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Looper looper, com.google.firebase.messaging.q qVar) {
        super(looper);
        this.a = 4;
        this.b = qVar;
    }
}
