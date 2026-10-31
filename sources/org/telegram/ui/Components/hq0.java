package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 e;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 n;
    public final /* synthetic */ org.telegram.ui.ActionBar.b1 r;
    public final /* synthetic */ Object s;

    public /* synthetic */ hq0(org.telegram.ui.ActionBar.b1 b1Var, rh.v5 v5Var, org.telegram.ui.ActionBar.b1 b1Var2, org.telegram.ui.ActionBar.b1 b1Var3, org.telegram.ui.ActionBar.b1 b1Var4, org.telegram.ui.ActionBar.b1 b1Var5, boolean z10, org.telegram.ui.ActionBar.b1 b1Var6, org.telegram.ui.ActionBar.b1 b1Var7) {
        this.b = b1Var;
        this.s = v5Var;
        this.c = b1Var2;
        this.d = b1Var3;
        this.e = b1Var4;
        this.f = b1Var5;
        this.h = z10;
        this.n = b1Var6;
        this.r = b1Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.b1 b1Var = this.r;
        org.telegram.ui.ActionBar.b1 b1Var2 = this.n;
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.b1 b1Var3 = this.f;
        org.telegram.ui.ActionBar.b1 b1Var4 = this.e;
        org.telegram.ui.ActionBar.b1 b1Var5 = this.d;
        org.telegram.ui.ActionBar.b1 b1Var6 = this.c;
        org.telegram.ui.ActionBar.b1 b1Var7 = this.b;
        Object obj = this.s;
        switch (i10) {
            case 0:
                rh.v5 v5Var = (rh.v5) obj;
                if (b1Var7 != null) {
                    b1Var7.j(org.telegram.messenger.cd.L0(v5Var.e ? 2131750206 : 2131750207, null), v5Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                b1Var6.setChecked(TLObject.hasFlag(v5Var.g, 1));
                b1Var5.setChecked(TLObject.hasFlag(v5Var.g, 2));
                b1Var4.setChecked(TLObject.hasFlag(v5Var.g, 4));
                b1Var3.setChecked(TLObject.hasFlag(v5Var.g, 8));
                if (z10) {
                    b1Var2.setChecked(TLObject.hasFlag(v5Var.g, 256));
                    b1Var.setChecked(TLObject.hasFlag(v5Var.g, 512));
                    break;
                }
                break;
            default:
                rh.v5 v5Var2 = ((ph.s3) obj).c.Q1;
                b1Var7.j(org.telegram.messenger.cd.L0(v5Var2.e ? 2131750206 : 2131750207, null), v5Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                b1Var6.setChecked(TLObject.hasFlag(v5Var2.g, 1));
                b1Var5.setChecked(TLObject.hasFlag(v5Var2.g, 2));
                b1Var4.setChecked(TLObject.hasFlag(v5Var2.g, 4));
                b1Var3.setChecked(TLObject.hasFlag(v5Var2.g, 8));
                if (z10) {
                    b1Var2.setChecked(TLObject.hasFlag(v5Var2.g, 256));
                    b1Var.setChecked(TLObject.hasFlag(v5Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hq0(ph.s3 s3Var, org.telegram.ui.ActionBar.b1 b1Var, org.telegram.ui.ActionBar.b1 b1Var2, org.telegram.ui.ActionBar.b1 b1Var3, org.telegram.ui.ActionBar.b1 b1Var4, org.telegram.ui.ActionBar.b1 b1Var5, boolean z10, org.telegram.ui.ActionBar.b1 b1Var6, org.telegram.ui.ActionBar.b1 b1Var7) {
        this.s = s3Var;
        this.b = b1Var;
        this.c = b1Var2;
        this.d = b1Var3;
        this.e = b1Var4;
        this.f = b1Var5;
        this.h = z10;
        this.n = b1Var6;
        this.r = b1Var7;
    }
}
