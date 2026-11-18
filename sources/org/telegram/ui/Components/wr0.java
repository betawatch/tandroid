package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wr0 extends bk0 {
    public final Context c;
    public final /* synthetic */ gt0 d;

    public wr0(gt0 gt0Var, Context context) {
        this.d = gt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        vs0[] vs0VarArr = this.d.w1;
        return vs0VarArr[5].a.size() != 0 || vs0VarArr[5].g;
    }

    @Override // v4.i0
    public final int b() {
        vs0[] vs0VarArr = this.d.w1;
        if (vs0VarArr[5].a.size() != 0 || vs0VarArr[5].g) {
            return vs0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.i0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        vs0[] vs0VarArr = this.d.w1;
        return (vs0VarArr[5].a.size() != 0 || vs0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 12) {
            gt0 gt0Var = this.d;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) gt0Var.w1[5].a.get(i7);
            TLRPC.Document F0 = fjVar.F0();
            if (F0 != null) {
                View view = f1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(fjVar.k.date, fjVar, F0);
                    if (gt0Var.F1) {
                        h2Var.c(gt0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > gt0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == gt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, !gt0Var.e1);
                    } else {
                        h2Var.c(false, !gt0Var.e1);
                    }
                }
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        gt0 gt0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.c;
        if (i7 == 11) {
            x3 X = gt0.X(5, gt0Var.m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new kj0(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, i6Var, true);
        h2Var.setCanPreviewGif(true);
        return new kj0(h2Var);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        View view = f1Var.a;
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
