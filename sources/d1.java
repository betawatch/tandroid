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
import org.webrtc.Logging;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class d1 extends Handler {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gu6 gu6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = gu6Var;
    }

    private final void a(Message message) {
        rj2 rj2Var;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            ta3 ta3Var = (ta3) this.b;
            qx6 qx6Var = ta3Var.c;
            if (obj == ta3Var.z) {
                if (ta3Var.p == 2 || ta3Var.k()) {
                    ta3Var.z = null;
                    if (obj2 instanceof Exception) {
                        qx6Var.E((Exception) obj2, false);
                        return;
                    }
                    try {
                        ta3Var.b.r(((ps6) obj2).a);
                        qx6Var.c = null;
                        HashSet hashSet = (HashSet) qx6Var.b;
                        po5 q = po5.q(hashSet);
                        hashSet.clear();
                        no5 listIterator = q.listIterator(0);
                        while (listIterator.hasNext()) {
                            ta3 ta3Var2 = (ta3) listIterator.next();
                            if (ta3Var2.n()) {
                                ta3Var2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        qx6Var.E(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 2) {
            ta3 ta3Var3 = (ta3) this.b;
            if (obj == ta3Var3.x && ta3Var3.k()) {
                ta3Var3.x = null;
                synchronized (ta3Var3.o) {
                    xh4 xh4Var = ta3Var3.y;
                    xh4Var.getClass();
                    rj2Var = new rj2((byte) 21);
                    ((mo5) xh4Var.b).f();
                    ta3Var3.y = null;
                }
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    ta3Var3.m((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] l = ta3Var3.b.l(ta3Var3.v, ((ps6) obj2).a);
                    if (ta3Var3.w != null && l != null && l.length != 0) {
                        ta3Var3.w = l;
                    }
                    ta3Var3.p = (byte) 4;
                    ta3Var3.i(new ht2(rj2Var, (byte) 19));
                } catch (Exception | NoSuchMethodError e2) {
                    ta3Var3.m(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        ex6 ex6Var;
        dx6 dx6Var;
        d1 d1Var;
        if (message.what == 1) {
            synchronized (((dx6) this.b).b) {
                ex6Var = (ex6) ((dx6) this.b).d.get();
                dx6Var = (dx6) this.b;
                d1Var = (d1) dx6Var.f;
            }
            if (ex6Var == null || dx6Var != ex6Var.b() || d1Var == null) {
                return;
            }
            ex6Var.e((sy6) message.obj);
            ((dx6) this.b).a(ex6Var, d1Var);
            ex6Var.e(null);
        }
    }

    private final void c(Message message) {
        gx6 gx6Var;
        dx6 dx6Var;
        d1 d1Var;
        if (message.what == 1) {
            synchronized (((dx6) this.b).b) {
                gx6Var = (gx6) ((dx6) this.b).d.get();
                dx6Var = (dx6) this.b;
                d1Var = (d1) dx6Var.f;
            }
            if (gx6Var == null || dx6Var != gx6Var.b() || d1Var == null) {
                return;
            }
            gx6Var.d((ry6) message.obj);
            ((dx6) this.b).b(gx6Var, d1Var);
            gx6Var.d(null);
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        switch (this.a) {
            case 14:
                try {
                    super.dispatchMessage(message);
                    return;
                } catch (Exception e) {
                    Logging.e("VoIPEglRenderer", "Exception on VoIPEglRenderer thread", e);
                    ((pjc) this.b).run();
                    throw e;
                }
            default:
                super.dispatchMessage(message);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        tx txVar;
        tx txVar2 = null;
        txVar2 = null;
        txVar2 = null;
        txVar2 = null;
        txVar2 = null;
        txVar2 = null;
        switch (this.a) {
            case 0:
                if (message.what == 1) {
                    ((e1) this.b).h = message.arg1;
                    ((e1) this.b).i = false;
                    return;
                }
                return;
            case 1:
                ux uxVar = (ux) this.b;
                int i = message.what;
                if (i == 1) {
                    txVar = (tx) message.obj;
                    try {
                        uxVar.a.queueInputBuffer(txVar.a, 0, txVar.b, txVar.d, txVar.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = uxVar.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            uxVar.e.e();
                        } else if (i != 4) {
                            AtomicReference atomicReference2 = uxVar.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                uxVar.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e2) {
                                AtomicReference atomicReference3 = uxVar.d;
                                while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (txVar2 == null) {
                            ux.e(txVar2);
                            return;
                        }
                        return;
                    }
                    txVar = (tx) message.obj;
                    int i2 = txVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = txVar.c;
                    long j = txVar.d;
                    int i3 = txVar.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            uxVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        } else {
                            synchronized (ux.n) {
                                uxVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            }
                        }
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = uxVar.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                txVar2 = txVar;
                if (txVar2 == null) {
                }
            case 2:
                a(message);
                return;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((wa3) this.b).x;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ta3 ta3Var = (ta3) obj;
                        ta3Var.p();
                        if (Arrays.equals(ta3Var.v, bArr)) {
                            if (message.what == 2 && ta3Var.p == 4) {
                                String str = gcc.a;
                                ta3Var.j(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                ru4 ru4Var = (ru4) this.b;
                qu4 qu4Var = ru4Var.g;
                int i5 = message.what;
                if (i5 == 1) {
                    qu4Var.getClass();
                    return;
                }
                if (i5 == 2) {
                    ru4Var.f.removeMessages(3);
                    ru4Var.j = false;
                    ru4Var.k = true;
                    qu4Var.onLongPress(ru4Var.n);
                    return;
                }
                if (i5 != 3) {
                    grb.h(message, "Unknown message ");
                    return;
                }
                pu4 pu4Var = ru4Var.h;
                if (pu4Var != null) {
                    if (ru4Var.i) {
                        ru4Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) pu4Var).f1(ru4Var.n);
                        return;
                    }
                }
                return;
            case 5:
                su4 su4Var = (su4) this.b;
                tu4 tu4Var = su4Var.f;
                int i6 = message.what;
                if (i6 == 1) {
                    tu4Var.onShowPress(su4Var.m);
                    return;
                }
                if (i6 == 2) {
                    su4Var.e.removeMessages(3);
                    su4Var.i = false;
                    su4Var.j = true;
                    tu4Var.onLongPress(su4Var.m);
                    return;
                }
                if (i6 != 3) {
                    grb.h(message, "Unknown message ");
                    return;
                }
                tu4 tu4Var2 = su4Var.g;
                if (tu4Var2 != null) {
                    if (su4Var.h) {
                        su4Var.i = true;
                        return;
                    } else {
                        tu4Var2.onSingleTapConfirmed(su4Var.m);
                        return;
                    }
                }
                return;
            case 6:
                int i7 = message.what;
                int i8 = message.arg1;
                Object obj2 = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((gu6) this.b).j;
                c99 c99Var = (c99) sparseArray.get(i8);
                if (c99Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i8);
                if (i7 == 3) {
                    c99Var.b((Bundle) obj2);
                    return;
                } else {
                    if (i7 == 4) {
                        c99.a(peekData != null ? peekData.getString("error") : null, (Bundle) obj2);
                        return;
                    }
                    return;
                }
            case 7:
                ou6 ou6Var = (ou6) this.b;
                d1 d1Var = ou6Var.N;
                int i9 = message.what;
                if (i9 == 1) {
                    ou6Var.e((List) message.obj);
                    return;
                }
                if (i9 == 2) {
                    if (ou6Var.r.isEmpty()) {
                        ou6Var.i(2);
                        d1Var.removeMessages(2);
                        d1Var.removeMessages(3);
                        d1Var.sendMessageDelayed(d1Var.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i9 == 3 && ou6Var.r.isEmpty()) {
                    ou6Var.i(3);
                    d1Var.removeMessages(2);
                    d1Var.removeMessages(3);
                    d1Var.removeMessages(1);
                    ou6Var.f.h(ou6Var.h);
                    return;
                }
                return;
            case 8:
                if (message.what == 1) {
                    lv6 lv6Var = (lv6) this.b;
                    List list = (List) message.obj;
                    lv6Var.G = SystemClock.uptimeMillis();
                    lv6Var.s.clear();
                    lv6Var.s.addAll(list);
                    lv6Var.w.D();
                    return;
                }
                return;
            case 9:
                wv6 wv6Var = (wv6) this.b;
                int i10 = message.what;
                if (i10 == 1) {
                    wv6Var.n();
                    return;
                } else {
                    if (i10 != 2 || wv6Var.N == null) {
                        return;
                    }
                    wv6Var.N = null;
                    wv6Var.o();
                    return;
                }
            case 10:
                bw6 bw6Var = (bw6) this.b;
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        bw6Var.b = false;
                        bw6Var.f((gv6) bw6Var.h);
                        return;
                    }
                    return;
                }
                bw6Var.c = false;
                xh4 xh4Var = (xh4) bw6Var.f;
                if (xh4Var != null) {
                    fo4 fo4Var = (fo4) bw6Var.n;
                    a05 a05Var = (a05) xh4Var.b;
                    iw6 d = a05Var.d(bw6Var);
                    if (d != null) {
                        a05Var.m(d, fo4Var);
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
            case 13:
                xw6 xw6Var = (xw6) message.obj;
                rx6 rx6Var = (rx6) this.b;
                if (rx6Var.Y(xw6Var)) {
                    ww6 ww6Var = xw6Var.e;
                    ww6Var.getClass();
                    ww6Var.e();
                    rx6Var.k0(xw6Var);
                    return;
                }
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public /* synthetic */ d1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Looper looper, Object obj, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }
}
