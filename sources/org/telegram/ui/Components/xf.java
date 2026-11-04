package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xf extends j1.b {
    public final /* synthetic */ yf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(yf yfVar, yf yfVar2) {
        super(yfVar2);
        this.o = yfVar;
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        yf yfVar = this.o;
        ChatActivityEnterView chatActivityEnterView = yfVar.c0;
        if (chatActivityEnterView.t4 && chatActivityEnterView.O1 != null && chatActivityEnterView.T3.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.O1 == null || chatActivityEnterView.o4 <= 0.1f || !yfVar.K.contains(f10, f11)) ? -1 : 4;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.c0;
        if (chatActivityEnterView.t4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.Q || chatActivityEnterView.O1 == null || chatActivityEnterView.o4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // j1.b
    public final boolean k(int i3, int i10) {
        return true;
    }

    @Override // j1.b
    public final void l(int i3, s0.d dVar) {
        yf yfVar = this.o;
        ChatActivityEnterView chatActivityEnterView = yfVar.c0;
        if (i3 == 2) {
            Rect rect = chatActivityEnterView.V3;
            RectF rectF = chatActivityEnterView.T3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.V3);
            dVar.o(org.telegram.messenger.bd.M0(chatActivityEnterView.q4 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i3 == 4) {
            Rect rect2 = chatActivityEnterView.V3;
            RectF rectF2 = yfVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.V3);
            dVar.o(org.telegram.messenger.bd.M0(chatActivityEnterView.P ? 2131754934 : 2131754935, null));
        }
    }
}
