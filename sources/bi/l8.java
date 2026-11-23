package bi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements Runnable {
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

    public /* synthetic */ l8(m8 m8Var, org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
        this.s = m8Var;
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
                di.p8 p8Var = ((m8) obj).c.U1;
                y0Var7.j(hd.N0(p8Var.e ? 2131750180 : 2131750181, null), p8Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
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
                    y0Var7.j(hd.N0(p8Var2.e ? 2131750180 : 2131750181, null), p8Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
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

    public /* synthetic */ l8(org.telegram.ui.ActionBar.y0 y0Var, di.p8 p8Var, org.telegram.ui.ActionBar.y0 y0Var2, org.telegram.ui.ActionBar.y0 y0Var3, org.telegram.ui.ActionBar.y0 y0Var4, org.telegram.ui.ActionBar.y0 y0Var5, boolean z10, org.telegram.ui.ActionBar.y0 y0Var6, org.telegram.ui.ActionBar.y0 y0Var7) {
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
