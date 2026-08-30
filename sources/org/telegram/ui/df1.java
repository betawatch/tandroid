package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class df1 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ gf1 c;

    public df1(gf1 gf1Var) {
        this.c = gf1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.o0
    public final int h() {
        gf1 gf1Var = this.c;
        if (gf1Var.i0) {
            return 0;
        }
        return gf1Var.h0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        gf1 gf1Var = this.c;
        if (i10 == gf1Var.e0 || i10 == gf1Var.b0) {
            return 1;
        }
        if (i10 < gf1Var.c0 || i10 >= gf1Var.d0) {
            return (i10 < gf1Var.f0 || i10 >= gf1Var.g0) ? 0 : 3;
        }
        return 2;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        View view = l1Var.a;
        gf1 gf1Var = this.c;
        kf1 kf1Var = gf1Var.q0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == gf1Var.b0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == gf1Var.e0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
            oaVar.setTopic((TLRPC.TL_forumTopic) gf1Var.W.get(i10 - gf1Var.c0));
            oaVar.d = i10 != gf1Var.d0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) gf1Var.a0.get(i10 - gf1Var.f0);
            hf1 hf1Var = (hf1) view;
            hf1Var.T4 = i10 != gf1Var.g0 - 1;
            i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = kf1Var.s.findTopic(kf1Var.a, topicId);
            if (findTopic != null) {
                hf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                hf1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.hf1] */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z4;
        kf1 kf1Var = this.c.q0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.oa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? hf1Var = new hf1(kf1Var, viewGroup.getContext(), true);
            z4 = ((org.telegram.ui.ActionBar.p2) kf1Var).inPreviewMode;
            hf1Var.h0 = z4;
            frameLayout = hf1Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
