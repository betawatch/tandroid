package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bg extends k1.b {
    public final int[] o;
    public final /* synthetic */ ChatActivityEnterView.RecordCircle p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (!chatActivityEnterView.s4 || chatActivityEnterView.N1 == null) {
            return -1;
        }
        if (chatActivityEnterView.T3.contains((int) f10, (int) f11)) {
            return 1;
        }
        if (chatActivityEnterView.S3.contains(f10, f11)) {
            return 2;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
        if (slideTextView == null || (rect = slideTextView.K) == null) {
            return -1;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.k1;
        int[] iArr = this.o;
        slideTextView2.getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        chatActivityEnterView.N1.getLocationOnScreen(iArr);
        rectF.offset(-iArr[0], -iArr[1]);
        return rectF.contains(f10, f11) ? 3 : -1;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.s4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override // k1.b
    public final void l(int i7, s0.d dVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i7 == 1) {
            dVar.h(chatActivityEnterView.T3);
            dVar.o(org.telegram.messenger.hd.M0(2131745641, "Send"));
            return;
        }
        if (i7 == 2) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            dVar.o(org.telegram.messenger.hd.M0(2131744842, null));
            return;
        }
        if (i7 != 3 || chatActivityEnterView.N1 == null) {
            return;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.k1;
        if (slideTextView != null && (rect = slideTextView.K) != null) {
            Rect rect3 = org.telegram.messenger.g0.Q;
            rect3.set(rect);
            ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.k1;
            int[] iArr = this.o;
            slideTextView2.getLocationOnScreen(iArr);
            rect3.offset(iArr[0], iArr[1]);
            chatActivityEnterView.N1.getLocationOnScreen(iArr);
            rect3.offset(-iArr[0], -iArr[1]);
            dVar.h(rect3);
        }
        dVar.o(org.telegram.messenger.hd.M0(2131752589, "Cancel"));
    }
}
