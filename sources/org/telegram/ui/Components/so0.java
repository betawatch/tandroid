package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ so0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ys0 ys0Var = this.b;
        switch (i7) {
            case 0:
                ys0Var.w0();
                break;
            case 1:
                ys0Var.o2 = (int) ys0Var.R0.c(ys0.u2);
                ys0Var.G();
                if (ys0Var.a0 != null) {
                    ys0Var.H1();
                }
                tr0[] tr0VarArr = ys0Var.m0;
                if (tr0VarArr != null) {
                    for (tr0 tr0Var : tr0VarArr) {
                        if (tr0Var != null) {
                            int paddingTop = tr0Var.h.getPaddingTop();
                            cq0 cq0Var = tr0Var.h;
                            int paddingLeft = cq0Var.getPaddingLeft();
                            int j02 = ys0Var.j0(tr0Var.E);
                            int paddingRight = tr0Var.h.getPaddingRight();
                            cq0 cq0Var2 = tr0Var.h;
                            int i02 = ys0Var.i0(ys0Var.I0());
                            cq0Var2.h3 = i02;
                            cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(tr0Var.h, new bp0(tr0Var, paddingTop - tr0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 2:
                u4.P(ys0Var.getContext(), ys0Var.x1, ys0Var.H1, new uo0(ys0Var));
                break;
            case 3:
                ys0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -ys0Var.f1.id);
                v80 v80Var = new v80(bundle, null);
                v80Var.c = ys0Var.f1;
                ys0Var.x1.presentFragment(v80Var);
                break;
            case 4:
                org.telegram.ui.ActionBar.f2 f2Var = ys0Var.x1;
                fi.va D = fi.va.D(f2Var.getParentActivity(), f2Var.getCurrentAccount());
                long j3 = ys0Var.l1;
                String currentLang = ys0Var.W.getCurrentLang();
                D.v0 = j3;
                D.w0 = currentLang;
                D.Q(null);
                D.v0 = j3;
                D.w0 = currentLang;
                break;
            case 5:
                ys0Var.W.f();
                break;
            case 6:
                sp0 sp0Var = ys0Var.W;
                if (sp0Var.d()) {
                    sp0Var.h();
                    break;
                } else {
                    sp0Var.f();
                    break;
                }
            case 7:
                sp0 sp0Var2 = ys0Var.W;
                sp0Var2.b(sp0Var2.getCurrentLang());
                break;
            case 8:
                org.telegram.ui.ActionBar.f2 f2Var2 = ys0Var.x1;
                f2Var2.getMessagesController().N4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", f2Var2.getUserConfig().e());
                f2Var2.presentFragment(new org.telegram.ui.cn(bundle2), true);
                break;
            case 9:
                org.telegram.ui.ActionBar.f2 f2Var3 = ys0Var.x1;
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
                org.telegram.ui.ActionBar.f2 f2Var4 = ys0Var.x1;
                TLRPC.User f10 = f2Var4.getUserConfig().f();
                u4.r(f2Var4, false, null, f10, false, true, false, true, new e2(17, ys0Var, f10));
                break;
            case 11:
                up0 up0Var = ys0Var.a0;
                up0Var.getClass();
                up0Var.h(null, new zh.j1(up0Var, 1));
                break;
            case 12:
                ys0Var.a0.setReordering(true);
                break;
            case 13:
                if (!ys0Var.D0()) {
                    ys0Var.E1();
                    break;
                }
                break;
            default:
                ys0Var.q1(false);
                org.telegram.ui.ActionBar.z4 z4Var = ys0Var.H;
                if (z4Var != null) {
                    z4Var.l(true);
                } else {
                    ys0Var.G.n(true);
                }
                ys0Var.c1 = 0;
                break;
        }
    }
}
