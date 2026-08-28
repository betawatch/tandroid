package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oe1 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ re1 c;

    public oe1(re1 re1Var) {
        this.c = re1Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 3 || i9 == 2;
    }

    @Override // f2.r0
    public final int h() {
        re1 re1Var = this.c;
        if (re1Var.h0) {
            return 0;
        }
        return re1Var.g0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        re1 re1Var = this.c;
        if (i9 == re1Var.d0 || i9 == re1Var.a0) {
            return 1;
        }
        if (i9 < re1Var.b0 || i9 >= re1Var.c0) {
            return (i9 < re1Var.e0 || i9 >= re1Var.f0) ? 0 : 3;
        }
        return 2;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        View view = q1Var.a;
        re1 re1Var = this.c;
        we1 we1Var = re1Var.p0;
        if (j(i9) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 == re1Var.a0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i9 == re1Var.d0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i9) == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.setTopic((TLRPC.TL_forumTopic) re1Var.V.get(i9 - re1Var.b0));
            paVar.d = i9 != re1Var.c0 - 1;
        }
        if (j(i9) == 3) {
            MessageObject messageObject = (MessageObject) re1Var.W.get(i9 - re1Var.e0);
            se1 se1Var = (se1) view;
            se1Var.S4 = i9 != re1Var.f0 - 1;
            i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = we1Var.s.findTopic(we1Var.a, topicId);
            if (findTopic != null) {
                se1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
                se1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.se1] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        boolean z10;
        we1 we1Var = this.c.p0;
        if (i9 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i9 == 2) {
            frameLayout = new org.telegram.ui.Cells.pa(viewGroup.getContext());
        } else {
            if (i9 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? se1Var = new se1(we1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.o2) we1Var).inPreviewMode;
            se1Var.g0 = z10;
            frameLayout = se1Var;
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
