package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kb0 extends f2.p0 {
    public final /* synthetic */ lb0 c;

    public kb0(lb0 lb0Var) {
        this.c = lb0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        int C;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Vc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = s1Var.Y3) == null) {
                    s1Var.u3(true);
                    int i11 = s1Var.n0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    C = s1Var.p1 ? org.telegram.messenger.x3.C(10.0f, s1Var.i2, i11) : i11;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    C = (int) s1Var.m4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                }
                if (arrayList != null && charSequence != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i12);
                        StaticLayout staticLayout = textLayoutBlock.textLayout;
                        String charSequence3 = staticLayout.getText().toString();
                        int i13 = textLayoutBlock.charactersOffset;
                        if (i10 > i13) {
                            if (i10 - i13 > charSequence3.length() - 1) {
                                lineBottom = C + ((int) (textLayoutBlock.textYOffset(arrayList, r1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, r1Var) + C + textLayoutBlock.padTop;
                            }
                            return (int) lineBottom;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // f2.p0
    public final int h() {
        MessagePreviewParams.Messages messages = this.c.r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        lb0 lb0Var = this.c;
        eb0 eb0Var = lb0Var.f;
        int i11 = lb0Var.a;
        MessagePreviewParams.Messages messages = lb0Var.r;
        if (messages != null && n1Var.f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) n1Var.a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.Z3(eb0Var.getMeasuredWidth(), eb0Var.getMeasuredHeight());
            int id2 = s1Var.getMessageObject() != null ? s1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                lb0Var.V.d.checkCurrentLink(lb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = lb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = lb0Var.r;
            s1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                s1Var.setDelegate(new bb.a(17));
            }
            if (lb0Var.r.previewMessages.size() > 1) {
                s1Var.J3(i11 == 1, false);
                boolean z10 = id2 == lb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = lb0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        lb0 lb0Var = this.c;
        rb0 rb0Var = lb0Var.V;
        ib0 ib0Var = new ib0(this, context, rb0Var.w, lb0Var.F, rb0Var.B);
        ib0Var.setClipChildren(false);
        ib0Var.setClipToPadding(false);
        ib0Var.setDelegate(new jb0(this));
        return new vk0(ib0Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        int i10;
        MessageObject c3;
        lb0 lb0Var = this.c;
        db0 db0Var = lb0Var.e;
        rb0 rb0Var = lb0Var.V;
        if (lb0Var.r == null || (i10 = lb0Var.a) == 1) {
            return;
        }
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            if (i10 != 0) {
                s1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = lb0.a(lb0Var, s1Var.getMessageObject());
            s1Var.setDrawSelectionBackground(a2 == null);
            s1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = rb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || s1Var.getMessageObject() == null || (c3 = lb0Var.c(null)) == null) {
                return;
            }
            if ((s1Var.getMessageObject() == c3 || s1Var.getMessageObject().getId() == c3.getId()) && !db0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = rb0Var.d;
                db0Var.a0(s1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (lb0Var.U) {
                    lb0Var.H = D(s1Var, rb0Var.d.quoteStart, false);
                    lb0Var.I = D(s1Var, rb0Var.d.quoteEnd, true);
                    lb0Var.J = true;
                    lb0Var.U = false;
                }
            }
        }
    }
}
