package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kg extends j1.b {
    public final /* synthetic */ lg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(lg lgVar, lg lgVar2) {
        super(lgVar2);
        this.o = lgVar;
    }

    @Override // j1.b
    public final int g(float f9, float f10) {
        lg lgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lgVar.R;
        if (chatActivityEnterView.n4 && chatActivityEnterView.I1 != null && chatActivityEnterView.N3.contains(f9, f10)) {
            return 2;
        }
        return (!chatActivityEnterView.L || chatActivityEnterView.I1 == null || chatActivityEnterView.i4 <= 0.1f || !lgVar.F.contains(f9, f10)) ? -1 : 4;
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
        lg lgVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lgVar.R;
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
            RectF rectF2 = lgVar.F;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.P3);
            cVar.o(LocaleController.getString(chatActivityEnterView.K ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
        }
    }
}
