package d4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import h5.b0;
import h5.d0;
import j3.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k7.c7;
import l3.p0;
import o4.l0;
import oh.h4;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class r extends j3.e {
    public static final byte[] Q0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public final j B;
    public int B0;
    public final s C;
    public boolean C0;
    public final float D;
    public boolean D0;
    public final n3.i E;
    public boolean E0;
    public final n3.i F;
    public long F0;
    public final n3.i G;
    public long G0;
    public final g H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final MediaCodec.BufferInfo J;
    public boolean J0;
    public final ArrayDeque K;
    public boolean K0;
    public final p0 L;
    public j3.n L0;
    public n0 M;
    public n3.f M0;
    public n0 N;
    public q N0;
    public o3.i O;
    public long O0;
    public o3.i P;
    public boolean P0;
    public MediaCrypto Q;
    public boolean R;
    public final long S;
    public float T;
    public float U;
    public k V;
    public n0 W;
    public MediaFormat X;
    public boolean Y;
    public float Z;
    public ArrayDeque a0;
    public p b0;
    public n c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public h o0;
    public long p0;
    public int q0;
    public int r0;
    public ByteBuffer s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public int z0;

    public r(int i10, j jVar, float f10) {
        super(i10);
        this.B = jVar;
        this.C = s.b;
        this.D = f10;
        this.E = new n3.i(0, 0);
        this.F = new n3.i(0, 0);
        this.G = new n3.i(2, 0);
        g gVar = new g(2, 0);
        gVar.w = 32;
        this.H = gVar;
        this.I = new ArrayList();
        this.J = new MediaCodec.BufferInfo();
        this.T = 1.0f;
        this.U = 1.0f;
        this.S = -9223372036854775807L;
        this.K = new ArrayDeque();
        j0(q.d);
        gVar.j(0);
        gVar.d.order(ByteOrder.nativeOrder());
        p0 p0Var = new p0();
        p0Var.c = l3.n.a;
        p0Var.b = 0;
        p0Var.a = 2;
        this.L = p0Var;
        this.Z = -1.0f;
        this.d0 = 0;
        this.z0 = 0;
        this.q0 = -1;
        this.r0 = -1;
        this.p0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.A0 = 0;
        this.B0 = 0;
    }

    public abstract n3.k A(n nVar, n0 n0Var, n0 n0Var2);

    public l B(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void C() {
        this.x0 = false;
        this.H.b();
        this.G.b();
        this.w0 = false;
        this.v0 = false;
        p0 p0Var = this.L;
        p0Var.getClass();
        p0Var.c = l3.n.a;
        p0Var.b = 0;
        p0Var.a = 2;
    }

    public final boolean D() {
        if (!this.C0) {
            o0();
            return true;
        }
        this.A0 = 1;
        if (this.f0 || this.h0) {
            this.B0 = 3;
            return false;
        }
        this.B0 = 2;
        return true;
    }

    public final boolean E(long j10, long j11) {
        MediaCodec.BufferInfo bufferInfo;
        boolean z4;
        boolean z10;
        boolean c02;
        int f10;
        boolean z11;
        int i10 = this.r0;
        MediaCodec.BufferInfo bufferInfo2 = this.J;
        if (i10 < 0) {
            if (this.i0 && this.D0) {
                try {
                    f10 = this.V.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    b0();
                    if (this.I0) {
                        e0();
                    }
                }
            } else {
                f10 = this.V.f(bufferInfo2);
            }
            if (f10 < 0) {
                if (f10 != -2) {
                    if (this.n0 && (this.H0 || this.A0 == 2)) {
                        b0();
                        return false;
                    }
                    return false;
                }
                this.E0 = true;
                MediaFormat outputFormat = this.V.getOutputFormat();
                if (this.d0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.m0 = true;
                    return true;
                }
                if (this.k0) {
                    outputFormat.setInteger("channel-count", 1);
                }
                this.X = outputFormat;
                this.Y = true;
                return true;
            }
            if (this.m0) {
                this.m0 = false;
                this.V.releaseOutputBuffer(f10, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                b0();
                return false;
            }
            this.r0 = f10;
            ByteBuffer outputBuffer = this.V.getOutputBuffer(f10);
            this.s0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.s0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.j0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.F0;
                if (j12 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.I;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z11 = false;
                    break;
                }
                if (((Long) arrayList.get(i11)).longValue() == j13) {
                    arrayList.remove(i11);
                    z11 = true;
                    break;
                }
                i11++;
            }
            this.t0 = z11;
            long j14 = this.G0;
            long j15 = bufferInfo2.presentationTimeUs;
            this.u0 = j14 == j15;
            p0(j15);
        }
        if (this.i0 && this.D0) {
            try {
                bufferInfo = bufferInfo2;
                z4 = false;
                z10 = true;
                try {
                    c02 = c0(j10, j11, this.V, this.s0, this.r0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.t0, this.u0, this.N);
                } catch (IllegalStateException unused2) {
                    b0();
                    if (!this.I0) {
                        return z4;
                    }
                    e0();
                    return z4;
                }
            } catch (IllegalStateException unused3) {
                z4 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z4 = false;
            z10 = true;
            c02 = c0(j10, j11, this.V, this.s0, this.r0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.t0, this.u0, this.N);
        }
        if (!c02) {
            return z4;
        }
        X(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0;
        this.r0 = -1;
        this.s0 = null;
        if (!z12) {
            return z10;
        }
        b0();
        return z4;
    }

    public final boolean F() {
        boolean z4;
        k kVar = this.V;
        if (kVar == null || this.A0 == 2 || this.H0) {
            return false;
        }
        int i10 = this.q0;
        n3.i iVar = this.F;
        if (i10 < 0) {
            int d = kVar.d();
            this.q0 = d;
            if (d < 0) {
                return false;
            }
            iVar.d = this.V.getInputBuffer(d);
            iVar.b();
        }
        if (this.A0 == 1) {
            if (!this.n0) {
                this.D0 = true;
                this.V.a(0L, this.q0, 0, 4);
                this.q0 = -1;
                iVar.d = null;
            }
            this.A0 = 2;
            return false;
        }
        if (this.l0) {
            this.l0 = false;
            iVar.d.put(Q0);
            this.V.a(0L, this.q0, 38, 0);
            this.q0 = -1;
            iVar.d = null;
            this.C0 = true;
            return true;
        }
        if (this.z0 == 1) {
            for (int i11 = 0; i11 < this.W.E.size(); i11++) {
                iVar.d.put((byte[]) this.W.E.get(i11));
            }
            this.z0 = 2;
        }
        ByteBuffer byteBuffer = iVar.d;
        n3.d dVar = iVar.c;
        int position = byteBuffer.position();
        f7.b bVar = this.c;
        bVar.l();
        try {
            int s6 = s(bVar, iVar, 0);
            if (h() || iVar.e(TLObject.FLAG_29)) {
                this.G0 = this.F0;
            }
            if (s6 == -3) {
                return false;
            }
            if (s6 == -5) {
                if (this.z0 == 2) {
                    iVar.b();
                    this.z0 = 1;
                }
                U(bVar);
                return true;
            }
            if (iVar.e(4)) {
                if (this.z0 == 2) {
                    iVar.b();
                    this.z0 = 1;
                }
                this.H0 = true;
                if (!this.C0) {
                    b0();
                    return false;
                }
                try {
                    if (this.n0) {
                        return false;
                    }
                    this.D0 = true;
                    this.V.a(0L, this.q0, 0, 4);
                    this.q0 = -1;
                    iVar.d = null;
                    return false;
                } catch (MediaCodec.CryptoException e6) {
                    throw a(e6, this.M, false, d0.r(e6.getErrorCode()));
                }
            }
            if (this.C0 || iVar.e(1)) {
                boolean e10 = iVar.e(TLObject.FLAG_30);
                if (e10) {
                    if (position == 0) {
                        dVar.getClass();
                    } else {
                        if (dVar.d == null) {
                            int[] iArr = new int[1];
                            dVar.d = iArr;
                            dVar.i.numBytesOfClearData = iArr;
                        }
                        int[] iArr2 = dVar.d;
                        iArr2[0] = iArr2[0] + position;
                    }
                }
                if (this.e0 && !e10) {
                    ByteBuffer byteBuffer2 = iVar.d;
                    int position2 = byteBuffer2.position();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int i14 = i12 + 1;
                        if (i14 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        int i15 = byteBuffer2.get(i12) & 255;
                        if (i13 == 3) {
                            if (i15 == 1 && (byteBuffer2.get(i14) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer2.duplicate();
                                duplicate.position(i12 - 3);
                                duplicate.limit(position2);
                                byteBuffer2.position(0);
                                byteBuffer2.put(duplicate);
                                break;
                            }
                        } else if (i15 == 0) {
                            i13++;
                        }
                        if (i15 != 0) {
                            i13 = 0;
                        }
                        i12 = i14;
                    }
                    if (iVar.d.position() != 0) {
                        this.e0 = false;
                    }
                }
                long j10 = iVar.f;
                h hVar = this.o0;
                if (hVar != null) {
                    n0 n0Var = this.M;
                    if (hVar.b == 0) {
                        hVar.a = j10;
                    }
                    if (!hVar.c) {
                        ByteBuffer byteBuffer3 = iVar.d;
                        byteBuffer3.getClass();
                        int i16 = 0;
                        for (int i17 = 0; i17 < 4; i17++) {
                            i16 = (i16 << 8) | (byteBuffer3.get(i17) & 255);
                        }
                        int i18 = l3.a.i(i16);
                        if (i18 == -1) {
                            hVar.c = true;
                            hVar.b = 0L;
                            hVar.a = iVar.f;
                            h5.a.K("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                            j10 = iVar.f;
                        } else {
                            j10 = Math.max(0L, ((hVar.b - 529) * 1000000) / n0Var.Q) + hVar.a;
                            hVar.b += i18;
                        }
                    }
                    long j11 = this.F0;
                    h hVar2 = this.o0;
                    n0 n0Var2 = this.M;
                    hVar2.getClass();
                    long j12 = n0Var2.Q;
                    z4 = e10;
                    this.F0 = Math.max(j11, Math.max(0L, ((hVar2.b - 529) * 1000000) / j12) + hVar2.a);
                } else {
                    z4 = e10;
                }
                if (iVar.e(TLObject.FLAG_31)) {
                    this.I.add(Long.valueOf(j10));
                }
                if (this.J0) {
                    ArrayDeque arrayDeque = this.K;
                    if (arrayDeque.isEmpty()) {
                        this.N0.c.a(this.M, j10);
                    } else {
                        ((q) arrayDeque.peekLast()).c.a(this.M, j10);
                    }
                    this.J0 = false;
                }
                this.F0 = Math.max(this.F0, j10);
                iVar.k();
                if (iVar.e(TLObject.FLAG_28)) {
                    N(iVar);
                }
                Z(iVar);
                try {
                    if (z4) {
                        this.V.c(this.q0, dVar, j10);
                    } else {
                        this.V.a(j10, this.q0, iVar.d.limit(), 0);
                    }
                    this.q0 = -1;
                    iVar.d = null;
                    this.C0 = true;
                    this.z0 = 0;
                    this.M0.c++;
                    return true;
                } catch (MediaCodec.CryptoException e11) {
                    throw a(e11, this.M, false, d0.r(e11.getErrorCode()));
                }
            }
            iVar.b();
            if (this.z0 == 2) {
                this.z0 = 1;
                return true;
            }
            return true;
        } catch (n3.h e12) {
            R(e12);
            d0(0);
            G();
            return true;
        }
    }

    public final void G() {
        try {
            this.V.flush();
        } finally {
            g0();
        }
    }

    public final boolean H() {
        if (this.V == null) {
            return false;
        }
        int i10 = this.B0;
        if (i10 == 3 || this.f0 || ((this.g0 && !this.E0) || (this.h0 && this.D0))) {
            e0();
            return true;
        }
        if (i10 == 2) {
            int i11 = d0.a;
            h5.a.i(i11 >= 23);
            if (i11 >= 23) {
                try {
                    o0();
                } catch (j3.n e6) {
                    h5.a.L("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e6);
                    e0();
                    return true;
                }
            }
        }
        G();
        return false;
    }

    public final List I(boolean z4) {
        n0 n0Var = this.M;
        s sVar = this.C;
        ArrayList L = L(sVar, n0Var, z4);
        if (!L.isEmpty() || !z4) {
            return L;
        }
        ArrayList L2 = L(sVar, this.M, false);
        if (!L2.isEmpty()) {
            h5.a.K("MediaCodecRenderer", "Drm session requires secure decoder for " + this.M.C + ", but no secure decoder available. Trying to proceed with " + L2 + ".");
        }
        return L2;
    }

    public boolean J() {
        return false;
    }

    public abstract float K(float f10, n0[] n0VarArr);

    public abstract ArrayList L(s sVar, n0 n0Var, boolean z4);

    public abstract i M(n nVar, n0 n0Var, MediaCrypto mediaCrypto, float f10);

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0416, code lost:
    
        if ("stvm8".equals(r5) == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0426, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(n nVar, MediaCrypto mediaCrypto) {
        float K;
        long j10;
        float f10;
        long j11;
        int i10;
        boolean z4;
        boolean z10;
        String str;
        String str2;
        char c3;
        String sb;
        String str3;
        o3.g gVar;
        String str4 = nVar.a;
        int i11 = d0.a;
        if (i11 < 23) {
            K = -1.0f;
        } else {
            float f11 = this.U;
            n0[] n0VarArr = this.r;
            n0VarArr.getClass();
            K = K(f11, n0VarArr);
        }
        if (K <= this.D) {
            K = -1.0f;
        }
        a0(this.M);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i M = M(nVar, this.M, mediaCrypto, K);
        if (i11 >= 31) {
            k3.k kVar = this.f;
            kVar.getClass();
            o.a(M, kVar);
        }
        try {
            h5.a.c("createCodec:" + str4);
            this.V = this.B.A1(M);
            h5.a.q();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (nVar.d(this.M)) {
                j10 = elapsedRealtime2;
                f10 = K;
                j11 = elapsedRealtime;
            } else {
                n0 n0Var = this.M;
                if (n0Var == null) {
                    sb = BuildConfig.BETA_URL;
                    j10 = elapsedRealtime2;
                    str2 = str4;
                    f10 = K;
                    j11 = elapsedRealtime;
                } else {
                    String str5 = n0Var.b;
                    String str6 = n0Var.c;
                    int i12 = n0Var.Q;
                    int i13 = n0Var.P;
                    float f12 = n0Var.J;
                    i5.b bVar = n0Var.O;
                    j10 = elapsedRealtime2;
                    int i14 = n0Var.I;
                    int i15 = n0Var.H;
                    j11 = elapsedRealtime;
                    o3.g gVar2 = n0Var.F;
                    String str7 = n0Var.r;
                    f10 = K;
                    int i16 = n0Var.n;
                    int i17 = n0Var.d;
                    int i18 = n0Var.e;
                    StringBuilder l10 = e2.c.l("id=");
                    str2 = str4;
                    l10.append(n0Var.a);
                    l10.append(", mimeType=");
                    l10.append(n0Var.C);
                    int i19 = -1;
                    if (i16 != -1) {
                        l10.append(", bitrate=");
                        l10.append(i16);
                    }
                    if (str7 != null) {
                        l10.append(", codecs=");
                        l10.append(str7);
                    }
                    if (gVar2 != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i20 = 0;
                        c3 = ',';
                        while (i20 < gVar2.d) {
                            UUID uuid = gVar2.a[i20].b;
                            if (uuid.equals(j3.h.b)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(j3.h.c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(j3.h.e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(j3.h.d)) {
                                linkedHashSet.add("widevine");
                            } else if (uuid.equals(j3.h.a)) {
                                linkedHashSet.add("universal");
                            } else {
                                gVar = gVar2;
                                linkedHashSet.add("unknown (" + uuid + ")");
                                i20++;
                                gVar2 = gVar;
                            }
                            gVar = gVar2;
                            i20++;
                            gVar2 = gVar;
                        }
                        l10.append(", drm=[");
                        new h4(String.valueOf(',')).E(l10, linkedHashSet);
                        l10.append(']');
                        i19 = -1;
                    } else {
                        c3 = ',';
                    }
                    if (i15 != i19 && i14 != i19) {
                        l10.append(", res=");
                        l10.append(i15);
                        l10.append("x");
                        l10.append(i14);
                    }
                    if (bVar != null) {
                        int i21 = bVar.c;
                        int i22 = bVar.b;
                        int i23 = bVar.a;
                        if (i23 != -1 && i22 != -1 && i21 != -1) {
                            l10.append(", color=");
                            if (i23 == -1 || i22 == -1 || i21 == -1) {
                                str3 = "NA";
                            } else {
                                String str8 = i23 != -1 ? i23 != 6 ? i23 != 1 ? i23 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
                                String str9 = i22 != -1 ? i22 != 1 ? i22 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
                                String a2 = i5.b.a(i21);
                                int i24 = d0.a;
                                Locale locale = Locale.US;
                                str3 = str8 + "/" + str9 + "/" + a2;
                            }
                            l10.append(str3);
                        }
                    }
                    if (f12 != -1.0f) {
                        l10.append(", fps=");
                        l10.append(f12);
                    }
                    if (i13 != -1) {
                        l10.append(", channels=");
                        l10.append(i13);
                    }
                    if (i12 != -1) {
                        l10.append(", sample_rate=");
                        l10.append(i12);
                    }
                    if (str6 != null) {
                        l10.append(", language=");
                        l10.append(str6);
                    }
                    if (str5 != null) {
                        l10.append(", label=");
                        l10.append(str5);
                    }
                    if (i17 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i17 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i17 & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((i17 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        l10.append(", selectionFlags=[");
                        new h4(String.valueOf(c3)).E(l10, arrayList);
                        l10.append("]");
                    }
                    if (i18 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i18 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i18 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i18 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i18 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i18 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i18 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i18 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i18 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i18 & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i18 & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i18 & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i18 & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i18 & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i18 & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i18 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        l10.append(", roleFlags=[");
                        new h4(String.valueOf(c3)).E(l10, arrayList2);
                        l10.append("]");
                    }
                    sb = l10.toString();
                }
                Locale locale2 = Locale.US;
                str4 = str2;
                h5.a.K("MediaCodecRenderer", yh.l("Format exceeds selected codec's capabilities [", sb, ", ", str4, "]"));
            }
            this.c0 = nVar;
            this.Z = f10;
            this.W = this.M;
            int i25 = d0.a;
            if (i25 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str4)) {
                String str10 = d0.d;
                if (str10.startsWith("SM-T585") || str10.startsWith("SM-A510") || str10.startsWith("SM-A520") || str10.startsWith("SM-J700")) {
                    i10 = 2;
                    this.d0 = i10;
                    this.e0 = i25 >= 21 && this.W.E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
                    this.f0 = i25 >= 18 || (i25 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i25 == 19 && d0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
                    this.g0 = i25 != 29 && "c2.android.aac.decoder".equals(str4);
                    if (i25 <= 23 || !"OMX.google.vorbis.decoder".equals(str4)) {
                        if (i25 <= 19) {
                            String str11 = d0.b;
                            if (!"hb2000".equals(str11)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str4)) {
                            }
                        }
                        z4 = false;
                        this.h0 = z4;
                        this.i0 = i25 != 21 && "OMX.google.aac.decoder".equals(str4);
                        if (i25 < 21 && "OMX.SEC.mp3.dec".equals(str4) && "samsung".equals(d0.c)) {
                            str = d0.b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z10 = true;
                                this.j0 = z10;
                                this.k0 = i25 > 18 && this.W.P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                                this.n0 = (i25 > 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i25 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i25 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(d0.c) && "AFTS".equals(d0.d) && nVar.f) || J()));
                                this.V.getClass();
                                if ("c2.android.mp3.decoder".equals(str4)) {
                                    this.o0 = new h();
                                }
                                if (this.h == 2) {
                                    this.p0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.M0.a++;
                                S(j10, j10 - j11, str4);
                            }
                        }
                        z10 = false;
                        this.j0 = z10;
                        this.k0 = i25 > 18 && this.W.P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                        this.n0 = (i25 > 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i25 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i25 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(d0.c) && "AFTS".equals(d0.d) && nVar.f) || J()));
                        this.V.getClass();
                        if ("c2.android.mp3.decoder".equals(str4)) {
                        }
                        if (this.h == 2) {
                        }
                        this.M0.a++;
                        S(j10, j10 - j11, str4);
                    }
                    z4 = true;
                    this.h0 = z4;
                    this.i0 = i25 != 21 && "OMX.google.aac.decoder".equals(str4);
                    if (i25 < 21) {
                        str = d0.b;
                        if (!str.startsWith("baffin")) {
                        }
                        z10 = true;
                        this.j0 = z10;
                        this.k0 = i25 > 18 && this.W.P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                        this.n0 = (i25 > 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i25 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i25 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(d0.c) && "AFTS".equals(d0.d) && nVar.f) || J()));
                        this.V.getClass();
                        if ("c2.android.mp3.decoder".equals(str4)) {
                        }
                        if (this.h == 2) {
                        }
                        this.M0.a++;
                        S(j10, j10 - j11, str4);
                    }
                    z10 = false;
                    this.j0 = z10;
                    this.k0 = i25 > 18 && this.W.P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                    this.n0 = (i25 > 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i25 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i25 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(d0.c) && "AFTS".equals(d0.d) && nVar.f) || J()));
                    this.V.getClass();
                    if ("c2.android.mp3.decoder".equals(str4)) {
                    }
                    if (this.h == 2) {
                    }
                    this.M0.a++;
                    S(j10, j10 - j11, str4);
                }
            }
            if (i25 < 24 && ("OMX.Nvidia.h264.decode".equals(str4) || "OMX.Nvidia.h264.decode.secure".equals(str4))) {
                String str12 = d0.b;
                if ("flounder".equals(str12) || "flounder_lte".equals(str12) || "grouper".equals(str12) || "tilapia".equals(str12)) {
                    i10 = 1;
                    this.d0 = i10;
                    this.e0 = i25 >= 21 && this.W.E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
                    this.f0 = i25 >= 18 || (i25 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i25 == 19 && d0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
                    this.g0 = i25 != 29 && "c2.android.aac.decoder".equals(str4);
                    if (i25 <= 23) {
                    }
                    if (i25 <= 19) {
                    }
                    z4 = false;
                    this.h0 = z4;
                    this.i0 = i25 != 21 && "OMX.google.aac.decoder".equals(str4);
                    if (i25 < 21) {
                    }
                    z10 = false;
                    this.j0 = z10;
                    this.k0 = i25 > 18 && this.W.P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
                    this.n0 = (i25 > 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i25 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i25 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(d0.c) && "AFTS".equals(d0.d) && nVar.f) || J()));
                    this.V.getClass();
                    if ("c2.android.mp3.decoder".equals(str4)) {
                    }
                    if (this.h == 2) {
                    }
                    this.M0.a++;
                    S(j10, j10 - j11, str4);
                }
            }
            i10 = 0;
            this.d0 = i10;
            this.e0 = i25 >= 21 && this.W.E.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
            this.f0 = i25 >= 18 || (i25 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i25 == 19 && d0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
            this.g0 = i25 != 29 && "c2.android.aac.decoder".equals(str4);
            if (i25 <= 23) {
            }
            if (i25 <= 19) {
            }
            z4 = false;
            this.h0 = z4;
            this.i0 = i25 != 21 && "OMX.google.aac.decoder".equals(str4);
            if (i25 < 21) {
            }
            z10 = false;
            this.j0 = z10;
            this.k0 = i25 > 18 && this.W.P == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
            this.n0 = (i25 > 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i25 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str4)) || ((i25 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(d0.c) && "AFTS".equals(d0.d) && nVar.f) || J()));
            this.V.getClass();
            if ("c2.android.mp3.decoder".equals(str4)) {
            }
            if (this.h == 2) {
            }
            this.M0.a++;
            S(j10, j10 - j11, str4);
        } catch (Throwable th2) {
            h5.a.q();
            throw th2;
        }
    }

    public final void P() {
        n0 n0Var;
        if (this.V != null || this.v0 || (n0Var = this.M) == null) {
            return;
        }
        if (this.P == null && l0(n0Var)) {
            n0 n0Var2 = this.M;
            C();
            String str = n0Var2.C;
            boolean equals = MediaController.AUDIO_MIME_TYPE.equals(str);
            g gVar = this.H;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.w = 32;
            } else {
                gVar.getClass();
                gVar.w = 1;
            }
            this.v0 = true;
            return;
        }
        i0(this.P);
        String str2 = this.M.C;
        o3.i iVar = this.O;
        if (iVar != null) {
            n3.b h = iVar.h();
            if (this.Q == null) {
                if (h == null) {
                    if (this.O.g() == null) {
                        return;
                    }
                } else if (h instanceof o3.w) {
                    o3.w wVar = (o3.w) h;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(wVar.a, wVar.b);
                        this.Q = mediaCrypto;
                        this.R = !wVar.c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e6) {
                        throw a(e6, this.M, false, 6006);
                    }
                }
            }
            if (o3.w.d && (h instanceof o3.w)) {
                int e10 = this.O.e();
                if (e10 == 1) {
                    o3.h g10 = this.O.g();
                    g10.getClass();
                    throw a(g10, this.M, false, g10.a);
                }
                if (e10 != 4) {
                    return;
                }
            }
        }
        try {
            Q(this.Q, this.R);
        } catch (p e11) {
            throw a(e11, this.M, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(MediaCrypto mediaCrypto, boolean z4) {
        String str;
        p pVar;
        if (this.a0 == null) {
            try {
                List I = I(z4);
                this.a0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) I;
                if (!arrayList.isEmpty()) {
                    this.a0.add((n) arrayList.get(0));
                }
                this.b0 = null;
            } catch (v e6) {
                throw new p(this.M, e6, z4, -49998);
            }
        }
        if (this.a0.isEmpty()) {
            throw new p(this.M, null, z4, -49999);
        }
        n nVar = (n) this.a0.peekFirst();
        while (this.V == null) {
            n nVar2 = (n) this.a0.peekFirst();
            if (!k0(nVar2)) {
                return;
            }
            try {
                O(nVar2, mediaCrypto);
            } catch (Exception e10) {
                if (nVar2 != nVar) {
                    throw e10;
                }
                try {
                    h5.a.K("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    O(nVar2, mediaCrypto);
                } catch (Exception e11) {
                    h5.a.L("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e11);
                    this.a0.removeFirst();
                    n0 n0Var = this.M;
                    String str2 = "Decoder init failed: " + nVar2.a + ", " + n0Var;
                    String str3 = n0Var.C;
                    if (d0.a < 21) {
                        str = e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null;
                    } else {
                        str = null;
                    }
                    p pVar2 = new p(str2, e11, str3, z4, nVar2, str);
                    R(pVar2);
                    pVar = this.b0;
                    if (pVar != null) {
                        this.b0 = pVar2;
                    } else {
                        this.b0 = new p(pVar.getMessage(), pVar.getCause(), pVar.a, pVar.b, pVar.c, pVar.d);
                    }
                    if (!this.a0.isEmpty()) {
                        throw this.b0;
                    }
                }
                h5.a.L("MediaCodecRenderer", "Failed to initialize decoder: " + nVar2, e11);
                this.a0.removeFirst();
                n0 n0Var2 = this.M;
                String str22 = "Decoder init failed: " + nVar2.a + ", " + n0Var2;
                String str32 = n0Var2.C;
                if (d0.a < 21) {
                }
                p pVar22 = new p(str22, e11, str32, z4, nVar2, str);
                R(pVar22);
                pVar = this.b0;
                if (pVar != null) {
                }
                if (!this.a0.isEmpty()) {
                }
            }
        }
        this.a0 = null;
    }

    public abstract void R(Exception exc);

    public abstract void S(long j10, long j11, String str);

    public abstract void T(String str);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r14 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e1, code lost:
    
        if (D() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0115, code lost:
    
        if (D() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0127, code lost:
    
        if (D() == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n3.k U(f7.b bVar) {
        n3.b h;
        n3.b h9;
        boolean z4 = true;
        this.J0 = true;
        n0 n0Var = (n0) bVar.c;
        n0Var.getClass();
        String str = n0Var.C;
        int i10 = 0;
        if (str == null) {
            throw a(new IllegalArgumentException(), n0Var, false, 4005);
        }
        o3.i iVar = (o3.i) bVar.b;
        l.d.D(this.P, iVar);
        this.P = iVar;
        this.M = n0Var;
        if (this.v0) {
            this.x0 = true;
            return null;
        }
        k kVar = this.V;
        if (kVar == null) {
            this.a0 = null;
            P();
            return null;
        }
        n nVar = this.c0;
        n0 n0Var2 = this.W;
        o3.i iVar2 = this.O;
        if (iVar2 != iVar) {
            if (iVar != null && iVar2 != null && (h = iVar.h()) != null && (h9 = iVar2.h()) != null && h.getClass().equals(h9.getClass())) {
                if (h instanceof o3.w) {
                    o3.w wVar = (o3.w) h;
                    if (iVar.a().equals(iVar2.a()) && d0.a >= 23) {
                        UUID uuid = j3.h.e;
                        if (!uuid.equals(iVar2.a()) && !uuid.equals(iVar.a())) {
                            boolean f10 = wVar.c ? false : iVar.f(str);
                            if (!nVar.f) {
                            }
                        }
                    }
                }
            }
            if (this.C0) {
                this.A0 = 1;
                this.B0 = 3;
            } else {
                e0();
                P();
            }
            return new n3.k(nVar.a, n0Var2, n0Var, 0, 128);
        }
        boolean z10 = this.P != this.O;
        h5.a.i(!z10 || d0.a >= 23);
        n3.k A = A(nVar, n0Var2, n0Var);
        int i11 = A.d;
        if (i11 != 0) {
            if (i11 == 1) {
                if (n0(n0Var)) {
                    this.W = n0Var;
                    if (!z10) {
                        if (this.C0) {
                            this.A0 = 1;
                            if (this.f0 || this.h0) {
                                this.B0 = 3;
                                i10 = 2;
                            } else {
                                this.B0 = 1;
                            }
                        }
                    }
                }
                i10 = 16;
            } else if (i11 == 2) {
                if (n0(n0Var)) {
                    this.y0 = true;
                    this.z0 = 1;
                    int i12 = this.d0;
                    if (i12 != 2 && (i12 != 1 || n0Var.H != n0Var2.H || n0Var.I != n0Var2.I)) {
                        z4 = false;
                    }
                    this.l0 = z4;
                    this.W = n0Var;
                    if (z10) {
                    }
                }
                i10 = 16;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                if (n0(n0Var)) {
                    this.W = n0Var;
                    if (z10) {
                    }
                }
                i10 = 16;
            }
        } else if (this.C0) {
            this.A0 = 1;
            this.B0 = 3;
        } else {
            e0();
            P();
        }
        return (i11 == 0 || (this.V == kVar && this.B0 != 3)) ? A : new n3.k(nVar.a, n0Var2, n0Var, 0, i10);
    }

    public abstract void V(n0 n0Var, MediaFormat mediaFormat);

    public void X(long j10) {
        this.O0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.K;
            if (arrayDeque.isEmpty() || j10 < ((q) arrayDeque.peek()).a) {
                return;
            }
            j0((q) arrayDeque.poll());
            Y();
        }
    }

    public abstract void Y();

    public abstract void Z(n3.i iVar);

    public final void b0() {
        int i10 = this.B0;
        if (i10 == 1) {
            G();
            return;
        }
        if (i10 == 2) {
            G();
            o0();
        } else if (i10 != 3) {
            this.I0 = true;
            f0();
        } else {
            e0();
            P();
        }
    }

    public abstract boolean c0(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z4, boolean z10, n0 n0Var);

    public final boolean d0(int i10) {
        f7.b bVar = this.c;
        bVar.l();
        n3.i iVar = this.E;
        iVar.b();
        int s6 = s(bVar, iVar, i10 | 4);
        if (s6 == -5) {
            U(bVar);
            return true;
        }
        if (s6 != -4 || !iVar.e(4)) {
            return false;
        }
        this.H0 = true;
        b0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0() {
        try {
            k kVar = this.V;
            if (kVar != null) {
                kVar.release();
                this.M0.b++;
                T(this.c0.a);
            }
            this.V = null;
            try {
                MediaCrypto mediaCrypto = this.Q;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.V = null;
            try {
                MediaCrypto mediaCrypto2 = this.Q;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void g0() {
        this.q0 = -1;
        this.F.d = null;
        this.r0 = -1;
        this.s0 = null;
        this.p0 = -9223372036854775807L;
        this.D0 = false;
        this.C0 = false;
        this.l0 = false;
        this.m0 = false;
        this.t0 = false;
        this.u0 = false;
        this.I.clear();
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        h hVar = this.o0;
        if (hVar != null) {
            hVar.a = 0L;
            hVar.b = 0L;
            hVar.c = false;
        }
        this.A0 = 0;
        this.B0 = 0;
        this.z0 = this.y0 ? 1 : 0;
    }

    public final void h0() {
        g0();
        this.L0 = null;
        this.o0 = null;
        this.a0 = null;
        this.c0 = null;
        this.W = null;
        this.X = null;
        this.Y = false;
        this.E0 = false;
        this.Z = -1.0f;
        this.d0 = 0;
        this.e0 = false;
        this.f0 = false;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.n0 = false;
        this.y0 = false;
        this.z0 = 0;
        this.R = false;
    }

    public final void i0(o3.i iVar) {
        l.d.D(this.O, iVar);
        this.O = iVar;
    }

    @Override // j3.e
    public boolean j() {
        boolean h;
        if (this.M != null) {
            if (h()) {
                h = this.w;
            } else {
                l0 l0Var = this.n;
                l0Var.getClass();
                h = l0Var.h();
            }
            if (!h) {
                if ((this.r0 >= 0) || (this.p0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.p0)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j0(q qVar) {
        this.N0 = qVar;
        if (qVar.b != -9223372036854775807L) {
            this.P0 = true;
            W();
        }
    }

    @Override // j3.e
    public void k() {
        this.M = null;
        j0(q.d);
        this.K.clear();
        H();
    }

    public boolean k0(n nVar) {
        return true;
    }

    public boolean l0(n0 n0Var) {
        return false;
    }

    @Override // j3.e
    public void m(long j10, boolean z4) {
        int i10;
        this.H0 = false;
        this.I0 = false;
        this.K0 = false;
        if (this.v0) {
            this.H.b();
            this.G.b();
            this.w0 = false;
            p0 p0Var = this.L;
            p0Var.getClass();
            p0Var.c = l3.n.a;
            p0Var.b = 0;
            p0Var.a = 2;
        } else if (H()) {
            P();
        }
        b0 b0Var = this.N0.c;
        synchronized (b0Var) {
            i10 = b0Var.b;
        }
        if (i10 > 0) {
            this.J0 = true;
        }
        this.N0.c.c();
        this.K.clear();
    }

    public abstract int m0(s sVar, n0 n0Var);

    public final boolean n0(n0 n0Var) {
        if (d0.a >= 23 && this.V != null && this.B0 != 3 && this.h != 0) {
            float f10 = this.U;
            n0[] n0VarArr = this.r;
            n0VarArr.getClass();
            float K = K(f10, n0VarArr);
            float f11 = this.Z;
            if (f11 != K) {
                if (K == -1.0f) {
                    if (this.C0) {
                        this.A0 = 1;
                        this.B0 = 3;
                        return false;
                    }
                    e0();
                    P();
                    return false;
                }
                if (f11 != -1.0f || K > this.D) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", K);
                    this.V.setParameters(bundle);
                    this.Z = K;
                }
            }
        }
        return true;
    }

    public final void o0() {
        n3.b h = this.P.h();
        if (h instanceof o3.w) {
            try {
                this.Q.setMediaDrmSession(((o3.w) h).b);
            } catch (MediaCryptoException e6) {
                throw a(e6, this.M, false, 6006);
            }
        }
        i0(this.P);
        this.A0 = 0;
        this.B0 = 0;
    }

    public final void p0(long j10) {
        Object obj;
        b0 b0Var = this.N0.c;
        synchronized (b0Var) {
            obj = null;
            while (b0Var.b > 0 && j10 - ((long[]) b0Var.c)[b0Var.a] >= 0) {
                obj = b0Var.g();
            }
        }
        n0 n0Var = (n0) obj;
        if (n0Var == null && this.P0 && this.X != null) {
            n0Var = (n0) this.N0.c.f();
        }
        if (n0Var != null) {
            this.N = n0Var;
        } else if (!this.Y || this.N == null) {
            return;
        }
        V(this.N, this.X);
        this.Y = false;
        this.P0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // j3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(n0[] n0VarArr, long j10, long j11) {
        if (this.N0.b == -9223372036854775807L) {
            j0(new q(-9223372036854775807L, j11));
            return;
        }
        ArrayDeque arrayDeque = this.K;
        if (arrayDeque.isEmpty()) {
            long j12 = this.F0;
            if (j12 != -9223372036854775807L) {
                long j13 = this.O0;
                if (j13 != -9223372036854775807L) {
                }
            }
            j0(new q(-9223372036854775807L, j11));
            if (this.N0.b != -9223372036854775807L) {
                Y();
                return;
            }
            return;
        }
        arrayDeque.add(new q(this.F0, j11));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006a A[LOOP:1: B:33:0x004a->B:42:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EDGE_INSN: B:43:0x006b->B:44:? BREAK  A[LOOP:1: B:33:0x004a->B:42:0x006a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0086 A[LOOP:2: B:45:0x006b->B:54:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087 A[EDGE_INSN: B:55:0x0087->B:56:0x0087 BREAK  A[LOOP:2: B:45:0x006b->B:54:0x0086], SYNTHETIC] */
    @Override // j3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(long j10, long j11) {
        boolean z4;
        boolean z10;
        boolean z11 = false;
        if (this.K0) {
            this.K0 = false;
            b0();
        }
        j3.n nVar = this.L0;
        if (nVar != null) {
            this.L0 = null;
            throw nVar;
        }
        try {
            if (this.I0) {
                f0();
                return;
            }
            if (this.M != null || d0(2)) {
                P();
                if (this.v0) {
                    h5.a.c("bypassRender");
                    while (z(j10, j11)) {
                    }
                    h5.a.q();
                } else if (this.V != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    h5.a.c("drainAndFeed");
                    while (E(j10, j11)) {
                        long j12 = this.S;
                        if (j12 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                            z10 = false;
                            if (z10) {
                                break;
                            }
                        }
                        z10 = true;
                        if (z10) {
                        }
                    }
                    while (F()) {
                        long j13 = this.S;
                        if (j13 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j13) {
                            z4 = false;
                            if (z4) {
                                break;
                            }
                        }
                        z4 = true;
                        if (z4) {
                        }
                    }
                    h5.a.q();
                } else {
                    n3.f fVar = this.M0;
                    int i10 = fVar.d;
                    l0 l0Var = this.n;
                    l0Var.getClass();
                    fVar.d = i10 + l0Var.l(j10 - this.s);
                    d0(1);
                }
                synchronized (this.M0) {
                }
            }
        } catch (IllegalStateException e6) {
            int i11 = d0.a;
            if (i11 < 21 || !(e6 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e6.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e6;
                }
            }
            R(e6);
            if (i11 >= 21) {
                if (e6 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e6).isRecoverable() : false) {
                    z11 = true;
                }
            }
            if (z11) {
                e0();
            }
            throw a(B(e6, this.c0), this.M, z11, 4003);
        }
    }

    @Override // j3.e
    public void w(float f10, float f11) {
        this.T = f10;
        this.U = f11;
        n0(this.W);
    }

    @Override // j3.e
    public final int x(n0 n0Var) {
        try {
            return m0(this.C, n0Var);
        } catch (v e6) {
            throw a(e6, n0Var, false, 4002);
        }
    }

    @Override // j3.e
    public final int y() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final boolean z(long j10, long j11) {
        g gVar;
        String str;
        int i10;
        g gVar2;
        ByteBuffer byteBuffer;
        h5.a.i(!this.I0);
        g gVar3 = this.H;
        int i11 = gVar3.v;
        if (i11 > 0) {
            gVar = gVar3;
            if (!c0(j10, j11, null, gVar3.d, this.r0, 0, i11, gVar3.f, gVar3.e(TLObject.FLAG_31), gVar3.e(4), this.N)) {
                return false;
            }
            X(gVar.s);
            gVar.b();
        } else {
            gVar = gVar3;
        }
        if (this.H0) {
            this.I0 = true;
            return false;
        }
        ?? r12 = 0;
        boolean z4 = this.w0;
        n3.i iVar = this.G;
        if (z4) {
            h5.a.i(gVar.m(iVar));
            this.w0 = false;
        }
        if (this.x0) {
            if (gVar.v > 0) {
                return true;
            }
            C();
            this.x0 = false;
            P();
            if (!this.v0) {
                return false;
            }
        }
        h5.a.i(!this.H0);
        f7.b bVar = this.c;
        bVar.l();
        iVar.b();
        while (true) {
            iVar.b();
            int s6 = s(bVar, iVar, r12);
            if (s6 == -5) {
                U(bVar);
                break;
            }
            if (s6 != -4) {
                if (s6 != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (iVar.e(4)) {
                    this.H0 = true;
                    break;
                }
                byte[] bArr = null;
                if (this.J0) {
                    n0 n0Var = this.M;
                    n0Var.getClass();
                    this.N = n0Var;
                    V(n0Var, null);
                    this.J0 = r12;
                }
                iVar.k();
                n0 n0Var2 = this.M;
                if (n0Var2 != null && (str = n0Var2.C) != null && str.equals("audio/opus")) {
                    List list = this.M.E;
                    p0 p0Var = this.L;
                    p0Var.getClass();
                    iVar.d.getClass();
                    if (iVar.d.limit() - iVar.d.position() == 0) {
                        gVar2 = gVar;
                    } else {
                        if (p0Var.a == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(r12);
                        }
                        ByteBuffer byteBuffer2 = iVar.d;
                        int position = byteBuffer2.position();
                        int limit = byteBuffer2.limit();
                        int i12 = limit - position;
                        int i13 = (i12 + 255) / 255;
                        int i14 = i13 + 27 + i12;
                        if (p0Var.a == 2) {
                            i10 = bArr != null ? bArr.length + 28 : 47;
                            i14 = i10 + 44 + i14;
                        } else {
                            i10 = 0;
                        }
                        if (((ByteBuffer) p0Var.c).capacity() < i14) {
                            p0Var.c = ByteBuffer.allocate(i14).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) p0Var.c).clear();
                        }
                        ByteBuffer byteBuffer3 = (ByteBuffer) p0Var.c;
                        if (p0Var.a == 2) {
                            if (bArr != null) {
                                p0.a(byteBuffer3, 0L, 0, 1, true);
                                byteBuffer = byteBuffer3;
                                gVar2 = gVar;
                                long length = bArr.length;
                                c7.b(length, "out of range: %s", (length >> 8) == 0);
                                byteBuffer.put((byte) length);
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, d0.k(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                gVar2 = gVar;
                                byteBuffer = byteBuffer3;
                                byteBuffer.put(p0.d);
                            }
                            byteBuffer.put(p0.e);
                        } else {
                            gVar2 = gVar;
                            byteBuffer = byteBuffer3;
                        }
                        int e6 = p0Var.b + ((int) ((l3.a.e(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                        p0Var.b = e6;
                        p0.a(byteBuffer, e6, p0Var.a, i13, false);
                        for (int i15 = 0; i15 < i13; i15++) {
                            if (i12 >= 255) {
                                byteBuffer.put((byte) -1);
                                i12 -= 255;
                            } else {
                                byteBuffer.put((byte) i12);
                                i12 = 0;
                            }
                        }
                        while (position < limit) {
                            byteBuffer.put(byteBuffer2.get(position));
                            position++;
                        }
                        byteBuffer2.position(byteBuffer2.limit());
                        byteBuffer.flip();
                        if (p0Var.a == 2) {
                            byteBuffer.putInt(i10 + 66, d0.k(byteBuffer.arrayOffset() + i10 + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                        } else {
                            byteBuffer.putInt(22, d0.k(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                        }
                        p0Var.a++;
                        p0Var.c = byteBuffer;
                        iVar.b();
                        iVar.j(((ByteBuffer) p0Var.c).remaining());
                        iVar.d.put((ByteBuffer) p0Var.c);
                        iVar.k();
                    }
                    gVar = gVar2;
                }
                if (!gVar.m(iVar)) {
                    this.w0 = true;
                    break;
                }
                r12 = 0;
            }
        }
        if (gVar.v > 0) {
            gVar.k();
        }
        return gVar.v > 0 || this.H0 || this.x0;
    }

    public void W() {
    }

    public void f0() {
    }

    public void N(n3.i iVar) {
    }

    public void a0(n0 n0Var) {
    }
}
