package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class tg extends j1.b {
    public final int[] o;
    public final /* synthetic */ ChatActivityEnterView.RecordCircle p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (!chatActivityEnterView.r4 || chatActivityEnterView.M1 == null) {
            return -1;
        }
        if (chatActivityEnterView.S3.contains((int) f7, (int) f10)) {
            return 1;
        }
        if (chatActivityEnterView.R3.contains(f7, f10)) {
            return 2;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.j1;
        if (slideTextView == null || (rect = slideTextView.J) == null) {
            return -1;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.j1;
        int[] iArr = this.o;
        slideTextView2.getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        chatActivityEnterView.M1.getLocationOnScreen(iArr);
        rectF.offset(-iArr[0], -iArr[1]);
        return rectF.contains(f7, f10) ? 3 : -1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.r4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override // j1.b
    public final void l(int i10, s0.c cVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i10 == 1) {
            cVar.h(chatActivityEnterView.S3);
            cVar.o(LocaleController.getString("Send", R.string.Send));
            return;
        }
        if (i10 == 2) {
            Rect rect2 = chatActivityEnterView.T3;
            RectF rectF = chatActivityEnterView.R3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.T3);
            cVar.o(LocaleController.getString(R.string.Stop));
            return;
        }
        if (i10 != 3 || chatActivityEnterView.M1 == null) {
            return;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.j1;
        if (slideTextView != null && (rect = slideTextView.J) != null) {
            Rect rect3 = AndroidUtilities.rectTmp2;
            rect3.set(rect);
            ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.j1;
            int[] iArr = this.o;
            slideTextView2.getLocationOnScreen(iArr);
            rect3.offset(iArr[0], iArr[1]);
            chatActivityEnterView.M1.getLocationOnScreen(iArr);
            rect3.offset(-iArr[0], -iArr[1]);
            cVar.h(rect3);
        }
        cVar.o(LocaleController.getString("Cancel", R.string.Cancel));
    }
}
