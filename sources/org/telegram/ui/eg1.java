package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class eg1 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ hg1 c;

    public eg1(hg1 hg1Var) {
        this.c = hg1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        hg1 hg1Var = this.c;
        if (hg1Var.l0) {
            return 0;
        }
        return hg1Var.k0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        hg1 hg1Var = this.c;
        if (i10 == hg1Var.h0 || i10 == hg1Var.e0) {
            return 1;
        }
        if (i10 < hg1Var.f0 || i10 >= hg1Var.g0) {
            return (i10 < hg1Var.i0 || i10 >= hg1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        hg1 hg1Var = this.c;
        lg1 lg1Var = hg1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == hg1Var.e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == hg1Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) hg1Var.c0.get(i10 - hg1Var.f0));
            qaVar.d = i10 != hg1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) hg1Var.d0.get(i10 - hg1Var.i0);
            ig1 ig1Var = (ig1) view;
            ig1Var.a5 = i10 != hg1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = lg1Var.s.findTopic(lg1Var.a, topicId);
            if (findTopic != null) {
                ig1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                ig1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.s2, org.telegram.ui.ig1] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        lg1 lg1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? ig1Var = new ig1(lg1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.m2) lg1Var).inPreviewMode;
            ig1Var.k0 = z10;
            frameLayout = ig1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
