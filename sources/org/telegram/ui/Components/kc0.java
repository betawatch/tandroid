package org.telegram.ui.Components;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichQuote;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kc0 extends s4.g0 {
    public final /* synthetic */ lc0 c;

    public kc0(lc0 lc0Var) {
        this.c = lc0Var;
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
            if (messageObject != null) {
                if (messageObject.richLayout != null) {
                    t1Var.t3(true);
                    RichMessageLayout richMessageLayout = messageObject.richLayout;
                    int size = richMessageLayout.textBlocks.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = richMessageLayout.textBlockCharOffsets.get(size).intValue();
                        if (i10 < intValue) {
                            size--;
                        } else {
                            Layout layout = richMessageLayout.textBlocks.get(size).getLayout();
                            if (layout != null) {
                                int lineForOffset = layout.getLineForOffset(Math.min(i10 - intValue, layout.getText().length()));
                                return richMessageLayout.textBlocks.get(size).getY() + t1Var.r0 + (z10 ? layout.getLineBottom(lineForOffset) : layout.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.getGroupId() == 0) {
                    if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = t1Var.c4) == null) {
                        t1Var.t3(true);
                        int i11 = t1Var.r0;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        C = t1Var.t1 ? org.telegram.messenger.v0.C(10.0f, t1Var.m2, i11) : i11;
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
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + textLayoutBlock.textYOffset(arrayList, s1Var) + C + textLayoutBlock.padTop;
                                }
                                return (int) lineBottom;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.g0
    public final int h() {
        MessagePreviewParams.Messages messages = this.c.r;
        if (messages == null) {
            return 0;
        }
        return messages.previewMessages.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        lc0 lc0Var = this.c;
        ec0 ec0Var = lc0Var.f;
        int i11 = lc0Var.a;
        MessagePreviewParams.Messages messages = lc0Var.r;
        if (messages != null && b1Var.f == 0) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) b1Var.a;
            t1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            t1Var.Y3(ec0Var.getMeasuredWidth(), ec0Var.getMeasuredHeight());
            int id2 = t1Var.getMessageObject() != null ? t1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                lc0Var.c0.d.checkCurrentLink(lc0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = lc0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = lc0Var.r;
            t1Var.W3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                t1Var.setDelegate(new oa.d(17));
            }
            if (lc0Var.r.previewMessages.size() > 1) {
                t1Var.I3(i11 == 1, false);
                boolean z10 = id2 == lc0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = lc0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                t1Var.K3(z11, z11, z10);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        lc0 lc0Var = this.c;
        rc0 rc0Var = lc0Var.c0;
        ic0 ic0Var = new ic0(this, context, rc0Var.w, lc0Var.J, rc0Var.F);
        ic0Var.setClipChildren(false);
        ic0Var.setClipToPadding(false);
        ic0Var.setDelegate(new jc0(this));
        return new wl0(ic0Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10;
        int i11;
        lc0 lc0Var = this.c;
        dc0 dc0Var = lc0Var.e;
        rc0 rc0Var = lc0Var.c0;
        if (lc0Var.r == null || (i10 = lc0Var.a) == 1) {
            return;
        }
        View view = b1Var.a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            if (i10 != 0) {
                t1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = lc0.a(lc0Var, t1Var.getMessageObject());
            t1Var.setDrawSelectionBackground(a2 == null);
            t1Var.K3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = rc0Var.d;
            if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && lc0Var.e(t1Var)) {
                MessageObject messageObject = t1Var.getMessageObject();
                MessagePreviewParams messagePreviewParams2 = rc0Var.d;
                MessagePreviewParams messagePreviewParams3 = rc0Var.d;
                org.telegram.ui.in inVar = messagePreviewParams3.quote;
                if (inVar.m && messageObject != null && messageObject.richLayout != null && ((i11 = messagePreviewParams3.quoteStart) < 0 || messagePreviewParams3.quoteEnd <= i11)) {
                    String str = inVar.i;
                    int[] findQuote = str == null ? null : RichQuote.findQuote(messageObject, str, inVar.o);
                    if (findQuote != null) {
                        messagePreviewParams2.quoteStart = findQuote[0];
                        messagePreviewParams2.quoteEnd = findQuote[1];
                    } else {
                        messagePreviewParams2.quoteStart = 0;
                        messagePreviewParams2.quoteEnd = Math.min(MessagesController.getInstance(rc0Var.w).quoteLengthMax, org.telegram.ui.in.d(messageObject));
                    }
                }
            }
            MessagePreviewParams messagePreviewParams4 = rc0Var.d;
            if (messagePreviewParams4.isSecret || messagePreviewParams4.quote == null || messagePreviewParams4.quoteStart < 0 || !lc0Var.e(t1Var) || dc0Var.x()) {
                return;
            }
            MessagePreviewParams messagePreviewParams5 = rc0Var.d;
            dc0Var.Z(t1Var, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
            if (lc0Var.b0) {
                lc0Var.L = D(t1Var, rc0Var.d.quoteStart, false);
                lc0Var.M = D(t1Var, rc0Var.d.quoteEnd, true);
                lc0Var.N = true;
                lc0Var.b0 = false;
            }
        }
    }
}
