// default package

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class c1 extends Handler {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(bs6 bs6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = bs6Var;
    }

    private final void a(Message message) {
        vi2 vi2Var;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            aa3 aa3Var = (aa3) this.b;
            lv6 lv6Var = aa3Var.c;
            if (obj == aa3Var.z) {
                if (aa3Var.p == 2 || aa3Var.k()) {
                    aa3Var.z = null;
                    if (obj2 instanceof Exception) {
                        lv6Var.D((Exception) obj2, false);
                        return;
                    }
                    try {
                        aa3Var.b.s(((lq6) obj2).a);
                        lv6Var.c = null;
                        HashSet hashSet = (HashSet) lv6Var.b;
                        mm5 q = mm5.q(hashSet);
                        hashSet.clear();
                        km5 listIterator = q.listIterator(0);
                        while (listIterator.hasNext()) {
                            aa3 aa3Var2 = (aa3) listIterator.next();
                            if (aa3Var2.n()) {
                                aa3Var2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        lv6Var.D(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 2) {
            aa3 aa3Var3 = (aa3) this.b;
            if (obj == aa3Var3.x && aa3Var3.k()) {
                aa3Var3.x = null;
                synchronized (aa3Var3.o) {
                    z24 z24Var = aa3Var3.y;
                    z24Var.getClass();
                    vi2Var = new vi2((byte) 21);
                    ((jm5) z24Var.b).f();
                    aa3Var3.y = null;
                }
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    aa3Var3.m((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] p = aa3Var3.b.p(aa3Var3.v, ((lq6) obj2).a);
                    if (aa3Var3.w != null && p != null && p.length != 0) {
                        aa3Var3.w = p;
                    }
                    aa3Var3.p = (byte) 4;
                    aa3Var3.i(new vu2(vi2Var, (byte) 17));
                } catch (Exception | NoSuchMethodError e2) {
                    aa3Var3.m(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        zu6 zu6Var;
        yu6 yu6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yu6) this.b).b) {
                zu6Var = (zu6) ((yu6) this.b).d.get();
                yu6Var = (yu6) this.b;
                c1Var = (c1) yu6Var.f;
            }
            if (zu6Var == null || yu6Var != zu6Var.b() || c1Var == null) {
                return;
            }
            zu6Var.e((nw6) message.obj);
            ((yu6) this.b).a(zu6Var, c1Var);
            zu6Var.e(null);
        }
    }

    private final void c(Message message) {
        bv6 bv6Var;
        yu6 yu6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yu6) this.b).b) {
                bv6Var = (bv6) ((yu6) this.b).d.get();
                yu6Var = (yu6) this.b;
                c1Var = (c1) yu6Var.f;
            }
            if (bv6Var == null || yu6Var != bv6Var.b() || c1Var == null) {
                return;
            }
            bv6Var.d((mw6) message.obj);
            ((yu6) this.b).b(bv6Var, c1Var);
            bv6Var.d(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        sx sxVar;
        sx sxVar2 = null;
        sxVar2 = null;
        sxVar2 = null;
        sxVar2 = null;
        sxVar2 = null;
        sxVar2 = null;
        switch (this.a) {
            case 0:
                if (message.what == 1) {
                    ((d1) this.b).h = message.arg1;
                    ((d1) this.b).i = false;
                    return;
                }
                return;
            case 1:
                tx txVar = (tx) this.b;
                int i = message.what;
                if (i == 1) {
                    sxVar = (sx) message.obj;
                    try {
                        txVar.a.queueInputBuffer(sxVar.a, 0, sxVar.b, sxVar.d, sxVar.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = txVar.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            txVar.e.e();
                        } else if (i != 4) {
                            AtomicReference atomicReference2 = txVar.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                txVar.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e2) {
                                AtomicReference atomicReference3 = txVar.d;
                                while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (sxVar2 == null) {
                            tx.e(sxVar2);
                            return;
                        }
                        return;
                    }
                    sxVar = (sx) message.obj;
                    int i2 = sxVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = sxVar.c;
                    long j = sxVar.d;
                    int i3 = sxVar.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            txVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        } else {
                            synchronized (tx.n) {
                                txVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            }
                        }
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = txVar.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                sxVar2 = sxVar;
                if (sxVar2 == null) {
                }
            case 2:
                a(message);
                return;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((da3) this.b).x;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        aa3 aa3Var = (aa3) obj;
                        aa3Var.p();
                        if (Arrays.equals(aa3Var.v, bArr)) {
                            if (message.what == 2 && aa3Var.p == 4) {
                                String str = g8c.a;
                                aa3Var.j(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                ns4 ns4Var = (ns4) this.b;
                ms4 ms4Var = ns4Var.g;
                int i5 = message.what;
                if (i5 == 1) {
                    ms4Var.getClass();
                    return;
                }
                if (i5 == 2) {
                    ns4Var.f.removeMessages(3);
                    ns4Var.j = false;
                    ns4Var.k = true;
                    ms4Var.onLongPress(ns4Var.n);
                    return;
                }
                if (i5 != 3) {
                    fyb.h(message, "Unknown message ");
                    return;
                }
                ls4 ls4Var = ns4Var.h;
                if (ls4Var != null) {
                    if (ns4Var.i) {
                        ns4Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) ls4Var).e1(ns4Var.n);
                        return;
                    }
                }
                return;
            case 5:
                os4 os4Var = (os4) this.b;
                ps4 ps4Var = os4Var.f;
                int i6 = message.what;
                if (i6 == 1) {
                    ps4Var.onShowPress(os4Var.m);
                    return;
                }
                if (i6 == 2) {
                    os4Var.e.removeMessages(3);
                    os4Var.i = false;
                    os4Var.j = true;
                    ps4Var.onLongPress(os4Var.m);
                    return;
                }
                if (i6 != 3) {
                    fyb.h(message, "Unknown message ");
                    return;
                }
                ps4 ps4Var2 = os4Var.g;
                if (ps4Var2 != null) {
                    if (os4Var.h) {
                        os4Var.i = true;
                        return;
                    } else {
                        ps4Var2.onSingleTapConfirmed(os4Var.m);
                        return;
                    }
                }
                return;
            case 6:
                int i7 = message.what;
                int i8 = message.arg1;
                Object obj2 = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((bs6) this.b).j;
                p59 p59Var = (p59) sparseArray.get(i8);
                if (p59Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i8);
                if (i7 == 3) {
                    p59Var.b((Bundle) obj2);
                    return;
                } else {
                    if (i7 == 4) {
                        p59.a(peekData != null ? peekData.getString("error") : null, (Bundle) obj2);
                        return;
                    }
                    return;
                }
            case 7:
                js6 js6Var = (js6) this.b;
                c1 c1Var = js6Var.N;
                int i9 = message.what;
                if (i9 == 1) {
                    js6Var.e((List) message.obj);
                    return;
                }
                if (i9 == 2) {
                    if (js6Var.r.isEmpty()) {
                        js6Var.i(2);
                        c1Var.removeMessages(2);
                        c1Var.removeMessages(3);
                        c1Var.sendMessageDelayed(c1Var.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i9 == 3 && js6Var.r.isEmpty()) {
                    js6Var.i(3);
                    c1Var.removeMessages(2);
                    c1Var.removeMessages(3);
                    c1Var.removeMessages(1);
                    js6Var.f.h(js6Var.h);
                    return;
                }
                return;
            case 8:
                if (message.what == 1) {
                    gt6 gt6Var = (gt6) this.b;
                    List list = (List) message.obj;
                    gt6Var.G = SystemClock.uptimeMillis();
                    gt6Var.s.clear();
                    gt6Var.s.addAll(list);
                    gt6Var.w.D();
                    return;
                }
                return;
            case 9:
                rt6 rt6Var = (rt6) this.b;
                int i10 = message.what;
                if (i10 == 1) {
                    rt6Var.n();
                    return;
                } else {
                    if (i10 != 2 || rt6Var.N == null) {
                        return;
                    }
                    rt6Var.N = null;
                    rt6Var.o();
                    return;
                }
            case 10:
                wt6 wt6Var = (wt6) this.b;
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        wt6Var.b = false;
                        wt6Var.f((bt6) wt6Var.h);
                        return;
                    }
                    return;
                }
                wt6Var.c = false;
                z24 z24Var = (z24) wt6Var.f;
                if (z24Var != null) {
                    am4 am4Var = (am4) wt6Var.n;
                    ux4 ux4Var = (ux4) z24Var.b;
                    du6 d = ux4Var.d(wt6Var);
                    if (d != null) {
                        ux4Var.m(d, am4Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c(message);
                return;
            case 12:
                b(message);
                return;
            default:
                su6 su6Var = (su6) message.obj;
                mv6 mv6Var = (mv6) this.b;
                if (mv6Var.V(su6Var)) {
                    ru6 ru6Var = su6Var.e;
                    ru6Var.getClass();
                    ru6Var.e();
                    mv6Var.e0(su6Var);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ c1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Looper looper, mv6 mv6Var) {
        super(looper);
        this.a = (byte) 13;
        this.b = mv6Var;
    }
}
