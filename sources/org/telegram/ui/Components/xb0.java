package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xb0 extends s4.h0 {
    public final /* synthetic */ yb0 c;

    public xb0(yb0 yb0Var) {
        this.c = yb0Var;
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
                    C = t1Var.t1 ? org.telegram.messenger.a2.C(10.0f, t1Var.m2, i11) : i11;
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
        yb0 yb0Var = this.c;
        rb0 rb0Var = yb0Var.f;
        int i11 = yb0Var.a;
        MessagePreviewParams.Messages messages = yb0Var.r;
        if (messages != null && c1Var.f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) c1Var.a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(rb0Var.getMeasuredWidth(), rb0Var.getMeasuredHeight());
            int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                yb0Var.c0.d.checkCurrentLink(yb0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = yb0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = yb0Var.r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                t1Var.setDelegate(new rb.a(16));
            }
            if (yb0Var.r.previewMessages.size() > 1) {
                t1Var.J3(i11 == 1, false);
                boolean z10 = id2 == yb0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = yb0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        yb0 yb0Var = this.c;
        ec0 ec0Var = yb0Var.c0;
        vb0 vb0Var = new vb0(this, context, ec0Var.w, yb0Var.J, ec0Var.F);
        vb0Var.setClipChildren(false);
        vb0Var.setClipToPadding(false);
        vb0Var.setDelegate(new wb0(this));
        return new fl0(vb0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10;
        MessageObject c10;
        yb0 yb0Var = this.c;
        qb0 qb0Var = yb0Var.e;
        ec0 ec0Var = yb0Var.c0;
        if (yb0Var.r == null || (i10 = yb0Var.a) == 1) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            if (i10 != 0) {
                t1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = yb0.a(yb0Var, t1Var.getMessageObject());
            t1Var.setDrawSelectionBackground(a2 == null);
            t1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = ec0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || t1Var.getMessageObject() == null || (c10 = yb0Var.c(null)) == null) {
                return;
            }
            if ((t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId()) && !qb0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = ec0Var.d;
                qb0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (yb0Var.b0) {
                    yb0Var.L = D(t1Var, ec0Var.d.quoteStart, false);
                    yb0Var.M = D(t1Var, ec0Var.d.quoteEnd, true);
                    yb0Var.N = true;
                    yb0Var.b0 = false;
                }
            }
        }
    }
}
