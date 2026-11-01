package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class os0 extends tk0 {
    public final Context c;
    public final /* synthetic */ au0 d;

    public os0(au0 au0Var, Context context) {
        this.d = au0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        pt0[] pt0VarArr = this.d.v1;
        return pt0VarArr[5].a.size() != 0 || pt0VarArr[5].g;
    }

    @Override // s4.g0
    public final int b() {
        pt0[] pt0VarArr = this.d.v1;
        if (pt0VarArr[5].a.size() != 0 || pt0VarArr[5].g) {
            return pt0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.g0
    public final long c(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        pt0[] pt0VarArr = this.d.v1;
        return (pt0VarArr[5].a.size() != 0 || pt0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            au0 au0Var = this.d;
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) au0Var.v1[5].a.get(i10);
            TLRPC.Document F0 = kjVar.F0();
            if (F0 != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(kjVar.k.date, kjVar, F0);
                    if (au0Var.E1) {
                        h2Var.c(au0Var.b1[(org.telegram.messenger.kj.B0(kjVar.k) > au0Var.l1 ? 1 : (org.telegram.messenger.kj.B0(kjVar.k) == au0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar.f1()) >= 0, !au0Var.d1);
                    } else {
                        h2Var.c(false, !au0Var.d1);
                    }
                }
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.c;
        if (i10 == 11) {
            p3 W = au0.W(5, au0Var.l1, context, p6Var);
            W.setLayoutParams(new s4.o0(-1, -1));
            return new dk0(W);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, p6Var, true);
        h2Var.setCanPreviewGif(true);
        return new dk0(h2Var);
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
