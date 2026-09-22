package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mt0 extends kl0 {
    public final Context c;
    public final /* synthetic */ yu0 d;

    public mt0(yu0 yu0Var, Context context) {
        this.d = yu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        nu0[] nu0VarArr = this.d.t1;
        return nu0VarArr[5].a.size() != 0 || nu0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        nu0[] nu0VarArr = this.d.t1;
        if (nu0VarArr[5].a.size() != 0 || nu0VarArr[5].g) {
            return nu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        nu0[] nu0VarArr = this.d.t1;
        return (nu0VarArr[5].a.size() != 0 || nu0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            yu0 yu0Var = this.d;
            MessageObject messageObject = (MessageObject) yu0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (yu0Var.C1) {
                        e2Var.c(yu0Var.Z0[(messageObject.getDialogId() > yu0Var.j1 ? 1 : (messageObject.getDialogId() == yu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !yu0Var.b1);
                    } else {
                        e2Var.c(false, !yu0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = yu0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            lt0 M = yu0.M(5, yu0Var.j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new vk0(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, e6Var, true);
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
