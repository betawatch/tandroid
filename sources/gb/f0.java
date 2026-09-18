package gb;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class f0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder v9 = a4.a.v("Expecting character, got: ", v, "; at ");
        v9.append(aVar.j());
        throw new db.j(v9.toString());
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        Character ch2 = (Character) obj;
        bVar.r(ch2 == null ? null : String.valueOf(ch2));
    }
}
