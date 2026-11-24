// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly9 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ a8 c;
    public final /* synthetic */ a8 d;
    public final /* synthetic */ a8 e;
    public final /* synthetic */ a8 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ a8 n;
    public final /* synthetic */ a8 r;
    public final /* synthetic */ Object s;

    public /* synthetic */ ly9(a8 a8Var, xsa xsaVar, a8 a8Var2, a8 a8Var3, a8 a8Var4, a8 a8Var5, boolean z, a8 a8Var6, a8 a8Var7) {
        this.b = a8Var;
        this.s = xsaVar;
        this.c = a8Var2;
        this.d = a8Var3;
        this.e = a8Var4;
        this.f = a8Var5;
        this.h = z;
        this.n = a8Var6;
        this.r = a8Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a8 a8Var = this.r;
        a8 a8Var2 = this.n;
        boolean z = this.h;
        a8 a8Var3 = this.f;
        a8 a8Var4 = this.e;
        a8 a8Var5 = this.d;
        a8 a8Var6 = this.c;
        Object obj = this.s;
        a8 a8Var7 = this.b;
        switch (b) {
            case 0:
                xsa xsaVar = ((my9) obj).c.T1;
                a8Var7.j(k96.M0(xsaVar.e ? 2131750181 : 2131750182, null), xsaVar.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                a8Var6.setChecked(TLObject.hasFlag(xsaVar.g, 1));
                a8Var5.setChecked(TLObject.hasFlag(xsaVar.g, 2));
                a8Var4.setChecked(TLObject.hasFlag(xsaVar.g, 4));
                a8Var3.setChecked(TLObject.hasFlag(xsaVar.g, 8));
                if (z) {
                    a8Var2.setChecked(TLObject.hasFlag(xsaVar.g, 256));
                    a8Var.setChecked(TLObject.hasFlag(xsaVar.g, 512));
                    break;
                }
                break;
            default:
                xsa xsaVar2 = (xsa) obj;
                if (a8Var7 != null) {
                    a8Var7.j(k96.M0(xsaVar2.e ? 2131750181 : 2131750182, null), xsaVar2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                a8Var6.setChecked(TLObject.hasFlag(xsaVar2.g, 1));
                a8Var5.setChecked(TLObject.hasFlag(xsaVar2.g, 2));
                a8Var4.setChecked(TLObject.hasFlag(xsaVar2.g, 4));
                a8Var3.setChecked(TLObject.hasFlag(xsaVar2.g, 8));
                if (z) {
                    a8Var2.setChecked(TLObject.hasFlag(xsaVar2.g, 256));
                    a8Var.setChecked(TLObject.hasFlag(xsaVar2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ly9(my9 my9Var, a8 a8Var, a8 a8Var2, a8 a8Var3, a8 a8Var4, a8 a8Var5, boolean z, a8 a8Var6, a8 a8Var7) {
        this.s = my9Var;
        this.b = a8Var;
        this.c = a8Var2;
        this.d = a8Var3;
        this.e = a8Var4;
        this.f = a8Var5;
        this.h = z;
        this.n = a8Var6;
        this.r = a8Var7;
    }
}
