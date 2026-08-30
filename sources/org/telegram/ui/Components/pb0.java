package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pb0 extends f2.o0 {
    public final /* synthetic */ qb0 c;

    public pb0(qb0 qb0Var) {
        this.c = qb0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z4) {
        int C;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Wc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = t1Var.Z3) == null) {
                    t1Var.u3(true);
                    int i11 = t1Var.o0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    C = t1Var.q1 ? org.telegram.messenger.y3.C(10.0f, t1Var.j2, i11) : i11;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    C = (int) t1Var.n4;
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
                                lineBottom = C + ((int) (textLayoutBlock.textYOffset(arrayList, s1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                lineBottom = (z4 ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, s1Var) + C + textLayoutBlock.padTop;
                            }
                            return (int) lineBottom;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // f2.o0
    public final int h() {
        MessagePreviewParams.Messages messages = this.c.r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        qb0 qb0Var = this.c;
        ib0 ib0Var = qb0Var.f;
        int i11 = qb0Var.a;
        MessagePreviewParams.Messages messages = qb0Var.r;
        if (messages != null && l1Var.f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) l1Var.a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(ib0Var.getMeasuredWidth(), ib0Var.getMeasuredHeight());
            int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                qb0Var.W.d.checkCurrentLink(qb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = qb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = qb0Var.r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                t1Var.setDelegate(new ab.a(16));
            }
            if (qb0Var.r.previewMessages.size() > 1) {
                t1Var.J3(i11 == 1, false);
                boolean z4 = id2 == qb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = qb0Var.r;
                boolean z10 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z10, z10, z4);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        qb0 qb0Var = this.c;
        wb0 wb0Var = qb0Var.W;
        nb0 nb0Var = new nb0(this, context, wb0Var.w, qb0Var.G, wb0Var.C);
        nb0Var.setClipChildren(false);
        nb0Var.setClipToPadding(false);
        nb0Var.setDelegate(new ob0(this));
        return new el0(nb0Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10;
        MessageObject c3;
        qb0 qb0Var = this.c;
        hb0 hb0Var = qb0Var.e;
        wb0 wb0Var = qb0Var.W;
        if (qb0Var.r == null || (i10 = qb0Var.a) == 1) {
            return;
        }
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            if (i10 != 0) {
                t1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = qb0.a(qb0Var, t1Var.getMessageObject());
            t1Var.setDrawSelectionBackground(a2 == null);
            t1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = wb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || t1Var.getMessageObject() == null || (c3 = qb0Var.c(null)) == null) {
                return;
            }
            if ((t1Var.getMessageObject() == c3 || t1Var.getMessageObject().getId() == c3.getId()) && !hb0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = wb0Var.d;
                hb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (qb0Var.V) {
                    qb0Var.I = D(t1Var, wb0Var.d.quoteStart, false);
                    qb0Var.J = D(t1Var, wb0Var.d.quoteEnd, true);
                    qb0Var.K = true;
                    qb0Var.V = false;
                }
            }
        }
    }
}
