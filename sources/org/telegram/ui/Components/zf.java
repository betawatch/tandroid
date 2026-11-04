package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zf extends j1.b {
    public final int[] o;
    public final /* synthetic */ ChatActivityEnterView.RecordCircle p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (!chatActivityEnterView.t4 || chatActivityEnterView.O1 == null) {
            return -1;
        }
        if (chatActivityEnterView.U3.contains((int) f10, (int) f11)) {
            return 1;
        }
        if (chatActivityEnterView.T3.contains(f10, f11)) {
            return 2;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.l1;
        if (slideTextView == null || (rect = slideTextView.L) == null) {
            return -1;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.l1;
        int[] iArr = this.o;
        slideTextView2.getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        chatActivityEnterView.O1.getLocationOnScreen(iArr);
        rectF.offset(-iArr[0], -iArr[1]);
        return rectF.contains(f10, f11) ? 3 : -1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.t4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override // j1.b
    public final boolean k(int i3, int i10) {
        return true;
    }

    @Override // j1.b
    public final void l(int i3, s0.d dVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i3 == 1) {
            dVar.h(chatActivityEnterView.U3);
            dVar.o(org.telegram.messenger.bd.M0(2131745650, "Send"));
            return;
        }
        if (i3 == 2) {
            Rect rect2 = chatActivityEnterView.V3;
            RectF rectF = chatActivityEnterView.T3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.V3);
            dVar.o(org.telegram.messenger.bd.M0(2131744851, null));
            return;
        }
        if (i3 != 3 || chatActivityEnterView.O1 == null) {
            return;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.l1;
        if (slideTextView != null && (rect = slideTextView.L) != null) {
            Rect rect3 = org.telegram.messenger.g0.Q;
            rect3.set(rect);
            ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.l1;
            int[] iArr = this.o;
            slideTextView2.getLocationOnScreen(iArr);
            rect3.offset(iArr[0], iArr[1]);
            chatActivityEnterView.O1.getLocationOnScreen(iArr);
            rect3.offset(-iArr[0], -iArr[1]);
            dVar.h(rect3);
        }
        dVar.o(org.telegram.messenger.bd.M0(2131752589, "Cancel"));
    }
}
