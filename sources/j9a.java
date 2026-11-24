// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j9a extends l9a {
    public final /* synthetic */ byte f;
    public final /* synthetic */ i9a g;
    public final /* synthetic */ m9a h;

    public /* synthetic */ j9a(m9a m9aVar, i9a i9aVar, byte b) {
        this.f = b;
        this.h = m9aVar;
        this.g = i9aVar;
    }

    @Override // l9a
    public final void a() {
        byte b = this.f;
        m9a m9aVar = this.h;
        switch (b) {
            case 0:
                d9a d9aVar = m9aVar.h;
                float f = d9aVar.i;
                float f2 = d9aVar.j;
                this.d = f;
                this.e = f2;
                break;
            default:
                d9a d9aVar2 = m9aVar.h;
                float f3 = d9aVar2.d;
                float f4 = d9aVar2.e;
                this.d = f3;
                this.e = f4;
                break;
        }
    }

    @Override // l9a
    public final void b(float f, float f2) {
        byte b = this.f;
        i9a i9aVar = this.g;
        m9a m9aVar = this.h;
        switch (b) {
            case 0:
                d9a d9aVar = m9aVar.h;
                d9aVar.i = f;
                d9aVar.j = f2;
                this.d = f;
                this.e = f2;
                i9aVar.a();
                break;
            default:
                d9a d9aVar2 = m9aVar.h;
                d9aVar2.d = f;
                d9aVar2.e = f2;
                this.d = f;
                this.e = f2;
                i9aVar.a();
                break;
        }
    }
}
