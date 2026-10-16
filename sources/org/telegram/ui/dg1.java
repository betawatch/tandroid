package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dg1 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ gg1 c;

    public dg1(gg1 gg1Var) {
        this.c = gg1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        gg1 gg1Var = this.c;
        if (gg1Var.l0) {
            return 0;
        }
        return gg1Var.k0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        gg1 gg1Var = this.c;
        if (i10 == gg1Var.h0 || i10 == gg1Var.e0) {
            return 1;
        }
        if (i10 < gg1Var.f0 || i10 >= gg1Var.g0) {
            return (i10 < gg1Var.i0 || i10 >= gg1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        gg1 gg1Var = this.c;
        kg1 kg1Var = gg1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == gg1Var.e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == gg1Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) gg1Var.c0.get(i10 - gg1Var.f0));
            qaVar.d = i10 != gg1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) gg1Var.d0.get(i10 - gg1Var.i0);
            hg1 hg1Var = (hg1) view;
            hg1Var.a5 = i10 != gg1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = kg1Var.s.findTopic(kg1Var.a, topicId);
            if (findTopic != null) {
                hg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                hg1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.s2, org.telegram.ui.hg1] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        kg1 kg1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? hg1Var = new hg1(kg1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.m2) kg1Var).inPreviewMode;
            hg1Var.k0 = z10;
            frameLayout = hg1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
