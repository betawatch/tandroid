package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yr0 extends dk0 {
    public final Context c;
    public final /* synthetic */ jt0 d;

    public yr0(jt0 jt0Var, Context context) {
        this.d = jt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        ys0[] ys0VarArr = this.d.w1;
        return ys0VarArr[5].a.size() != 0 || ys0VarArr[5].g;
    }

    @Override // v4.i0
    public final int b() {
        ys0[] ys0VarArr = this.d.w1;
        if (ys0VarArr[5].a.size() != 0 || ys0VarArr[5].g) {
            return ys0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        ys0[] ys0VarArr = this.d.w1;
        return (ys0VarArr[5].a.size() != 0 || ys0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 12) {
            jt0 jt0Var = this.d;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) jt0Var.w1[5].a.get(i7);
            TLRPC.Document F0 = gjVar.F0();
            if (F0 != null) {
                View view = f1Var.a;
                if (view instanceof org.telegram.ui.Cells.i2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                    i2Var.d(gjVar.k.date, gjVar, F0);
                    if (jt0Var.F1) {
                        i2Var.c(jt0Var.c1[(org.telegram.messenger.gj.B0(gjVar.k) > jt0Var.m1 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == jt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0, !jt0Var.e1);
                    } else {
                        i2Var.c(false, !jt0Var.e1);
                    }
                }
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.c;
        if (i7 == 11) {
            y3 X = jt0.X(5, jt0Var.m1, context, h6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new mj0(X);
        }
        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(context, h6Var, true);
        i2Var.setCanPreviewGif(true);
        return new mj0(i2Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.i2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) view).getPhotoImage();
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
