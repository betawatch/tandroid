package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (xv0Var.C1) {
                        e2Var.c(xv0Var.Z0[(messageObject.getDialogId() > xv0Var.j1 ? 1 : (messageObject.getDialogId() == xv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !xv0Var.b1);
                    } else {
                        e2Var.c(false, !xv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            ku0 N = xv0.N(5, xv0Var.j1, context, g6Var);
            N.setLayoutParams(new s4.o0(-1, -1));
            return new wl0(N);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, g6Var, true);
        e2Var.setCanPreviewGif(true);
        return new wl0(e2Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
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
