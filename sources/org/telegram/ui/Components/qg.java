package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qg extends k1.b {
    public final /* synthetic */ rg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(rg rgVar, rg rgVar2) {
        super(rgVar2);
        this.o = rgVar;
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        rg rgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = rgVar.Q0;
        if (chatActivityEnterView.i5 && chatActivityEnterView.D2 != null && chatActivityEnterView.I4.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.D2 == null || chatActivityEnterView.d5 <= 0.1f || !rgVar.K.contains(f10, f11)) ? -1 : 4;
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
        rg rgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = rgVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.K4;
            RectF rectF = chatActivityEnterView.I4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.K4);
            cVar.o(org.telegram.messenger.hd.N0(chatActivityEnterView.f5 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.K4;
            RectF rectF2 = rgVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.K4);
            cVar.o(org.telegram.messenger.hd.N0(chatActivityEnterView.P ? 2131754934 : 2131754935, null));
        }
    }
}
