// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iba extends lba {
    public final /* synthetic */ byte f;
    public final /* synthetic */ mba g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iba(mba mbaVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = mbaVar;
    }

    @Override // lba
    public final void a() {
        byte b = this.f;
        mba mbaVar = this.g;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                double atan2 = Math.atan2(dbaVar.c - dbaVar.j, dbaVar.b - dbaVar.i) + 3.141592653589793d;
                dba dbaVar2 = mbaVar.h;
                double d = dbaVar2.k / 5.5f;
                float cos = dbaVar2.b + ((float) (Math.cos(atan2) * d));
                float sin = mbaVar.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                dba dbaVar3 = mbaVar.h;
                float f = dbaVar3.b + dbaVar3.d;
                float f2 = dbaVar3.c;
                this.d = f;
                this.e = f2;
                break;
            case 2:
                dba dbaVar4 = mbaVar.h;
                float min = Math.min(dbaVar4.d, dbaVar4.e);
                dba dbaVar5 = mbaVar.h;
                float f3 = (0.95105654f * min) + dbaVar5.b;
                float f4 = ((-0.309017f) * min) + dbaVar5.c;
                this.d = f3;
                this.e = f4;
                break;
            case 3:
                dba dbaVar6 = mbaVar.h;
                float f5 = dbaVar6.b;
                float abs = dbaVar6.c - Math.abs(dbaVar6.e);
                this.d = f5;
                this.e = abs;
                break;
            case 4:
                dba dbaVar7 = mbaVar.h;
                float f6 = dbaVar7.i;
                float f7 = dbaVar7.j;
                dbaVar7.i = f6;
                dbaVar7.j = f7;
                this.d = f6;
                this.e = f7;
                break;
            default:
                dba dbaVar8 = mbaVar.h;
                this.d = dbaVar8.b;
                this.e = dbaVar8.c;
                break;
        }
    }

    @Override // lba
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        mba mbaVar = this.g;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                double atan2 = Math.atan2(dbaVar.c - dbaVar.j, dbaVar.b - dbaVar.i) + 1.5707963267948966d;
                dba dbaVar2 = mbaVar.h;
                float a = (oqe.a(dbaVar2.b, dbaVar2.c, dbaVar2.i, dbaVar2.j) * 5.5f) / 2.0f;
                dba dbaVar3 = mbaVar.h;
                float f3 = dbaVar3.b;
                float f4 = dbaVar3.c;
                mbaVar.getClass();
                dbaVar3.k = Math.min(a, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                dba dbaVar4 = mbaVar.h;
                float a2 = oqe.a(dbaVar4.b, dbaVar4.c, f, f2);
                dbaVar4.e = a2;
                dbaVar4.d = a2;
                return;
            case 2:
                dba dbaVar5 = mbaVar.h;
                float a3 = oqe.a(dbaVar5.b, dbaVar5.c, f, f2);
                dbaVar5.e = a3;
                dbaVar5.d = a3;
                mbaVar.h.h = (float) ((((float) Math.atan2(r0.c - f2, f - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                return;
            case 3:
                mbaVar.h.h = (float) ((((float) Math.atan2(r12.c - f2, f - r12.b)) - 1.5707963267948966d) + r12.h);
                while (i < mbaVar.m.size()) {
                    lba lbaVar = (lba) mbaVar.m.get(i);
                    if (lbaVar instanceof kba) {
                        lbaVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                dba dbaVar6 = mbaVar.h;
                dbaVar6.i = f;
                dbaVar6.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = dbaVar6.c;
                float f6 = dbaVar6.e;
                float f7 = f5 - f6;
                if (f2 > f7 && f2 < f5 + f6) {
                    float f8 = dbaVar6.b;
                    if (f <= f8) {
                        float f9 = f8 - dbaVar6.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + dbaVar6.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = dbaVar6.b;
                float f12 = dbaVar6.d;
                if (f > f11 - f12 && f < f11 + f12) {
                    if (f2 <= f5 && f2 > f7) {
                        this.e = f7;
                        f2 = f7;
                    } else if (f2 > f5) {
                        float f13 = f5 + f6;
                        if (f2 < f13) {
                            this.e = f13;
                            f2 = f13;
                        }
                    }
                }
                dbaVar6.i = f;
                dbaVar6.j = f2;
                return;
        }
        while (i < mbaVar.m.size()) {
            lba lbaVar2 = (lba) mbaVar.m.get(i);
            if (lbaVar2 != this) {
                lbaVar2.a();
            }
            i++;
        }
        dba dbaVar7 = mbaVar.h;
        dbaVar7.b = f;
        dbaVar7.c = f2;
        this.d = f;
        this.e = f2;
    }

    public /* synthetic */ iba(mba mbaVar, byte b) {
        this.f = b;
        this.g = mbaVar;
    }
}
