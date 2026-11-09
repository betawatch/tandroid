package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pr0 extends pj0 {
    public final Context c;
    public final /* synthetic */ zs0 d;

    public pr0(zs0 zs0Var, Context context) {
        this.d = zs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        os0[] os0VarArr = this.d.v1;
        return os0VarArr[5].a.size() != 0 || os0VarArr[5].g;
    }

    @Override // v4.g0
    public final int b() {
        os0[] os0VarArr = this.d.v1;
        if (os0VarArr[5].a.size() != 0 || os0VarArr[5].g) {
            return os0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // v4.g0
    public final long c(int i7) {
        return i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        os0[] os0VarArr = this.d.v1;
        return (os0VarArr[5].a.size() != 0 || os0VarArr[5].g) ? 12 : 11;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 12) {
            zs0 zs0Var = this.d;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) zs0Var.v1[5].a.get(i7);
            TLRPC.Document F0 = ijVar.F0();
            if (F0 != null) {
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ijVar.k.date, ijVar, F0);
                    if (zs0Var.E1) {
                        h2Var.c(zs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > zs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == zs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, !zs0Var.d1);
                    } else {
                        h2Var.c(false, !zs0Var.d1);
                    }
                }
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        zs0 zs0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.c;
        if (i7 == 11) {
            r3 X = zs0.X(5, zs0Var.l1, context, g6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new yi0(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, g6Var, true);
        h2Var.setCanPreviewGif(true);
        return new yi0(h2Var);
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
