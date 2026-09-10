package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bg1 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ eg1 c;

    public bg1(eg1 eg1Var) {
        this.c = eg1Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        eg1 eg1Var = this.c;
        if (eg1Var.l0) {
            return 0;
        }
        return eg1Var.k0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        eg1 eg1Var = this.c;
        if (i10 == eg1Var.h0 || i10 == eg1Var.e0) {
            return 1;
        }
        if (i10 < eg1Var.f0 || i10 >= eg1Var.g0) {
            return (i10 < eg1Var.i0 || i10 >= eg1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        eg1 eg1Var = this.c;
        ig1 ig1Var = eg1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == eg1Var.e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == eg1Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            uaVar.setTopic((TLRPC.TL_forumTopic) eg1Var.c0.get(i10 - eg1Var.f0));
            uaVar.d = i10 != eg1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) eg1Var.d0.get(i10 - eg1Var.i0);
            fg1 fg1Var = (fg1) view;
            fg1Var.W4 = i10 != eg1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = ig1Var.s.findTopic(ig1Var.a, topicId);
            if (findTopic != null) {
                fg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                fg1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.fg1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        ig1 ig1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.ua(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? fg1Var = new fg1(ig1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.p2) ig1Var).inPreviewMode;
            fg1Var.k0 = z10;
            frameLayout = fg1Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.fl0(frameLayout);
    }
}
