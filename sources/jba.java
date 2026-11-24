// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jba extends lba {
    public final /* synthetic */ byte f;
    public final /* synthetic */ iba g;
    public final /* synthetic */ mba h;

    public /* synthetic */ jba(mba mbaVar, iba ibaVar, byte b) {
        this.f = b;
        this.h = mbaVar;
        this.g = ibaVar;
    }

    @Override // lba
    public final void a() {
        byte b = this.f;
        mba mbaVar = this.h;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                float f = dbaVar.i;
                float f2 = dbaVar.j;
                this.d = f;
                this.e = f2;
                break;
            default:
                dba dbaVar2 = mbaVar.h;
                float f3 = dbaVar2.d;
                float f4 = dbaVar2.e;
                this.d = f3;
                this.e = f4;
                break;
        }
    }

    @Override // lba
    public final void b(float f, float f2) {
        byte b = this.f;
        iba ibaVar = this.g;
        mba mbaVar = this.h;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                dbaVar.i = f;
                dbaVar.j = f2;
                this.d = f;
                this.e = f2;
                ibaVar.a();
                break;
            default:
                dba dbaVar2 = mbaVar.h;
                dbaVar2.d = f;
                dbaVar2.e = f2;
                this.d = f;
                this.e = f2;
                ibaVar.a();
                break;
        }
    }
}
