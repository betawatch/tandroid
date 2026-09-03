package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lf1 extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ of1 c;

    public lf1(of1 of1Var) {
        this.c = of1Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.o0
    public final int h() {
        of1 of1Var = this.c;
        if (of1Var.i0) {
            return 0;
        }
        return of1Var.h0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        of1 of1Var = this.c;
        if (i10 == of1Var.e0 || i10 == of1Var.b0) {
            return 1;
        }
        if (i10 < of1Var.c0 || i10 >= of1Var.d0) {
            return (i10 < of1Var.f0 || i10 >= of1Var.g0) ? 0 : 3;
        }
        return 2;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        View view = l1Var.a;
        of1 of1Var = this.c;
        sf1 sf1Var = of1Var.q0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (i10 == of1Var.b0) {
                t3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == of1Var.e0) {
                t3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.na naVar = (org.telegram.ui.Cells.na) view;
            naVar.setTopic((TLRPC.TL_forumTopic) of1Var.W.get(i10 - of1Var.c0));
            naVar.d = i10 != of1Var.d0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) of1Var.a0.get(i10 - of1Var.f0);
            pf1 pf1Var = (pf1) view;
            pf1Var.T4 = i10 != of1Var.g0 - 1;
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = sf1Var.s.findTopic(sf1Var.a, topicId);
            if (findTopic != null) {
                pf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                pf1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.q2, org.telegram.ui.pf1] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z4;
        sf1 sf1Var = this.c.q0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.t3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.na(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? pf1Var = new pf1(sf1Var, viewGroup.getContext(), true);
            z4 = ((org.telegram.ui.ActionBar.p2) sf1Var).inPreviewMode;
            pf1Var.h0 = z4;
            frameLayout = pf1Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.dl0(frameLayout);
    }
}
