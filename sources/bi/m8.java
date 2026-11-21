package bi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 n;
    public final /* synthetic */ org.telegram.ui.ActionBar.y0 r;
    public final /* synthetic */ Object s;

    public /* synthetic */ m8(n8 n8Var, org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.s = n8Var;
        this.b = y0Var;
        this.c = y0Var2;
        this.d = y0Var3;
        this.e = y0Var4;
        this.f = y0Var5;
        this.h = z10;
        this.n = y0Var6;
        this.r = y0Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.y0 y0Var = this.r;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.e;
        org.telegram.ui.ActionBar.y0 y0Var5 = this.d;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.c;
        Object obj = this.s;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.b;
        switch (i7) {
            case 0:
                di.p8 p8Var = ((n8) obj).c.U1;
                y0Var7.j(gd.N0(p8Var.e ? 2131750180 : 2131750181, null), p8Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                y0Var6.setChecked(TLObject.hasFlag(p8Var.g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var.g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var.g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var.g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var.g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var.g, 512));
                    break;
                }
                break;
            default:
                di.p8 p8Var2 = (di.p8) obj;
                if (y0Var7 != null) {
                    y0Var7.j(gd.N0(p8Var2.e ? 2131750180 : 2131750181, null), p8Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                y0Var6.setChecked(TLObject.hasFlag(p8Var2.g, 1));
                y0Var5.setChecked(TLObject.hasFlag(p8Var2.g, 2));
                y0Var4.setChecked(TLObject.hasFlag(p8Var2.g, 4));
                y0Var3.setChecked(TLObject.hasFlag(p8Var2.g, 8));
                if (z10) {
                    y0Var2.setChecked(TLObject.hasFlag(p8Var2.g, 256));
                    y0Var.setChecked(TLObject.hasFlag(p8Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m8(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.b = y0Var;
        this.s = p8Var;
        this.c = y0Var2;
        this.d = y0Var3;
        this.e = y0Var4;
        this.f = y0Var5;
        this.h = z10;
        this.n = y0Var6;
        this.r = y0Var7;
    }
}
