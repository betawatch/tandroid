// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gia extends ri4 {
    public final eia a;
    public final fia b;
    public float c = 1.0f;

    public gia(eia eiaVar, fia fiaVar) {
        this.a = eiaVar;
        this.b = fiaVar;
    }

    @Override // ri4
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override // ri4
    public final void b(Object obj, float f) {
        this.b.b(obj, f / this.c);
    }
}
