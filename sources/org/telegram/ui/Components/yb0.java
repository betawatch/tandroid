package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yb0 extends s4.h0 {
    public final /* synthetic */ zb0 c;

    public yb0(zb0 zb0Var) {
        this.c = zb0Var;
    }

    public static int D(org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
        int C;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (u1Var != null) {
            org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
            MessageObject messageObject = u1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = u1Var.c4) == null) {
                    u1Var.u3(true);
                    int i11 = u1Var.r0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    C = u1Var.t1 ? org.telegram.messenger.f0.C(10.0f, u1Var.m2, i11) : i11;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    C = (int) u1Var.q4;
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
                                lineBottom = C + ((int) (textLayoutBlock.textYOffset(arrayList, t1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset) : staticLayout.getLineTop(lineForOffset)) + textLayoutBlock.textYOffset(arrayList, t1Var) + C + textLayoutBlock.padTop;
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
        zb0 zb0Var = this.c;
        sb0 sb0Var = zb0Var.f;
        int i11 = zb0Var.a;
        MessagePreviewParams.Messages messages = zb0Var.r;
        if (messages != null && c1Var.f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(sb0Var.getMeasuredWidth(), sb0Var.getMeasuredHeight());
            int id2 = u1Var.getMessageObject() != null ? u1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                zb0Var.c0.d.checkCurrentLink(zb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = zb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = zb0Var.r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (zb0Var.r.previewMessages.size() > 1) {
                u1Var.J3(i11 == 1, false);
                boolean z10 = id2 == zb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = zb0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        zb0 zb0Var = this.c;
        fc0 fc0Var = zb0Var.c0;
        wb0 wb0Var = new wb0(this, context, fc0Var.w, zb0Var.J, fc0Var.F);
        wb0Var.setClipChildren(false);
        wb0Var.setClipToPadding(false);
        wb0Var.setDelegate(new xb0(this));
        return new gl0(wb0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        MessageObject c10;
        zb0 zb0Var = this.c;
        rb0 rb0Var = zb0Var.e;
        fc0 fc0Var = zb0Var.c0;
        if (zb0Var.r == null || (i10 = zb0Var.a) == 1) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            if (i10 != 0) {
                u1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = zb0.a(zb0Var, u1Var.getMessageObject());
            u1Var.setDrawSelectionBackground(a2 == null);
            u1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = fc0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || u1Var.getMessageObject() == null || (c10 = zb0Var.c(null)) == null) {
                return;
            }
            if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !rb0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = fc0Var.d;
                rb0Var.a0(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (zb0Var.b0) {
                    zb0Var.L = D(u1Var, fc0Var.d.quoteStart, false);
                    zb0Var.M = D(u1Var, fc0Var.d.quoteEnd, true);
                    zb0Var.N = true;
                    zb0Var.b0 = false;
                }
            }
        }
    }
}
