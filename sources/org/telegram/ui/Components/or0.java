package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class or0 extends oj0 {
    public final Context c;
    public final /* synthetic */ ys0 d;

    public or0(ys0 ys0Var, Context context) {
        this.d = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        ns0[] ns0VarArr = this.d.v1;
        return ns0VarArr[5].a.size() != 0 || ns0VarArr[5].g;
    }

    @Override // v4.g0
    public final int b() {
        ns0[] ns0VarArr = this.d.v1;
        if (ns0VarArr[5].a.size() != 0 || ns0VarArr[5].g) {
            return ns0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.g0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ns0[] ns0VarArr = this.d.v1;
        return (ns0VarArr[5].a.size() != 0 || ns0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 12) {
            ys0 ys0Var = this.d;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) ys0Var.v1[5].a.get(i7);
            TLRPC.Document F0 = ijVar.F0();
            if (F0 != null) {
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ijVar.k.date, ijVar, F0);
                    if (ys0Var.E1) {
                        h2Var.c(ys0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > ys0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == ys0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, !ys0Var.d1);
                    } else {
                        h2Var.c(false, !ys0Var.d1);
                    }
                }
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.c;
        if (i7 == 11) {
            q3 X = ys0.X(5, ys0Var.l1, context, h6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new xi0(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, h6Var, true);
        h2Var.setCanPreviewGif(true);
        return new xi0(h2Var);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        View view = d1Var.a;
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
