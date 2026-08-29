package b4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import eg.n;
import f5.d0;
import f5.m;
import h7.h5;
import j3.g1;
import j3.h0;
import j3.h1;
import j3.k0;
import j3.t0;
import j3.u0;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends j3.e implements Handler.Callback {
    public final d a;
    public final h0 b;
    public final Handler c;
    public final e d;
    public h5 e;
    public boolean f;
    public boolean h;
    public long n;
    public c r;
    public long s;

    public f(h0 h0Var, Looper looper) {
        super(5);
        Handler handler;
        this.b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.a;
            handler = new Handler(looper, this);
        }
        this.c = handler;
        this.a = d.a;
        this.d = new e();
        this.s = -9223372036854775807L;
    }

    public final void a(c cVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.a;
            if (i10 >= bVarArr.length) {
                return;
            }
            t0 wrappedMetadataFormat = bVarArr[i10].getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null) {
                d dVar = this.a;
                if (dVar.b(wrappedMetadataFormat)) {
                    h5 a2 = dVar.a(wrappedMetadataFormat);
                    byte[] wrappedMetadataBytes = bVarArr[i10].getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    e eVar = this.d;
                    eVar.clear();
                    eVar.b(wrappedMetadataBytes.length);
                    eVar.b.put(wrappedMetadataBytes);
                    eVar.c();
                    c a10 = a2.a(eVar);
                    if (a10 != null) {
                        a(a10, arrayList);
                    }
                    i10++;
                }
            }
            arrayList.add(bVarArr[i10]);
            i10++;
        }
    }

    public final long b(long j10) {
        f5.a.i(j10 != -9223372036854775807L);
        f5.a.i(this.s != -9223372036854775807L);
        return j10 - this.s;
    }

    public final void c(c cVar) {
        h0 h0Var = this.b;
        k0 k0Var = h0Var.a;
        h1 h1Var = k0Var.h0;
        m mVar = k0Var.l;
        g1 a2 = h1Var.a();
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.a;
            if (i10 >= bVarArr.length) {
                break;
            }
            bVarArr[i10].populateMediaMetadata(a2);
            i10++;
        }
        k0Var.h0 = new h1(a2);
        h1 R = k0Var.R();
        if (!R.equals(k0Var.O)) {
            k0Var.O = R;
            mVar.c(14, new n(h0Var, 13));
        }
        mVar.c(28, new n(cVar, 14));
        mVar.b();
    }

    @Override // j3.e, j3.h2
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        c((c) message.obj);
        return true;
    }

    @Override // j3.e
    public final boolean isEnded() {
        return this.h;
    }

    @Override // j3.e
    public final boolean isReady() {
        return true;
    }

    @Override // j3.e
    public final void onDisabled() {
        this.r = null;
        this.e = null;
        this.s = -9223372036854775807L;
    }

    @Override // j3.e
    public final void onPositionReset(long j10, boolean z10) {
        this.r = null;
        this.f = false;
        this.h = false;
    }

    @Override // j3.e
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        this.e = this.a.a(t0VarArr[0]);
        c cVar = this.r;
        if (cVar != null) {
            long j12 = cVar.b;
            long j13 = (this.s + j12) - j11;
            if (j12 != j13) {
                cVar = new c(j13, cVar.a);
            }
            this.r = cVar;
        }
        this.s = j11;
    }

    @Override // j3.e
    public final void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f && this.r == null) {
                e eVar = this.d;
                eVar.clear();
                u0 formatHolder = getFormatHolder();
                int readSource = readSource(formatHolder, eVar, 0);
                if (readSource == -4) {
                    if (eVar.isEndOfStream()) {
                        this.f = true;
                    } else {
                        eVar.n = this.n;
                        eVar.c();
                        h5 h5Var = this.e;
                        int i10 = d0.a;
                        c a2 = h5Var.a(eVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.a.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.r = new c(b(eVar.d), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (readSource == -5) {
                    t0 t0Var = formatHolder.b;
                    t0Var.getClass();
                    this.n = t0Var.F;
                }
            }
            c cVar = this.r;
            if (cVar == null || cVar.b > b(j10)) {
                z10 = false;
            } else {
                c cVar2 = this.r;
                Handler handler = this.c;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    c(cVar2);
                }
                this.r = null;
                z10 = true;
            }
            if (this.f && this.r == null) {
                this.h = true;
            }
        }
    }

    @Override // j3.h2
    public final int supportsFormat(t0 t0Var) {
        if (this.a.b(t0Var)) {
            return com.google.android.recaptcha.internal.a.b(t0Var.W == 0 ? 4 : 2, 0, 0);
        }
        return com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }
}
