// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ada extends cda {
    public final /* synthetic */ byte f;
    public final /* synthetic */ zca g;
    public final /* synthetic */ dda h;

    public /* synthetic */ ada(dda ddaVar, zca zcaVar, byte b) {
        this.f = b;
        this.h = ddaVar;
        this.g = zcaVar;
    }

    @Override // cda
    public final void a() {
        byte b = this.f;
        dda ddaVar = this.h;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                float f = ucaVar.i;
                float f2 = ucaVar.j;
                this.d = f;
                this.e = f2;
                break;
            default:
                uca ucaVar2 = ddaVar.h;
                float f3 = ucaVar2.d;
                float f4 = ucaVar2.e;
                this.d = f3;
                this.e = f4;
                break;
        }
    }

    @Override // cda
    public final void b(float f, float f2) {
        byte b = this.f;
        zca zcaVar = this.g;
        dda ddaVar = this.h;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                ucaVar.i = f;
                ucaVar.j = f2;
                this.d = f;
                this.e = f2;
                zcaVar.a();
                break;
            default:
                uca ucaVar2 = ddaVar.h;
                ucaVar2.d = f;
                ucaVar2.e = f2;
                this.d = f;
                this.e = f2;
                zcaVar.a();
                break;
        }
    }
}
