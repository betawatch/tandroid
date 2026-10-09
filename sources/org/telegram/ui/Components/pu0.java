package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pu0 extends pm0 {
    public final Context c;
    public final /* synthetic */ bw0 d;

    public pu0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        qv0[] qv0VarArr = this.d.t1;
        return qv0VarArr[5].a.size() != 0 || qv0VarArr[5].g;
    }

    @Override // s4.i0
    public final int h() {
        qv0[] qv0VarArr = this.d.t1;
        if (qv0VarArr[5].a.size() != 0 || qv0VarArr[5].g) {
            return qv0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.i0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.i0
    public final int j(int i10) {
        qv0[] qv0VarArr = this.d.t1;
        return (qv0VarArr[5].a.size() != 0 || qv0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f == 12) {
            bw0 bw0Var = this.d;
            MessageObject messageObject = (MessageObject) bw0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (bw0Var.C1) {
                        f2Var.c(bw0Var.Z0[(messageObject.getDialogId() > bw0Var.j1 ? 1 : (messageObject.getDialogId() == bw0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !bw0Var.b1);
                    } else {
                        f2Var.c(false, !bw0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            ou0 M = bw0.M(5, bw0Var.j1, context, e6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new am0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, e6Var, true);
        f2Var.setCanPreviewGif(true);
        return new am0(f2Var);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        View view = d1Var.a;
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
