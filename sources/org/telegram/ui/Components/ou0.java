package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ou0 extends lm0 {
    public final Context c;
    public final /* synthetic */ aw0 d;

    public ou0(aw0 aw0Var, Context context) {
        this.d = aw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        pv0[] pv0VarArr = this.d.v1;
        return pv0VarArr[5].a.size() != 0 || pv0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        pv0[] pv0VarArr = this.d.v1;
        if (pv0VarArr[5].a.size() != 0 || pv0VarArr[5].g) {
            return pv0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        pv0[] pv0VarArr = this.d.v1;
        return (pv0VarArr[5].a.size() != 0 || pv0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f == 12) {
            aw0 aw0Var = this.d;
            MessageObject messageObject = (MessageObject) aw0Var.v1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = e1Var.a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (aw0Var.E1) {
                        d2Var.c(aw0Var.b1[(messageObject.getDialogId() > aw0Var.l1 ? 1 : (messageObject.getDialogId() == aw0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !aw0Var.d1);
                    } else {
                        d2Var.c(false, !aw0Var.d1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        aw0 aw0Var = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.c;
        if (i10 == 11) {
            nu0 U = aw0.U(5, aw0Var.l1, context, u6Var);
            U.setLayoutParams(new s4.q0(-1, -1));
            return new vl0(U);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, u6Var, true);
        d2Var.setCanPreviewGif(true);
        return new vl0(d2Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.d2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) view).getPhotoImage();
            if (this.d.m0[0].E == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
            } else {
                photoImage.setAllowStartAnimation(false);
                photoImage.stopAnimation();
            }
        }
    }
}
