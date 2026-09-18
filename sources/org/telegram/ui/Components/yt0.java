package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class yt0 extends vl0 {
    public final Context c;
    public final /* synthetic */ kv0 d;

    public yt0(kv0 kv0Var, Context context) {
        this.d = kv0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        zu0[] zu0VarArr = this.d.t1;
        return zu0VarArr[5].a.size() != 0 || zu0VarArr[5].g;
    }

    @Override // s4.h0
    public final int h() {
        zu0[] zu0VarArr = this.d.t1;
        if (zu0VarArr[5].a.size() != 0 || zu0VarArr[5].g) {
            return zu0VarArr[5].a.size();
        }
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        zu0[] zu0VarArr = this.d.t1;
        return (zu0VarArr[5].a.size() != 0 || zu0VarArr[5].g) ? 12 : 11;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 12) {
            kv0 kv0Var = this.d;
            MessageObject messageObject = (MessageObject) kv0Var.t1[5].a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (kv0Var.C1) {
                        f2Var.c(kv0Var.Z0[(messageObject.getDialogId() > kv0Var.j1 ? 1 : (messageObject.getDialogId() == kv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !kv0Var.b1);
                    } else {
                        f2Var.c(false, !kv0Var.b1);
                    }
                }
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        kv0 kv0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = kv0Var.F1;
        Context context = this.c;
        if (i10 == 11) {
            xt0 M = kv0.M(5, kv0Var.j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new gl0(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, e6Var, true);
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
