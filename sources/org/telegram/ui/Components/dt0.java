package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dt0 extends il0 {
    public final Context c;
    public final /* synthetic */ qu0 d;

    public dt0(qu0 qu0Var, Context context) {
        this.d = qu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        fu0[] fu0VarArr = this.d.p1;
        return fu0VarArr[5].a.size() != 0 || fu0VarArr[5].g;
    }

    @Override // f2.p0
    public final int h() {
        fu0[] fu0VarArr = this.d.p1;
        if (fu0VarArr[5].a.size() != 0 || fu0VarArr[5].g) {
            return fu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        fu0[] fu0VarArr = this.d.p1;
        return (fu0VarArr[5].a.size() != 0 || fu0VarArr[5].g) ? 12 : 11;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f == 12) {
            qu0 qu0Var = this.d;
            MessageObject messageObject = (MessageObject) qu0Var.p1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = n1Var.a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (qu0Var.y1) {
                        d2Var.c(qu0Var.V0[(messageObject.getDialogId() > qu0Var.f1 ? 1 : (messageObject.getDialogId() == qu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !qu0Var.X0);
                    } else {
                        d2Var.c(false, !qu0Var.X0);
                    }
                }
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.c;
        if (i10 == 11) {
            ct0 M = qu0.M(5, qu0Var.f1, context, c6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new vk0(M);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, c6Var, true);
        d2Var.setCanPreviewGif(true);
        return new vk0(d2Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.d2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) view).getPhotoImage();
            if (this.d.g0[0].B == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
            } else {
                photoImage.setAllowStartAnimation(false);
                photoImage.stopAnimation();
            }
        }
    }
}
