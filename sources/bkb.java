// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bkb extends uh0 implements Handler.Callback {
    public final k1f K;
    public final la3 L;
    public h53 M;
    public final x59 N;
    public boolean O;
    public byte P;
    public mcb Q;
    public rcb R;
    public scb S;
    public scb T;
    public int U;
    public final Handler V;
    public final c74 W;
    public final mj4 X;
    public boolean Y;
    public boolean Z;
    public go4 a0;
    public long b0;
    public long c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkb(c74 c74Var, Looper looper) {
        super(3);
        Handler handler;
        x59 x59Var = ocb.A;
        this.W = c74Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = hac.a;
            handler = new Handler(looper, this);
        }
        this.V = handler;
        this.N = x59Var;
        this.K = new k1f((byte) 16);
        this.L = new la3(1, 0);
        this.X = new mj4((byte) 3, false);
        this.c0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0282, code lost:
    
        if (r7 == (-3)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r23 < (r0.e - 1000000)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (A(r11, r0, 0) != (-4)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r0.isEndOfStream() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r22.Y = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r0.d();
        r5 = r0.c;
        r5.getClass();
        r11 = r0.e;
        r6 = r5.array();
        r8 = r5.arrayOffset();
        r5 = r5.limit();
        r22.K.getClass();
        r10 = android.os.Parcel.obtain();
        r10.unmarshall(r6, r8, r5);
        r10.setDataPosition(0);
        r5 = r10.readBundle(android.os.Bundle.class.getClassLoader());
        r10.recycle();
        r6 = r5.getParcelableArrayList("c");
        r6.getClass();
        r10 = new i53(r11, r5.getLong("d"), d41.b(new o41((byte) 1), r6));
        r0.clear();
        r9 = r22.M.b(r10, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r13 >= (r5 - 1000000)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r8 == (-3)) goto L26;
     */
    @Override // uh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j, long j2) {
        boolean z;
        boolean z2;
        long j3;
        la3 la3Var;
        int A;
        if (this.E) {
            long j4 = this.c0;
            if (j4 != -9223372036854775807L && j >= j4) {
                Q();
                this.Z = true;
            }
        }
        if (this.Z) {
            return;
        }
        go4 go4Var = this.a0;
        go4Var.getClass();
        boolean equals = Objects.equals(go4Var.t, "application/x-media3-cues");
        Handler handler = this.V;
        int i = 5;
        boolean z3 = false;
        mj4 mj4Var = this.X;
        if (equals) {
            this.M.getClass();
            if (!this.Y && ((A = A(mj4Var, (la3Var = this.L), 5)) != -3 || la3Var.isEndOfStream())) {
                if (A == -4) {
                    if (!la3Var.isEndOfStream()) {
                    }
                    long j5 = this.I;
                    long j6 = j - this.w;
                    if (j5 != -9223372036854775807L) {
                    }
                }
            }
            long a = this.M.a(this.b0);
            if (a == Long.MIN_VALUE && this.Y && !z3) {
                this.Z = true;
            }
            if (a != Long.MIN_VALUE && a <= j) {
                z3 = true;
            }
            if (z3) {
                mo5 c = this.M.c(j);
                long d = this.M.d(j);
                g53 g53Var = new g53(N(d), c);
                if (handler != null) {
                    handler.obtainMessage(1, g53Var).sendToTarget();
                } else {
                    P(g53Var);
                }
                this.M.e(d);
            }
            this.b0 = j;
            return;
        }
        K();
        this.b0 = j;
        if (this.T == null) {
            mcb mcbVar = this.Q;
            mcbVar.getClass();
            mcbVar.b(j);
            try {
                mcb mcbVar2 = this.Q;
                mcbVar2.getClass();
                this.T = (scb) mcbVar2.c();
            } catch (ncb e) {
                ncd.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.a0, e);
                L();
                Q();
                mcb mcbVar3 = this.Q;
                mcbVar3.getClass();
                mcbVar3.release();
                this.Q = null;
                this.P = (byte) 0;
                O();
                return;
            }
        }
        if (this.n == 2) {
            if (this.S != null) {
                long M = M();
                z = false;
                while (M <= j) {
                    this.U++;
                    M = M();
                    z = true;
                }
            } else {
                z = false;
            }
            scb scbVar = this.T;
            if (scbVar != null) {
                if (scbVar.isEndOfStream()) {
                    if (!z && M() == Long.MAX_VALUE) {
                        if (this.P == 2) {
                            Q();
                            mcb mcbVar4 = this.Q;
                            mcbVar4.getClass();
                            mcbVar4.release();
                            this.Q = null;
                            this.P = (byte) 0;
                            O();
                        } else {
                            Q();
                            this.Z = true;
                        }
                    }
                } else if (scbVar.timeUs <= j) {
                    scb scbVar2 = this.S;
                    if (scbVar2 != null) {
                        scbVar2.release();
                    }
                    this.U = scbVar.b(j);
                    this.S = scbVar;
                    this.T = null;
                    z = true;
                }
            }
            if (z) {
                this.S.getClass();
                int b = this.S.b(j);
                if (b == 0 || this.S.q() == 0) {
                    j3 = this.S.timeUs;
                } else {
                    scb scbVar3 = this.S;
                    j3 = b == -1 ? scbVar3.k(scbVar3.q() - 1) : scbVar3.k(b - 1);
                }
                g53 g53Var2 = new g53(N(j3), this.S.p(j));
                if (handler != null) {
                    handler.obtainMessage(1, g53Var2).sendToTarget();
                } else {
                    P(g53Var2);
                }
            }
            if (this.P != 2) {
                while (!this.Y) {
                    try {
                        rcb rcbVar = this.R;
                        if (rcbVar == null) {
                            mcb mcbVar5 = this.Q;
                            mcbVar5.getClass();
                            rcbVar = (rcb) mcbVar5.d();
                            if (rcbVar == null) {
                                return;
                            } else {
                                this.R = rcbVar;
                            }
                        }
                        if (this.P == 1) {
                            rcbVar.setFlags(4);
                            mcb mcbVar6 = this.Q;
                            mcbVar6.getClass();
                            mcbVar6.e(rcbVar);
                            this.R = null;
                            this.P = (byte) 2;
                            return;
                        }
                        int A2 = A(mj4Var, rcbVar, i);
                        if (A2 == -3 && !rcbVar.isEndOfStream()) {
                            return;
                        }
                        if (A2 == -4) {
                            if (!rcbVar.isEndOfStream()) {
                                if (j < rcbVar.e - 1000000) {
                                    return;
                                }
                            }
                            long j7 = this.I;
                            long j8 = j - this.w;
                            if (j7 == -9223372036854775807L || j8 < j7 - 1000000) {
                                return;
                            }
                        }
                        int A3 = A(mj4Var, rcbVar, 0);
                        if (A3 == -4) {
                            if (rcbVar.isEndOfStream()) {
                                this.Y = true;
                                this.O = false;
                                z2 = false;
                            } else {
                                go4 go4Var2 = (go4) mj4Var.c;
                                if (go4Var2 == null) {
                                    return;
                                }
                                rcbVar.r = go4Var2.y;
                                rcbVar.d();
                                z2 = this.O & (!rcbVar.isKeyFrame());
                                this.O = z2;
                            }
                            if (!z2) {
                                mcb mcbVar7 = this.Q;
                                mcbVar7.getClass();
                                mcbVar7.e(rcbVar);
                                this.R = null;
                            }
                        } else if (A3 == -3) {
                            return;
                        }
                        i = 5;
                    } catch (ncb e2) {
                        ncd.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.a0, e2);
                        L();
                        Q();
                        mcb mcbVar8 = this.Q;
                        mcbVar8.getClass();
                        mcbVar8.release();
                        this.Q = null;
                        this.P = (byte) 0;
                        O();
                        return;
                    }
                }
            }
        }
    }

    @Override // uh0
    public final int G(go4 go4Var) {
        boolean equals = Objects.equals(go4Var.t, "application/x-media3-cues");
        String str = go4Var.t;
        if (!equals) {
            x59 x59Var = this.N;
            x59Var.getClass();
            if (!((fgf) x59Var.b).h(go4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return wf7.l(str) ? kt6.a(1, 0, 0, 0) : kt6.a(0, 0, 0, 0);
            }
        }
        return kt6.a(go4Var.X == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void K() {
        boolean z = Objects.equals(this.a0.t, "application/cea-608") || Objects.equals(this.a0.t, "application/x-mp4-cea-608") || Objects.equals(this.a0.t, "application/cea-708");
        String str = this.a0.t;
        if (z) {
            return;
        }
        dq9.m(pwe.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void L() {
        ko5 ko5Var = mo5.b;
        g53 g53Var = new g53(N(this.b0), y79.e);
        Handler handler = this.V;
        if (handler != null) {
            handler.obtainMessage(1, g53Var).sendToTarget();
        } else {
            P(g53Var);
        }
    }

    public final long M() {
        if (this.U == -1) {
            return Long.MAX_VALUE;
        }
        this.S.getClass();
        if (this.U >= this.S.q()) {
            return Long.MAX_VALUE;
        }
        return this.S.k(this.U);
    }

    public final long N(long j) {
        jte.p(j != -9223372036854775807L);
        return j - this.w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        mcb xe3Var;
        char c = 1;
        this.O = true;
        go4 go4Var = this.a0;
        go4Var.getClass();
        fgf fgfVar = (fgf) this.N.b;
        String str = go4Var.t;
        int i = go4Var.T;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    xe3Var = new ve1(str, i);
                    break;
                case 2:
                    xe3Var = new ze1(i, go4Var.w);
                    break;
            }
            this.Q = xe3Var;
            xe3Var.a(this.x);
        }
        if (!fgfVar.h(go4Var)) {
            u36.j(b10.h("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        }
        vcb v = fgfVar.v(go4Var);
        xe3Var = new xe3(v.getClass().getSimpleName().concat("Decoder"), v);
        this.Q = xe3Var;
        xe3Var.a(this.x);
    }

    public final void P(g53 g53Var) {
        y79 y79Var = g53Var.a;
        c74 c74Var = this.W;
        c74Var.a.m.e(27, new yu3(y79Var, (byte) 14));
        h74 h74Var = c74Var.a;
        h74Var.e0 = g53Var;
        h74Var.m.e(27, new yu3(g53Var, (byte) 11));
    }

    public final void Q() {
        this.R = null;
        this.U = -1;
        scb scbVar = this.S;
        if (scbVar != null) {
            scbVar.release();
            this.S = null;
        }
        scb scbVar2 = this.T;
        if (scbVar2 != null) {
            scbVar2.release();
            this.T = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            P((g53) message.obj);
            return true;
        }
        rjb.h();
        return false;
    }

    @Override // uh0
    public final String l() {
        return "TextRenderer";
    }

    @Override // uh0
    public final boolean n() {
        return this.Z;
    }

    @Override // uh0
    public final boolean o() {
        go4 go4Var = this.a0;
        if (go4Var != null) {
            if (Objects.equals(go4Var.t, "application/x-media3-cues")) {
                h53 h53Var = this.M;
                h53Var.getClass();
                if (h53Var.a(this.b0) == Long.MIN_VALUE) {
                    try {
                        jr9 jr9Var = this.r;
                        jr9Var.getClass();
                        jr9Var.d();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.Z) {
                    return false;
                }
                if (this.Y) {
                    scb scbVar = this.S;
                    long j = this.b0;
                    if (scbVar == null || scbVar.q() <= 0 || scbVar.k(scbVar.q() - 1) <= j) {
                        scb scbVar2 = this.T;
                        long j2 = this.b0;
                        if ((scbVar2 == null || scbVar2.q() <= 0 || scbVar2.k(scbVar2.q() - 1) <= j2) && this.R != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // uh0
    public final void q() {
        this.a0 = null;
        this.c0 = -9223372036854775807L;
        L();
        this.b0 = -9223372036854775807L;
        if (this.Q != null) {
            Q();
            mcb mcbVar = this.Q;
            mcbVar.getClass();
            mcbVar.release();
            this.Q = null;
            this.P = (byte) 0;
        }
    }

    @Override // uh0
    public final void s(long j, boolean z, boolean z2) {
        this.b0 = j;
        h53 h53Var = this.M;
        if (h53Var != null) {
            h53Var.clear();
        }
        L();
        this.Y = false;
        this.Z = false;
        this.c0 = -9223372036854775807L;
        go4 go4Var = this.a0;
        if (go4Var == null || Objects.equals(go4Var.t, "application/x-media3-cues")) {
            return;
        }
        if (this.P == 0) {
            Q();
            mcb mcbVar = this.Q;
            mcbVar.getClass();
            mcbVar.flush();
            mcbVar.a(this.x);
            return;
        }
        Q();
        mcb mcbVar2 = this.Q;
        mcbVar2.getClass();
        mcbVar2.release();
        this.Q = null;
        this.P = (byte) 0;
        O();
    }

    @Override // uh0
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        go4 go4Var = go4VarArr[0];
        this.a0 = go4Var;
        if (Objects.equals(go4Var.t, "application/x-media3-cues")) {
            this.M = this.a0.U == 1 ? new x27() : new xv6((byte) 1);
            return;
        }
        K();
        if (this.Q != null) {
            this.P = (byte) 1;
        } else {
            O();
        }
    }
}
