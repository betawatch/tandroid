package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xr0 extends dk0 {
    public final Context c;
    public final /* synthetic */ it0 d;

    public xr0(it0 it0Var, Context context) {
        this.d = it0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        xs0[] xs0VarArr = this.d.w1;
        return xs0VarArr[5].a.size() != 0 || xs0VarArr[5].g;
    }

    @Override // v4.i0
    public final int b() {
        xs0[] xs0VarArr = this.d.w1;
        if (xs0VarArr[5].a.size() != 0 || xs0VarArr[5].g) {
            return xs0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        xs0[] xs0VarArr = this.d.w1;
        return (xs0VarArr[5].a.size() != 0 || xs0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 12) {
            it0 it0Var = this.d;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) it0Var.w1[5].a.get(i7);
            TLRPC.Document F0 = fjVar.F0();
            if (F0 != null) {
                View view = f1Var.a;
                if (view instanceof org.telegram.ui.Cells.i2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                    i2Var.d(fjVar.k.date, fjVar, F0);
                    if (it0Var.F1) {
                        i2Var.c(it0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > it0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == it0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, !it0Var.e1);
                    } else {
                        i2Var.c(false, !it0Var.e1);
                    }
                }
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.c;
        if (i7 == 11) {
            x3 X = it0.X(5, it0Var.m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new mj0(X);
        }
        org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(context, i6Var, true);
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
                photoImage.Q0(false);
            } else {
                photoImage.u0 = false;
                photoImage.R0();
            }
        }
    }
}
