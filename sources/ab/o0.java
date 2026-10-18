package ab;

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
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.u20;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class o0 extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Message message) {
        oa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 == 1) {
            n2.b bVar = (n2.b) this.b;
            n2.e eVar = bVar.c;
            if (obj == bVar.z) {
                if (bVar.p == 2 || bVar.k()) {
                    bVar.z = null;
                    if (obj2 instanceof Exception) {
                        eVar.X((Exception) obj2, false);
                        return;
                    }
                    try {
                        bVar.b.j0(((n2.w) obj2).a);
                        eVar.c = null;
                        HashSet hashSet = (HashSet) eVar.b;
                        e9.n0 u10 = e9.n0.u(hashSet);
                        hashSet.clear();
                        e9.l0 listIterator = u10.listIterator(0);
                        while (listIterator.hasNext()) {
                            n2.b bVar2 = (n2.b) listIterator.next();
                            if (bVar2.n()) {
                                bVar2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        eVar.X(e, true);
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
                le.b bVar4 = bVar3.y;
                bVar4.getClass();
                dVar = new oa.d(14);
                ((e9.k0) bVar4.b).f();
                bVar3.y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                bVar3.m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] g02 = bVar3.b.g0(bVar3.v, ((n2.w) obj2).a);
                if (bVar3.w != null && g02 != null && g02.length != 0) {
                    bVar3.w = g02;
                }
                bVar3.p = 4;
                bVar3.i(new j5.b(dVar, 19));
            } catch (Exception e7) {
                e = e7;
                bVar3.m(e, true);
            } catch (NoSuchMethodError e10) {
                e = e10;
                bVar3.m(e, true);
            }
        }
    }

    private final void b(Message message) {
        n4.n nVar;
        n4.l lVar;
        o0 o0Var;
        if (message.what == 1) {
            synchronized (((n4.l) this.b).a) {
                nVar = (n4.n) ((n4.l) this.b).d.get();
                lVar = (n4.l) this.b;
                o0Var = lVar.e;
            }
            if (nVar == null || lVar != nVar.b() || o0Var == null) {
                return;
            }
            nVar.d((n4.t) message.obj);
            ((n4.l) this.b).a(nVar, o0Var);
            nVar.d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kd.c] */
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
                be.f0.q(be.f0.b((kd.h) this.b), new v(str, r3, i10));
                return;
            case 1:
                androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.b;
                o0 o0Var = gVar.M;
                int i11 = msg.what;
                if (i11 == 1) {
                    gVar.e((List) msg.obj);
                    return;
                }
                if (i11 == 2) {
                    if (gVar.r.isEmpty()) {
                        gVar.i(2);
                        o0Var.removeMessages(2);
                        o0Var.removeMessages(3);
                        o0Var.sendMessageDelayed(o0Var.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i11 == 3 && gVar.r.isEmpty()) {
                    gVar.i(3);
                    o0Var.removeMessages(2);
                    o0Var.removeMessages(3);
                    o0Var.removeMessages(1);
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
                c0Var.v.D();
                return;
            case 3:
                androidx.mediarouter.app.n0 n0Var = (androidx.mediarouter.app.n0) this.b;
                int i12 = msg.what;
                if (i12 == 1) {
                    n0Var.n();
                    return;
                } else {
                    if (i12 == 2 && n0Var.M != null) {
                        n0Var.M = null;
                        n0Var.o();
                        return;
                    }
                    return;
                }
            case 4:
                m4.v vVar = (m4.v) msg.obj;
                qi.e eVar = (qi.e) this.b;
                if (eVar.w(vVar)) {
                    m4.u uVar = vVar.d;
                    uVar.getClass();
                    uVar.g();
                    eVar.E(vVar);
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
                ArrayList arrayList = ((n2.f) this.b).w;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    n2.b bVar = (n2.b) obj;
                    bVar.p();
                    if (Arrays.equals(bVar.v, bArr)) {
                        if (msg.what == 2 && bVar.p == 4) {
                            String str2 = e2.m0.a;
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
                s20 s20Var = (s20) this.b;
                r20 r20Var = s20Var.g;
                int i14 = msg.what;
                if (i14 == 1) {
                    r20Var.getClass();
                    return;
                }
                if (i14 == 2) {
                    s20Var.f.removeMessages(3);
                    s20Var.j = false;
                    s20Var.k = true;
                    r20Var.onLongPress(s20Var.n);
                    return;
                }
                if (i14 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                q20 q20Var = s20Var.h;
                if (q20Var != null) {
                    if (s20Var.i) {
                        s20Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) q20Var).a2(s20Var.n);
                        return;
                    }
                }
                return;
            case 9:
                t20 t20Var = (t20) this.b;
                u20 u20Var = t20Var.f;
                int i15 = msg.what;
                if (i15 == 1) {
                    u20Var.onShowPress(t20Var.m);
                    return;
                }
                if (i15 == 2) {
                    t20Var.e.removeMessages(3);
                    t20Var.i = false;
                    t20Var.j = true;
                    u20Var.onLongPress(t20Var.m);
                    return;
                }
                if (i15 != 3) {
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
                le.b bVar2 = (le.b) g3Var.f;
                if (bVar2 != null) {
                    b2.t tVar = (b2.t) g3Var.n;
                    p4.e eVar2 = (p4.e) bVar2.b;
                    p4.u d = eVar2.d(g3Var);
                    if (d != null) {
                        eVar2.m(d, tVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                r2.e eVar3 = (r2.e) this.b;
                int i19 = msg.what;
                if (i19 == 1) {
                    dVar = (r2.d) msg.obj;
                    try {
                        eVar3.a.queueInputBuffer(dVar.a, 0, dVar.b, dVar.d, dVar.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = eVar3.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i19 != 2) {
                        if (i19 == 3) {
                            eVar3.e.e();
                        } else if (i19 != 4) {
                            AtomicReference atomicReference2 = eVar3.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                eVar3.a.setParameters((Bundle) msg.obj);
                            } catch (RuntimeException e7) {
                                AtomicReference atomicReference3 = eVar3.d;
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
                            eVar3.a.queueSecureInputBuffer(i20, 0, cryptoInfo, j10, i21);
                        } else {
                            synchronized (r2.e.n) {
                                eVar3.a.queueSecureInputBuffer(i20, 0, cryptoInfo, j10, i21);
                            }
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference4 = eVar3.d;
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
    public /* synthetic */ o0(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kd.h hVar) {
        super(Looper.getMainLooper());
        this.a = 0;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p4.g gVar) {
        super(Looper.getMainLooper());
        this.a = 10;
        this.b = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Looper looper, qi.e eVar) {
        super(looper);
        this.a = 4;
        this.b = eVar;
    }
}
