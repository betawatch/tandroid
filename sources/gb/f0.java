package gb;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        StringBuilder w10 = a4.a.w("Expecting character, got: ", v, "; at ");
        w10.append(aVar.j());
        throw new db.j(w10.toString());
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        Character ch2 = (Character) obj;
        bVar.r(ch2 == null ? null : String.valueOf(ch2));
    }
}
