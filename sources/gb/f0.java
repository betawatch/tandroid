package gb;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
