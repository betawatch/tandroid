// default package

import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class na1 extends jo3 implements la1, cx2, akc {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final fw2 d;
    public final sw2 e;

    static {
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(na1.class.getDeclaredField("_decisionAndIndex$volatile"));
        n = unsafe.objectFieldOffset(na1.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(na1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public na1(int i, fw2 fw2Var) {
        super(i);
        this.d = fw2Var;
        this.e = fw2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = h9.a;
    }

    public static Object D(tj7 tj7Var, Object obj, int i, gq4 gq4Var) {
        if (obj instanceof fp2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (gq4Var != null || (tj7Var instanceof ja1)) {
            return new dp2(obj, tj7Var instanceof ja1 ? (ja1) tj7Var : null, gq4Var, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(tj7 tj7Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + tj7Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, gq4 gq4Var) {
        B(obj, this.c, gq4Var);
    }

    public final void B(Object obj, int i, gq4 gq4Var) {
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof tj7)) {
                na1 na1Var2 = this;
                if (objectVolatile instanceof pa1) {
                    pa1 pa1Var = (pa1) objectVolatile;
                    if (unsafe.compareAndSwapInt(pa1Var, pa1.c, 0, 1)) {
                        if (gq4Var != null) {
                            na1Var2.k(gq4Var, pa1Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                wn4.n(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object D = D((tj7) objectVolatile, obj, i, gq4Var);
            while (true) {
                Unsafe unsafe2 = ex.a;
                na1Var = this;
                if (unsafe2.compareAndSwapObject(na1Var, n, objectVolatile, D)) {
                    if (!na1Var.w()) {
                        na1Var.n();
                    }
                    na1Var.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(na1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = na1Var;
                }
            }
            this = na1Var;
        }
    }

    public final void C(vw2 vw2Var) {
        fw2 fw2Var = this.d;
        ho3 ho3Var = fw2Var instanceof ho3 ? (ho3) fw2Var : null;
        B(g5c.a, (ho3Var != null ? ho3Var.d : null) == vw2Var ? 4 : this.c, null);
    }

    public final lo5 E(Object obj, gq4 gq4Var) {
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof tj7)) {
                return null;
            }
            Object D = D((tj7) objectVolatile, obj, this.c, gq4Var);
            while (true) {
                Unsafe unsafe2 = ex.a;
                na1Var = this;
                if (unsafe2.compareAndSwapObject(na1Var, n, objectVolatile, D)) {
                    boolean w = na1Var.w();
                    lo5 lo5Var = v43.a;
                    if (!w) {
                        na1Var.n();
                    }
                    return lo5Var;
                }
                if (unsafe2.getObjectVolatile(na1Var, j) != objectVolatile) {
                    break;
                }
                this = na1Var;
            }
            this = na1Var;
        }
    }

    @Override // akc
    public final void a(nv9 nv9Var, int i) {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                sc8.j("invokeOnCancellation should be called at most once");
                return;
            }
            na1 na1Var = this;
            if (unsafe.compareAndSwapInt(na1Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                na1Var.v(nv9Var);
                return;
            }
            this = na1Var;
        }
    }

    @Override // la1
    public final lo5 b(Object obj, gq4 gq4Var) {
        return E(obj, gq4Var);
    }

    @Override // jo3
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof tj7) {
                sc8.j("Not completed");
                return;
            }
            if (objectVolatile instanceof fp2) {
                return;
            }
            if (objectVolatile instanceof dp2) {
                dp2 dp2Var = (dp2) objectVolatile;
                if (dp2Var.e != null) {
                    sc8.j("Must be called at most once");
                    return;
                }
                dp2 a = dp2.a(dp2Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    na1 na1Var2 = this;
                    if (unsafe2.compareAndSwapObject(na1Var2, n, objectVolatile, a)) {
                        ja1 ja1Var = dp2Var.b;
                        if (ja1Var != null) {
                            na1Var2.j(ja1Var, cancellationException);
                        }
                        gq4 gq4Var = dp2Var.c;
                        if (gq4Var != null) {
                            na1Var2.k(gq4Var, cancellationException, dp2Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(na1Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        na1Var = na1Var2;
                        break;
                    }
                    this = na1Var2;
                }
            } else {
                na1 na1Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                dp2 dp2Var2 = new dp2(objectVolatile, (ja1) null, (gq4) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    dp2 dp2Var3 = dp2Var2;
                    Unsafe unsafe3 = ex.a;
                    na1Var = na1Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(na1Var, n, objectVolatile, dp2Var3);
                    dp2Var2 = dp2Var3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(na1Var, j) != objectVolatile) {
                        break;
                    } else {
                        na1Var3 = na1Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = na1Var;
        }
    }

    @Override // jo3
    public final fw2 d() {
        return this.d;
    }

    @Override // la1
    public final void e(Object obj) {
        o(this.c);
    }

    @Override // jo3
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    @Override // jo3
    public final Object g(Object obj) {
        return obj instanceof dp2 ? ((dp2) obj).a : obj;
    }

    @Override // cx2
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.d;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    @Override // fw2
    public final sw2 getContext() {
        return this.e;
    }

    @Override // jo3
    public final Object i() {
        return r();
    }

    public final void j(ja1 ja1Var, Throwable th) {
        try {
            ja1Var.a(th);
        } catch (Throwable th2) {
            c9e.a(this.e, new gp2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(gq4 gq4Var, Throwable th, Object obj) {
        sw2 sw2Var = this.e;
        try {
            gq4Var.a(th, obj, sw2Var);
        } catch (Throwable th2) {
            c9e.a(sw2Var, new gp2("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(nv9 nv9Var, Throwable th) {
        sw2 sw2Var = this.e;
        int intVolatile = ex.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            sc8.j("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            nv9Var.h(intVolatile, sw2Var);
        } catch (Throwable th2) {
            c9e.a(sw2Var, new gp2("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof tj7)) {
                return false;
            }
            pa1 pa1Var = new pa1(this, th, (objectVolatile instanceof ja1) || (objectVolatile instanceof nv9));
            while (true) {
                Unsafe unsafe2 = ex.a;
                na1Var = this;
                if (unsafe2.compareAndSwapObject(na1Var, n, objectVolatile, pa1Var)) {
                    tj7 tj7Var = (tj7) objectVolatile;
                    if (tj7Var instanceof ja1) {
                        na1Var.j((ja1) objectVolatile, th);
                    } else if (tj7Var instanceof nv9) {
                        na1Var.l((nv9) objectVolatile, th);
                    }
                    if (!na1Var.w()) {
                        na1Var.n();
                    }
                    na1Var.o(na1Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(na1Var, j) != objectVolatile) {
                    break;
                }
                this = na1Var;
            }
            this = na1Var;
        }
    }

    public final void n() {
        Unsafe unsafe = ex.a;
        long j = h;
        no3 no3Var = (no3) unsafe.getObjectVolatile(this, j);
        if (no3Var == null) {
            return;
        }
        no3Var.dispose();
        unsafe.putObjectVolatile(this, j, sj7.a);
    }

    public final void o(int i) {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    sc8.j("Already resumed");
                    return;
                }
                boolean z = i == 4;
                fw2 fw2Var = this.d;
                if (!z && (fw2Var instanceof ho3)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        ho3 ho3Var = (ho3) fw2Var;
                        vw2 vw2Var = ho3Var.d;
                        sw2 context = ho3Var.e.getContext();
                        if (vw2Var.d(context)) {
                            vw2Var.c(context, this);
                            return;
                        }
                        d44 a = dnb.a();
                        if (a.c >= 4294967296L) {
                            ks ksVar = a.e;
                            if (ksVar == null) {
                                ksVar = new ks();
                                a.e = ksVar;
                            }
                            ksVar.addLast(this);
                            return;
                        }
                        a.g(true);
                        try {
                            eee.a(this, fw2Var, true);
                            do {
                            } while (a.i());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                eee.a(this, fw2Var, z);
                return;
            }
            na1 na1Var = this;
            if (unsafe.compareAndSwapInt(na1Var, j, intVolatile, TLObject.FLAG_30 + (536870911 & intVolatile))) {
                return;
            } else {
                this = na1Var;
            }
        }
    }

    public Throwable p(pt5 pt5Var) {
        return pt5Var.getCancellationException();
    }

    public final Object q() {
        bt5 bt5Var;
        boolean w = w();
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    sc8.j("Already suspended");
                    return null;
                }
                if (w) {
                    this.z();
                }
                Object r = this.r();
                if (r instanceof fp2) {
                    throw ((fp2) r).a;
                }
                int i2 = this.c;
                if ((i2 != 1 && i2 != 2) || (bt5Var = (bt5) this.e.get(pd5.c)) == null || bt5Var.isActive()) {
                    return this.g(r);
                }
                CancellationException cancellationException = bt5Var.getCancellationException();
                this.c(cancellationException);
                throw cancellationException;
            }
            na1 na1Var = this;
            if (unsafe.compareAndSwapInt(na1Var, j, intVolatile, TLObject.FLAG_29 + (536870911 & intVolatile))) {
                if (((no3) unsafe.getObjectVolatile(na1Var, h)) == null) {
                    na1Var.t();
                }
                if (w) {
                    na1Var.z();
                }
                return bx2.a;
            }
            this = na1Var;
        }
    }

    public final Object r() {
        return ex.a.getObjectVolatile(this, n);
    }

    @Override // fw2
    public final void resumeWith(Object obj) {
        Throwable a = ta9.a(obj);
        if (a != null) {
            obj = new fp2(a, false);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        no3 t = t();
        if (t == null || (r() instanceof tj7)) {
            return;
        }
        t.dispose();
        ex.a.putObjectVolatile(this, h, sj7.a);
    }

    public final no3 t() {
        bt5 bt5Var = (bt5) this.e.get(pd5.c);
        if (bt5Var == null) {
            return null;
        }
        no3 c = nle.c(bt5Var, true, new eg2(this));
        while (true) {
            Unsafe unsafe = ex.a;
            long j = h;
            na1 na1Var = this;
            if (unsafe.compareAndSwapObject(na1Var, j, (Object) null, c) || unsafe.getObjectVolatile(na1Var, j) != null) {
                break;
            }
            this = na1Var;
        }
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(y());
        sb.append('(');
        sb.append(s83.d(this.d));
        sb.append("){");
        Object r = r();
        sb.append(r instanceof tj7 ? "Active" : r instanceof pa1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(s83.a(this));
        return sb.toString();
    }

    public final void u(qp4 qp4Var) {
        v(new ia1(qp4Var, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        x(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c2, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(tj7 tj7Var) {
        tj7 tj7Var2;
        na1 na1Var;
        na1 na1Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = ex.a;
            long j = n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof h9) {
                while (true) {
                    Unsafe unsafe3 = ex.a;
                    na1 na1Var3 = this;
                    tj7 tj7Var3 = tj7Var;
                    na1Var = na1Var3;
                    tj7Var2 = tj7Var3;
                    if (!unsafe3.compareAndSwapObject(na1Var3, n, objectVolatile, tj7Var3)) {
                        if (unsafe3.getObjectVolatile(na1Var, j) != objectVolatile) {
                            break;
                        }
                        this = na1Var;
                        tj7Var = tj7Var2;
                    } else {
                        return;
                    }
                }
            } else {
                tj7Var2 = tj7Var;
                na1Var = this;
                if ((objectVolatile instanceof ja1) || (objectVolatile instanceof nv9)) {
                    break;
                }
                if (objectVolatile instanceof fp2) {
                    fp2 fp2Var = (fp2) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(fp2Var, fp2.b, 0, 1)) {
                        x(tj7Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof pa1) {
                        Throwable th = fp2Var.a;
                        if (tj7Var2 instanceof ja1) {
                            na1Var.j((ja1) tj7Var2, th);
                            return;
                        } else {
                            na1Var.l((nv9) tj7Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof dp2) {
                    dp2 dp2Var = (dp2) objectVolatile;
                    if (dp2Var.b != null) {
                        x(tj7Var2, objectVolatile);
                        throw null;
                    }
                    if (tj7Var2 instanceof nv9) {
                        return;
                    }
                    ja1 ja1Var = (ja1) tj7Var2;
                    Throwable th2 = dp2Var.e;
                    if (th2 != null) {
                        na1Var.j(ja1Var, th2);
                        return;
                    }
                    dp2 a = dp2.a(dp2Var, ja1Var, null, 29);
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(na1Var, n, objectVolatile, a)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(na1Var, j) == objectVolatile);
                } else {
                    if (tj7Var2 instanceof nv9) {
                        return;
                    }
                    dp2 dp2Var2 = new dp2(objectVolatile, (ja1) tj7Var2, (gq4) null, (CancellationException) null, 28);
                    while (true) {
                        dp2 dp2Var3 = dp2Var2;
                        Unsafe unsafe4 = ex.a;
                        na1Var2 = na1Var;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(na1Var2, n, objectVolatile, dp2Var3);
                        dp2Var2 = dp2Var3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(na1Var2, j) != objectVolatile) {
                            break;
                        } else {
                            na1Var = na1Var2;
                        }
                    }
                    this = na1Var2;
                    tj7Var = tj7Var2;
                }
            }
            na1Var2 = na1Var;
            this = na1Var2;
            tj7Var = tj7Var2;
        }
    }

    public final boolean w() {
        if (this.c == 2) {
            return ex.a.getObjectVolatile((ho3) this.d, ho3.n) != null;
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r9.n();
        r9.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        na1 na1Var;
        Unsafe unsafe;
        fw2 fw2Var = this.d;
        Throwable th = null;
        ho3 ho3Var = fw2Var instanceof ho3 ? (ho3) fw2Var : null;
        if (ho3Var == null) {
            return;
        }
        long j = ho3.n;
        loop0: while (true) {
            Object objectVolatile = ex.a.getObjectVolatile(ho3Var, j);
            lo5 lo5Var = r3c.b;
            if (objectVolatile != lo5Var) {
                na1Var = this;
                if (!(objectVolatile instanceof Throwable)) {
                    wn4.n(objectVolatile, "Inconsistent state ");
                    return;
                }
                do {
                    unsafe = ex.a;
                    if (unsafe.compareAndSwapObject(ho3Var, ho3.n, objectVolatile, (Object) null)) {
                        th = (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(ho3Var, j) == objectVolatile);
                w26.j("Failed requirement.");
                return;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                na1 na1Var2 = this;
                na1Var = na1Var2;
                if (unsafe2.compareAndSwapObject(ho3Var, ho3.n, lo5Var, na1Var2)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(ho3Var, j) != lo5Var) {
                    break;
                } else {
                    this = na1Var;
                }
            }
            this = na1Var;
        }
    }
}
