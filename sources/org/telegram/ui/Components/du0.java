package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class du0 extends yl0 {
    public final Context c;
    public final /* synthetic */ pv0 d;

    public du0(pv0 pv0Var, Context context) {
        this.d = pv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        ev0[] ev0VarArr = this.d.t1;
        return ev0VarArr[5].a.size() != 0 || ev0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        ev0[] ev0VarArr = this.d.t1;
        if (ev0VarArr[5].a.size() != 0 || ev0VarArr[5].g) {
            return ev0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ev0[] ev0VarArr = this.d.t1;
        return (ev0VarArr[5].a.size() != 0 || ev0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            pv0 pv0Var = this.d;
            MessageObject messageObject = (MessageObject) pv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (pv0Var.C1) {
                        f2Var.c(pv0Var.Z0[(messageObject.getDialogId() > pv0Var.j1 ? 1 : (messageObject.getDialogId() == pv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !pv0Var.b1);
                    } else {
                        f2Var.c(false, !pv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        pv0 pv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = pv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            cu0 M = pv0.M(5, pv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new il0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new il0(f2Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
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
