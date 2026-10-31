package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;

    public /* synthetic */ vp0(zt0 zt0Var, int i10) {
        this.a = i10;
        this.b = zt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        zt0 zt0Var = this.b;
        switch (i10) {
            case 0:
                zt0Var.o2 = (int) zt0Var.R0.c(zt0.u2);
                zt0Var.F();
                if (zt0Var.a0 != null) {
                    zt0Var.C1();
                }
                ss0[] ss0VarArr = zt0Var.m0;
                if (ss0VarArr != null) {
                    for (ss0 ss0Var : ss0VarArr) {
                        if (ss0Var != null) {
                            int paddingTop = ss0Var.h.getPaddingTop();
                            dr0 dr0Var = ss0Var.h;
                            int paddingLeft = dr0Var.getPaddingLeft();
                            int h02 = zt0Var.h0(ss0Var.E);
                            int paddingRight = ss0Var.h.getPaddingRight();
                            dr0 dr0Var2 = ss0Var.h;
                            int g02 = zt0Var.g0(zt0Var.E0());
                            dr0Var2.h3 = g02;
                            dr0Var.setPadding(paddingLeft, h02, paddingRight, g02);
                            org.telegram.messenger.i0.J(ss0Var.h, new dq0(ss0Var, paddingTop - ss0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                s4.R(zt0Var.getContext(), zt0Var.x1, zt0Var.H1, new wp0(zt0Var));
                break;
            case 2:
                zt0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -zt0Var.f1.id);
                n90 n90Var = new n90(bundle, null);
                n90Var.c = zt0Var.f1;
                zt0Var.x1.presentFragment(n90Var);
                break;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
                vh.o8 D = vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount());
                long j10 = zt0Var.l1;
                String currentLang = zt0Var.W.getCurrentLang();
                D.v0 = j10;
                D.w0 = currentLang;
                D.Q(null);
                D.v0 = j10;
                D.w0 = currentLang;
                break;
            case 4:
                zt0Var.W.f();
                break;
            case 5:
                uq0 uq0Var = zt0Var.W;
                if (uq0Var.d()) {
                    uq0Var.h();
                    break;
                } else {
                    uq0Var.f();
                    break;
                }
            case 6:
                uq0 uq0Var2 = zt0Var.W;
                uq0Var2.b(uq0Var2.getCurrentLang());
                break;
            case 7:
                org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var.x1;
                k2Var2.getMessagesController().K4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", k2Var2.getUserConfig().e());
                k2Var2.presentFragment(new org.telegram.ui.un(bundle2), true);
                break;
            case 8:
                org.telegram.ui.ActionBar.k2 k2Var3 = zt0Var.x1;
                try {
                    org.telegram.messenger.ui mediaDataController = k2Var3.getMediaDataController();
                    long e = k2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ui.R1;
                    mediaDataController.y0(e, 0, null);
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 9:
                org.telegram.ui.ActionBar.k2 k2Var4 = zt0Var.x1;
                TLRPC.User f7 = k2Var4.getUserConfig().f();
                s4.r(k2Var4, false, null, f7, false, true, false, true, new f2(18, zt0Var, f7));
                break;
            case 10:
                vq0 vq0Var = zt0Var.a0;
                vq0Var.getClass();
                vq0Var.h(null, new ph.o1(vq0Var, 1));
                break;
            case 11:
                zt0Var.a0.setReordering(true);
                break;
            case 12:
                zt0Var.l1(false);
                org.telegram.ui.ActionBar.i5 i5Var = zt0Var.H;
                if (i5Var != null) {
                    i5Var.j(true);
                } else {
                    zt0Var.G.k(true);
                }
                zt0Var.c1 = 0;
                break;
            default:
                zt0Var.u0();
                break;
        }
    }
}
