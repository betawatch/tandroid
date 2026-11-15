package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fg extends k1.b {
    public final /* synthetic */ gg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(gg ggVar, gg ggVar2) {
        super(ggVar2);
        this.o = ggVar;
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        gg ggVar = this.o;
        ChatActivityEnterView chatActivityEnterView = ggVar.Q0;
        if (chatActivityEnterView.a5 && chatActivityEnterView.v2 != null && chatActivityEnterView.A4.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.v2 == null || chatActivityEnterView.V4 <= 0.1f || !ggVar.K.contains(f10, f11)) ? -1 : 4;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.Q0;
        if (chatActivityEnterView.a5) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.Q || chatActivityEnterView.v2 == null || chatActivityEnterView.V4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override // k1.b
    public final void l(int i7, s0.c cVar) {
        gg ggVar = this.o;
        ChatActivityEnterView chatActivityEnterView = ggVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.C4;
            RectF rectF = chatActivityEnterView.A4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.C4);
            cVar.o(org.telegram.messenger.hd.M0(chatActivityEnterView.X4 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.C4;
            RectF rectF2 = ggVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.C4);
            cVar.o(org.telegram.messenger.hd.M0(chatActivityEnterView.P ? 2131754934 : 2131754935, null));
        }
    }
}
