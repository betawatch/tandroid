package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qg extends j1.b {
    public final /* synthetic */ rg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(rg rgVar, rg rgVar2) {
        super(rgVar2);
        this.o = rgVar;
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        rg rgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = rgVar.V;
        if (chatActivityEnterView.r4 && chatActivityEnterView.M1 != null && chatActivityEnterView.R3.contains(f7, f10)) {
            return 2;
        }
        return (!chatActivityEnterView.P || chatActivityEnterView.M1 == null || chatActivityEnterView.m4 <= 0.1f || !rgVar.J.contains(f7, f10)) ? -1 : 4;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.V;
        if (chatActivityEnterView.r4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.P || chatActivityEnterView.M1 == null || chatActivityEnterView.m4 <= 0.1f) {
            return;
        }
        arrayList.add(4);
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override // j1.b
    public final void l(int i10, s0.d dVar) {
        rg rgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = rgVar.V;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.T3;
            RectF rectF = chatActivityEnterView.R3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.T3);
            dVar.o(LocaleController.getString(chatActivityEnterView.o4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.T3;
            RectF rectF2 = rgVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.T3);
            dVar.o(LocaleController.getString(chatActivityEnterView.O ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
