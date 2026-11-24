// default package

import java.io.IOException;

/* loaded from: classes.dex */
public final class hde extends xkd {
    private static volatile dvd zzbg;
    private static final hde zzbir;
    private omd zzbiq = cwd.c;

    static {
        hde hdeVar = new hde();
        zzbir = hdeVar;
        xkd.c(hde.class, hdeVar);
    }

    public static hde f() {
        return zzbir;
    }

    public static hde g(byte[] bArr) {
        xkd xkdVar = (xkd) zzbir.a(4);
        try {
            wvd wvdVar = wvd.c;
            wvdVar.getClass();
            wvdVar.a(xkdVar.getClass()).c(xkdVar, bArr, 0, bArr.length, new ucd());
            wvdVar.a(xkdVar.getClass()).b(xkdVar);
            if (xkdVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z = true;
            byte byteValue = ((Byte) xkdVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = wvdVar.a(xkdVar.getClass()).g(xkdVar);
                    xkdVar.a(2);
                }
            }
            if (z) {
                return (hde) xkdVar;
            }
            throw new xmd(new rq2().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof xmd) {
                throw ((xmd) e.getCause());
            }
            throw new xmd(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw xmd.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dvd, java.lang.Object] */
    @Override // xkd
    public final Object a(int i) {
        dvd dvdVar;
        switch (rde.a[i - 1]) {
            case 1:
                return new hde();
            case 2:
                return new ede(zzbir);
            case 3:
                return new iwd(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", gde.class});
            case 4:
                return zzbir;
            case 5:
                dvd dvdVar2 = zzbg;
                if (dvdVar2 != null) {
                    return dvdVar2;
                }
                synchronized (hde.class) {
                    dvd dvdVar3 = zzbg;
                    dvdVar = dvdVar3;
                    if (dvdVar3 == null) {
                        ?? wkdVar = new wkd();
                        zzbg = wkdVar;
                        dvdVar = wkdVar;
                    }
                }
                return dvdVar;
            case 6:
                return (byte) 1;
            default:
                gxc.b();
            case 7:
                return null;
        }
    }

    public final omd e() {
        return this.zzbiq;
    }
}
