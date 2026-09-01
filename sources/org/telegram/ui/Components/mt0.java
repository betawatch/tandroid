package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mt0 extends sl0 {
    public final Context c;
    public final /* synthetic */ zu0 d;

    public mt0(zu0 zu0Var, Context context) {
        this.d = zu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        ou0[] ou0VarArr = this.d.q1;
        return ou0VarArr[5].a.size() != 0 || ou0VarArr[5].g;
    }

    @Override // f2.p0
    public final int h() {
        ou0[] ou0VarArr = this.d.q1;
        if (ou0VarArr[5].a.size() != 0 || ou0VarArr[5].g) {
            return ou0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ou0[] ou0VarArr = this.d.q1;
        return (ou0VarArr[5].a.size() != 0 || ou0VarArr[5].g) ? 12 : 11;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f == 12) {
            zu0 zu0Var = this.d;
            MessageObject messageObject = (MessageObject) zu0Var.q1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = m1Var.a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (zu0Var.z1) {
                        e2Var.c(zu0Var.W0[(messageObject.getDialogId() > zu0Var.g1 ? 1 : (messageObject.getDialogId() == zu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !zu0Var.Y0);
                    } else {
                        e2Var.c(false, !zu0Var.Y0);
                    }
                }
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.c;
        if (i10 == 11) {
            lt0 M = zu0.M(5, zu0Var.g1, context, g6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new fl0(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, g6Var, true);
        e2Var.setCanPreviewGif(true);
        return new fl0(e2Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.h0[0].C == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
            } else {
                photoImage.setAllowStartAnimation(false);
                photoImage.stopAnimation();
            }
        }
    }
}
