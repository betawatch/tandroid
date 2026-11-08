package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class nr0 extends oj0 {
    public final Context c;
    public final /* synthetic */ xs0 d;

    public nr0(xs0 xs0Var, Context context) {
        this.d = xs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        ms0[] ms0VarArr = this.d.v1;
        return ms0VarArr[5].a.size() != 0 || ms0VarArr[5].g;
    }

    @Override // v4.g0
    public final int b() {
        ms0[] ms0VarArr = this.d.v1;
        if (ms0VarArr[5].a.size() != 0 || ms0VarArr[5].g) {
            return ms0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.g0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ms0[] ms0VarArr = this.d.v1;
        return (ms0VarArr[5].a.size() != 0 || ms0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 12) {
            xs0 xs0Var = this.d;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) xs0Var.v1[5].a.get(i7);
            TLRPC.Document F0 = ijVar.F0();
            if (F0 != null) {
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ijVar.k.date, ijVar, F0);
                    if (xs0Var.E1) {
                        h2Var.c(xs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > xs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == xs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.f1()) >= 0, !xs0Var.d1);
                    } else {
                        h2Var.c(false, !xs0Var.d1);
                    }
                }
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.c;
        if (i7 == 11) {
            r3 X = xs0.X(5, xs0Var.l1, context, f6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new xi0(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, f6Var, true);
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
