package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m extends m74 {
    public final int[] o;
    public final /* synthetic */ ChatActivityEnterView.RecordCircle p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override // m74
    public final int g(float f, float f2) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (!chatActivityEnterView.j5 || chatActivityEnterView.C2 == null) {
            return -1;
        }
        if (chatActivityEnterView.H4.contains((int) f, (int) f2)) {
            return 1;
        }
        if (chatActivityEnterView.G4.contains(f, f2)) {
            return 2;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
        if (slideTextView == null || (rect = slideTextView.I) == null) {
            return -1;
        }
        RectF rectF = hl.P;
        rectF.set(rect);
        ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.Z1;
        int[] iArr = this.o;
        slideTextView2.getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        chatActivityEnterView.C2.getLocationOnScreen(iArr);
        rectF.offset(-iArr[0], -iArr[1]);
        return rectF.contains(f, f2) ? 3 : -1;
    }

    @Override // m74
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.j5) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override // m74
    public final boolean k(int i, int i2) {
        return true;
    }

    @Override // m74
    public final void l(int i, v4 v4Var) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i == 1) {
            v4Var.h(chatActivityEnterView.H4);
            v4Var.o(ob6.M0(2131745368, "Send"));
            return;
        }
        if (i == 2) {
            Rect rect2 = chatActivityEnterView.I4;
            RectF rectF = chatActivityEnterView.G4;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            v4Var.h(chatActivityEnterView.I4);
            v4Var.o(ob6.M0(2131744498, null));
            return;
        }
        if (i != 3 || chatActivityEnterView.C2 == null) {
            return;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
        if (slideTextView != null && (rect = slideTextView.I) != null) {
            Rect rect3 = hl.Q;
            rect3.set(rect);
            ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.Z1;
            int[] iArr = this.o;
            slideTextView2.getLocationOnScreen(iArr);
            rect3.offset(iArr[0], iArr[1]);
            chatActivityEnterView.C2.getLocationOnScreen(iArr);
            rect3.offset(-iArr[0], -iArr[1]);
            v4Var.h(rect3);
        }
        v4Var.o(ob6.M0(2131752570, "Cancel"));
    }
}
