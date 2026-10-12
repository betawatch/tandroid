package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lu0 extends lm0 {
    public final Context c;
    public final /* synthetic */ xv0 d;

    public lu0(xv0 xv0Var, Context context) {
        this.d = xv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        mv0[] mv0VarArr = this.d.t1;
        return mv0VarArr[5].a.size() != 0 || mv0VarArr[5].g;
    }

    @Override // s4.g0
    public final int h() {
        mv0[] mv0VarArr = this.d.t1;
        if (mv0VarArr[5].a.size() != 0 || mv0VarArr[5].g) {
            return mv0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        mv0[] mv0VarArr = this.d.t1;
        return (mv0VarArr[5].a.size() != 0 || mv0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 12) {
            xv0 xv0Var = this.d;
            MessageObject messageObject = (MessageObject) xv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (xv0Var.C1) {
                        f2Var.c(xv0Var.Z0[(messageObject.getDialogId() > xv0Var.j1 ? 1 : (messageObject.getDialogId() == xv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !xv0Var.b1);
                    } else {
                        f2Var.c(false, !xv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            ku0 M = xv0.M(5, xv0Var.j1, context, c6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new wl0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, c6Var, true);
        f2Var.setCanPreviewGif(true);
        return new wl0(f2Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
            } else {
                photoImage.setAllowStartAnimation(false);
                photoImage.stopAnimation();
            }
        }
    }
}
