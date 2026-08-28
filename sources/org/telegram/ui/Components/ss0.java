package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ss0 extends vk0 {
    public final Context c;
    public final /* synthetic */ eu0 d;

    public ss0(eu0 eu0Var, Context context) {
        this.d = eu0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        tt0[] tt0VarArr = this.d.p1;
        return tt0VarArr[5].a.size() != 0 || tt0VarArr[5].g;
    }

    @Override // f2.r0
    public final int h() {
        tt0[] tt0VarArr = this.d.p1;
        if (tt0VarArr[5].a.size() != 0 || tt0VarArr[5].g) {
            return tt0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        tt0[] tt0VarArr = this.d.p1;
        return (tt0VarArr[5].a.size() != 0 || tt0VarArr[5].g) ? 12 : 11;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f == 12) {
            eu0 eu0Var = this.d;
            MessageObject messageObject = (MessageObject) eu0Var.p1[5].a.get(i9);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = q1Var.a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (eu0Var.y1) {
                        e2Var.c(eu0Var.V0[(messageObject.getDialogId() > eu0Var.f1 ? 1 : (messageObject.getDialogId() == eu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !eu0Var.X0);
                    } else {
                        e2Var.c(false, !eu0Var.X0);
                    }
                }
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.d;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.c;
        if (i9 == 11) {
            rs0 M = eu0.M(5, eu0Var.f1, context, b6Var);
            M.setLayoutParams(new f2.a1(-1, -1));
            return new ik0(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, b6Var, true);
        e2Var.setCanPreviewGif(true);
        return new ik0(e2Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
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
