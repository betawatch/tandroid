package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gu0 extends hm0 {
    public final Context c;
    public final /* synthetic */ sv0 d;

    public gu0(sv0 sv0Var, Context context) {
        this.d = sv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        hv0[] hv0VarArr = this.d.t1;
        return hv0VarArr[5].a.size() != 0 || hv0VarArr[5].g;
    }

    @Override // s4.g0
    public final int h() {
        hv0[] hv0VarArr = this.d.t1;
        if (hv0VarArr[5].a.size() != 0 || hv0VarArr[5].g) {
            return hv0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        hv0[] hv0VarArr = this.d.t1;
        return (hv0VarArr[5].a.size() != 0 || hv0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 12) {
            sv0 sv0Var = this.d;
            MessageObject messageObject = (MessageObject) sv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (sv0Var.C1) {
                        f2Var.c(sv0Var.Z0[(messageObject.getDialogId() > sv0Var.j1 ? 1 : (messageObject.getDialogId() == sv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !sv0Var.b1);
                    } else {
                        f2Var.c(false, !sv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        sv0 sv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            fu0 M = sv0.M(5, sv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new sl0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new sl0(f2Var);
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
