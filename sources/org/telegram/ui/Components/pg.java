package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pg extends k1.b {
    public final /* synthetic */ qg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(qg qgVar, qg qgVar2) {
        super(qgVar2);
        this.o = qgVar;
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        qg qgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = qgVar.Q0;
        if (chatActivityEnterView.i5 && chatActivityEnterView.D2 != null && chatActivityEnterView.I4.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.D2 == null || chatActivityEnterView.d5 <= 0.1f || !qgVar.K.contains(f10, f11)) ? -1 : 4;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.Q0;
        if (chatActivityEnterView.i5) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.Q || chatActivityEnterView.D2 == null || chatActivityEnterView.d5 <= 0.1f) {
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
        qg qgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = qgVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.K4;
            RectF rectF = chatActivityEnterView.I4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.K4);
            cVar.o(org.telegram.messenger.gd.N0(chatActivityEnterView.f5 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.K4;
            RectF rectF2 = qgVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.K4);
            cVar.o(org.telegram.messenger.gd.N0(chatActivityEnterView.P ? 2131754934 : 2131754935, null));
        }
    }
}
