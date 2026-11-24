package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m extends s64 {
    public final int[] o;
    public final /* synthetic */ ChatActivityEnterView.RecordCircle p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override // s64
    public final int g(float f, float f2) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (!chatActivityEnterView.h5 || chatActivityEnterView.D2 == null) {
            return -1;
        }
        if (chatActivityEnterView.I4.contains((int) f, (int) f2)) {
            return 1;
        }
        if (chatActivityEnterView.H4.contains(f, f2)) {
            return 2;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
        if (slideTextView == null || (rect = slideTextView.I) == null) {
            return -1;
        }
        RectF rectF = gl.P;
        rectF.set(rect);
        ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.a2;
        int[] iArr = this.o;
        slideTextView2.getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        chatActivityEnterView.D2.getLocationOnScreen(iArr);
        rectF.offset(-iArr[0], -iArr[1]);
        return rectF.contains(f, f2) ? 3 : -1;
    }

    @Override // s64
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.h5) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override // s64
    public final boolean k(int i, int i2) {
        return true;
    }

    @Override // s64
    public final void l(int i, u4 u4Var) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i == 1) {
            u4Var.h(chatActivityEnterView.I4);
            u4Var.o(k96.M0(2131745448, "Send"));
            return;
        }
        if (i == 2) {
            Rect rect2 = chatActivityEnterView.J4;
            RectF rectF = chatActivityEnterView.H4;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            u4Var.h(chatActivityEnterView.J4);
            u4Var.o(k96.M0(2131744604, null));
            return;
        }
        if (i != 3 || chatActivityEnterView.D2 == null) {
            return;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
        if (slideTextView != null && (rect = slideTextView.I) != null) {
            Rect rect3 = gl.Q;
            rect3.set(rect);
            ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.a2;
            int[] iArr = this.o;
            slideTextView2.getLocationOnScreen(iArr);
            rect3.offset(iArr[0], iArr[1]);
            chatActivityEnterView.D2.getLocationOnScreen(iArr);
            rect3.offset(-iArr[0], -iArr[1]);
            u4Var.h(rect3);
        }
        u4Var.o(k96.M0(2131752577, "Cancel"));
    }
}
