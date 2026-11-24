package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k extends s64 {
    public final /* synthetic */ l o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, l lVar2) {
        super(lVar2);
        this.o = lVar;
    }

    @Override // s64
    public final int g(float f, float f2) {
        l lVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lVar.Q0;
        if (chatActivityEnterView.h5 && chatActivityEnterView.D2 != null && chatActivityEnterView.H4.contains(f, f2)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.D2 == null || chatActivityEnterView.c5 <= 0.1f || !lVar.K.contains(f, f2)) ? -1 : 4;
    }

    @Override // s64
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.Q0;
        if (chatActivityEnterView.h5) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.Q || chatActivityEnterView.D2 == null || chatActivityEnterView.c5 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // s64
    public final boolean k(int i, int i2) {
        return true;
    }

    @Override // s64
    public final void l(int i, u4 u4Var) {
        l lVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lVar.Q0;
        if (i == 2) {
            Rect rect = chatActivityEnterView.J4;
            RectF rectF = chatActivityEnterView.H4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            u4Var.h(chatActivityEnterView.J4);
            u4Var.o(k96.M0(chatActivityEnterView.e5 > 0.5f ? 2131754927 : 2131754930, null));
            return;
        }
        if (i == 4) {
            Rect rect2 = chatActivityEnterView.J4;
            RectF rectF2 = lVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            u4Var.h(chatActivityEnterView.J4);
            u4Var.o(k96.M0(chatActivityEnterView.P ? 2131754934 : 2131754935, null));
        }
    }
}
