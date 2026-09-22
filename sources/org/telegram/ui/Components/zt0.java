package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zt0 extends xl0 {
    public final Context c;
    public final /* synthetic */ lv0 d;

    public zt0(lv0 lv0Var, Context context) {
        this.d = lv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        av0[] av0VarArr = this.d.t1;
        return av0VarArr[5].a.size() != 0 || av0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        av0[] av0VarArr = this.d.t1;
        if (av0VarArr[5].a.size() != 0 || av0VarArr[5].g) {
            return av0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        av0[] av0VarArr = this.d.t1;
        return (av0VarArr[5].a.size() != 0 || av0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            lv0 lv0Var = this.d;
            MessageObject messageObject = (MessageObject) lv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (lv0Var.C1) {
                        f2Var.c(lv0Var.Z0[(messageObject.getDialogId() > lv0Var.j1 ? 1 : (messageObject.getDialogId() == lv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !lv0Var.b1);
                    } else {
                        f2Var.c(false, !lv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            yt0 M = lv0.M(5, lv0Var.j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new il0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, f6Var, true);
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
