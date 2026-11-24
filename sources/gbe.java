// default package

import java.io.IOException;

/* loaded from: classes.dex */
public final class gbe extends vid {
    private static volatile atd zzbg;
    private static final gbe zzbir;
    private mkd zzbiq = ztd.c;

    static {
        gbe gbeVar = new gbe();
        zzbir = gbeVar;
        vid.c(gbe.class, gbeVar);
    }

    public static gbe f() {
        return zzbir;
    }

    public static gbe g(byte[] bArr) {
        vid vidVar = (vid) zzbir.a(4);
        try {
            ttd ttdVar = ttd.c;
            ttdVar.getClass();
            ttdVar.a(vidVar.getClass()).c(vidVar, bArr, 0, bArr.length, new sad());
            ttdVar.a(vidVar.getClass()).b(vidVar);
            if (vidVar.zzex != 0) {
                throw new RuntimeException();
            }
            boolean z = true;
            byte byteValue = ((Byte) vidVar.a(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = ttdVar.a(vidVar.getClass()).g(vidVar);
                    vidVar.a(2);
                }
            }
            if (z) {
                return (gbe) vidVar;
            }
            throw new vkd(new gp2().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof vkd) {
                throw ((vkd) e.getCause());
            }
            throw new vkd(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw vkd.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [atd, java.lang.Object] */
    @Override // vid
    public final Object a(int i) {
        atd atdVar;
        switch (qbe.a[i - 1]) {
            case 1:
                return new gbe();
            case 2:
                return new dbe(zzbir);
            case 3:
                return new fud(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", fbe.class});
            case 4:
                return zzbir;
            case 5:
                atd atdVar2 = zzbg;
                if (atdVar2 != null) {
                    return atdVar2;
                }
                synchronized (gbe.class) {
                    atd atdVar3 = zzbg;
                    atdVar = atdVar3;
                    if (atdVar3 == null) {
                        ?? uidVar = new uid();
                        zzbg = uidVar;
                        atdVar = uidVar;
                    }
                }
                return atdVar;
            case 6:
                return (byte) 1;
            default:
                fvc.b();
            case 7:
                return null;
        }
    }

    public final mkd e() {
        return this.zzbiq;
    }
}
