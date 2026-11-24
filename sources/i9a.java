// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i9a extends l9a {
    public final /* synthetic */ byte f;
    public final /* synthetic */ m9a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9a(m9a m9aVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = m9aVar;
    }

    @Override // l9a
    public final void a() {
        byte b = this.f;
        m9a m9aVar = this.g;
        switch (b) {
            case 0:
                d9a d9aVar = m9aVar.h;
                double atan2 = Math.atan2(d9aVar.c - d9aVar.j, d9aVar.b - d9aVar.i) + 3.141592653589793d;
                d9a d9aVar2 = m9aVar.h;
                double d = d9aVar2.k / 5.5f;
                float cos = d9aVar2.b + ((float) (Math.cos(atan2) * d));
                float sin = m9aVar.h.c + ((float) (Math.sin(atan2) * d));
                this.d = cos;
                this.e = sin;
                break;
            case 1:
                d9a d9aVar3 = m9aVar.h;
                float f = d9aVar3.b + d9aVar3.d;
                float f2 = d9aVar3.c;
                this.d = f;
                this.e = f2;
                break;
            case 2:
                d9a d9aVar4 = m9aVar.h;
                float min = Math.min(d9aVar4.d, d9aVar4.e);
                d9a d9aVar5 = m9aVar.h;
                float f3 = (0.95105654f * min) + d9aVar5.b;
                float f4 = ((-0.309017f) * min) + d9aVar5.c;
                this.d = f3;
                this.e = f4;
                break;
            case 3:
                d9a d9aVar6 = m9aVar.h;
                float f5 = d9aVar6.b;
                float abs = d9aVar6.c - Math.abs(d9aVar6.e);
                this.d = f5;
                this.e = abs;
                break;
            case 4:
                d9a d9aVar7 = m9aVar.h;
                float f6 = d9aVar7.i;
                float f7 = d9aVar7.j;
                d9aVar7.i = f6;
                d9aVar7.j = f7;
                this.d = f6;
                this.e = f7;
                break;
            default:
                d9a d9aVar8 = m9aVar.h;
                this.d = d9aVar8.b;
                this.e = d9aVar8.c;
                break;
        }
    }

    @Override // l9a
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        m9a m9aVar = this.g;
        switch (b) {
            case 0:
                d9a d9aVar = m9aVar.h;
                double atan2 = Math.atan2(d9aVar.c - d9aVar.j, d9aVar.b - d9aVar.i) + 1.5707963267948966d;
                d9a d9aVar2 = m9aVar.h;
                float a = (loe.a(d9aVar2.b, d9aVar2.c, d9aVar2.i, d9aVar2.j) * 5.5f) / 2.0f;
                d9a d9aVar3 = m9aVar.h;
                float f3 = d9aVar3.b;
                float f4 = d9aVar3.c;
                m9aVar.getClass();
                d9aVar3.k = Math.min(a, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                d9a d9aVar4 = m9aVar.h;
                float a2 = loe.a(d9aVar4.b, d9aVar4.c, f, f2);
                d9aVar4.e = a2;
                d9aVar4.d = a2;
                return;
            case 2:
                d9a d9aVar5 = m9aVar.h;
                float a3 = loe.a(d9aVar5.b, d9aVar5.c, f, f2);
                d9aVar5.e = a3;
                d9aVar5.d = a3;
                m9aVar.h.h = (float) ((((float) Math.atan2(r0.c - f2, f - r0.b)) - 0.3141592653589793d) + r0.h);
                a();
                return;
            case 3:
                m9aVar.h.h = (float) ((((float) Math.atan2(r12.c - f2, f - r12.b)) - 1.5707963267948966d) + r12.h);
                while (i < m9aVar.m.size()) {
                    l9a l9aVar = (l9a) m9aVar.m.get(i);
                    if (l9aVar instanceof k9a) {
                        l9aVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                d9a d9aVar6 = m9aVar.h;
                d9aVar6.i = f;
                d9aVar6.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = d9aVar6.c;
                float f6 = d9aVar6.e;
                float f7 = f5 - f6;
                if (f2 > f7 && f2 < f5 + f6) {
                    float f8 = d9aVar6.b;
                    if (f <= f8) {
                        float f9 = f8 - d9aVar6.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + d9aVar6.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = d9aVar6.b;
                float f12 = d9aVar6.d;
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
                d9aVar6.i = f;
                d9aVar6.j = f2;
                return;
        }
        while (i < m9aVar.m.size()) {
            l9a l9aVar2 = (l9a) m9aVar.m.get(i);
            if (l9aVar2 != this) {
                l9aVar2.a();
            }
            i++;
        }
        d9a d9aVar7 = m9aVar.h;
        d9aVar7.b = f;
        d9aVar7.c = f2;
        this.d = f;
        this.e = f2;
    }

    public /* synthetic */ i9a(m9a m9aVar, byte b) {
        this.f = b;
        this.g = m9aVar;
    }
}
