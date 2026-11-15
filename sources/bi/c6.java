package bi;

import di.m8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                m8 m8Var = ((d6) obj).c.U1;
                z0Var7.j(hd.M0(m8Var.e ? 2131750197 : 2131750198, null), m8Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                z0Var6.setChecked(TLObject.hasFlag(m8Var.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(m8Var.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(m8Var.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(m8Var.g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(m8Var.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(m8Var.g, 512));
                    break;
                }
                break;
            default:
                m8 m8Var2 = (m8) obj;
                if (z0Var7 != null) {
                    z0Var7.j(hd.M0(m8Var2.e ? 2131750197 : 2131750198, null), m8Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(m8Var2.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(m8Var2.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(m8Var2.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(m8Var2.g, 8));
                if (z10) {
                    z0Var2.setChecked(TLObject.hasFlag(m8Var2.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(m8Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c6(org.telegram.ui.ActionBar.z0 z0Var, m8 m8Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z10, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.b = z0Var;
        this.s = m8Var;
        this.c = z0Var2;
        this.d = z0Var3;
        this.e = z0Var4;
        this.f = z0Var5;
        this.h = z10;
        this.n = z0Var6;
        this.r = z0Var7;
    }
}
