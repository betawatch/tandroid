package bi;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
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

    public /* synthetic */ j8(k8 k8Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.s = k8Var;
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
                di.o8 o8Var = ((k8) obj).c.U1;
                z0Var7.j(gd.M0(o8Var.e ? 2131750181 : 2131750182, null), o8Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                z0Var6.setChecked(TLObject.hasFlag(o8Var.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(o8Var.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(o8Var.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(o8Var.g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(o8Var.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(o8Var.g, 512));
                    break;
                }
                break;
            default:
                di.o8 o8Var2 = (di.o8) obj;
                if (z0Var7 != null) {
                    z0Var7.j(gd.M0(o8Var2.e ? 2131750181 : 2131750182, null), o8Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(o8Var2.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(o8Var2.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(o8Var2.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(o8Var2.g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(o8Var2.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(o8Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j8(org.telegram.ui.ActionBar.z0 z0Var, di.o8 o8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.b = z0Var;
        this.s = o8Var;
        this.c = z0Var2;
        this.d = z0Var3;
        this.e = z0Var4;
        this.f = z0Var5;
        this.h = z10;
        this.n = z0Var6;
        this.r = z0Var7;
    }
}
