package org.telegram.ui.Components;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class va0 extends f2.r0 {
    public final /* synthetic */ wa0 c;

    public va0(wa0 wa0Var) {
        this.c = wa0Var;
    }

    public static int D(org.telegram.ui.Cells.t1 t1Var, int i9, boolean z10) {
        int C;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (t1Var != null) {
            org.telegram.ui.Cells.s1 s1Var = t1Var.Vc;
            MessageObject messageObject = t1Var.getMessageObject();
            if (messageObject != null && messageObject.getGroupId() == 0) {
                if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = t1Var.Y3) == null) {
                    t1Var.u3(true);
                    int i10 = t1Var.n0;
                    CharSequence charSequence2 = messageObject.messageText;
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                    C = t1Var.p1 ? org.telegram.messenger.l0.C(10.0f, t1Var.i2, i10) : i10;
                    arrayList = arrayList2;
                    charSequence = charSequence2;
                } else {
                    C = (int) t1Var.m4;
                    charSequence = messageObject.caption;
                    arrayList = textLayoutBlocks.textLayoutBlocks;
                }
                if (arrayList != null && charSequence != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        StaticLayout staticLayout = textLayoutBlock.textLayout;
                        String charSequence3 = staticLayout.getText().toString();
                        int i12 = textLayoutBlock.charactersOffset;
                        if (i9 > i12) {
                            if (i9 - i12 > charSequence3.length() - 1) {
                                lineBottom = C + ((int) (textLayoutBlock.textYOffset(arrayList, s1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                            } else {
                                int lineForOffset = staticLayout.getLineForOffset(i9 - textLayoutBlock.charactersOffset);
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

    @Override // f2.r0
    public final int h() {
        MessagePreviewParams.Messages messages = this.c.r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        wa0 wa0Var = this.c;
        pa0 pa0Var = wa0Var.f;
        int i10 = wa0Var.a;
        MessagePreviewParams.Messages messages = wa0Var.r;
        if (messages != null && q1Var.f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q1Var.a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Z3(pa0Var.getMeasuredWidth(), pa0Var.getMeasuredHeight());
            int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
            if (i10 == 2) {
                wa0Var.V.d.checkCurrentLink(wa0Var.r.previewMessages.get(i9));
            }
            MessageObject messageObject = wa0Var.r.previewMessages.get(i9);
            MessagePreviewParams.Messages messages2 = wa0Var.r;
            t1Var.X3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i9).getGroupId()), true, true, false, false);
            if (i10 == 1) {
                t1Var.setDelegate(new wa.a(18));
            }
            if (wa0Var.r.previewMessages.size() > 1) {
                t1Var.J3(i10 == 1, false);
                boolean z10 = id2 == wa0Var.r.previewMessages.get(i9).getId();
                MessagePreviewParams.Messages messages3 = wa0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i9).getId(), false);
                t1Var.L3(z11, z11, z10);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = viewGroup.getContext();
        wa0 wa0Var = this.c;
        cb0 cb0Var = wa0Var.V;
        ta0 ta0Var = new ta0(this, context, cb0Var.w, wa0Var.F, cb0Var.B);
        ta0Var.setClipChildren(false);
        ta0Var.setClipToPadding(false);
        ta0Var.setDelegate(new ua0(this));
        return new ik0(ta0Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int i9;
        MessageObject c10;
        wa0 wa0Var = this.c;
        oa0 oa0Var = wa0Var.e;
        cb0 cb0Var = wa0Var.V;
        if (wa0Var.r == null || (i9 = wa0Var.a) == 1) {
            return;
        }
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            if (i9 != 0) {
                t1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = wa0.a(wa0Var, t1Var.getMessageObject());
            t1Var.setDrawSelectionBackground(a2 == null);
            t1Var.L3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = cb0Var.d;
            if (messagePreviewParams.isSecret || messagePreviewParams.quote == null || t1Var.getMessageObject() == null || (c10 = wa0Var.c(null)) == null) {
                return;
            }
            if ((t1Var.getMessageObject() == c10 || t1Var.getMessageObject().getId() == c10.getId()) && !oa0Var.y()) {
                MessagePreviewParams messagePreviewParams2 = cb0Var.d;
                oa0Var.a0(t1Var, messagePreviewParams2.quoteStart, messagePreviewParams2.quoteEnd);
                if (wa0Var.U) {
                    wa0Var.H = D(t1Var, cb0Var.d.quoteStart, false);
                    wa0Var.I = D(t1Var, cb0Var.d.quoteEnd, true);
                    wa0Var.J = true;
                    wa0Var.U = false;
                }
            }
        }
    }
}
