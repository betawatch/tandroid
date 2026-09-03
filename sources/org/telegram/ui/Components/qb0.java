package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qb0 extends f2.o0 {
    public final /* synthetic */ rb0 c;

    public qb0(rb0 rb0Var) {
        this.c = rb0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z4) {
        int C;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Wc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = s1Var.Z3) == null) {
                    s1Var.u3(true);
                    int i11 = s1Var.o0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    C = s1Var.q1 ? org.telegram.messenger.y3.C(10.0f, s1Var.j2, i11) : i11;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    C = (int) s1Var.n4;
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
                                lineBottom = (z4 ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, r1Var) + C + textLayoutBlock.padTop;
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
        rb0 rb0Var = this.c;
        jb0 jb0Var = rb0Var.f;
        int i11 = rb0Var.a;
        MessagePreviewParams.Messages messages = rb0Var.r;
        if (messages != null && l1Var.f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) l1Var.a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.Z3(jb0Var.getMeasuredWidth(), jb0Var.getMeasuredHeight());
            int id2 = s1Var.getMessageObject() != null ? s1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                rb0Var.W.d.checkCurrentLink(rb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = rb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = rb0Var.r;
            s1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                s1Var.setDelegate(new h7.u(16));
            }
            if (rb0Var.r.previewMessages.size() > 1) {
                s1Var.J3(i11 == 1, false);
                boolean z4 = id2 == rb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = rb0Var.r;
                boolean z10 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.L3(z10, z10, z4);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        rb0 rb0Var = this.c;
        xb0 xb0Var = rb0Var.W;
        ob0 ob0Var = new ob0(this, context, xb0Var.w, rb0Var.G, xb0Var.C);
        ob0Var.setClipChildren(false);
        ob0Var.setClipToPadding(false);
        ob0Var.setDelegate(new pb0(this));
        return new dl0(ob0Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10;
        MessageObject c3;
        rb0 rb0Var = this.c;
        ib0 ib0Var = rb0Var.e;
        xb0 xb0Var = rb0Var.W;
        if (rb0Var.r == null || (i10 = rb0Var.a) == 1) {
            return;
        }
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            if (i10 != 0) {
                s1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = rb0.a(rb0Var, s1Var.getMessageObject());
            s1Var.setDrawSelectionBackground(a2 == null);
            s1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = xb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || s1Var.getMessageObject() == null || (c3 = rb0Var.c(null)) == null) {
                return;
            }
            if ((s1Var.getMessageObject() == c3 || s1Var.getMessageObject().getId() == c3.getId()) && !ib0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = xb0Var.d;
                ib0Var.a0(s1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (rb0Var.V) {
                    rb0Var.I = D(s1Var, xb0Var.d.quoteStart, false);
                    rb0Var.J = D(s1Var, xb0Var.d.quoteEnd, true);
                    rb0Var.K = true;
                    rb0Var.V = false;
                }
            }
        }
    }
}
