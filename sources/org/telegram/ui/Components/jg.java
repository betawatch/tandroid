package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jg extends j1.b {
    public final int[] o;
    public final /* synthetic */ ChatActivityEnterView.RecordCircle p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (!chatActivityEnterView.n4 || chatActivityEnterView.I1 == null) {
            return -1;
        }
        if (chatActivityEnterView.O3.contains((int) f10, (int) f11)) {
            return 1;
        }
        if (chatActivityEnterView.N3.contains(f10, f11)) {
            return 2;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
        if (slideTextView == null || (rect = slideTextView.F) == null) {
            return -1;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f1;
        int[] iArr = this.o;
        slideTextView2.getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        chatActivityEnterView.I1.getLocationOnScreen(iArr);
        rectF.offset(-iArr[0], -iArr[1]);
        return rectF.contains(f10, f11) ? 3 : -1;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.n4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override // j1.b
    public final boolean k(int i9, int i10) {
        return true;
    }

    @Override // j1.b
    public final void l(int i9, s0.d dVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i9 == 1) {
            dVar.h(chatActivityEnterView.O3);
            dVar.o(LocaleController.getString("Send", R.string.Send));
            return;
        }
        if (i9 == 2) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.P3);
            dVar.o(LocaleController.getString(R.string.Stop));
            return;
        }
        if (i9 != 3 || chatActivityEnterView.I1 == null) {
            return;
        }
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
        if (slideTextView != null && (rect = slideTextView.F) != null) {
            Rect rect3 = AndroidUtilities.rectTmp2;
            rect3.set(rect);
            ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f1;
            int[] iArr = this.o;
            slideTextView2.getLocationOnScreen(iArr);
            rect3.offset(iArr[0], iArr[1]);
            chatActivityEnterView.I1.getLocationOnScreen(iArr);
            rect3.offset(-iArr[0], -iArr[1]);
            dVar.h(rect3);
        }
        dVar.o(LocaleController.getString("Cancel", R.string.Cancel));
    }
}
