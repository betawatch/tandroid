package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pe1 extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ se1 c;

    public pe1(se1 se1Var) {
        this.c = se1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 3 || i10 == 2;
    }

    @Override // f2.q0
    public final int h() {
        se1 se1Var = this.c;
        if (se1Var.h0) {
            return 0;
        }
        return se1Var.g0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        se1 se1Var = this.c;
        if (i10 == se1Var.d0 || i10 == se1Var.a0) {
            return 1;
        }
        if (i10 < se1Var.b0 || i10 >= se1Var.c0) {
            return (i10 < se1Var.e0 || i10 >= se1Var.f0) ? 0 : 3;
        }
        return 2;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        View view = o1Var.a;
        se1 se1Var = this.c;
        we1 we1Var = se1Var.p0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == se1Var.a0) {
                s3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == se1Var.d0) {
                s3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) se1Var.V.get(i10 - se1Var.b0));
            laVar.d = i10 != se1Var.c0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) se1Var.W.get(i10 - se1Var.e0);
            te1 te1Var = (te1) view;
            te1Var.S4 = i10 != se1Var.f0 - 1;
            i11 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = we1Var.s.findTopic(we1Var.a, topicId);
            if (findTopic != null) {
                te1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
                te1Var.setTopicIcon(findTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.telegram.ui.Cells.p2, org.telegram.ui.te1] */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        we1 we1Var = this.c.p0;
        if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            frameLayout = new org.telegram.ui.Cells.la(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            ?? te1Var = new te1(we1Var, viewGroup.getContext(), true);
            z10 = ((org.telegram.ui.ActionBar.n2) we1Var).inPreviewMode;
            te1Var.g0 = z10;
            frameLayout = te1Var;
        }
        frameLayout.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(frameLayout);
    }
}
