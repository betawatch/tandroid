package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class me1 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ pe1 c;

    public me1(pe1 pe1Var) {
        this.c = pe1Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        pe1 pe1Var = this.c;
        if (pe1Var.l0) {
            return 0;
        }
        return pe1Var.k0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        pe1 pe1Var = this.c;
        if (i10 == pe1Var.h0 || i10 == pe1Var.e0) {
            return 1;
        }
        if (i10 < pe1Var.f0 || i10 >= pe1Var.g0) {
            return (i10 < pe1Var.i0 || i10 >= pe1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        pe1 pe1Var = this.c;
        te1 te1Var = pe1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == pe1Var.e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == pe1Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.setTopic((TLRPC.TL_forumTopic) pe1Var.c0.get(i10 - pe1Var.f0));
            paVar.d = i10 != pe1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) pe1Var.d0.get(i10 - pe1Var.i0);
            qe1 qe1Var = (qe1) view;
            qe1Var.a5 = i10 != pe1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = te1Var.s.findTopic(te1Var.a, topicId);
            if (findTopic != null) {
                qe1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                qe1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.qe1] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        te1 te1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.pa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? qe1Var = new qe1(te1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) te1Var).inPreviewMode;
            qe1Var.k0 = z10;
            frameLayout = qe1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
