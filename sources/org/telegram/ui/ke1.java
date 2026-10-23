package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ke1 extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ ne1 c;

    public ke1(ne1 ne1Var) {
        this.c = ne1Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        ne1 ne1Var = this.c;
        if (ne1Var.l0) {
            return 0;
        }
        return ne1Var.k0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        ne1 ne1Var = this.c;
        if (i10 == ne1Var.h0 || i10 == ne1Var.e0) {
            return 1;
        }
        if (i10 < ne1Var.f0 || i10 >= ne1Var.g0) {
            return (i10 < ne1Var.i0 || i10 >= ne1Var.j0) ? 0 : 3;
        }
        return 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        ne1 ne1Var = this.c;
        re1 re1Var = ne1Var.t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == ne1Var.e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ne1Var.h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.setTopic((TLRPC.TL_forumTopic) ne1Var.c0.get(i10 - ne1Var.f0));
            paVar.d = i10 != ne1Var.g0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ne1Var.d0.get(i10 - ne1Var.i0);
            oe1 oe1Var = (oe1) view;
            oe1Var.a5 = i10 != ne1Var.j0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = re1Var.s.findTopic(re1Var.a, topicId);
            if (findTopic != null) {
                oe1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                oe1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.r2, org.telegram.ui.oe1] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        re1 re1Var = this.c.t0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.pa(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? oe1Var = new oe1(re1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) re1Var).inPreviewMode;
            oe1Var.k0 = z10;
            frameLayout = oe1Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.tl0(frameLayout);
    }
}
