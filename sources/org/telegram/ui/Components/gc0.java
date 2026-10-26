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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gc0 extends s4.h0 {
    public final /* synthetic */ hc0 c;

    public gc0(hc0 hc0Var) {
        this.c = hc0Var;
    }

    public static int D(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        int D;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        float lineBottom;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (s1Var != null) {
            org.telegram.ui.Cells.r1 r1Var = s1Var.Zc;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.richLayout != null) {
                    s1Var.w3(true);
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
                                return richMessageLayout.textBlocks.get(size).getY() + s1Var.r0 + (z10 ? layout.getLineBottom(lineForOffset) : layout.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.getGroupId() == 0) {
                    if (TextUtils.isEmpty(messageObject.caption) || (textLayoutBlocks = s1Var.c4) == null) {
                        s1Var.w3(true);
                        int i11 = s1Var.r0;
                        CharSequence charSequence2 = messageObject.messageText;
                        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = messageObject.textLayoutBlocks;
                        D = s1Var.t1 ? org.telegram.messenger.t.D(10.0f, s1Var.m2, i11) : i11;
                        arrayList = arrayList2;
                        charSequence = charSequence2;
                    } else {
                        D = (int) s1Var.q4;
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
                                    lineBottom = D + ((int) (textLayoutBlock.textYOffset(arrayList, r1Var) + textLayoutBlock.padTop + textLayoutBlock.height));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - textLayoutBlock.charactersOffset);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + textLayoutBlock.textYOffset(arrayList, r1Var) + D + textLayoutBlock.padTop;
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
    public final void v(s4.e1 e1Var, int i10) {
        hc0 hc0Var = this.c;
        ac0 ac0Var = hc0Var.f;
        int i11 = hc0Var.a;
        MessagePreviewParams.Messages messages = hc0Var.r;
        if (messages != null && e1Var.f == 0) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) e1Var.a;
            s1Var.setInvalidateSpoilersParent(messages.hasSpoilers);
            s1Var.b4(ac0Var.getMeasuredWidth(), ac0Var.getMeasuredHeight());
            int id2 = s1Var.getMessageObject() != null ? s1Var.getMessageObject().getId() : 0;
            if (i11 == 2) {
                hc0Var.c0.d.checkCurrentLink(hc0Var.r.previewMessages.get(i10));
            }
            MessageObject messageObject = hc0Var.r.previewMessages.get(i10);
            MessagePreviewParams.Messages messages2 = hc0Var.r;
            s1Var.Z3(messageObject, messages2.groupedMessagesMap.get(messages2.previewMessages.get(i10).getGroupId()), true, true, false, false);
            if (i11 == 1) {
                s1Var.setDelegate(new tb.a(15));
            }
            if (hc0Var.r.previewMessages.size() > 1) {
                s1Var.L3(i11 == 1, false);
                boolean z10 = id2 == hc0Var.r.previewMessages.get(i10).getId();
                MessagePreviewParams.Messages messages3 = hc0Var.r;
                boolean z11 = messages3.selectedIds.get(messages3.previewMessages.get(i10).getId(), false);
                s1Var.N3(z11, z11, z10);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        hc0 hc0Var = this.c;
        nc0 nc0Var = hc0Var.c0;
        ec0 ec0Var = new ec0(this, context, nc0Var.w, hc0Var.J, nc0Var.F);
        ec0Var.setClipChildren(false);
        ec0Var.setClipToPadding(false);
        ec0Var.setDelegate(new fc0(this));
        return new vl0(ec0Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int i10;
        int i11;
        hc0 hc0Var = this.c;
        zb0 zb0Var = hc0Var.e;
        nc0 nc0Var = hc0Var.c0;
        if (hc0Var.r == null || (i10 = hc0Var.a) == 1) {
            return;
        }
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            if (i10 != 0) {
                s1Var.setDrawSelectionBackground(false);
                return;
            }
            MessageObject.GroupedMessages a2 = hc0.a(hc0Var, s1Var.getMessageObject());
            s1Var.setDrawSelectionBackground(a2 == null);
            s1Var.N3(true, a2 == null, false);
            MessagePreviewParams messagePreviewParams = nc0Var.d;
            if (!messagePreviewParams.isSecret && messagePreviewParams.quote != null && hc0Var.e(s1Var)) {
                MessageObject messageObject = s1Var.getMessageObject();
                MessagePreviewParams messagePreviewParams2 = nc0Var.d;
                MessagePreviewParams messagePreviewParams3 = nc0Var.d;
                org.telegram.ui.kn knVar = messagePreviewParams3.quote;
                if (knVar.m && messageObject != null && messageObject.richLayout != null && ((i11 = messagePreviewParams3.quoteStart) < 0 || messagePreviewParams3.quoteEnd <= i11)) {
                    String str = knVar.i;
                    int[] findQuote = str == null ? null : RichQuote.findQuote(messageObject, str, knVar.o);
                    if (findQuote != null) {
                        messagePreviewParams2.quoteStart = findQuote[0];
                        messagePreviewParams2.quoteEnd = findQuote[1];
                    } else {
                        messagePreviewParams2.quoteStart = 0;
                        messagePreviewParams2.quoteEnd = Math.min(MessagesController.getInstance(nc0Var.w).quoteLengthMax, org.telegram.ui.kn.d(messageObject));
                    }
                }
            }
            MessagePreviewParams messagePreviewParams4 = nc0Var.d;
            if (messagePreviewParams4.isSecret || messagePreviewParams4.quote == null || messagePreviewParams4.quoteStart < 0 || !hc0Var.e(s1Var) || zb0Var.x()) {
                return;
            }
            MessagePreviewParams messagePreviewParams5 = nc0Var.d;
            zb0Var.Z(s1Var, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
            if (hc0Var.b0) {
                hc0Var.L = D(s1Var, nc0Var.d.quoteStart, false);
                hc0Var.M = D(s1Var, nc0Var.d.quoteEnd, true);
                hc0Var.N = true;
                hc0Var.b0 = false;
            }
        }
    }
}
