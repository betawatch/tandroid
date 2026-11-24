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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c1 extends Handler {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(cu6 cu6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = cu6Var;
    }

    private final void a(Message message) {
        jk2 jk2Var;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            mb3 mb3Var = (mb3) this.b;
            hi2 hi2Var = mb3Var.c;
            if (obj == mb3Var.z) {
                if (mb3Var.p == 2 || mb3Var.k()) {
                    mb3Var.z = null;
                    if (obj2 instanceof Exception) {
                        hi2Var.K((Exception) obj2, false);
                        return;
                    }
                    try {
                        mb3Var.b.o(((ls6) obj2).a);
                        hi2Var.c = null;
                        HashSet hashSet = (HashSet) hi2Var.b;
                        mo5 q = mo5.q(hashSet);
                        hashSet.clear();
                        ko5 listIterator = q.listIterator(0);
                        while (listIterator.hasNext()) {
                            mb3 mb3Var2 = (mb3) listIterator.next();
                            if (mb3Var2.n()) {
                                mb3Var2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        hi2Var.K(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == 2) {
            mb3 mb3Var3 = (mb3) this.b;
            if (obj == mb3Var3.x && mb3Var3.k()) {
                mb3Var3.x = null;
                synchronized (mb3Var3.o) {
                    ai4 ai4Var = mb3Var3.y;
                    ai4Var.getClass();
                    jk2Var = new jk2((byte) 21);
                    ((jo5) ai4Var.b).f();
                    mb3Var3.y = null;
                }
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    mb3Var3.m((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] l = mb3Var3.b.l(mb3Var3.v, ((ls6) obj2).a);
                    if (mb3Var3.w != null && l != null && l.length != 0) {
                        mb3Var3.w = l;
                    }
                    mb3Var3.p = (byte) 4;
                    mb3Var3.i(new wm2(jk2Var, (byte) 20));
                } catch (Exception | NoSuchMethodError e2) {
                    mb3Var3.m(e2, true);
                }
            }
        }
    }

    private final void b(Message message) {
        zw6 zw6Var;
        yw6 yw6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yw6) this.b).b) {
                zw6Var = (zw6) ((yw6) this.b).d.get();
                yw6Var = (yw6) this.b;
                c1Var = (c1) yw6Var.f;
            }
            if (zw6Var == null || yw6Var != zw6Var.b() || c1Var == null) {
                return;
            }
            zw6Var.e((ny6) message.obj);
            ((yw6) this.b).a(zw6Var, c1Var);
            zw6Var.e(null);
        }
    }

    private final void c(Message message) {
        bx6 bx6Var;
        yw6 yw6Var;
        c1 c1Var;
        if (message.what == 1) {
            synchronized (((yw6) this.b).b) {
                bx6Var = (bx6) ((yw6) this.b).d.get();
                yw6Var = (yw6) this.b;
                c1Var = (c1) yw6Var.f;
            }
            if (bx6Var == null || yw6Var != bx6Var.b() || c1Var == null) {
                return;
            }
            bx6Var.d((my6) message.obj);
            ((yw6) this.b).b(bx6Var, c1Var);
            bx6Var.d(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        ty tyVar;
        ty tyVar2 = null;
        tyVar2 = null;
        tyVar2 = null;
        tyVar2 = null;
        tyVar2 = null;
        tyVar2 = null;
        switch (this.a) {
            case 0:
                if (message.what == 1) {
                    ((d1) this.b).h = message.arg1;
                    ((d1) this.b).i = false;
                    return;
                }
                return;
            case 1:
                uy uyVar = (uy) this.b;
                int i = message.what;
                if (i == 1) {
                    tyVar = (ty) message.obj;
                    try {
                        uyVar.a.queueInputBuffer(tyVar.a, 0, tyVar.b, tyVar.d, tyVar.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = uyVar.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            uyVar.e.e();
                        } else if (i != 4) {
                            AtomicReference atomicReference2 = uyVar.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                uyVar.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e2) {
                                AtomicReference atomicReference3 = uyVar.d;
                                while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (tyVar2 == null) {
                            uy.e(tyVar2);
                            return;
                        }
                        return;
                    }
                    tyVar = (ty) message.obj;
                    int i2 = tyVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = tyVar.c;
                    long j = tyVar.d;
                    int i3 = tyVar.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            uyVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        } else {
                            synchronized (uy.n) {
                                uyVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            }
                        }
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = uyVar.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                tyVar2 = tyVar;
                if (tyVar2 == null) {
                }
            case 2:
                a(message);
                return;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((pb3) this.b).x;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        mb3 mb3Var = (mb3) obj;
                        mb3Var.p();
                        if (Arrays.equals(mb3Var.v, bArr)) {
                            if (message.what == 2 && mb3Var.p == 4) {
                                String str = hac.a;
                                mb3Var.j(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                ou4 ou4Var = (ou4) this.b;
                nu4 nu4Var = ou4Var.g;
                int i5 = message.what;
                if (i5 == 1) {
                    nu4Var.getClass();
                    return;
                }
                if (i5 == 2) {
                    ou4Var.f.removeMessages(3);
                    ou4Var.j = false;
                    ou4Var.k = true;
                    nu4Var.onLongPress(ou4Var.n);
                    return;
                }
                if (i5 != 3) {
                    rjb.i(message, "Unknown message ");
                    return;
                }
                mu4 mu4Var = ou4Var.h;
                if (mu4Var != null) {
                    if (ou4Var.i) {
                        ou4Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) mu4Var).f1(ou4Var.n);
                        return;
                    }
                }
                return;
            case 5:
                pu4 pu4Var = (pu4) this.b;
                qu4 qu4Var = pu4Var.f;
                int i6 = message.what;
                if (i6 == 1) {
                    qu4Var.onShowPress(pu4Var.m);
                    return;
                }
                if (i6 == 2) {
                    pu4Var.e.removeMessages(3);
                    pu4Var.i = false;
                    pu4Var.j = true;
                    qu4Var.onLongPress(pu4Var.m);
                    return;
                }
                if (i6 != 3) {
                    rjb.i(message, "Unknown message ");
                    return;
                }
                qu4 qu4Var2 = pu4Var.g;
                if (qu4Var2 != null) {
                    if (pu4Var.h) {
                        pu4Var.i = true;
                        return;
                    } else {
                        qu4Var2.onSingleTapConfirmed(pu4Var.m);
                        return;
                    }
                }
                return;
            case 6:
                int i7 = message.what;
                int i8 = message.arg1;
                Object obj2 = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((cu6) this.b).j;
                r79 r79Var = (r79) sparseArray.get(i8);
                if (r79Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i8);
                if (i7 == 3) {
                    r79Var.b((Bundle) obj2);
                    return;
                } else {
                    if (i7 == 4) {
                        r79.a(peekData != null ? peekData.getString("error") : null, (Bundle) obj2);
                        return;
                    }
                    return;
                }
            case 7:
                ku6 ku6Var = (ku6) this.b;
                c1 c1Var = ku6Var.N;
                int i9 = message.what;
                if (i9 == 1) {
                    ku6Var.e((List) message.obj);
                    return;
                }
                if (i9 == 2) {
                    if (ku6Var.r.isEmpty()) {
                        ku6Var.i(2);
                        c1Var.removeMessages(2);
                        c1Var.removeMessages(3);
                        c1Var.sendMessageDelayed(c1Var.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i9 == 3 && ku6Var.r.isEmpty()) {
                    ku6Var.i(3);
                    c1Var.removeMessages(2);
                    c1Var.removeMessages(3);
                    c1Var.removeMessages(1);
                    ku6Var.f.h(ku6Var.h);
                    return;
                }
                return;
            case 8:
                if (message.what == 1) {
                    gv6 gv6Var = (gv6) this.b;
                    List list = (List) message.obj;
                    gv6Var.G = SystemClock.uptimeMillis();
                    gv6Var.s.clear();
                    gv6Var.s.addAll(list);
                    gv6Var.w.D();
                    return;
                }
                return;
            case 9:
                rv6 rv6Var = (rv6) this.b;
                int i10 = message.what;
                if (i10 == 1) {
                    rv6Var.n();
                    return;
                } else {
                    if (i10 != 2 || rv6Var.N == null) {
                        return;
                    }
                    rv6Var.N = null;
                    rv6Var.o();
                    return;
                }
            case 10:
                wv6 wv6Var = (wv6) this.b;
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        wv6Var.b = false;
                        wv6Var.f((bv6) wv6Var.h);
                        return;
                    }
                    return;
                }
                wv6Var.c = false;
                ai4 ai4Var = (ai4) wv6Var.f;
                if (ai4Var != null) {
                    bo4 bo4Var = (bo4) wv6Var.n;
                    wz4 wz4Var = (wz4) ai4Var.b;
                    dw6 d = wz4Var.d(wv6Var);
                    if (d != null) {
                        wz4Var.m(d, bo4Var);
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
                sw6 sw6Var = (sw6) message.obj;
                mx6 mx6Var = (mx6) this.b;
                if (mx6Var.X(sw6Var)) {
                    rw6 rw6Var = sw6Var.e;
                    rw6Var.getClass();
                    rw6Var.e();
                    mx6Var.i0(sw6Var);
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
    public c1(Looper looper, mx6 mx6Var) {
        super(looper);
        this.a = (byte) 13;
        this.b = mx6Var;
    }
}
