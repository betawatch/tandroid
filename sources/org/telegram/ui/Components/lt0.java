package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class lt0 extends kl0 {
    public final Context c;
    public final /* synthetic */ xu0 d;

    public lt0(xu0 xu0Var, Context context) {
        this.d = xu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        mu0[] mu0VarArr = this.d.t1;
        return mu0VarArr[5].a.size() != 0 || mu0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        mu0[] mu0VarArr = this.d.t1;
        if (mu0VarArr[5].a.size() != 0 || mu0VarArr[5].g) {
            return mu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        mu0[] mu0VarArr = this.d.t1;
        return (mu0VarArr[5].a.size() != 0 || mu0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            xu0 xu0Var = this.d;
            MessageObject messageObject = (MessageObject) xu0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (xu0Var.C1) {
                        e2Var.c(xu0Var.Z0[(messageObject.getDialogId() > xu0Var.j1 ? 1 : (messageObject.getDialogId() == xu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !xu0Var.b1);
                    } else {
                        e2Var.c(false, !xu0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        xu0 xu0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            kt0 M = xu0.M(5, xu0Var.j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new vk0(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, f6Var, true);
        e2Var.setCanPreviewGif(true);
        return new vk0(e2Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
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
