package a4;

import h5.w;
import j3.m0;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import k7.x6;
import s8.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends j {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i10 = wVar.b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.e(0, bArr.length, bArr2);
        wVar.F(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // a4.j
    public final long b(w wVar) {
        byte[] bArr = wVar.a;
        return (this.i * l3.a.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // a4.j
    public final boolean c(w wVar, long j10, af.c cVar) {
        if (e(wVar, o)) {
            byte[] copyOf = Arrays.copyOf(wVar.a, wVar.c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = l3.a.a(copyOf);
            if (((n0) cVar.b) == null) {
                m0 m0Var = new m0();
                m0Var.o = "audio/opus";
                m0Var.B = i10;
                m0Var.C = 48000;
                m0Var.q = a2;
                cVar.b = new n0(m0Var);
                return true;
            }
        } else {
            if (!e(wVar, p)) {
                h5.a.j((n0) cVar.b);
                return false;
            }
            h5.a.j((n0) cVar.b);
            if (!this.n) {
                this.n = true;
                wVar.G(8);
                e4.c a10 = x6.a(v.u((String[]) x6.b(wVar, false, false).b));
                if (a10 != null) {
                    m0 a11 = ((n0) cVar.b).a();
                    e4.c cVar2 = ((n0) cVar.b).s;
                    if (cVar2 != null) {
                        a10 = a10.a(cVar2.a);
                    }
                    a11.i = a10;
                    cVar.b = new n0(a11);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // a4.j
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.n = false;
        }
    }
}
