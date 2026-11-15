package bi;

import di.l8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 n;
    public final /* synthetic */ org.telegram.ui.ActionBar.z0 r;
    public final /* synthetic */ Object s;

    public /* synthetic */ c6(d6 d6Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.s = d6Var;
        this.b = z0Var;
        this.c = z0Var2;
        this.d = z0Var3;
        this.e = z0Var4;
        this.f = z0Var5;
        this.h = z10;
        this.n = z0Var6;
        this.r = z0Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.z0 z0Var = this.r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.c;
        Object obj = this.s;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.b;
        switch (i7) {
            case 0:
                l8 l8Var = ((d6) obj).c.U1;
                z0Var7.j(hd.M0(l8Var.e ? 2131750197 : 2131750198, null), l8Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                z0Var6.setChecked(TLObject.hasFlag(l8Var.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(l8Var.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(l8Var.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(l8Var.g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(l8Var.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(l8Var.g, 512));
                    break;
                }
                break;
            default:
                l8 l8Var2 = (l8) obj;
                if (z0Var7 != null) {
                    z0Var7.j(hd.M0(l8Var2.e ? 2131750197 : 2131750198, null), l8Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(l8Var2.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(l8Var2.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(l8Var2.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(l8Var2.g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(l8Var2.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(l8Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c6(org.telegram.ui.ActionBar.z0 z0Var, l8 l8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.b = z0Var;
        this.s = l8Var;
        this.c = z0Var2;
        this.d = z0Var3;
        this.e = z0Var4;
        this.f = z0Var5;
        this.h = z10;
        this.n = z0Var6;
        this.r = z0Var7;
    }
}
