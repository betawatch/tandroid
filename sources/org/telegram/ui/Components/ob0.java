package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ob0 extends s4.h0 {
    public final /* synthetic */ pb0 c;

    public ob0(pb0 pb0Var) {
        this.c = pb0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10) {
        int C;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Zc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = t1Var.c4) == null) {
                    t1Var.u3(true);
                    int i11 = t1Var.r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    C = t1Var.t1 ? org.telegram.messenger.y0.C(10.0f, t1Var.m2, i11) : i11;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    C = (int) t1Var.q4;
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
                                lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, s1Var) + C + textLayoutBlock.padTop;
                            }
                            return (int) lineBottom;
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.h0
    public final int h() {
        MessagePreviewParams.Messages messages = this.c.r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        pb0 pb0Var = this.c;
        hb0 hb0Var = pb0Var.f;
        int i11 = pb0Var.a;
        MessagePreviewParams.Messages messages = pb0Var.r;
        if (messages != null && c1Var.f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(hb0Var.getMeasuredWidth(), hb0Var.getMeasuredHeight());
            int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                pb0Var.c0.d.checkCurrentLink(pb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = pb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = pb0Var.r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                t1Var.setDelegate(new rb.a(16));
            }
            if (pb0Var.r.previewMessages.size() > 1) {
                t1Var.J3(i11 == 1, false);
                boolean z10 = id2 == pb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = pb0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        pb0 pb0Var = this.c;
        vb0 vb0Var = pb0Var.c0;
        mb0 mb0Var = new mb0(this, context, vb0Var.w, pb0Var.J, vb0Var.F);
        mb0Var.setClipChildren(false);
        mb0Var.setClipToPadding(false);
        mb0Var.setDelegate(new nb0(this));
        return new vk0(mb0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        MessageObject c10;
        pb0 pb0Var = this.c;
        gb0 gb0Var = pb0Var.e;
        vb0 vb0Var = pb0Var.c0;
        if (pb0Var.r == null || (i10 = pb0Var.a) == 1) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            if (i10 != 0) {
                t1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = pb0.a(pb0Var, t1Var.getMessageObject());
            t1Var.setDrawSelectionBackground(a2 == null);
            t1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = vb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || t1Var.getMessageObject() == null || (c10 = pb0Var.c(null)) == null) {
                return;
            }
            if ((t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId()) && !gb0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = vb0Var.d;
                gb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (pb0Var.b0) {
                    pb0Var.L = D(t1Var, vb0Var.d.quoteStart, false);
                    pb0Var.M = D(t1Var, vb0Var.d.quoteEnd, true);
                    pb0Var.N = true;
                    pb0Var.b0 = false;
                }
            }
        }
    }
}
