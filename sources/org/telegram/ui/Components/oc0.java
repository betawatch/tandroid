package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oc0 extends s4.i0 {
    public final /* synthetic */ pc0 c;

    public oc0(pc0 pc0Var) {
        this.c = pc0Var;
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
                    C = u1Var.t1 ? org.telegram.messenger.q.C(10.0f, u1Var.m2, i11) : i11;
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

    @Override // s4.i0
    public final int h() {
        MessagePreviewParams.Messages messages = this.c.r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        pc0 pc0Var = this.c;
        ic0 ic0Var = pc0Var.f;
        int i11 = pc0Var.a;
        MessagePreviewParams.Messages messages = pc0Var.r;
        if (messages != null && d1Var.f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) d1Var.a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(ic0Var.getMeasuredWidth(), ic0Var.getMeasuredHeight());
            int id2 = u1Var.getMessageObject() != null ? u1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                pc0Var.c0.d.checkCurrentLink(pc0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = pc0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = pc0Var.r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (pc0Var.r.previewMessages.size() > 1) {
                u1Var.J3(i11 == 1, false);
                boolean z10 = id2 == pc0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = pc0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        pc0 pc0Var = this.c;
        vc0 vc0Var = pc0Var.c0;
        mc0 mc0Var = new mc0(this, context, vc0Var.w, pc0Var.J, vc0Var.F);
        mc0Var.setClipChildren(false);
        mc0Var.setClipToPadding(false);
        mc0Var.setDelegate(new nc0(this));
        return new am0(mc0Var);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        int i10;
        MessageObject c10;
        pc0 pc0Var = this.c;
        hc0 hc0Var = pc0Var.e;
        vc0 vc0Var = pc0Var.c0;
        if (pc0Var.r == null || (i10 = pc0Var.a) == 1) {
            return;
        }
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            if (i10 != 0) {
                u1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = pc0.a(pc0Var, u1Var.getMessageObject());
            u1Var.setDrawSelectionBackground(a2 == null);
            u1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = vc0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || u1Var.getMessageObject() == null || (c10 = pc0Var.c(null)) == null) {
                return;
            }
            if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !hc0Var.x()) {
                MessagePreviewParams messagePreviewParams2 = vc0Var.d;
                hc0Var.Z(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (pc0Var.b0) {
                    pc0Var.L = D(u1Var, vc0Var.d.quoteStart, false);
                    pc0Var.M = D(u1Var, vc0Var.d.quoteEnd, true);
                    pc0Var.N = true;
                    pc0Var.b0 = false;
                }
            }
        }
    }
}
