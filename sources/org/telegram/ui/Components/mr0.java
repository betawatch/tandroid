package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mr0 extends sj0 {
    public final Context c;
    public final /* synthetic */ ws0 d;

    public mr0(ws0 ws0Var, Context context) {
        this.d = ws0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        ls0[] ls0VarArr = this.d.w1;
        return ls0VarArr[5].a.size() != 0 || ls0VarArr[5].g;
    }

    @Override // u4.h0
    public final int b() {
        ls0[] ls0VarArr = this.d.w1;
        if (ls0VarArr[5].a.size() != 0 || ls0VarArr[5].g) {
            return ls0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // u4.h0
    public final long c(int i3) {
        return i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        ls0[] ls0VarArr = this.d.w1;
        return (ls0VarArr[5].a.size() != 0 || ls0VarArr[5].g) ? 12 : 11;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f == 12) {
            ws0 ws0Var = this.d;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) ws0Var.w1[5].a.get(i3);
            TLRPC.Document F0 = ziVar.F0();
            if (F0 != null) {
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.h2) {
                    org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                    h2Var.d(ziVar.k.date, ziVar, F0);
                    if (ws0Var.F1) {
                        h2Var.c(ws0Var.c1[(org.telegram.messenger.zi.B0(ziVar.k) > ws0Var.m1 ? 1 : (org.telegram.messenger.zi.B0(ziVar.k) == ws0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) >= 0, !ws0Var.e1);
                    } else {
                        h2Var.c(false, !ws0Var.e1);
                    }
                }
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.c;
        if (i3 == 11) {
            p3 X = ws0.X(5, ws0Var.m1, context, e6Var);
            X.setLayoutParams(new u4.p0(-1, -1));
            return new bj0(X);
        }
        org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(context, e6Var, true);
        h2Var.setCanPreviewGif(true);
        return new bj0(h2Var);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        View view = d1Var.a;
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
