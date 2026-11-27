package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k extends m74 {
    public final /* synthetic */ l o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, l lVar2) {
        super(lVar2);
        this.o = lVar;
    }

    @Override // m74
    public final int g(float f, float f2) {
        l lVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lVar.U0;
        if (chatActivityEnterView.j5 && chatActivityEnterView.C2 != null && chatActivityEnterView.G4.contains(f, f2)) {
            return 2;
        }
        return (!chatActivityEnterView.Q || chatActivityEnterView.C2 == null || chatActivityEnterView.b5 <= 0.1f || !lVar.K.contains(f, f2)) ? -1 : 4;
    }

    @Override // m74
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.U0;
        if (chatActivityEnterView.j5) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.Q || chatActivityEnterView.C2 == null || chatActivityEnterView.b5 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // m74
    public final boolean k(int i, int i2) {
        return true;
    }

    @Override // m74
    public final void l(int i, v4 v4Var) {
        l lVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lVar.U0;
        if (i == 2) {
            Rect rect = chatActivityEnterView.I4;
            RectF rectF = chatActivityEnterView.G4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            v4Var.h(chatActivityEnterView.I4);
            v4Var.o(ob6.M0(chatActivityEnterView.d5 > 0.5f ? 2131754923 : 2131754926, null));
            return;
        }
        if (i == 4) {
            Rect rect2 = chatActivityEnterView.I4;
            RectF rectF2 = lVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            v4Var.h(chatActivityEnterView.I4);
            v4Var.o(ob6.M0(chatActivityEnterView.P ? 2131754930 : 2131754931, null));
        }
    }
}
