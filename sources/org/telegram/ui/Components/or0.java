package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class or0 extends tj0 {
    public final Context c;
    public final /* synthetic */ ys0 d;

    public or0(ys0 ys0Var, Context context) {
        this.d = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        ns0[] ns0VarArr = this.d.w1;
        return ns0VarArr[5].a.size() != 0 || ns0VarArr[5].g;
    }

    @Override // v4.h0
    public final int b() {
        ns0[] ns0VarArr = this.d.w1;
        if (ns0VarArr[5].a.size() != 0 || ns0VarArr[5].g) {
            return ns0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.h0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.h0
    public final int d(int i7) {
        ns0[] ns0VarArr = this.d.w1;
        return (ns0VarArr[5].a.size() != 0 || ns0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f == 12) {
            ys0 ys0Var = this.d;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) ys0Var.w1[5].a.get(i7);
            TLRPC.Document F0 = gjVar.F0();
            if (F0 != null) {
                View view = e1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(gjVar.k.date, gjVar, F0);
                    if (ys0Var.F1) {
                        h2Var.c(ys0Var.c1[(org.telegram.messenger.gj.B0(gjVar.k) > ys0Var.m1 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == ys0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0, !ys0Var.e1);
                    } else {
                        h2Var.c(false, !ys0Var.e1);
                    }
                }
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.c;
        if (i7 == 11) {
            p3 X = ys0.X(5, ys0Var.m1, context, e6Var);
            X.setLayoutParams(new v4.p0(-1, -1));
            return new cj0(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, e6Var, true);
        h2Var.setCanPreviewGif(true);
        return new cj0(h2Var);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.h2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) view).getPhotoImage();
            if (this.d.n0[0].F == 5) {
                photoImage.u0 = true;
                photoImage.P0(false);
            } else {
                photoImage.u0 = false;
                photoImage.Q0();
            }
        }
    }
}
