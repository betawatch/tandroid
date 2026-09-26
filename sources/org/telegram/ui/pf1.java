package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pf1 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ sf1 c;

    public pf1(sf1 sf1Var) {
        this.c = sf1Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        sf1 sf1Var = this.c;
        if (sf1Var.l0) {
            return 0;
        }
        return sf1Var.k0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        sf1 sf1Var = this.c;
        if (i10 == sf1Var.h0 || i10 == sf1Var.e0) {
            return 1;
        }
        if (i10 < sf1Var.f0 || i10 >= sf1Var.g0) {
            return (i10 < sf1Var.i0 || i10 >= sf1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        sf1 sf1Var = this.c;
        wf1 wf1Var = sf1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == sf1Var.e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == sf1Var.h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) sf1Var.c0.get(i10 - sf1Var.f0));
            saVar.d = i10 != sf1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) sf1Var.d0.get(i10 - sf1Var.i0);
            tf1 tf1Var = (tf1) view;
            tf1Var.W4 = i10 != sf1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = wf1Var.s.findTopic(wf1Var.a, topicId);
            if (findTopic != null) {
                tf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                tf1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.s2, org.telegram.ui.tf1] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        wf1 wf1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? tf1Var = new tf1(wf1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.m2) wf1Var).inPreviewMode;
            tf1Var.k0 = z10;
            frameLayout = tf1Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(frameLayout);
    }
}
