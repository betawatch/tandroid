package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class xt0 extends vl0 {
    public final Context c;
    public final /* synthetic */ jv0 d;

    public xt0(jv0 jv0Var, Context context) {
        this.d = jv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        yu0[] yu0VarArr = this.d.t1;
        return yu0VarArr[5].a.size() != 0 || yu0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        yu0[] yu0VarArr = this.d.t1;
        if (yu0VarArr[5].a.size() != 0 || yu0VarArr[5].g) {
            return yu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        yu0[] yu0VarArr = this.d.t1;
        return (yu0VarArr[5].a.size() != 0 || yu0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            jv0 jv0Var = this.d;
            MessageObject messageObject = (MessageObject) jv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (jv0Var.C1) {
                        f2Var.c(jv0Var.Z0[(messageObject.getDialogId() > jv0Var.j1 ? 1 : (messageObject.getDialogId() == jv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !jv0Var.b1);
                    } else {
                        f2Var.c(false, !jv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            wt0 M = jv0.M(5, jv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new gl0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new gl0(f2Var);
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
