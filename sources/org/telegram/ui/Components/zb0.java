package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zb0 extends s4.h0 {
    public final /* synthetic */ ac0 c;

    public zb0(ac0 ac0Var) {
        this.c = ac0Var;
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
                    C = u1Var.t1 ? org.telegram.messenger.l0.C(10.0f, u1Var.m2, i11) : i11;
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
        ac0 ac0Var = this.c;
        sb0 sb0Var = ac0Var.f;
        int i11 = ac0Var.a;
        MessagePreviewParams.Messages messages = ac0Var.r;
        if (messages != null && c1Var.f == 0) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.a;
            u1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            u1Var.Z3(sb0Var.getMeasuredWidth(), sb0Var.getMeasuredHeight());
            int id2 = u1Var.getMessageObject() != null ? u1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                ac0Var.c0.d.checkCurrentLink(ac0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = ac0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = ac0Var.r;
            u1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                u1Var.setDelegate(new rb.a(16));
            }
            if (ac0Var.r.previewMessages.size() > 1) {
                u1Var.J3(i11 == 1, false);
                boolean z10 = id2 == ac0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = ac0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                u1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ac0 ac0Var = this.c;
        gc0 gc0Var = ac0Var.c0;
        xb0 xb0Var = new xb0(this, context, gc0Var.w, ac0Var.J, gc0Var.F);
        xb0Var.setClipChildren(false);
        xb0Var.setClipToPadding(false);
        xb0Var.setDelegate(new yb0(this));
        return new il0(xb0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        MessageObject c10;
        ac0 ac0Var = this.c;
        rb0 rb0Var = ac0Var.e;
        gc0 gc0Var = ac0Var.c0;
        if (ac0Var.r == null || (i10 = ac0Var.a) == 1) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            if (i10 != 0) {
                u1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = ac0.a(ac0Var, u1Var.getMessageObject());
            u1Var.setDrawSelectionBackground(a2 == null);
            u1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = gc0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || u1Var.getMessageObject() == null || (c10 = ac0Var.c(null)) == null) {
                return;
            }
            if ((u1Var.getMessageObject() == c10 || u1Var.getMessageObject().getId() == c10.getId()) && !rb0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = gc0Var.d;
                rb0Var.a0(u1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (ac0Var.b0) {
                    ac0Var.L = D(u1Var, gc0Var.d.quoteStart, false);
                    ac0Var.M = D(u1Var, gc0Var.d.quoteEnd, true);
                    ac0Var.N = true;
                    ac0Var.b0 = false;
                }
            }
        }
    }
}
