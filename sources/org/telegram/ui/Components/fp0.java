package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;

    public /* synthetic */ fp0(gt0 gt0Var, int i7) {
        this.a = i7;
        this.b = gt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        gt0 gt0Var = this.b;
        switch (i7) {
            case 0:
                gt0Var.w0();
                break;
            case 1:
                gt0Var.p2 = (int) gt0Var.S0.d(gt0.v2);
                gt0Var.G();
                if (gt0Var.b0 != null) {
                    gt0Var.H1();
                }
                bs0[] bs0VarArr = gt0Var.n0;
                if (bs0VarArr != null) {
                    for (bs0 bs0Var : bs0VarArr) {
                        if (bs0Var != null) {
                            int paddingTop = bs0Var.h.getPaddingTop();
                            lq0 lq0Var = bs0Var.h;
                            int paddingLeft = lq0Var.getPaddingLeft();
                            int j02 = gt0Var.j0(bs0Var.F);
                            int paddingRight = bs0Var.h.getPaddingRight();
                            lq0 lq0Var2 = bs0Var.h;
                            int i02 = gt0Var.i0(gt0Var.I0());
                            lq0Var2.i3 = i02;
                            lq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(bs0Var.h, new op0(bs0Var, paddingTop - bs0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 2:
                b5.P(gt0Var.getContext(), gt0Var.y1, gt0Var.I1, new hp0(gt0Var));
                break;
            case 3:
                gt0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -gt0Var.g1.id);
                i90 i90Var = new i90(bundle, null);
                i90Var.c = gt0Var.g1;
                gt0Var.y1.presentFragment(i90Var);
                break;
            case 4:
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
                hi.ta D = hi.ta.D(h2Var.getParentActivity(), h2Var.getCurrentAccount());
                long j3 = gt0Var.m1;
                String currentLang = gt0Var.a0.getCurrentLang();
                D.w0 = j3;
                D.x0 = currentLang;
                D.Q(null);
                D.w0 = j3;
                D.x0 = currentLang;
                break;
            case 5:
                gt0Var.a0.f();
                break;
            case 6:
                dq0 dq0Var = gt0Var.a0;
                if (dq0Var.d()) {
                    dq0Var.h();
                    break;
                } else {
                    dq0Var.f();
                    break;
                }
            case 7:
                dq0 dq0Var2 = gt0Var.a0;
                dq0Var2.b(dq0Var2.getCurrentLang());
                break;
            case 8:
                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var.y1;
                h2Var2.getMessagesController().Z4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", h2Var2.getUserConfig().e());
                h2Var2.presentFragment(new org.telegram.ui.bn(bundle2), true);
                break;
            case 9:
                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var.y1;
                try {
                    org.telegram.messenger.ri mediaDataController = h2Var3.getMediaDataController();
                    long e10 = h2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ri.U1;
                    mediaDataController.A0(e10, 0, null);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.h2 h2Var4 = gt0Var.y1;
                TLRPC.User f10 = h2Var4.getUserConfig().f();
                b5.r(h2Var4, false, null, f10, false, true, false, true, new g2(20, gt0Var, f10));
                break;
            case 11:
                eq0 eq0Var = gt0Var.b0;
                eq0Var.getClass();
                eq0Var.h(null, new bi.i5(eq0Var, 1));
                break;
            case 12:
                gt0Var.b0.setReordering(true);
                break;
            case 13:
                if (!gt0Var.D0()) {
                    gt0Var.E1();
                    break;
                }
                break;
            default:
                gt0Var.q1(false);
                org.telegram.ui.ActionBar.a5 a5Var = gt0Var.I;
                if (a5Var != null) {
                    a5Var.o(true);
                } else {
                    gt0Var.H.o(true);
                }
                gt0Var.d1 = 0;
                break;
        }
    }
}
