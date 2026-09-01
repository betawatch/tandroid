package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rb0 extends f2.p0 {
    public final /* synthetic */ sb0 c;

    public rb0(sb0 sb0Var) {
        this.c = sb0Var;
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
    public final void v(f2.m1 m1Var, int i10) {
        sb0 sb0Var = this.c;
        kb0 kb0Var = sb0Var.f;
        int i11 = sb0Var.a;
        MessagePreviewParams.Messages messages = sb0Var.r;
        if (messages != null && m1Var.f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) m1Var.a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(kb0Var.getMeasuredWidth(), kb0Var.getMeasuredHeight());
            int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                sb0Var.W.d.checkCurrentLink(sb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = sb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = sb0Var.r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                t1Var.setDelegate(new ab.a(16));
            }
            if (sb0Var.r.previewMessages.size() > 1) {
                t1Var.J3(i11 == 1, false);
                boolean z4 = id2 == sb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = sb0Var.r;
                boolean z10 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z10, z10, z4);
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        sb0 sb0Var = this.c;
        yb0 yb0Var = sb0Var.W;
        pb0 pb0Var = new pb0(this, context, yb0Var.w, sb0Var.G, yb0Var.C);
        pb0Var.setClipChildren(false);
        pb0Var.setClipToPadding(false);
        pb0Var.setDelegate(new qb0(this));
        return new fl0(pb0Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        int i10;
        MessageObject c3;
        sb0 sb0Var = this.c;
        jb0 jb0Var = sb0Var.e;
        yb0 yb0Var = sb0Var.W;
        if (sb0Var.r == null || (i10 = sb0Var.a) == 1) {
            return;
        }
        View view = m1Var.a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            if (i10 != 0) {
                t1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = sb0.a(sb0Var, t1Var.getMessageObject());
            t1Var.setDrawSelectionBackground(a2 == null);
            t1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = yb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || t1Var.getMessageObject() == null || (c3 = sb0Var.c(null)) == null) {
                return;
            }
            if ((t1Var.getMessageObject() == c3 || t1Var.getMessageObject().getId() == c3.getId()) && !jb0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = yb0Var.d;
                jb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (sb0Var.V) {
                    sb0Var.I = D(t1Var, yb0Var.d.quoteStart, false);
                    sb0Var.J = D(t1Var, yb0Var.d.quoteEnd, true);
                    sb0Var.K = true;
                    sb0Var.V = false;
                }
            }
        }
    }
}
