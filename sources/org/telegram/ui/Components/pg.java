package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pg extends j1.b {
    public final /* synthetic */ qg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(qg qgVar, qg qgVar2) {
        super(qgVar2);
        this.o = qgVar;
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        qg qgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = qgVar.V;
        if (chatActivityEnterView.r4 && chatActivityEnterView.M1 != null && chatActivityEnterView.R3.contains(f7, f10)) {
            return 2;
        }
        return (!chatActivityEnterView.P || chatActivityEnterView.M1 == null || chatActivityEnterView.m4 <= 0.1f || !qgVar.J.contains(f7, f10)) ? -1 : 4;
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
    public final void l(int i10, s0.c cVar) {
        qg qgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = qgVar.V;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.T3;
            RectF rectF = chatActivityEnterView.R3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.T3);
            cVar.o(LocaleController.getString(chatActivityEnterView.o4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.T3;
            RectF rectF2 = qgVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.T3);
            cVar.o(LocaleController.getString(chatActivityEnterView.O ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
