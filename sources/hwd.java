// default package

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class hwd {
    protected int zza;

    public final byte[] a() {
        try {
            s6e s6eVar = (s6e) this;
            int e = s6eVar.e();
            byte[] bArr = new byte[e];
            s0e s0eVar = new s0e(e, bArr);
            rfe a = zee.c.a(s6eVar.getClass());
            oqd oqdVar = s0eVar.a;
            if (oqdVar == null) {
                oqdVar = new oqd();
                Charset charset = x7e.a;
                oqdVar.a = s0eVar;
                s0eVar.a = oqdVar;
            }
            a.f(s6eVar, oqdVar);
            if (e - s0eVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            grb.j(qd4.y("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public abstract int b(rfe rfeVar);
}
