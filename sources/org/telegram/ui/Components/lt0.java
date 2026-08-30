package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lt0 extends rl0 {
    public final Context c;
    public final /* synthetic */ yu0 d;

    public lt0(yu0 yu0Var, Context context) {
        this.d = yu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        nu0[] nu0VarArr = this.d.q1;
        return nu0VarArr[5].a.size() != 0 || nu0VarArr[5].g;
    }

    @Override // f2.o0
    public final int h() {
        nu0[] nu0VarArr = this.d.q1;
        if (nu0VarArr[5].a.size() != 0 || nu0VarArr[5].g) {
            return nu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        nu0[] nu0VarArr = this.d.q1;
        return (nu0VarArr[5].a.size() != 0 || nu0VarArr[5].g) ? 12 : 11;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f == 12) {
            yu0 yu0Var = this.d;
            MessageObject messageObject = (MessageObject) yu0Var.q1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = l1Var.a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (yu0Var.z1) {
                        e2Var.c(yu0Var.W0[(messageObject.getDialogId() > yu0Var.g1 ? 1 : (messageObject.getDialogId() == yu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !yu0Var.Y0);
                    } else {
                        e2Var.c(false, !yu0Var.Y0);
                    }
                }
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.c;
        if (i10 == 11) {
            kt0 M = yu0.M(5, yu0Var.g1, context, f6Var);
            M.setLayoutParams(new f2.w0(-1, -1));
            return new el0(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, f6Var, true);
        e2Var.setCanPreviewGif(true);
        return new el0(e2Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        View view = l1Var.a;
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
