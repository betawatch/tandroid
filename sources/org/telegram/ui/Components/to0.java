package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;

    public /* synthetic */ to0(zs0 zs0Var, int i7) {
        this.a = i7;
        this.b = zs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        zs0 zs0Var = this.b;
        switch (i7) {
            case 0:
                zs0Var.w0();
                break;
            case 1:
                zs0Var.o2 = (int) zs0Var.R0.c(zs0.u2);
                zs0Var.G();
                if (zs0Var.a0 != null) {
                    zs0Var.H1();
                }
                ur0[] ur0VarArr = zs0Var.m0;
                if (ur0VarArr != null) {
                    for (ur0 ur0Var : ur0VarArr) {
                        if (ur0Var != null) {
                            int paddingTop = ur0Var.h.getPaddingTop();
                            dq0 dq0Var = ur0Var.h;
                            int paddingLeft = dq0Var.getPaddingLeft();
                            int j02 = zs0Var.j0(ur0Var.E);
                            int paddingRight = ur0Var.h.getPaddingRight();
                            dq0 dq0Var2 = ur0Var.h;
                            int i02 = zs0Var.i0(zs0Var.I0());
                            dq0Var2.h3 = i02;
                            dq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(ur0Var.h, new cp0(ur0Var, paddingTop - ur0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 2:
                v4.P(zs0Var.getContext(), zs0Var.x1, zs0Var.H1, new vo0(zs0Var));
                break;
            case 3:
                zs0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -zs0Var.f1.id);
                v80 v80Var = new v80(bundle, null);
                v80Var.c = zs0Var.f1;
                zs0Var.x1.presentFragment(v80Var);
                break;
            case 4:
                org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
                fi.va D = fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount());
                long j3 = zs0Var.l1;
                String currentLang = zs0Var.W.getCurrentLang();
                D.v0 = j3;
                D.w0 = currentLang;
                D.Q(null);
                D.v0 = j3;
                D.w0 = currentLang;
                break;
            case 5:
                zs0Var.W.f();
                break;
            case 6:
                tp0 tp0Var = zs0Var.W;
                if (tp0Var.d()) {
                    tp0Var.h();
                    break;
                } else {
                    tp0Var.f();
                    break;
                }
            case 7:
                tp0 tp0Var2 = zs0Var.W;
                tp0Var2.b(tp0Var2.getCurrentLang());
                break;
            case 8:
                org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var.x1;
                f2Var2.getMessagesController().N4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", f2Var2.getUserConfig().e());
                f2Var2.presentFragment(new org.telegram.ui.cn(bundle2), true);
                break;
            case 9:
                org.telegram.ui.ActionBar.f2 f2Var3 = zs0Var.x1;
                try {
                    org.telegram.messenger.ui mediaDataController = f2Var3.getMediaDataController();
                    long e10 = f2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ui.R1;
                    mediaDataController.y0(e10, 0, null);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var4 = zs0Var.x1;
                TLRPC.User f10 = f2Var4.getUserConfig().f();
                v4.r(f2Var4, false, null, f10, false, true, false, true, new f2(17, zs0Var, f10));
                break;
            case 11:
                vp0 vp0Var = zs0Var.a0;
                vp0Var.getClass();
                vp0Var.h(null, new zh.j1(vp0Var, 1));
                break;
            case 12:
                zs0Var.a0.setReordering(true);
                break;
            case 13:
                if (!zs0Var.D0()) {
                    zs0Var.E1();
                    break;
                }
                break;
            default:
                zs0Var.q1(false);
                org.telegram.ui.ActionBar.y4 y4Var = zs0Var.H;
                if (y4Var != null) {
                    y4Var.k(true);
                } else {
                    zs0Var.G.m(true);
                }
                zs0Var.c1 = 0;
                break;
        }
    }
}
