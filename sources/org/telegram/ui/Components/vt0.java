package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vt0 extends ul0 {
    public final Context c;
    public final /* synthetic */ iv0 d;

    public vt0(iv0 iv0Var, Context context) {
        this.d = iv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        xu0[] xu0VarArr = this.d.t1;
        return xu0VarArr[5].a.size() != 0 || xu0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        xu0[] xu0VarArr = this.d.t1;
        if (xu0VarArr[5].a.size() != 0 || xu0VarArr[5].g) {
            return xu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        xu0[] xu0VarArr = this.d.t1;
        return (xu0VarArr[5].a.size() != 0 || xu0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            iv0 iv0Var = this.d;
            MessageObject messageObject = (MessageObject) iv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (iv0Var.C1) {
                        e2Var.c(iv0Var.Z0[(messageObject.getDialogId() > iv0Var.j1 ? 1 : (messageObject.getDialogId() == iv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !iv0Var.b1);
                    } else {
                        e2Var.c(false, !iv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        iv0 iv0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            ut0 M = iv0.M(5, iv0Var.j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new fl0(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, f6Var, true);
        e2Var.setCanPreviewGif(true);
        return new fl0(e2Var);
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
