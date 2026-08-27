package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dg extends j1.b {
    public final /* synthetic */ eg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(eg egVar, eg egVar2) {
        super(egVar2);
        this.o = egVar;
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        eg egVar = this.o;
        ChatActivityEnterView chatActivityEnterView = egVar.R;
        if (chatActivityEnterView.n4 && chatActivityEnterView.I1 != null && chatActivityEnterView.N3.contains(f10, f11)) {
            return 2;
        }
        return (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.i4 <= 0.1f || !egVar.F.contains(f10, f11)) ? -1 : 4;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.R;
        if (chatActivityEnterView.n4) {
            arrayList.add(2);
        }
        if (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.i4 <= 0.1f) {
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
        eg egVar = this.o;
        ChatActivityEnterView chatActivityEnterView = egVar.R;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.P3);
            cVar.o(LocaleController.getString(chatActivityEnterView.k4 > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
            return;
        }
        if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF2 = egVar.F;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.P3);
            cVar.o(LocaleController.getString(chatActivityEnterView.K ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
