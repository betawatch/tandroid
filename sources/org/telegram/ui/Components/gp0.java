package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ it0 b;

    public /* synthetic */ gp0(it0 it0Var, int i7) {
        this.a = i7;
        this.b = it0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        it0 it0Var = this.b;
        switch (i7) {
            case 0:
                it0Var.w0();
                break;
            case 1:
                it0Var.p2 = (int) it0Var.S0.d(it0.v2);
                it0Var.G();
                if (it0Var.b0 != null) {
                    it0Var.H1();
                }
                ds0[] ds0VarArr = it0Var.n0;
                if (ds0VarArr != null) {
                    for (ds0 ds0Var : ds0VarArr) {
                        if (ds0Var != null) {
                            int paddingTop = ds0Var.h.getPaddingTop();
                            mq0 mq0Var = ds0Var.h;
                            int paddingLeft = mq0Var.getPaddingLeft();
                            int j02 = it0Var.j0(ds0Var.F);
                            int paddingRight = ds0Var.h.getPaddingRight();
                            mq0 mq0Var2 = ds0Var.h;
                            int i02 = it0Var.i0(it0Var.I0());
                            mq0Var2.i3 = i02;
                            mq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                            org.telegram.messenger.g0.J(ds0Var.h, new pp0(ds0Var, paddingTop - ds0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 2:
                b5.P(it0Var.getContext(), it0Var.y1, it0Var.I1, new ip0(it0Var));
                break;
            case 3:
                it0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                bundle.putLong("dialog_id", -it0Var.g1.id);
                h90 h90Var = new h90(bundle, null);
                h90Var.c = it0Var.g1;
                it0Var.y1.presentFragment(h90Var);
                break;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
                hi.nb D = hi.nb.D(g2Var.getParentActivity(), g2Var.getCurrentAccount());
                long j3 = it0Var.m1;
                String currentLang = it0Var.a0.getCurrentLang();
                D.w0 = j3;
                D.x0 = currentLang;
                D.Q(null);
                D.w0 = j3;
                D.x0 = currentLang;
                break;
            case 5:
                it0Var.a0.f();
                break;
            case 6:
                eq0 eq0Var = it0Var.a0;
                if (eq0Var.d()) {
                    eq0Var.h();
                    break;
                } else {
                    eq0Var.f();
                    break;
                }
            case 7:
                eq0 eq0Var2 = it0Var.a0;
                eq0Var2.b(eq0Var2.getCurrentLang());
                break;
            case 8:
                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var.y1;
                g2Var2.getMessagesController().Z4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", g2Var2.getUserConfig().e());
                g2Var2.presentFragment(new org.telegram.ui.bn(bundle2), true);
                break;
            case 9:
                org.telegram.ui.ActionBar.g2 g2Var3 = it0Var.y1;
                try {
                    org.telegram.messenger.ri mediaDataController = g2Var3.getMediaDataController();
                    long e10 = g2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ri.U1;
                    mediaDataController.A0(e10, 0, null);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.g2 g2Var4 = it0Var.y1;
                TLRPC.User f10 = g2Var4.getUserConfig().f();
                b5.r(g2Var4, false, null, f10, false, true, false, true, new g2(20, it0Var, f10));
                break;
            case 11:
                fq0 fq0Var = it0Var.b0;
                fq0Var.getClass();
                fq0Var.h(null, new bi.n5(fq0Var, 1));
                break;
            case 12:
                it0Var.b0.setReordering(true);
                break;
            case 13:
                if (!it0Var.D0()) {
                    it0Var.E1();
                    break;
                }
                break;
            default:
                it0Var.q1(false);
                org.telegram.ui.ActionBar.z4 z4Var = it0Var.I;
                if (z4Var != null) {
                    z4Var.o(true);
                } else {
                    it0Var.H.n(true);
                }
                it0Var.d1 = 0;
                break;
        }
    }
}
