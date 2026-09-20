package gb;

import java.math.BigInteger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class i0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            fb.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as BigInteger; at path ");
            v9.append(aVar.j());
            throw new db.j(v9.toString(), e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
