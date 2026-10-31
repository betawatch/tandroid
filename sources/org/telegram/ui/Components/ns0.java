package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ns0 extends sk0 {
    public final Context c;
    public final /* synthetic */ zt0 d;

    public ns0(zt0 zt0Var, Context context) {
        this.d = zt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        ot0[] ot0VarArr = this.d.v1;
        return ot0VarArr[5].a.size() != 0 || ot0VarArr[5].g;
    }

    @Override // s4.g0
    public final int b() {
        ot0[] ot0VarArr = this.d.v1;
        if (ot0VarArr[5].a.size() != 0 || ot0VarArr[5].g) {
            return ot0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.g0
    public final long c(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        ot0[] ot0VarArr = this.d.v1;
        return (ot0VarArr[5].a.size() != 0 || ot0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            zt0 zt0Var = this.d;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) zt0Var.v1[5].a.get(i10);
            TLRPC.Document F0 = jjVar.F0();
            if (F0 != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(jjVar.k.date, jjVar, F0);
                    if (zt0Var.E1) {
                        h2Var.c(zt0Var.b1[(org.telegram.messenger.jj.B0(jjVar.k) > zt0Var.l1 ? 1 : (org.telegram.messenger.jj.B0(jjVar.k) == zt0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) >= 0, !zt0Var.d1);
                    } else {
                        h2Var.c(false, !zt0Var.d1);
                    }
                }
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.c;
        if (i10 == 11) {
            p3 V = zt0.V(5, zt0Var.l1, context, p6Var);
            V.setLayoutParams(new s4.o0(-1, -1));
            return new ck0(V);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, p6Var, true);
        h2Var.setCanPreviewGif(true);
        return new ck0(h2Var);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.t0 = true;
                photoImage.P0(false);
            } else {
                photoImage.t0 = false;
                photoImage.Q0();
            }
        }
    }
}
