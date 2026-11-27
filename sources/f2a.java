// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f2a implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ b8 c;
    public final /* synthetic */ b8 d;
    public final /* synthetic */ b8 e;
    public final /* synthetic */ b8 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ b8 n;
    public final /* synthetic */ b8 r;
    public final /* synthetic */ Object s;

    public /* synthetic */ f2a(b8 b8Var, axa axaVar, b8 b8Var2, b8 b8Var3, b8 b8Var4, b8 b8Var5, boolean z, b8 b8Var6, b8 b8Var7) {
        this.b = b8Var;
        this.s = axaVar;
        this.c = b8Var2;
        this.d = b8Var3;
        this.e = b8Var4;
        this.f = b8Var5;
        this.h = z;
        this.n = b8Var6;
        this.r = b8Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b8 b8Var = this.r;
        b8 b8Var2 = this.n;
        boolean z = this.h;
        b8 b8Var3 = this.f;
        b8 b8Var4 = this.e;
        b8 b8Var5 = this.d;
        b8 b8Var6 = this.c;
        Object obj = this.s;
        b8 b8Var7 = this.b;
        switch (b) {
            case 0:
                axa axaVar = ((g2a) obj).c.T1;
                b8Var7.j(ob6.M0(axaVar.e ? 2131750156 : 2131750157, null), axaVar.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                b8Var6.setChecked(TLObject.hasFlag(axaVar.g, 1));
                b8Var5.setChecked(TLObject.hasFlag(axaVar.g, 2));
                b8Var4.setChecked(TLObject.hasFlag(axaVar.g, 4));
                b8Var3.setChecked(TLObject.hasFlag(axaVar.g, 8));
                if (z) {
                    b8Var2.setChecked(TLObject.hasFlag(axaVar.g, 256));
                    b8Var.setChecked(TLObject.hasFlag(axaVar.g, 512));
                    break;
                }
                break;
            default:
                axa axaVar2 = (axa) obj;
                if (b8Var7 != null) {
                    b8Var7.j(ob6.M0(axaVar2.e ? 2131750156 : 2131750157, null), axaVar2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                b8Var6.setChecked(TLObject.hasFlag(axaVar2.g, 1));
                b8Var5.setChecked(TLObject.hasFlag(axaVar2.g, 2));
                b8Var4.setChecked(TLObject.hasFlag(axaVar2.g, 4));
                b8Var3.setChecked(TLObject.hasFlag(axaVar2.g, 8));
                if (z) {
                    b8Var2.setChecked(TLObject.hasFlag(axaVar2.g, 256));
                    b8Var.setChecked(TLObject.hasFlag(axaVar2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f2a(g2a g2aVar, b8 b8Var, b8 b8Var2, b8 b8Var3, b8 b8Var4, b8 b8Var5, boolean z, b8 b8Var6, b8 b8Var7) {
        this.s = g2aVar;
        this.b = b8Var;
        this.c = b8Var2;
        this.d = b8Var3;
        this.e = b8Var4;
        this.f = b8Var5;
        this.h = z;
        this.n = b8Var6;
        this.r = b8Var7;
    }
}
