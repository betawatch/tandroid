package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class iu0 extends im0 {
    public final Context c;
    public final /* synthetic */ uv0 d;

    public iu0(uv0 uv0Var, Context context) {
        this.d = uv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        jv0[] jv0VarArr = this.d.t1;
        return jv0VarArr[5].a.size() != 0 || jv0VarArr[5].g;
    }

    @Override // s4.g0
    public final int h() {
        jv0[] jv0VarArr = this.d.t1;
        if (jv0VarArr[5].a.size() != 0 || jv0VarArr[5].g) {
            return jv0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        jv0[] jv0VarArr = this.d.t1;
        return (jv0VarArr[5].a.size() != 0 || jv0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 12) {
            uv0 uv0Var = this.d;
            MessageObject messageObject = (MessageObject) uv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (uv0Var.C1) {
                        f2Var.c(uv0Var.Z0[(messageObject.getDialogId() > uv0Var.j1 ? 1 : (messageObject.getDialogId() == uv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !uv0Var.b1);
                    } else {
                        f2Var.c(false, !uv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        uv0 uv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            hu0 M = uv0.M(5, uv0Var.j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new tl0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new tl0(f2Var);
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
