// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d25 implements p8c {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ u41 b;
    public final /* synthetic */ u41 c;
    public final /* synthetic */ ki7 d;
    public final /* synthetic */ wjb e;
    public final /* synthetic */ s25 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d25(u41 u41Var, u41 u41Var2, w25 w25Var, s25 s25Var, ki7 ki7Var, wjb wjbVar, jf4 jf4Var) {
        this.b = u41Var;
        this.c = u41Var2;
        this.g = w25Var;
        this.f = s25Var;
        this.d = ki7Var;
        this.e = wjbVar;
        this.h = jf4Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                w25 w25Var = (w25) obj3;
                jf4 jf4Var = (jf4) obj2;
                Boolean bool = (Boolean) obj;
                u41 u41Var = this.b;
                u41Var.setEnabled(false);
                u41 u41Var2 = this.c;
                u41Var2.setEnabled(false);
                (bool.booleanValue() ? u41Var2 : u41Var).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                ki7 ki7Var = this.d;
                wjb wjbVar = this.e;
                s25 s25Var = this.f;
                w25Var.e(s25Var, booleanValue, new f25(u41Var, u41Var2, ki7Var, wjbVar, jf4Var, s25Var, (byte) 0));
                break;
            default:
                boolean[] zArr = (boolean[]) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                String str = (String) obj;
                u41 u41Var3 = this.b;
                u41Var3.setLoading(false);
                u41 u41Var4 = this.c;
                u41Var4.setLoading(false);
                ki7 ki7Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        u21.d0(str, ki7Var2.F, this.e);
                        s25 s25Var2 = this.f;
                        u41Var3.setEnabled(!s25Var2.n && zArr2[0]);
                        if (!s25Var2.n && !s25Var2.o) {
                            z = true;
                        }
                        u41Var4.setEnabled(z);
                        break;
                    } else {
                        u21.c0(str);
                        break;
                    }
                } else {
                    ki7Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d25(u41 u41Var, u41 u41Var2, ki7 ki7Var, boolean[] zArr, wjb wjbVar, s25 s25Var, boolean[] zArr2) {
        this.b = u41Var;
        this.c = u41Var2;
        this.d = ki7Var;
        this.g = zArr;
        this.e = wjbVar;
        this.f = s25Var;
        this.h = zArr2;
    }
}
