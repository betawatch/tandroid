package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements Runnable {
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

    public /* synthetic */ gp0(org.telegram.ui.ActionBar.z0 z0Var, bi.v9 v9Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.b = z0Var;
        this.s = v9Var;
        this.c = z0Var2;
        this.d = z0Var3;
        this.e = z0Var4;
        this.f = z0Var5;
        this.h = z9;
        this.n = z0Var6;
        this.r = z0Var7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.z0 z0Var = this.r;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.n;
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.z0 z0Var3 = this.f;
        org.telegram.ui.ActionBar.z0 z0Var4 = this.e;
        org.telegram.ui.ActionBar.z0 z0Var5 = this.d;
        org.telegram.ui.ActionBar.z0 z0Var6 = this.c;
        org.telegram.ui.ActionBar.z0 z0Var7 = this.b;
        Object obj = this.s;
        switch (i7) {
            case 0:
                bi.v9 v9Var = (bi.v9) obj;
                if (z0Var7 != null) {
                    z0Var7.j(org.telegram.messenger.id.M0(v9Var.e ? 2131750198 : 2131750199, null), v9Var.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                }
                z0Var6.setChecked(TLObject.hasFlag(v9Var.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var.g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var.g, 512));
                    break;
                }
                break;
            default:
                bi.v9 v9Var2 = ((zh.m3) obj).c.Q1;
                z0Var7.j(org.telegram.messenger.id.M0(v9Var2.e ? 2131750198 : 2131750199, null), v9Var2.e ? R.drawable.menu_sort_value : R.drawable.menu_sort_date, null);
                z0Var6.setChecked(TLObject.hasFlag(v9Var2.g, 1));
                z0Var5.setChecked(TLObject.hasFlag(v9Var2.g, 2));
                z0Var4.setChecked(TLObject.hasFlag(v9Var2.g, 4));
                z0Var3.setChecked(TLObject.hasFlag(v9Var2.g, 8));
                if (z9) {
                    z0Var2.setChecked(TLObject.hasFlag(v9Var2.g, 256));
                    z0Var.setChecked(TLObject.hasFlag(v9Var2.g, 512));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gp0(zh.m3 m3Var, org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, org.telegram.ui.ActionBar.z0 z0Var3, org.telegram.ui.ActionBar.z0 z0Var4, org.telegram.ui.ActionBar.z0 z0Var5, boolean z9, org.telegram.ui.ActionBar.z0 z0Var6, org.telegram.ui.ActionBar.z0 z0Var7) {
        this.s = m3Var;
        this.b = z0Var;
        this.c = z0Var2;
        this.d = z0Var3;
        this.e = z0Var4;
        this.f = z0Var5;
        this.h = z9;
        this.n = z0Var6;
        this.r = z0Var7;
    }
}
